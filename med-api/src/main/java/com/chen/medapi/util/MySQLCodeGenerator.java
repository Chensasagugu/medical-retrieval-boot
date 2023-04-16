package com.chen.medapi.util;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author chen
 * @date 2023.04.02 16:57
 */
public class MySQLCodeGenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://47.115.208.86:3306/medical","root","2577cs242220")
                .globalConfig(builder -> {
                    builder.author("aaashuai").enableSwagger()
                            .fileOverride()
                            .outputDir("D://MyBatis-Generator");
                })
                .packageConfig(builder -> {
                    builder.parent("com.chen") // 设置父包名
                            .moduleName("medapi") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://MyBatis-Generator")); // 设置mapperXml生成路径
                }).execute();
    }
}
