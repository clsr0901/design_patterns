package com.design.patterns.iterator.test3;


/**
 * 用来实现访问Collection集合的迭代接口，为了外部统一访问方式
 * @author chenliangsen
 * @date 2019/12/24 15:09
 */
public class CollectionIteratorImpl implements Iterator {
    /**
     * 用来存放被迭代的聚合对象
     */
    private PayManager aggregate = null;
    /**
     * 内部索引，记录当前迭代到的索引位置
     * -1表示刚开始的时候，迭代器指向聚合对象第一个对象之前
     */
    private int index = -1;

    public CollectionIteratorImpl(PayManager aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < this.aggregate.size()) {
            index = index + 1;
        }
    }

    @Override
    public boolean isDone() {
        if (index == this.aggregate.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return this.aggregate.get(index);
    }
}
