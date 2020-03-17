package com.example.im_test.Fragment;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.example.im_test.Activity.MainActivity;
import com.example.im_test.App;
import com.example.im_test.Persenter.LoginPersenter;
import com.example.im_test.R;
import com.example.im_test.Utils.AppTools;
import com.example.im_test.Utils.SpUtil;
import com.example.im_test.Utils.ToastUtils;
import com.example.im_test.View.LoginView;
import com.example.im_test.base.BaseFragment;
import com.example.im_test.common.Constants;
import com.example.im_test.entity.UserBean;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginFragment extends BaseFragment<LoginView, LoginPersenter> {




    @Override
    public int getLayoutId() {
        return R.layout.login_frag;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    // SpUtil.putString(getContext(),Constants.LoginType,"report");
    @Override
    public LoginPersenter createPresenter() {
        return new LoginPersenter(getApp());
    }


//    public boolean ischeck() {
//        if (TextUtils.isEmpty(userName.getText().toString().trim())) {
//            ToastUtils.showToast(getContext(), "请输入用户名");
//            return false;
//        }
//        if (TextUtils.isEmpty(userPwd.getText().toString().trim())) {
//            ToastUtils.showToast(getContext(), "请输入密码");
//            return false;
//        }
//
//
//        return true;
//    }


//    @OnClick(R.id.login)
//    public void onViewClicked() {
//        if (ischeck()) {
//
//        }
//
//    }

}
