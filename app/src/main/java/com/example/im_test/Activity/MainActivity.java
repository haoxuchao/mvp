package com.example.im_test.Activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.example.im_test.App;
import com.example.im_test.Fragment.CircleFragment;
import com.example.im_test.Fragment.HomeFragment;
import com.example.im_test.Fragment.MarketFragment;
import com.example.im_test.Fragment.MineFragment;
import com.example.im_test.Fragment.ZmFragment;
import com.example.im_test.Persenter.MainPersenter;
import com.example.im_test.R;
import com.example.im_test.Utils.AppTools;
import com.example.im_test.Utils.SpUtil;
import com.example.im_test.Utils.ToastUtils;
import com.example.im_test.View.MainView;
import com.example.im_test.base.BaseActivity;
import com.example.im_test.common.Constants;
import com.example.im_test.entity.UserBean;
import com.tbruyelle.rxpermissions2.RxPermissions;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.Objects;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * @author Created by stone
 * @since 2019/2/23
 * <p>
 * 首页-MainActivity
 */
public class MainActivity extends BaseActivity<MainView, MainPersenter> implements MainView, RadioGroup.OnCheckedChangeListener {

    @BindView(R.id.main_radio_group)
    RadioGroup mainRadioGroup;
    @BindView(R.id.home_radio_btn)
    RadioButton homeRadioBtn;
    @BindView(R.id.circle_radio_btn)
    RadioButton circleRadioBtn;
    @BindView(R.id.zm_radio_btn)
    RadioButton zmRadioBtn;
    @BindView(R.id.main_zm_img)
    ImageView mainZmImg;
    @BindView(R.id.market_radio_btn)
    RadioButton marketRadioBtn;
    @BindView(R.id.mine_radio_btn)
    RadioButton mineRadioBtn;
    @BindView(R.id.main_act_btm_v)
    public View mainActBtmV;
    @BindView(R.id.main_frame_container)
    FrameLayout mainFrameContainer;
    @BindView(R.id.main_btm_wire)
    View mainBtmWire;
    @BindView(R.id.float_btn)
    FloatingActionButton floatBtn;
    @BindView(R.id.root_layout)
    ConstraintLayout rootLayout;

    private HomeFragment homeFragment;
    private CircleFragment circleFragment;
    private ZmFragment zmFragment;
    private MarketFragment marketFragment;
    private MineFragment mineFragment;

    private static MainActivity mainInstance = null;
    private String login_type;

    public static MainActivity getInstance() {
        return mainInstance;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.setMainActivity(this);
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public int getLayoutId() {
        return R.layout.main_act;
    }

    @Override
    public void initView() {
        mainInstance = this;
        mainRadioGroup.setOnCheckedChangeListener(this);
        // 默认显示第一个
        showAsFragment(0);
//        Logger.w("jpush-registration_id：" + JPushInterface.getRegistrationID(this));
    }

    @SuppressLint({"CheckResult", "RestrictedApi"})
    @Override
    public void initData() {
        login_type= SpUtil.getString(MainActivity.this, Constants.LoginType);
        if(login_type!=null&&!login_type.equals("网格管理员")){
           floatBtn.setVisibility(View.GONE);
        }else{
            floatBtn.setVisibility(View.VISIBLE);
        }
    }

//djshdjsjdhs
    @SuppressLint("MissingSuperCall")
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //super.onSaveInstanceState(outState);
    }

