package com.example.im_test.Persenter;

import com.google.gson.Gson;
import com.example.im_test.App;
import com.example.im_test.View.PushIncidentView;
import com.example.im_test.base.BasePresenter;
import com.example.im_test.entity.RequestBao;
import com.example.im_test.http.HttpResult;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class PushIncidentPerxsenter extends BasePresenter<PushIncidentView> {
    public PushIncidentPerxsenter(App app) {
        super(app);
    }

        public void createBao(RequestBao params) {
        getAppComponent().getAPIService()
                .createEvent(getRequestBody(params))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HttpResult<String>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(HttpResult<String> result) {
                        if (isViewAttached()) {
                            if (result != null) {
                                getView().onCreateBao(result.getData());
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        if (isViewAttached()) {
                            getView().onError(e);
                        }
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }

    public RequestBody getRequestBody(RequestBao baodanBean) {
       String json= new Gson().toJson(baodanBean);
        RequestBody requestBody =
                RequestBody.create(MediaType.parse("application/json; charset=utf-8"),json );
//        RequestBody.create(MediaType.parse("application/json; charset=utf-8"), );
//        Toast.makeText(getApp(),json,Toast.LENGTH_SHORT);

        return requestBody;
    }
}
