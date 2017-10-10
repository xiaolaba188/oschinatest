package net.oschina.app.com.oschina.pages;

import android.widget.TextView;

import net.oschina.app.SoloWap;

/**
 * Created by wanggang on 2017/9/20.
 */

public class PageSettings {
    private SoloWap solo;
    private TextView outlogin;

    public PageSettings(SoloWap solo){
        this.solo=solo;
    }
    public void initView(){
        outlogin=(TextView) solo.getView("net.oschina.app:id/rl_cancle");
    }
    public void clickOutLoginView(){
        solo.clickOnView(outlogin);
    }
}
