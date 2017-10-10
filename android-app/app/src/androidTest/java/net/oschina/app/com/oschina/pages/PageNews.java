package net.oschina.app.com.oschina.pages;

import android.widget.ImageView;

import net.oschina.app.SoloWap;

/**
 * Created by wanggang on 2017/9/29.
 */

public class PageNews {
    private ImageView shareIV;
    private SoloWap solo;
    public PageNews(SoloWap solo){
        this.solo=solo;
    }
    public void initView(){
        shareIV = (ImageView) solo.getView("net.oschina.app:id/iv_share");
    }
    public void clickOnshareIV(){
        solo.clickOnView(shareIV);
    }
}
