package com.example.im_test.Fragment;


import com.example.im_test.Persenter.ZmPresenter;
import com.example.im_test.R;
import com.example.im_test.View.ZmView;
import com.example.im_test.base.BaseFragment;

public class ZmFragment extends BaseFragment<ZmView, ZmPresenter> {
    public static ZmFragment newInstance() {
        return new ZmFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.zm_frgm;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public ZmPresenter createPresenter() {
        return new ZmPresenter(getApp());
    }
}
