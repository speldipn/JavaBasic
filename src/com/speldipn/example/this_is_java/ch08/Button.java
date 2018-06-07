package com.speldipn.example.this_is_java.ch08;

public class Button {
  OnClickListener listener;

  void setOnClickListener(OnClickListener listener) {
    this.listener = listener;
  }

  void touch() {
    listener.onClick();
  }

  interface OnClickListener {
    void onClick();
  }
}
