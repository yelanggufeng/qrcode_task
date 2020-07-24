package com.mobiusvision.qrcode.utils;

public class WDWUtil {
    public WDWUtil() {
    }

    public static boolean isExcel2003(String filePath) {
        return filePath.matches("^.+\\.(?i)(xls)$");
    }

    public static boolean isExcel2007(String filePath) {
        return filePath.matches("^.+\\.(?i)(xlsx)$");
    }

    public static boolean validateExcel(String filePath) {
        return filePath != null && (isExcel2003(filePath) || isExcel2007(filePath));
    }
}
