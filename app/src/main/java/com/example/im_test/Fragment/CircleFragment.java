package com.example.im_test.Fragment;


import com.example.im_test.Persenter.CirclePresenter;
import com.example.im_test.R;
import com.example.im_test.View.CircleView;
import com.example.im_test.base.BaseFragment;

public class CircleFragment extends BaseFragment<CircleView, CirclePresenter> {
    public static CircleFragment newInstance() {
        return new CircleFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.circle_frgm;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public CirclePresenter createPresenter() {
        return new CirclePresenter(getApp());
    }
}
