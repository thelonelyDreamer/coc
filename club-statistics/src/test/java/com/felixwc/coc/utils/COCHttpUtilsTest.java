package com.felixwc.coc.utils;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;


class COCHttpUtilsTest {
    @Test
    public void test1() throws IOException {
        HttpClient httpClient = COCHttpUtils.getHttpClient();
        HttpGet httpGet = new HttpGet("https://api.clashofclans.com/v1/labels/players");
        HttpResponse response = httpClient.execute(httpGet);
        InputStream content = response.getEntity().getContent();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(content));
        String str;
        while ((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }
    }
}