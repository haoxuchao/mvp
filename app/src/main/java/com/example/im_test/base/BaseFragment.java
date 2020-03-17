package com.example.im_test.base;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.example.im_test.Activity.FmActivity;
import com.example.im_test.App;
import com.example.im_test.Utils.ScreenUtils;
import com.example.im_test.Utils.SpUtil;
import com.example.im_test.common.Constants;
import com.example.im_test.entity.UserBean;
import com.hannesdorfmann.mosby.mvp.MvpFragment;
import com.jaeger.library.StatusBarUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.annotations.Nullable;

//import com.umeng.socialize.UMShareListener;
//import com.umeng.socialize.bean.SHARE_MEDIA;
//import com.zhangmu.andr_pro.App;
//import com.zhangmu.andr_pro.R;
//import com.zhangmu.andr_pro.common.Constants;
//import com.zhangmu.andr_pro.service.entity.UserDetailBean;
//import com.zhangmu.andr_pro.ui.activity.FmActivity;
//import com.zhangmu.andr_pro.ui.activity.MainActivity;
//import com.zhangmu.andr_pro.utils.ScreenUtils;
//import com.zhangmu.andr_pro.utils.SpUtil;
//import com.zhangmu.andr_pro.utils.ToastUtils;


/**
 * @author Created by stone
 * @since 2019/2/23
 */

public abstract class BaseFragment<V extends BaseView, P extends BasePresenter<V>> extends MvpFragment<V, P> {

    public static final String FRAG_ARG_DEPRECATED = "frag_arg_deprecated";

    protected Context context;

    protected View rootView;

    private Unbinder unbinder;

    protected Map<String, String> map = new HashMap<>();

//    protected UserDetailBean userBean = null;
//    protected UserDetailBean.MemberBean userInfo = null;
    protected String city;
    protected String login_type;
    protected UserBean user;

    // 设置刷新、加载的初始值
    protected int page = 1;
    protected boolean load_more = false;
    // 是否是第一次加载数据
    protected boolean first_init_data = true;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(getLayoutId(), null);
        unbinder = ButterKnife.bind(this, rootView);
        context = getActivity();
        getLocalUserData();
        initView();
        return rootView;
    }

    /**
     * 获得本地用户数据
     */
    protected void getLocalUserData() {
//        login_type = SpUtil.getString(context, Constants.LoginType);
//        user=SpUtil.getObject(context,Constants.UserBean);


    }

    /**
     * 设置状态栏颜色跟随顶部View的颜色
     *
     * @param tbLayout 顶部View
     */
    protected void setStatusBarToView(View tbLayout) {
        StatusBarUtil.setTransparentForImageView(getActivity(), tbLayout);
    }

    /**
     * 适配顶部状态栏方法
     *
     * @param title_bar title bar layout
     */
    protected void adapterStatus(View title_bar) {
        int status_height = ScreenUtils.getStatusHeight(getContext());
        ViewGroup.LayoutParams params = title_bar.getLayoutParams();
        params.height = params.height + status_height;
        title_bar.setLayoutParams(params);
        title_bar.setPadding(0, status_height, 0, 0);
    }

//    protected UserDetailBean getUserBean() {
//        return userBean;
//    }

    /**
     * 判断当前系统版本大于21以上才针对状态栏设置marginTop间距
     *
     * @return 是否成立
     */
    protected boolean api21Greater() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }

    /**
     * 设置状态栏字体颜色黑暗模式（黑）
     */
    protected void setLightMode() {
        if (getActivity() != null)
            StatusBarUtil.setLightMode(getActivity());
    }

    /**
     * 设置状态栏字体颜色为明亮模式（白）
     * 注：系统状态栏默认即使明亮模式
     */
    protected void setDarkMode() {
        if (getActivity() != null)
            StatusBarUtil.setDarkMode(getActivity());
    }

    /**
     * 获取上级页面传过来的bundle数据
     */
    protected Bundle getBundle() {
        Intent intent = Objects.requireNonNull(getActivity()).getIntent();
        if (intent.getExtras() != null)
            return intent.getExtras();
        return null;
    }

    // 初始化Map中的基础参数
    protected void initMap() {


    }

    /**
     * 判断数据是否为空
     */
    protected boolean dataIsEmpty(List<?> data) {
        return data == null || data.size() == 0;
    }

    /**
     * 判断数据是否为空
     */
    protected boolean dataIsEmpty(Object data) {
        return data == null;
    }

