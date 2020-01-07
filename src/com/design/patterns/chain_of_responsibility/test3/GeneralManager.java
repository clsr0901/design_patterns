package com.design.patterns.chain_of_responsibility.test3;

/**
 * @author chenliangsen
 * @date 2020/1/7 10:07
 */
public class GeneralManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        //部门经理的权限只能在1000以内
        if (fee >= 1000) {
            //为了测试，简单点，只同意小李的
            if ("小李".equals(user)) {
                str = "总经理同意" + user + "聚餐费用" + fee + "元的请求";
            }else {
                //其他人一律不同意
                str = "总经理不同意" + user + "聚餐费用" + fee + "元的请求";
            }
            return str;
        } else {
            //如果还有后续继续传递
            if (this.successor != null) {
                return successor.handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}