package com.pachong.test;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * //找小游戏
 *
 * @author xiongtao
 * @version v1.0
 * @cratedate 2017/8/15.
 * @since v1.0
 */
public class FindGame {

    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader =     new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/xiongtao/Desktop/小游戏/2.html"),"gb2312"));

            String data = null;
            while((data = bufferedReader.readLine())!=null)
            {
                if(StringUtils.isNotEmpty(data)){
                    if(data.contains("name"))
                        if(data.contains("href")){
                            System.out.println(data);
                        }



                }
            }
            System.out.println(bufferedReader.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
