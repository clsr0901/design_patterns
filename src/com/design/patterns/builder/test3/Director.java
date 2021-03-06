package com.design.patterns.builder.test3;

import com.design.patterns.builder.test1.ExportDataModel;
import com.design.patterns.builder.test1.ExportFooterModel;
import com.design.patterns.builder.test1.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * 指导者，指导使用生成器的接口来构建输出的文件的对象
 * @author chenliangsen
 * @date 2019/12/13 11:20
 */
public class Director {
    /**
     * 持有当前需要使用的生成器对象
     */
    private Builder builder;

    /**
     * 构造方法，传入生成器对象
     * @param builder 生成器对象
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(ExportHeaderModel ehm,
                          Map<String, Collection<ExportDataModel>> mapData,
                          ExportFooterModel efm) {
        //1.先构建Header
        builder.buildHeader(ehm);
        //2.然后构建Body
        builder.buildBody(mapData);
        //3.再构建Footer
        builder.buildFooter(efm);
    }

}
