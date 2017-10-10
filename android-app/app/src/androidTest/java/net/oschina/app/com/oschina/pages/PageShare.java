package net.oschina.app.com.oschina.pages;

import net.oschina.app.SoloWap;

/**
 * Created by wanggang on 2017/9/29.
 */

public class PageShare {
    private SoloWap solo;

    public PageShare(SoloWap solo){
        this.solo=solo;
    }
    public void clickOnQQ(){
        solo.clickOnText("QQ");
    }

}
