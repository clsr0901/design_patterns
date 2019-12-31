package com.design.patterns.command.test2;


/**
 * 技嘉主板类，开机命令的真正实现者，再Command模式中充当Receiver
 * @author chenliangsen
 * @date 2019/12/23 16:19
 */
public class GigaMainBoard implements MainBoardApi {

    /**
     * 真正的开机命令的实现
     */
    @Override
    public void open() {
        System.out.println("技嘉主板现在正在开机，请稍后");
        System.out.println("接通电源。。。。");
        System.out.println("设备检查...");
        System.out.println("装载系统...");
        System.out.println("机器正常运转起来...");
        System.out.println("机器已经正常打开，请操作");
    }
}