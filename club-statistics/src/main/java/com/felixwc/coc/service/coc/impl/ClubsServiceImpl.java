package com.felixwc.coc.service.coc.impl;

import com.felixwc.coc.service.coc.ClubsService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * in order to learn java!
 * created at 2021/11/21 01:23
 *
 * @author wangchao
 */
@Service
@Log
@AllArgsConstructor
public class ClubsServiceImpl implements ClubsService {
    private final CloseableHttpClient cocHttpClient;
    private final Map<String, HttpUriRequest> cocRequest;

    @Override
    public String getInterfaceName() {
        return "ClubsService";
    }

    @Override
    public String getClubs() {
        try {
            log.info("请求进入");
            HttpUriRequest httpUriRequest = cocRequest.get("/labels/clans");
            System.out.println(httpUriRequest.getURI());
            CloseableHttpResponse response = cocHttpClient.execute(httpUriRequest);
            InputStream content = response.getEntity().getContent();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(content));
            String s = bufferedReader.readLine();
            bufferedReader.close();
            response.close();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
