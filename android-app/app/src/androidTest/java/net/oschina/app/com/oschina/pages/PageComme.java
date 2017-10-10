package net.oschina.app.com.oschina.pages;

import net.oschina.app.SoloWap;

/**
 * Created by wanggang on 2017/9/20.
 */

public class PageComme {
    private SoloWap solo;
    public PageComme(SoloWap solo){
        this.solo=solo;
    }
    public void searchText(String text){
        solo.searchText(text);
    }
    public void clickOnText(String text){
        solo.clickOnText(text);
    }
}
