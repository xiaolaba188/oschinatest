package net.oschina.app.com.oschina.logintest.tests;


import net.oschina.app.BasicTest;

/**
 * Created by wanggang on 2017/9/19.
 */

public class Login1 extends BasicTest {
//    public Login1(){
//        super(false);
//    }
    public void testLogin(){
       pageHelper.getPageNavigetion().clickMyTab();
        pageHelper.getPageMyUnLoginStatus().clickLoginView();
        pageHelper.getPageLogin().Login("574116332@qq.com","30286293wg");
        pageHelper.getPageComme().searchText("xiaolaba188");
    }
}
