//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.madao.plugin.utils;

import org.apache.commons.lang.StringUtils;

public class MyStringUtils {
    public MyStringUtils() {
    }

    public static String firstLetterToLower(String str) {
        return StringUtils.isBlank(str) ? "" : str.replaceFirst(str.substring(0, 1), str.substring(0, 1).toLowerCase());
    }
}
