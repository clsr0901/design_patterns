package com.design.patterns.bridge.test3;

/**
 * 实现发送消息的统一接口
 */
public interface MessageImplementor {
    /**
     * 发送消息
     * @param message 要发送消息的内容
     * @param toUser 消息发送的目的人员
     */
    public void send(String message, String toUser);
}
