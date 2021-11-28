package com.felixwc.coc.service.coc.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.felixwc.coc.pojo.coc.Member;
import com.felixwc.coc.pojo.coc.Members;
import com.felixwc.coc.service.coc.SingleClubService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * in order to learn java!
 * created at 2021/11/21 11:26
 *
 * @author wangchao
 */
@Service
@AllArgsConstructor
@Log
public class SingleClubServiceImpl implements SingleClubService {
    private CloseableHttpClient httpClient;
    private ObjectMapper mapper;

    @Override
    public List<Member> getClubMember(String clubId) {
        List<Member> members = null;
        CloseableHttpResponse response = null;
        BufferedReader reader = null;
        try {
            HttpGet httpGet = new HttpGet("https://api.clashofclans.com/v1/clans/" + clubId + "/members");
            response = httpClient.execute(httpGet);
            if (response.getStatusLine().getStatusCode() == 200) {
                reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                members = mapper.readValue(reader.readLine(), Members.class).getItems();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return members;
    }
}
