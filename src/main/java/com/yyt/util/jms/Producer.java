package com.yyt.util.jms;

public interface Producer {
    public void sendMsg(String destinationName, Object obj);
}
