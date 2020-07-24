package com.mobiusvision.qrcode.service.impl;

import com.mobiusvision.qrcode.entity.WxSignVo;
import com.mobiusvision.qrcode.service.IWxService;
import com.mobiusvision.qrcode.utils.JsonUtils;
import com.mobiusvision.qrcode.utils.PredictableException;
import com.mobiusvision.qrcode.utils.SecretUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WxServiceImpl implements IWxService {
    private String getWxTokenUrl = "https://api.weixin.qq.com/cgi-bin/token";
    private String getAccessTokenUrl = "https://api.weixin.qq.com/sns/oauth2/access_token";
    private String getWxTicketUrl = "https://api.weixin.qq.com/cgi-bin/ticket/getticket";
    private String getUserInfoUrl = "https://api.weixin.qq.com/sns/userinfo";
    @Value("${wx.public.appid}")
    private String appid;
    @Value("${wx.public.secret}")
    private String secret;
    @Autowired
    private HttpClient httpClient;

    public WxServiceImpl() {
    }

    public WxSignVo getWxSign(String url) throws Exception {
        String token = this.getToken();
        String ticket = this.getTicket(token, "jsapi");
        String noncestr = SecretUtil.uuid();
        long timestamp = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        String str1 = "jsapi_ticket=" + ticket + "&noncestr=" + noncestr + "&timestamp=" + timestamp + "&url=" + url;
        String sign = SecretUtil.shaEncode(str1);
        return new WxSignVo(this.appid, timestamp, noncestr, sign, ticket);
    }

    private String getToken() throws Exception {
        StringBuffer out = new StringBuffer();
        BufferedReader in = null;

        String var11;
        try {
            List<BasicNameValuePair> list = new ArrayList();
            list.add(new BasicNameValuePair("appid", this.appid));
            list.add(new BasicNameValuePair("secret", this.secret));
            list.add(new BasicNameValuePair("grant_type", "client_credential"));
            String params = EntityUtils.toString(new UrlEncodedFormEntity(list, Consts.UTF_8));
            HttpGet httpGet = new HttpGet(this.getWxTokenUrl + "?" + params);
            HttpEntity entity = this.httpClient.execute(httpGet).getEntity();
            InputStream content = entity.getContent();
            in = new BufferedReader(new InputStreamReader(content, Charset.forName("UTF-8")));

            String line;
            while((line = in.readLine()) != null) {
                out.append(line);
            }

            in.close();
            Map map = (Map)JsonUtils.jsonToPojo(out.toString(), Map.class);
            String access_token = (String)map.get("access_token");
            if (StringUtils.isBlank(access_token)) {
                throw new PredictableException(out.toString());
            }

            var11 = access_token;
        } catch (Exception var15) {
            var15.printStackTrace();
            throw var15;
        } finally {
            if (null != in) {
                in.close();
            }

        }

        return var11;
    }

    private String getTicket(String token, String type) throws IOException {
        StringBuffer out = new StringBuffer();
        BufferedReader in = null;

        String var13;
        try {
            List<BasicNameValuePair> list = new ArrayList();
            list.add(new BasicNameValuePair("access_token", token));
            list.add(new BasicNameValuePair("type", type));
            String params = EntityUtils.toString(new UrlEncodedFormEntity(list, Consts.UTF_8));
            HttpGet httpGet = new HttpGet(this.getWxTicketUrl + "?" + params);
            HttpEntity entity = this.httpClient.execute(httpGet).getEntity();
            InputStream content = entity.getContent();
            in = new BufferedReader(new InputStreamReader(content, Charset.forName("UTF-8")));

            String line;
            while((line = in.readLine()) != null) {
                out.append(line);
            }

            in.close();
            Map map = (Map)JsonUtils.jsonToPojo(out.toString(), Map.class);
            String ticket = (String)map.get("ticket");
            if (StringUtils.isBlank(ticket)) {
                throw new PredictableException(out.toString());
            }

            var13 = ticket;
        } catch (Exception var17) {
            var17.printStackTrace();
            throw var17;
        } finally {
            if (null != in) {
                in.close();
            }

        }

        return var13;
    }

    private String getAccessToken(String code) throws IOException {
        StringBuffer out = new StringBuffer();
        BufferedReader in = null;

        String var13;
        try {
            List<BasicNameValuePair> list = new ArrayList();
            list.add(new BasicNameValuePair("appid", this.appid));
            list.add(new BasicNameValuePair("secret", this.secret));
            list.add(new BasicNameValuePair("code", code));
            list.add(new BasicNameValuePair("grant_type", "authorization_code"));
            String params = EntityUtils.toString(new UrlEncodedFormEntity(list, Consts.UTF_8));
            HttpGet httpGet = new HttpGet(this.getAccessTokenUrl + "?" + params);
            HttpEntity entity = this.httpClient.execute(httpGet).getEntity();
            InputStream content = entity.getContent();
            in = new BufferedReader(new InputStreamReader(content, Charset.forName("UTF-8")));

            String line;
            while((line = in.readLine()) != null) {
                out.append(line);
            }

            in.close();
            String result = out.toString();
            Map map = (Map)JsonUtils.jsonToPojo(result, Map.class);
            String token = (String)map.get("access_token");
            if (StringUtils.isBlank(token)) {
                throw new PredictableException(out.toString());
            }

            var13 = result;
        } catch (Exception var17) {
            var17.printStackTrace();
            throw var17;
        } finally {
            if (null != in) {
                in.close();
            }

        }

        return var13;
    }

    private String getUserInfo(String accessToken, String openId) throws IOException {
        StringBuffer out = new StringBuffer();
        BufferedReader in = null;

        String var14;
        try {
            List<BasicNameValuePair> list = new ArrayList();
            list.add(new BasicNameValuePair("access_token", accessToken));
            list.add(new BasicNameValuePair("openid", openId));
            list.add(new BasicNameValuePair("lang", "zh_CN"));
            String params = EntityUtils.toString(new UrlEncodedFormEntity(list, Consts.UTF_8));
            HttpGet httpGet = new HttpGet(this.getUserInfoUrl + "?" + params);
            HttpEntity entity = this.httpClient.execute(httpGet).getEntity();
            InputStream content = entity.getContent();
            in = new BufferedReader(new InputStreamReader(content, Charset.forName("UTF-8")));

            String line;
            while((line = in.readLine()) != null) {
                out.append(line);
            }

            in.close();
            String result = out.toString();
            Map map = (Map)JsonUtils.jsonToPojo(result, Map.class);
            String errcode = (String)map.get("errcode");
            if (StringUtils.isNotBlank(errcode)) {
                throw new PredictableException(out.toString());
            }

            var14 = result;
        } catch (Exception var18) {
            var18.printStackTrace();
            throw var18;
        } finally {
            if (null != in) {
                in.close();
            }

        }

        return var14;
    }
}