package com.dome.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//声明这个是一个属性读取类
@ConfigurationProperties(prefix = "str")
public class StrProperties {


     StrProperties(String abc, String zxc) {
        this.abc = abc;
        this.zxc = zxc;
    }

    private  String abc;

    private String zxc;

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public String getZxc() {
        return zxc;
    }

    public void setZxc(String zxc) {
        this.zxc = zxc;
    }
}
