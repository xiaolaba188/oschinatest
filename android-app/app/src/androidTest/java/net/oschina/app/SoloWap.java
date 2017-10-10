package net.oschina.app;

import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.robotium.solo.By;
import com.robotium.solo.Solo;
import com.robotium.solo.WebElement;

import junit.framework.AssertionFailedError;

/**
 * Created by wanggang on 2017/9/19.
 */

public class SoloWap {
    private Solo solo;
    public SoloWap(Solo solo){
        this.solo=solo;
    }
    public View getView(String text){
        try {
            return solo.getView(text);
        }catch (AssertionFailedError asf){
            return null;
        }

    }
    public void enterText(EditText ET, String text){
        Log.i("AUTO","要往输入框"+ET+"输入文本"+text);
        solo.enterText(ET,text);
    }
    public void clearText(EditText ET){
        solo.clearEditText(ET);
    }
    public void clickOnView(View view){
        solo.clickOnView(view);
    }
    public boolean searchText(String text){
        return solo.searchText(text,true);
    }
    public boolean waitForText(String text){
        return solo.waitForText(text,1,5000,false,true);
    }
    public void takeScreenShot(String name){
        solo.takeScreenshot(name);
    }
    public void getWebElement(String text,int id){
         WebElement web=solo.getWebElement(By.xpath("text"),id);
    }
    public void clickOnText(String text){
        solo.clickOnText(text);
    }
}

