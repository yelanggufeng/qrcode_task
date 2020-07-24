package com.mobiusvision.qrcode.utils;

public class Utf8String {
    public Utf8String() {
    }

    public static String toUtf8String(String s) {
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c >= 0 && c <= 255) {
                sb.append(c);
            } else {
                byte[] b;
                try {
                    b = Character.toString(c).getBytes("utf-8");
                } catch (Exception var7) {
                    System.out.println(var7);
                    b = new byte[0];
                }

                for(int j = 0; j < b.length; ++j) {
                    int k = b[j];
                    if (k < 0) {
                        k += 256;
                    }

                    sb.append("%" + Integer.toHexString(k).toUpperCase());
                }
            }
        }

        return sb.toString();
    }
}


