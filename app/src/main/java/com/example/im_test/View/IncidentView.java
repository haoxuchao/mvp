package com.example.im_test.View;


import com.example.im_test.base.BaseView;
import com.example.im_test.entity.BaodanBean;

import java.util.List;

public interface IncidentView extends BaseView {
    void onSeachBao(List<BaodanBean> data);
}
