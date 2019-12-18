package com.design.patterns.prototype.test3;

/**
 * 订单的接口，声明了可以克隆自身的方法
 * @author chenliangsen
 * @date 2019/12/17 15:20
 */
public interface OrderApi {
    /**
     * 获取订单产品数量
     * @return 订单中产品数量
     */
    public int getOrderProductNum();

    /**
     * 设置订单产品数量
     * @param num 订单产品数量
     */
    public void setOrderProductNum(int num);


    /**
     * 克隆方法
     * @return 订单原型的实例
     */
    public OrderApi clone();
}