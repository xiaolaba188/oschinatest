package net.oschina.app.com.oschina.pages;

import android.widget.Button;
import android.widget.EditText;

import net.oschina.app.SoloWap;

/**
 * Created by wanggang on 2017/9/20.
 */

public class PageLogin {
    private SoloWap solo;
    private EditText nameET;
    private EditText pwdET;
    private Button btn;
    public PageLogin(SoloWap solo){
        this.solo=solo;
    }
    public void initView(){
        nameET= (EditText) solo.getView("net.oschina.app:id/et_username");
        pwdET=(EditText) solo.getView("net.oschina.app:id/et_password");
        btn=(Button)solo.getView("net.oschina.app:id/btn_login");
    }
    public void enterName(String text){
        solo.enterText(nameET,text);
    }
    public void enterPwd(String text){
        solo.enterText(pwdET,text);
    }
    public void clearName(){
        solo.clearText(nameET);
    }
    public void clearPwd(){
        solo.clearText(pwdET);
    }
    public void clickOnBtn(){
        solo.clickOnView(btn);
    }
    public void Login(String name,String pwd){
        clearName();
        enterName(name);
        clearPwd();
        enterPwd(pwd);
        clickOnBtn();
    }
}
