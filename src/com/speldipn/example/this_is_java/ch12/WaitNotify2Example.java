package com.speldipn.example.this_is_java.ch12;

/**
 * @Author: Oh, Joon young (speldipn)
 * @Since: 2018-06-10
 */
public class WaitNotify2Example {
  public static void main(String[] args) {
    DataBox dataBox = new DataBox();

    MyProducer producer = new MyProducer(dataBox);
    MyConsumer consumer = new MyConsumer(dataBox);

    producer.start();
    consumer.start();
  }

  private static class Data {
    public int data;

    public Data(int data) {
      this.data = data;
    }
  }

  private static class DataBox {
    private Data data = null;

    public synchronized void setData(int i) { // 생산자가 호출하는 함수
      if (this.data != null) {
        try {
          // 데이터가 존재하면 상태를 Waiting으로 변경한다.
          wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      this.data = new Data(i);
      System.out.println("Producer setData - " + i);
      notify();
    }

    public synchronized int getData() { // 소비자가 호출하는 함수
      if(this.data == null) {
        try {
          wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      int iData = this.data.data;
      this.data = null;
      notify();
      return iData;
    }
  }

  private static class MyProducer extends Thread {
    DataBox dataBox;

    public MyProducer(DataBox dataBox) {
      this.dataBox = dataBox;
    }

    @Override
    public void run() {
      for (int i = 1; i <= 3; ++i) {
        dataBox.setData(i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  private static class MyConsumer extends Thread {
    DataBox dataBox;

    public MyConsumer(DataBox dataBox) {
      this.dataBox = dataBox;
    }

    @Override
    public void run() {
      for (int i = 1; i <= 3; ++i) {
        int data = dataBox.getData();
        System.out.println("data - " + data);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
