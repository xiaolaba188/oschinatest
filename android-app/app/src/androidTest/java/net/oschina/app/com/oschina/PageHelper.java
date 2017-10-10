package net.oschina.app.com.oschina;

import net.oschina.app.SoloWap;
import net.oschina.app.com.oschina.pages.PageComme;
import net.oschina.app.com.oschina.pages.PageLogin;
import net.oschina.app.com.oschina.pages.PageMyLoginStatus;
import net.oschina.app.com.oschina.pages.PageMyUnLoginStatus;
import net.oschina.app.com.oschina.pages.PageNavigetion;
import net.oschina.app.com.oschina.pages.PageNews;
import net.oschina.app.com.oschina.pages.PageSettings;
import net.oschina.app.com.oschina.pages.PageShare;

/**
 * Created by wanggang on 2017/9/20.
 */

public class PageHelper {
    private PageLogin pageLogin;
    private PageMyUnLoginStatus pageMyUnLoginStatus;
    private PageSettings pageSettings;
    private PageMyLoginStatus pageMyLoginStatus;
    private PageNavigetion pageNavigetion;
    private PageComme pageComme;
    private PageNews pageNews;
    private PageShare pageShare;
    private SoloWap solo;
    public PageHelper(SoloWap solo){
        this.solo=solo;
    }
    public PageLogin getPageLogin(){
        if (pageLogin==null){
            pageLogin=new PageLogin(solo);
        }
        pageLogin.initView();
        return pageLogin;
    }
    public PageMyUnLoginStatus getPageMyUnLoginStatus(){
        if (pageMyUnLoginStatus==null){
            pageMyUnLoginStatus=new PageMyUnLoginStatus(solo);
        }
        pageMyUnLoginStatus.initView();
        return pageMyUnLoginStatus;
    }
    public PageSettings getPageSettings(){
        if (pageSettings==null){
            pageSettings=new PageSettings(solo);
        }
        pageSettings.initView();
        return pageSettings;
    }
    public PageMyLoginStatus getPageMyLoginStatus(){
        if (pageMyLoginStatus==null){
            pageMyLoginStatus=new PageMyLoginStatus(solo);
        }
        pageMyLoginStatus.initView();
        return pageMyLoginStatus;
    }
    public PageNavigetion getPageNavigetion(){
        if (pageNavigetion == null){
            pageNavigetion = new PageNavigetion(solo);
        }
        pageNavigetion.initView();
        return pageNavigetion;
    }
    public PageComme getPageComme(){
        if (pageComme == null){
            pageComme = new PageComme(solo);
        }
        return pageComme;
    }
    public PageNews getPageNews(){
        if (pageNews == null){
            pageNews = new PageNews(solo);
        }
        pageNews.initView();
        return pageNews;
    }
    public PageShare getPageShare(){
        if (pageShare == null){
            pageShare = new PageShare(solo);
        }
        return pageShare;
    }
}
