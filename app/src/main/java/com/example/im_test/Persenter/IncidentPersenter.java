package com.example.im_test.Persenter;

import com.google.gson.Gson;
import com.example.im_test.App;
import com.example.im_test.View.IncidentView;
import com.example.im_test.base.BasePresenter;
import com.example.im_test.entity.BaodanBean;
import com.example.im_test.entity.SeachBao;
import com.example.im_test.http.HttpResult;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class IncidentPersenter extends BasePresenter<IncidentView> {

    public IncidentPersenter(App app) {
        super(app);
    }
    public void seachBao(SeachBao params) {
        getAppComponent().getAPIService()
                .seachBao(getRequestBody(params))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HttpResult<List<BaodanBean>>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                    }

                    @Override
                    public void onNext(HttpResult<List<BaodanBean>> result) {
                        if (isViewAttached()) {
                            if (result != null) {
                                getView().onSeachBao(result.getData());
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

    public RequestBody getRequestBody(SeachBao baodanBean) {
        String json= new Gson().toJson(baodanBean);
        RequestBody requestBody =
                RequestBody.create(MediaType.parse("application/json; charset=utf-8"),json );
//        RequestBody.create(MediaType.parse("application/json; charset=utf-8"), );

        return requestBody;
    }
}
