package com.example.im_test;

import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.StrictMode;

import androidx.multidex.MultiDex;

import com.example.im_test.Activity.MainActivity;
import com.example.im_test.Utils.CrashHandler;
import com.example.im_test.Utils.DynamicTimeFormat;
import com.example.im_test.Utils.ToastUtils;
import com.example.im_test.common.Constants;
import com.example.im_test.di.componet.AppComponent;
import com.example.im_test.di.componet.DaggerAppComponent;
import com.example.im_test.di.module.AppModule;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreator;
import com.scwang.smartrefresh.layout.api.DefaultRefreshInitializer;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;

import io.reactivex.annotations.NonNull;

public class App extends Application {
    private static App INSTANCE;

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    private AppComponent mAppComponent;

    public static MainActivity mainActivity;

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public static void setMainActivity(MainActivity mainActivity) {
        App.mainActivity = mainActivity;
    }

    public static App getInstance() {
        return INSTANCE;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
        INSTANCE = this;
    }

    public static void copy(String content, Context context) {
        // 得到剪贴板管理器
        ClipboardManager cmb = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        cmb.setText(content.trim());
        ToastUtils.showToast(getInstance().mAppComponent.getContext(), "已复制到剪切板");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        //LeakCanary.install(this);
//        JPushInterface.setDebugMode(true);// 设置开启日志,发布时请关闭日志
//        JPushInterface.init(this);// 初始化 JPush
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
        setStrictMode();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this, Constants.BASE_URL)).build();
//        /**
//         * 初始化common库
//         * 参数1:上下文，必须的参数，不能为空
//         * 参数2:友盟 app key，非必须参数，如果Manifest文件中已配置app key，该参数可以传空，则使用Manifest中配置的app key，否则该参数必须传入
//         * 参数3:友盟 channel，非必须参数，如果Manifest文件中已配置channel，该参数可以传空，则使用Manifest中配置的channel，否则该参数必须传入，channel命名请详见channel渠道命名规范
//         * 参数4:设备类型，必须参数，传参数为UMConfigure.DEVICE_TYPE_PHONE则表示手机；传参数为UMConfigure.DEVICE_TYPE_BOX则表示盒子；默认为手机
//         * 参数5:Push推送业务的secret，需要集成Push功能时必须传入Push的secret，否则传空
//         */
//        UMConfigure.init(this, "5b5c18f6a40fa301470001c4", "Umeng", UMConfigure.DEVICE_TYPE_PHONE, "");
//        UMConfigure.setLogEnabled(true);
//        PlatformConfig.setWeixin(Constants.WEXAPPID, "c5f9e6f534da85fa2cb6654fd0bbe5b1");
//        PlatformConfig.setSinaWeibo("1741067854", "071328feeee05976d44b8b62b3806b60", "http://open.weibo.com/apps/1741067854/privilege/oauth");
//        PlatformConfig.setQQZone("1106929359", "yArPjV6fsDggIU6I");
//        PlatformConfig.setAlipay("2019032263671117");
//        //环信客服sdk初始化
//        ChatClient.getInstance().init(this, new ChatClient.Options()
//                .setAppkey(Constant.HX_APPKEY)
//                .setTenantId(Constant.TENANT_ID)
//                .setConsoleLog(true));
        // Kefu EaseUI的初始化
        //UIProvider.getInstance().init(this);
        //JZVideoPlayer.setMediaInterface(new JZMediaIjkplayer());  //  ijkMediaPlayer
    }

    /**
     * 严谨模式
     */
    protected void setStrictMode() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
    }

    //static 代码段可以防止内存泄露
    static {
        //设置全局的Header构建器
        SmartRefreshLayout.setDefaultRefreshInitializer(new DefaultRefreshInitializer() {
            @Override
            public void initialize(@NonNull Context context, @NonNull RefreshLayout layout) {
                // 最大显示下拉高度/Header标准高度
                layout.setHeaderMaxDragRate(1.6f);
                // 最大显示上拉高度/Footer标准高度
                layout.setFooterMaxDragRate(1f);
                //全局设置（优先级最低）
                layout.setEnableAutoLoadMore(true);
                // //是否启用越界拖动（仿苹果效果）1.0.4
                layout.setEnableOverScrollDrag(false);
                layout.setEnableOverScrollBounce(true);
                layout.setEnableLoadMoreWhenContentNotFull(true);
                layout.setEnableScrollContentWhenRefreshed(true);
                layout.setPrimaryColorsId(R.color.gray, android.R.color.black);
            }
        });
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new DefaultRefreshHeaderCreator() {
            @NonNull
            @Override
            public RefreshHeader createRefreshHeader(@NonNull Context context, @NonNull RefreshLayout layout) {
                //全局设置主题颜色（优先级第二低，可以覆盖 DefaultRefreshInitializer 的配置，与下面的ClassicsHeader绑定）
                layout.setEnableHeaderTranslationContent(true);
                return new ClassicsHeader(context).setTimeFormat(new DynamicTimeFormat("更新于 %s"));
            }
        });
    }
}

