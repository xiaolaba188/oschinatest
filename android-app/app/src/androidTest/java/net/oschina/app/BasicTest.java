package net.oschina.app;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import net.oschina.app.com.oschina.PageHelper;

/**
 * Created by wanggang on 2017/9/19.
 */

public class BasicTest extends ActivityInstrumentationTestCase2<AppStart>{
    private boolean isNeedLogin = false;
    private Solo solo;
    protected SoloWap solo1;
    protected PageHelper pageHelper;
    public BasicTest(boolean isNeedLogin){
        super(AppStart.class);
        this.isNeedLogin=isNeedLogin;
    }

    @Override
    public void setUp() throws Exception {

        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
        solo1 = new SoloWap(solo);
        pageHelper = new PageHelper(solo1);
        solo.clickOnText("我的");
//        solo.sleep(5000);
//
//        if (isNeedLogin) {
//            if (!pageHelper.getPageMyLoginStatus().isAlreadyLogin()) {
//                pageHelper.getPageMyUnLoginStatus().clickLoginView();
//                pageHelper.getPageLogin().Login("574116332@qq.com", "30286293wg");
//            } else {
//                if (pageHelper.getPageMyLoginStatus().isAlreadyLogin()) {
//                    pageHelper.getPageMyLoginStatus().clickSetting();
//                    pageHelper.getPageSettings().clickOutLoginView();
//                }
//
//            }
//            pageHelper.getPageNavigetion().clickNewTab();
//        }
    }
//    public void runTest() throws Throwable {
//        try {
//            super.runTest();
//        }catch (Throwable th){
//            Log.i("AUTO","Error Message is"+th.getMessage());
//            solo.takeScreenshot(this.getClass().getSimpleName());
//            tearDown();
//            throw th;
//        }
//
//    }

    @Override
    public void tearDown() throws Exception {
//        try {
//
//        }catch (Throwable th){
//            Log.i("AUTO","Error Message is"+th.getMessage());
//            solo.takeScreenshot(this.getClass().getSimpleName());
//            throw th;
//        }finally {
            solo.finishOpenedActivities();
            super.tearDown();
//        }
//
    }
}
