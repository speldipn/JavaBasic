package com.speldipn.example.java_ysw.ch23;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-10-14
 */
public class NewsPaperStory {
    static class NewsPaper {
        String todayNews;

        public void setTodayNews(String news) {
            todayNews = news;
        }

        public String getTodayNews() {
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
        NewsReader reader = new NewsReader(paper);
        NewsWriter writer = new NewsWriter(paper);

        reader.start();
        writer.start();

        try {
            reader.join();
            writer.join();
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
