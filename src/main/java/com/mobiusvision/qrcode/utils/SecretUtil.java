package com.mobiusvision.qrcode.utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;
import java.util.UUID;

public class SecretUtil {
    public SecretUtil() {
    }

    public static String md5(String pwd, int times) {
        for(int i = 0; i < times; ++i) {
            pwd = DigestUtils.md5Hex(pwd);
        }

        return pwd;
    }

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    public static String shaEncode(String inStr) throws Exception {
        MessageDigest sha = null;

        try {
            sha = MessageDigest.getInstance("SHA");
        } catch (Exception var7) {
            System.out.println(var7.toString());
            var7.printStackTrace();
            return "";
        }

        byte[] byteArray = inStr.getBytes("UTF-8");
        byte[] md5Bytes = sha.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();

        for(int i = 0; i < md5Bytes.length; ++i) {
            int val = md5Bytes[i] & 255;
            if (val < 16) {
                hexValue.append("0");
            }

            hexValue.append(Integer.toHexString(val));
        }

        return hexValue.toString();
    }
}

