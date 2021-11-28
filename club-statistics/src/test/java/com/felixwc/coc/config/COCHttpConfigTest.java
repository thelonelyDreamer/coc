package com.felixwc.coc.config;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;

@SpringBootTest
class COCHttpConfigTest {
    @Autowired
    private COCHttpConfig httpConfig;
    @Resource
    private HttpClient cocHttpClient;
    @Resource
    private HashMap<String, HttpUriRequest> cocRequest;

    @Test
    public void checkProperties(){
        System.out.println(httpConfig);
    }

    @Test
    public void checkClient() throws IOException {
        HttpUriRequest httpUriRequest = cocRequest.get("/labels/clans");
        HttpResponse response = cocHttpClient.execute(httpUriRequest);
        System.out.println(response.getStatusLine());
    }

}