package com.speldipn.example.this_is_java.ch08.solve;

public class Chatting {
  void startChatting(String chatId) {
    String nickName = chatId;
//    nickName = chatId;
    Chat chat = new Chat() {
      @Override
      void start() {
        while(true) {
          String inputData = "안녕하세요";
          String message = "[" + nickName + "] " + inputData;
          sendMessage(message);
        }
      }
    };

    chat.start();
  }

  class Chat {
    void start() {}
    void sendMessage(String message) {}
  }
}
