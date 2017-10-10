package net.oschina.app.com.oschina.pages;

import android.widget.FrameLayout;
import android.widget.ImageView;

import net.oschina.app.SoloWap;

/**
 * Created by wanggang on 2017/9/20.
 */

public class PageNavigetion {
    private FrameLayout newTab,sweetTab,exprolerTab,myTab;
    private ImageView pubTab;
    private SoloWap solo;
    public PageNavigetion(SoloWap solo){
        this.solo=solo;
    }
    public void initView(){
        newTab = (FrameLayout) solo.getView("net.oschina.app:id/nav_item_news");
        sweetTab = (FrameLayout) solo.getView("net.oschina.app:id/nav_item_tweet");
        exprolerTab = (FrameLayout) solo.getView("net.oschina.app:id/nav_item_explore");
        myTab = (FrameLayout) solo.getView("net.oschina.app:id/nav_item_me");
        pubTab =(ImageView) solo.getView("net.oschina.app:id/nav_item_tweet_pub");
    }
    public void clickNewTab(){
        solo.clickOnView(newTab);
    }
    public void clickSweetTab(){
        solo.clickOnView(sweetTab);
    }
    public void clickExprolerTab(){
        solo.clickOnView(exprolerTab);
    }
    public void clickMyTab(){
        solo.clickOnView(myTab);
    }
    public void clickPubTab(){
        solo.clickOnView(pubTab);
    }
}
