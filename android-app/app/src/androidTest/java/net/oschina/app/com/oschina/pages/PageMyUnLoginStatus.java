package net.oschina.app.com.oschina.pages;

import android.widget.ImageView;

import net.oschina.app.SoloWap;

/**
 * Created by wanggang on 2017/9/20.
 */

public class PageMyUnLoginStatus {
    private ImageView setting,loginIcon;
    private SoloWap solo;
    public PageMyUnLoginStatus(SoloWap solo){
        this.solo=solo;
    }
    public void initView(){
        solo.waitForText("点击头像登录");
        setting=(ImageView)solo.getView("net.oschina.app:id/iv_logo_setting");
        loginIcon=(ImageView)solo.getView("net.oschina.app:id/iv_portrait");
    }
    public void clickLoginView(){
        solo.clickOnView(loginIcon);
    }
    public void clickSetting(){
        solo.clickOnView(setting);
    }
}
