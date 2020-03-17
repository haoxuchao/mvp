package com.example.im_test.Fragment;


import android.util.Log;
import android.widget.TextView;

import com.example.im_test.App;
import com.example.im_test.Persenter.MainFpresenter;
import com.example.im_test.R;
import com.example.im_test.Utils.AppTools;
import com.example.im_test.Utils.SpUtil;
import com.example.im_test.Utils.ToastUtils;
import com.example.im_test.base.BaseFragment;
import com.example.im_test.common.Constants;

import butterknife.BindView;
import butterknife.OnClick;

public class MineFragment extends BaseFragment<MineFview, MainFpresenter> {
    @BindView(R.id.login_out)
    TextView loginOut;

    public static MineFragment newInstance() {

        return new MineFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.mine_frgm;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public MainFpresenter createPresenter() {
        return new MainFpresenter(getApp());
    }

    @OnClick(R.id.login_out)
    public void onViewClicked() {

    }



}
