package com.zzh.util;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
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

    // 生成盐
    public static String createSalt() {
        StringBuffer hexString = new StringBuffer();
        try {
            Random ranGen = new SecureRandom();
            byte[] aesKey = new byte[20];
            ranGen.nextBytes(aesKey);
            for (int i = 0; i < aesKey.length; i++) {
                String hex = Integer.toHexString(0xff & aesKey[i]);
                if (hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hexString.toString();
    }

    // 明文密码加密
    public static String createPwd(String pwd, String salt) {
        String newPwd = "";
        pwd += salt;
        try {
            // 得到一个信息摘要器
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(pwd.getBytes());
            StringBuffer buffer = new StringBuffer();
            // 把每一个byte 做一个与运算 0xff;
            for (byte b : result) {
                // 与运算
                int number = b & 0xff;// 加盐
                String str = Integer.toHexString(number);
                if (str.length() == 1) {
                    buffer.append("0");
                }
                buffer.append(str);
            }
            newPwd = buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newPwd;
    }

}
