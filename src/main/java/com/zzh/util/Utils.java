package com.zzh.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by zhenghua.zhang on 2018/1/18.
 */
public class Utils {

    // 生成订单号
    public static String generateOrderId(Integer source) {
        StringBuilder code = new StringBuilder();
        switch (source) {
            case 0:
                // 其他
                code.append("AM");
                break;
            case 1:
                // 后台添加
                code.append("BM");
                break;
            case 2:
                // 客户生成
                code.append("CM");
                break;
            default:
                code.append("AM");
                break;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        code.append(sdf.format(new Date()));
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {//有可能是负数
            hashCodeV = - hashCodeV;
        }
        return code + String.format("%04d", hashCodeV);
    }

}
