package net.oschina.app.com.oschina;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by wanggang on 2017/9/29.
 */

public class Utils {
    public void sentRequestHttp(String className,String methodName){
        OkHttpClient client = new OkHttpClient();
        HttpUrl.Builder urlBuilder = HttpUrl.parse("").newBuilder();
        urlBuilder.addQueryParameter("className",className);
        urlBuilder.addQueryParameter("methodNane",methodName);
        String url = urlBuilder.build().toString();
        Request request = new Request.Builder()
                .url(url)
                .build();
        try {
            Response response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