    @NonNull
    @Override
    public MainPersenter createPresenter() {
        return new MainPersenter(getApp());
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.home_radio_btn:
                showAsFragment(0);
                break;
            case R.id.circle_radio_btn:
                showAsFragment(1);
                break;
            case R.id.zm_radio_btn:
                showAsFragment(2);
                break;
            case R.id.market_radio_btn:
                showAsFragment(3);
                break;
            case R.id.mine_radio_btn:
                showAsFragment(4);
                break;
            default:
                break;
        }
    }

    /**
     * 显示指定的Fragment
     *
     * @param index 指定索引位置
     */
    private void showAsFragment(int index) {
        switchZmIcon(index == 2);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFragment(transaction);
        transaction.show(createCurrentFragment(transaction, index)).commitAllowingStateLoss();
    }

    private Fragment createCurrentFragment(FragmentTransaction transaction, int index) {
        Fragment fragment = null;
        switch (index) {
            case 0:
                if (homeFragment == null) {
                    homeFragment = HomeFragment.newInstance();
                    transaction.add(R.id.main_frame_container, homeFragment);
                }
                fragment = homeFragment;
                break;
            case 1:
                if (circleFragment == null) {
                    circleFragment = CircleFragment.newInstance();
                    transaction.add(R.id.main_frame_container, circleFragment);
                }
                fragment = circleFragment;
                break;
            case 2:
                if (zmFragment == null) {
                    zmFragment = ZmFragment.newInstance();
                    transaction.add(R.id.main_frame_container, zmFragment);
                }
                fragment = zmFragment;
                break;
            case 3:
                if (marketFragment == null) {
                    marketFragment = MarketFragment.newInstance();
                    transaction.add(R.id.main_frame_container, marketFragment);
                }
                fragment = marketFragment;
                break;
            case 4:
                if (mineFragment == null) {
                    mineFragment = MineFragment.newInstance();
                    transaction.add(R.id.main_frame_container, mineFragment);
                }
                fragment = mineFragment;
                break;
            default:
                break;
        }
        return fragment;
    }

    /**
     * 隐藏所有Fragment
     *
     * @param transaction transaction
     */
    private void hideAllFragment(FragmentTransaction transaction) {
        if (homeFragment != null) {
            transaction.hide(homeFragment);
        }
        if (circleFragment != null) {
//            JZVideoPlayerStandard.goOnPlayOnPause();
            transaction.hide(circleFragment);
        }
        if (zmFragment != null) {
            transaction.hide(zmFragment);
        }
        if (marketFragment != null) {
            transaction.hide(marketFragment);
        }
        if (mineFragment != null) {
            transaction.hide(mineFragment);
        }
    }

    private void switchZmIcon(boolean checked) {
        mainZmImg.setImageResource(checked ? R.mipmap.dhl_zm_select_icon : R.mipmap.dhl_zm_unselected_icon);
    }

    @OnClick({R.id.main_zm_img, R.id.float_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.main_zm_img:
                mainRadioGroup.check(R.id.zm_radio_btn);
                showAsFragment(2);
                break;
            case R.id.float_btn:
                RxPermissions rxPermissions = new RxPermissions(Objects.requireNonNull(this));
                rxPermissions.request(Manifest.permission.ACCESS_FINE_LOCATION)
                        .subscribe(new Consumer<Boolean>() {
                            @Override
                            public void accept(Boolean aBoolean) throws Exception {
                                AppTools.startFmActivity(MainActivity.this, Constants.PushIncident);
                            }
                        });
                break;
            default:
                break;
        }
    }

//    @Override
//    public void onLocationResult(AMapLocation aMapLocation) {
//        if (aMapLocation != null) {
//            LocationEntity locationEntity = LocationEntity.generateEntity(aMapLocation);
//            SpUtil.putString(this, Constants.City, aMapLocation.getCity());
//            SpUtil.putObject(this, Constants.LOCATION_ENTITY, locationEntity);
//        }
//    }

    @Override
    public void onBackPressed() {
//        if (JZVideoPlayerStandard.backPress()) {
//            return;
//        }
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
//        JZVideoPlayerStandard.goOnPlayOnPause();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(Integer index) {
//        Logger.w("" + index);
        switch (index) {
            case 0:
                homeRadioBtn.setChecked(true);
                break;
            case 1:
                circleRadioBtn.setChecked(true);
                break;
            case 2:
                zmRadioBtn.setChecked(true);
                break;
            case 3:
                marketRadioBtn.setChecked(true);
                break;
            case 4:
                mineRadioBtn.setChecked(true);
                break;
        }
        showAsFragment(index);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
//        JZVideoPlayerStandard.releaseAllVideos();
    }


    private long mExitTime;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                ToastUtils.showToast(this, "再按一次退出程序");
                mExitTime = System.currentTimeMillis();
            } else {
                System.exit(0);
                Process.killProcess(Process.myPid());
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void showProgress() {
    }

    @Override
    public void onCompleted() {
    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        //ToastUtils.showToast(this, e.getMessage());
    }
}
