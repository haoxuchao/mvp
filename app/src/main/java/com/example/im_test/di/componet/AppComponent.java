package com.example.im_test.di.componet;

import android.content.Context;

import com.example.im_test.App;
import com.example.im_test.di.module.AppModule;
import com.example.im_test.http.APIService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Created by stone
 * @since 2018/7/10
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(App app);

    Context getContext();

    APIService getAPIService();

}
