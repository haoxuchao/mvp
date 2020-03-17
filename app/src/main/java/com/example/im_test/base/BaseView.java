package com.example.im_test.base;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * @author Created by stone
 * @since 2019/2/23
 */

public interface BaseView extends MvpView{

    void showProgress();

    void onCompleted();

    void onError(Throwable e);
}
