package com.example.im_test.Utils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


import com.example.im_test.Activity.FmActivity;
import com.example.im_test.common.Constants;

import java.util.Map;

/**
 * @author Created by stone
 * @since 2019/2/26
 * <p>
 * app操作工具类
 */
public class AppTools {

    public static void startActivity(Context context, Class<?> cls) {
        Intent intent = new Intent(context, cls);
        context.startActivity(intent);
    }

    public static void startFmActivity(Context context, int fm_value) {
        Intent intent = new Intent(context, FmActivity.class);
        intent.putExtra(Constants.KEY_FRAGMENT, fm_value);
        context.startActivity(intent);
    }

    public static void startFmActivity(Context context, int fm_value, boolean develop) {
        Intent intent = new Intent(context, FmActivity.class);
        intent.putExtra(Constants.KEY_FRAGMENT, fm_value);
        // intent跨顺序跳转
        if (develop) {
            intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        }
        context.startActivity(intent);
    }

    /**
     * 通过map传递参数
     */
    public static void startFmActivity(Context context, int fm_value, Map<String, String> map) {
        Intent intent = new Intent(context, FmActivity.class);
        intent.putExtra(Constants.KEY_FRAGMENT, fm_value);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            intent.putExtra(entry.getKey(), entry.getValue());
        }
        context.startActivity(intent);
    }

    /**
     * 通过map传递参数
     */
    public static void startFmActivity(Context context, int fm_value, Map<String, String> map, boolean develop) {
        Intent intent = new Intent(context, FmActivity.class);
        intent.putExtra(Constants.KEY_FRAGMENT, fm_value);
        // intent跨顺序跳转
        if (develop) {
            intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            intent.putExtra(entry.getKey(), entry.getValue());
        }
        context.startActivity(intent);
    }

    /**
     * 通过bundle传递参数
     */
    public static void startFmActivity(Context context, int fm_value, Bundle bundle) {
        Intent intent = new Intent(context, FmActivity.class);
        intent.putExtra(Constants.KEY_FRAGMENT, fm_value);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
    /**
     * 用户未登录执行的操作
     */
//    public static void notLoginOperation(Context context) {
//        Intent intent = new Intent(context, FmActivity.class);
//        intent.putExtra(Constants.KEY_FRAGMENT, Constants.Login_Fragment);
//        context.startActivity(intent);
//    }
//
//    /**
//     * 跳转到app视频播放页面
//     */
//    public static void startVideoPlay(Context context, String video_url) {
//        Bundle bundle = new Bundle();
//        bundle.putString("video_url", video_url);
//        startFmActivity(context, Constants.Video_Player, bundle);
//    }

    /**
     * 用户未登录执行的操作
     */
    public static void notLoginOperation(Context context) {
        Intent intent = new Intent(context, FmActivity.class);
        intent.putExtra(Constants.KEY_FRAGMENT, Constants.Login);
        context.startActivity(intent);
    }
}
