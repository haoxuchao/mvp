package com.example.im_test.Fragment;


import com.example.im_test.Persenter.MarketPresenter;
import com.example.im_test.R;
import com.example.im_test.View.MarketView;
import com.example.im_test.base.BaseFragment;

public class MarketFragment extends BaseFragment<MarketView, MarketPresenter> {
    public static MarketFragment newInstance() {
        return new MarketFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.market_grgm;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public MarketPresenter createPresenter() {
        return new MarketPresenter(getApp());
    }
}
