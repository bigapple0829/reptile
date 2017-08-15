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
    public static String getMatcher(String regex, String source) {
              String result = "";
         Pattern pattern = Pattern.compile(regex);
               Matcher matcher = pattern.matcher(source);
             while (matcher.find()) {
                     result = matcher.group(1);
                  }
               return result;
            }

         public static void main(String[] args) {
             String url = "http://172.12.1.123/test.txt";
               String regex = "(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})";
       //        String regex = "(\\d{1,3}\\.){1,3}(\\d{1,3})";
                 System.out.println(getMatcher(regex,url));
             }
}
