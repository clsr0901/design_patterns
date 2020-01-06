package com.design.patterns.decorator.test4;

/**
 * 装饰器的接口，需要和被装饰的对象实现同样的接口
 * @author chenliangsen
 * @date 2020/1/6 15:03
 */
public abstract class Decorator implements GoodsSaleEbi {
    /**
     * 持有被装饰的组件对象
     */
    protected GoodsSaleEbi ebi;

    /**
     * 通过构造方法传入被装饰的对象
     * @param ebi 被装饰的对象
     */
    public Decorator(GoodsSaleEbi ebi) {
        this.ebi = ebi;
    }
}