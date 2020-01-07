package com.design.patterns.chain_of_responsibility.test2;

/**
 * 职责的接口，也就是处理请求的接口
 * @author chenliangsen
 * @date 2020/1/7 9:58
 */
public abstract class Handler {

    /**
     * 持有后续的职责对象
     */
    protected Handler successor;

    /**
     * 设置后续的职责对象
     * @param successor 后续的职责对象
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 示意处理请求的方法，虽然这个示意方法是没有传入参数的
     * 但实际是可以传入参数的，根据具体需要来选择是否传递参数
     */
    public abstract void handleRequest();
}
