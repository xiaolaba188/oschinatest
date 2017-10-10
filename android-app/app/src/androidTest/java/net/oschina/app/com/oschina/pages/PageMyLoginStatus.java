package net.oschina.app.com.oschina.pages;

import android.widget.ImageView;
import android.widget.TextView;

import net.oschina.app.SoloWap;

/**
 * Created by wanggang on 2017/9/20.
 */

public class PageMyLoginStatus {
    private SoloWap solo;
    private ImageView setting;
    private TextView imagess;

    public PageMyLoginStatus(SoloWap solo){
        this.solo=solo;
    }
    public void initView(){
        setting=(ImageView) solo.getView("net.oschina.app:id/iv_logo_setting");
        imagess=(TextView)solo.getView("net.oschina.app:id/tv_nick");
    }
    public void clickSetting(){
        solo.clickOnView(setting);
    }
    public String message(){
        return imagess.getText().toString();
    }
    public boolean isAlreadyLogin(){
        return message().equals("xiaolaba188");
    }

}
