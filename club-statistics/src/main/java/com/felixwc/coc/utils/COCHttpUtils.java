package com.felixwc.coc.utils;

import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;

import java.util.LinkedList;

/**
 * in order to learn java!
 * created at 2021/11/20 16:43
 *
 * @author wangchao
 */
public class COCHttpUtils {
    private static final HttpClient httpClient;

    static {
        LinkedList<Header> headers = new LinkedList<>();
        headers.add(new BasicHeader("authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6IjMwMzQ5YTQ2LTk3ODYtNGY2Zi1hMjVkLTRlNjY0Yzk5ZjZkNCIsImlhdCI6MTYzNzM5MDQzNiwic3ViIjoiZGV2ZWxvcGVyLzkxZWRmZDJjLTJiMGMtNDYwZi00NTM5LTM4MzMwMjE1ZDc4MiIsInNjb3BlcyI6WyJjbGFzaCJdLCJsaW1pdHMiOlt7InRpZXIiOiJkZXZlbG9wZXIvc2lsdmVyIiwidHlwZSI6InRocm90dGxpbmcifSx7ImNpZHJzIjpbIjEyMC4yNDIuMjUzLjM5Il0sInR5cGUiOiJjbGllbnQifV19.FfTZDmrkz76HumBS55D6JLXUiAQ8QJzi2SMpLW9E6muk5eeqpCXNKQmifZxl4-3ChkyG3JVHtEyXjcbLJj8N3Q"));
        httpClient = HttpClients.custom().setDefaultHeaders(headers).build();
    }

    public static HttpClient getHttpClient() {
        return COCHttpUtils.httpClient;
    }
}
