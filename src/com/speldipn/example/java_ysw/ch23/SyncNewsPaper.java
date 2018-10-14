package com.speldipn.example.java_ysw.ch23;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class SyncNewsPaper {
    static class NewsPaper {
        String todayNews;
        boolean isTodayNews = false;

        public void setTodayNews(String news) {
            todayNews = news;
            isTodayNews = true;

            synchronized (this) {
                notifyAll(); // wake up all !!
            }
        }

        public String getTodayNews() {
            if (isTodayNews == false) {
                try {
                    System.out.println("대기 들어간다");
                    synchronized (this) {
                        wait(); // pending..
                    }
                    System.out.println("대기 빠져나온다");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return todayNews;
        }
    }

    static class NewsWriter extends Thread {
        NewsPaper paper;

        public NewsWriter(NewsPaper paper) {
            this.paper = paper;
        }

        @Override
        public void run() {
            paper.setTodayNews("자바의 열기가 뜨겁습니다.");
        }
    }

    static class NewsReader extends Thread {
        NewsPaper paper;

        public NewsReader(NewsPaper paper) {
            this.paper = paper;
        }

        @Override
        public void run() {
            System.out.println("오늘의 뉴스 : " + paper.getTodayNews());
        }
    }

    public static void main(String[] args) {
        NewsPaper paper = new NewsPaper();
        NewsWriter writer = new NewsWriter(paper);
        NewsReader reader1 = new NewsReader(paper);
        NewsReader reader2 = new NewsReader(paper);

        try {
            reader1.start();
            reader2.start();

            Thread.sleep(1000);
            writer.start();

            reader1.join();
            reader2.join();
            writer.join();

        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
