package com.design.patterns.memento.test1;

/**
 * 模拟运行流程A，只是一个示意，代指某个具体流程
 * @author chenliangsen
 * @date 2020/1/2 9:54
 */
public class FlowAMock {
    /**
     * 流程名称，不需要外部存储的状态数据
     */
    private String flowName;

    /**
     * 示意，代指某个中间结果，需要外部存储的状态数据
     */
    private int tempResult;

    /**
     * 示意，代指某个中间结果，需要外部存储的状态数据
     */
    private String tempState;

    public FlowAMock(String flowName) {
        this.flowName = flowName;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public int getTempResult() {
        return tempResult;
    }

    public void setTempResult(int tempResult) {
        this.tempResult = tempResult;
    }

    public String getTempState() {
        return tempState;
    }

    public void setTempState(String tempState) {
        this.tempState = tempState;
    }

    /**
     * 示意，运行流程的第一个阶段
     */
    public void runPhaseOne() {
        //在这个阶段，可能产生了中间结果，示意一下
        tempResult = 3;
        tempState = "PhaseOne";
    }

    /**
     * 示意，按照方案一来运行流程后半部分
     */
    public void schema1() {
        //示意，需要使用第一个阶段产生的数据
        this.tempState += ",Schema1";
        System.out.println(this.tempState + " : now run " + tempResult);
    }

    /**
     * 示意，按照方案二来运行流程后半部分
     */
    public void schema2() {
        //示意，需要使用第一个阶段产生的数据
        this.tempState += ",Schema2";
        System.out.println(this.tempState + " : now run " + tempResult);
        this.tempResult += 22;
    }
}
