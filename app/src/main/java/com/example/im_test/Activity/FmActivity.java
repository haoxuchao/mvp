package com.example.im_test.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.im_test.R;
import com.example.im_test.common.Constants;


/**
 * @author Created by stone
 * @since 2019/2/23
 * <p>
 * Fragment Activity
 */
public class FmActivity extends AppCompatActivity {

    private int fm_key;
    private View mChildOfContent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        setContentView(R.layout.fm_act);
        fm_key = getIntent().getIntExtra(Constants.KEY_FRAGMENT, 0);
        addFragment();
    }

    public void addFragment() {
        switch (fm_key) {
            case Constants.IncidentDetail:
                break;
            case Constants.Login:
                break;
            case Constants.PushIncident:
                break;

        }
    }

    public void replaceFragment(Fragment fragment) {
        replaceFragment(R.id.fm_frame_layout, fragment);
    }

    public void replaceFragment(@IdRes int id, Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(id, fragment).commit();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onBackPressed() {
//        if (JZVideoPlayerStandard.backPress()) {
//            return;
//        }
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
//        JZVideoPlayerStandard.releaseAllVideos();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }
}

