package com.felixwc.coc.service.coc.impl;

import com.felixwc.coc.pojo.coc.player.PlayerInfo;
import com.felixwc.coc.service.coc.PlayerService;
import lombok.AllArgsConstructor;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URLEncoder;

/**
 * in order to learn java!
 * created at 2021/11/22 13:17
 *
 * @author wangchao
 */
@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private CloseableHttpClient cocHttpClient;
    @Override
    public PlayerInfo obtainPlayer(String playerTag) {
        return null;
    }

    @Override
    public boolean validPlayer(String tag, String apiToken) {
        boolean result=false;
        try {
            String encode = URLEncoder.encode("", "utf-8");
            URI uri = new URI(encode);
            HttpGet httpGet = new HttpGet(uri);
            CloseableHttpResponse response = cocHttpClient.execute(httpGet);
            if(response.getStatusLine().getStatusCode()==200){
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
