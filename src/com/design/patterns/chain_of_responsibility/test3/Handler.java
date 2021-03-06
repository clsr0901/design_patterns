package com.design.patterns.chain_of_responsibility.test3;

/**
 * 定义职责对象的接口
 * @author chenliangsen
 * @date 2020/1/7 10:05
 */
public abstract class Handler {
    /**
     * 持有下一个处理请求的对象
     */
    protected Handler successor = null;

    /**
     * 设置下一个处理请求的对象
     * @param successor 下一个处理请求的对象
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     * @param user 申请人
     * @param fee 申请费用
     * @return 成功或失败的具体通知
     */
    public abstract String handleFeeRequest(String user, double fee);
}
