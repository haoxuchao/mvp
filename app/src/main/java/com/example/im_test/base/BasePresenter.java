package com.example.im_test.base;


import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.example.im_test.App;
import com.example.im_test.di.componet.AppComponent;

import javax.inject.Inject;

/**
 * @author Created by stone
 * @since 2019/2/23
 */

public class BasePresenter<V extends BaseView> extends MvpBasePresenter<V> {

    private App app;

    private AppComponent mAppComponent;

    @Inject
    public BasePresenter(App app) {
        super();
        this.app = app;
        mAppComponent = app.getAppComponent();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public App getApp() {
        return getApp();
    }

    @Override
    public boolean isViewAttached() {
        return super.isViewAttached();
    }
}
