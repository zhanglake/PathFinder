package com.zzh.entity;

/**
 * Created by zhenghua.zhang on 2018/1/11.
 */
public class Unit {

    // 省份列表
    public static enum PROVINCE {
        BEIJING("北京市"), TIANJING("天津市"), SHANGHAI("上海市"), CHONGQING("重庆市"), HEBEI("河北省"), SHANXI1("山西省"),
        LIAONING("辽宁省"), JILING("吉林省"), HEILONGJIANG("黑龙江省"), JIANGSU("江苏省"), ZHEJIANG("浙江省"), ANHUI("安徽省"),
        FUJIAN("福建省"), JIANGXI("江西省"), SHANDONG("山东省"), HENAN("河南省"), HUBEI("湖北省"), HUNAN("湖南省"),
        GUANGDONG("广东省"), HAINAN("海南省"), SICHUAN("四川省"), GUIZHOU("贵州省"), YUNNAN("云南省"), SHANXI2("陕西省"),
        GS("甘肃省"), QH("青海省"), TW("台湾省"), NMG("内蒙古自治区"), GX("广西壮族自治区"),
        XIZANG("西藏自治区"), NINGXIA("宁夏回族自治区"), XINJIANG("新疆维吾尔自治区"),
        XIANGGANG("香港特别行政区"), AOMEN("澳门特别行政区");

        private String name;

        PROVINCE (String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {

            return name;
        }
    }

}