//    /**
//     * 判断是否登录
//     */
//    protected boolean notLoggedIn() {
//        return userInfo == null;
//    }

    /**
     * 获得空视图view
     *
     * @return layout
     */
//    protected View getEmptyView() {
//        return View.inflate(context, R.layout.no_data_layout, null);
//    }

   /* // 设置空视图中ImageView的图片
    protected ImageView setEmptyImage(View view, int res) {
        ImageView img = view.findViewById(R.id.no_data_img);
        img.setImageResource(res);
        return img;
    }

    // 设置空视图中TextView的文本
    protected TextView setEmptyText(View view, String text) {
        TextView tv = view.findViewById(R.id.no_data_tv);
        tv.setText(text);
        return tv;
    }
    // 设置空视图中TextView的文本
    protected TextView setEmptyText(View view, String text,int color) {
        TextView tv = view.findViewById(R.id.no_data_tv);
        tv.setText(text);
        tv.setTextColor(getResources().getColor(color));
        return tv;
    }

    // 设置空视图中Btn的文本，是否显示
    protected TextView setEmptyBtn(View view, String text, boolean visible) {
        TextView btn = view.findViewById(R.id.no_data_btn);
        btn.setText(text);
        btn.setVisibility(visible ? View.VISIBLE : View.GONE);
        return btn;
    }*/


    @Override
    public void onResume() {
        super.onResume();
        getLocalUserData();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        map = null;
        if (unbinder != null)
            unbinder.unbind();
    }

    public View getRootView() {
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }


    public App getApp() {
        return (App) getActivity().getApplication();
    }

    public <T> void toSetList(List<T> list, List<T> newList, boolean isMore) {

        if (list != null && newList != null) {
            synchronized (BaseFragment.class) {
                if (!isMore) {
                    list.clear();
                }
                list.addAll(newList);
            }
        }
    }

    protected Intent getContentActivityIntent() {
        return new Intent(getContext(), FmActivity.class);
    }

    protected Intent getFragmentIntent(int fragmentKey) {
        Intent intent = getContentActivityIntent();
        intent.putExtra(Constants.KEY_FRAGMENT, fragmentKey);
        return intent;
    }

    protected void startActivity(Class<?> cls) {
        startActivity(new Intent(context, cls));
    }

    protected void finish() {
        getActivity().finish();
    }

  /*  // 友盟分享回调监听-该监听可以共用
    protected UMShareListener umShareListener = new UMShareListener() {
        @Override
        public void onStart(SHARE_MEDIA share_media) {
        }

        @Override
        public void onResult(SHARE_MEDIA share_media) {
            ToastUtils.showToast(context, "分享成功");
        }

        @Override
        public void onError(SHARE_MEDIA share_media, Throwable throwable) {
            ToastUtils.showToast(context, "分享失败：" + throwable.getMessage());
        }

        @Override
        public void onCancel(SHARE_MEDIA share_media) {
            ToastUtils.showToast(context, "分享已取消");
        }
    };*/

   /* *//**
     * 判断MainActivity
     *
     * @return
     *//*
    protected boolean mainWhetherExist() {
        MainActivity mainInstance = MainActivity.getInstance();
        return mainInstance == null || mainInstance.isDestroyed() || mainInstance.isFinishing();
    }*/

   /* *//**
     * 复制内容到剪贴板
     *
     * @param content 需要复制的内容
     *//*
    protected void copyToClipBoard(String content) {
        // 获取系统剪贴板
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        // 创建一个剪贴数据集，包含一个普通文本数据条目（需要复制的数据）
        ClipData clipData = ClipData.newPlainText(null, content);
        // 把数据集设置（复制）到剪贴板
        clipboard.setPrimaryClip(clipData);
        ToastUtils.showToast(context, R.string.copy_to_clip_board_str);
    }*/

    /**
     * 隐藏软键盘
     *
     * @param et
     */
    protected void hideInputMethod(EditText et) {
        InputMethodManager imm = (InputMethodManager) context.getApplicationContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(et.getWindowToken(), 0);
        et.clearFocus();
    }

    /**
     * 显示软键盘
     *
     * @param et
     */
    public void showInputMethod(final EditText et) {
        et.requestFocus();
        InputMethodManager imm = (InputMethodManager) context.getApplicationContext()
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(et, InputMethodManager.SHOW_IMPLICIT);
    }

    public abstract int getLayoutId();

    public abstract void initView();

    public abstract void initData();
}
