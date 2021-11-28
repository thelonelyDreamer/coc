package com.felixwc.coc.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.apache.http.message.BasicHeader;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * in order to learn java!
 * created at 2021/11/20 17:22
 *
 * @author wangchao
 */
@Configuration
@ConfigurationProperties(prefix = "coc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class COCHttpConfig {
    private String jwt;
    private static String prefix;

    @Bean("cocHttpClient")
    public CloseableHttpClient obtainHttpClient() {
        LinkedList<Header> headers = new LinkedList<>();
        headers.add(new BasicHeader("authorization", "Bearer " + jwt));
        CloseableHttpClient client = HttpClients.custom().setDefaultHeaders(headers).build();
        return client;
    }

    @Bean("cocRequest")
    public HashMap<String, HttpUriRequest> obtainRequestUri() {
        HashMap<String, HttpUriRequest> map = new HashMap<>();
        map.put("/labels/clans", new HttpGet(prefix + "/labels/clans"));
        return map;
    }

    @Bean("cocHttpClientConnectionManager")
    public HttpClientConnectionManager obtainHttpClientConnectionManager() {
        BasicHttpClientConnectionManager manager = new BasicHttpClientConnectionManager();
        return manager;
    }

}
