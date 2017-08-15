package com.pachong.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * //TODO description
 *
 * @author xiongtao
 * @version v1.0
 * @cratedate 2017/8/15.
 * @since v1.0
 */
public class Patterns {
    public static void main(String args[]) {
        String str = "我是一个大苹果";
        String pattern = "我";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }
}
