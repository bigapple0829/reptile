package com.pachong.test;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.*;

/**
 * //TODO description
 *
 * @author xiongtao
 * @version v1.0
 * @cratedate 2017/8/15.
 * @since v1.0
 */
public class FindMoreGame {


    public static void main(String[] args) {

        for (int i=2;i<30;i++){
            //httpClient
            HttpClient httpClient = new DefaultHttpClient();

            String url = "http://h.4399.com/xyx_"+i+".htm";
            HttpGet httpGet = new HttpGet(url);
            //response
            HttpResponse response = null;
            try {
                response = httpClient.execute(httpGet);

                //get response into String
                String data1 = "";

                HttpEntity entity = response.getEntity();
                data1 = EntityUtils.toString(entity, "gb2312");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data1.getBytes());

                InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream);

                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                String data = null;
                FileWriter fw = null;
                File f = new File("C:/Users/xiongtao/Desktop/小游戏/2.txt");

                if (!f.exists()) {
                    f.createNewFile();
                }
                fw = new FileWriter(f,true);
                BufferedWriter out = new BufferedWriter(fw);
                while ((data = bufferedReader.readLine()) != null) {
                    if (StringUtils.isNotEmpty(data)) {
                        if (data.contains("name"))
                            if (data.contains("href")) {
                                String trim = data.trim();
                                out.write(trim+"\r\n");
                                out.flush();
                            }

                    }
                }
                out.close();
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }


}




