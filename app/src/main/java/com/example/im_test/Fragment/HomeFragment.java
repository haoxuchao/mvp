package com.example.im_test.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.im_test.Persenter.HomePerenter;
import com.example.im_test.R;
import com.example.im_test.View.HomeView;
import com.example.im_test.base.BaseFragment;
import com.shehuan.niv.NiceImageView;

import java.util.ArrayList;

import butterknife.BindView;

public class HomeFragment extends BaseFragment<HomeView, HomePerenter> {


    @BindView(R.id.top_view)
    View topView;
    @BindView(R.id.user_img)
    NiceImageView userImg;
    @BindView(R.id.username)
    TextView username;
    @BindView(R.id.balance)
    TextView balance;
    @BindView(R.id.balance_tv)
    TextView balanceTv;
    @BindView(R.id.task_amount)
    TextView taskAmount;
    @BindView(R.id.task_amount_tv)
    TextView taskAmountTv;
    @BindView(R.id.referral_bonuses)
    TextView referralBonuses;
    @BindView(R.id.referral_bonuses_tv)
    TextView referralBonusesTv;
    @BindView(R.id.amount_frozen)
    TextView amountFrozen;
    @BindView(R.id.amount_frozen_tv)
    TextView amountFrozenTv;
    @BindView(R.id.t_bottom_view)
    View tBottomView;
    @BindView(R.id.scheduling_tv)
    TextView schedulingTv;
    @BindView(R.id.shu_view)
    View shuView;
    @BindView(R.id.scheduling_num)
    TextView schedulingNum;
    @BindView(R.id.scheduling_money)
    TextView schedulingMoney;
    @BindView(R.id.punctuality_tv)
    TextView punctualityTv;
    @BindView(R.id.team_management)
    TextView teamManagement;
    @BindView(R.id.order_management)
    TextView orderManagement;
    @BindView(R.id.resource_management)
    TextView resourceManagement;
    @BindView(R.id.app_settings)
    TextView appSettings;
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private String[] mTabTitles;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        StatusBarUtil.setTranslucentForImageView(getActivity(), 0,);
    }

    @Override
    public int getLayoutId() {
        return R.layout.home_frgm;
    }

    @Override
    public void initView() {

    }

    @Override
    public void onResume() {
        super.onResume();
//        if (login_type == null || login_type.equals("")) {
//            AppTools.notLoginOperation(context);
//            //userInfo.setMember_id("558");//693
//            //userInfo.setMember_token("3d8f3b6b-5250-46db-ba19-2ad8bb3e523b");
//        }
    }

    @Override
    public void initData() {
    }

    @Override
    public HomePerenter createPresenter() {
        return new HomePerenter(getApp());
    }
}
