package com.example.im_test.adapter;

import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.im_test.R;
import com.example.im_test.entity.BaodanBean;


import java.util.List;

public class IncidentAdapter extends BaseQuickAdapter<BaodanBean, BaseViewHolder> {
    public IncidentAdapter(@Nullable List<BaodanBean> data) {
        super(R.layout.incident_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, BaodanBean item) {
        helper.setText(R.id.incident_name, item.getEventName());
        helper.setText(R.id.incident_stutas, item.getEventStatus());
        helper.setText(R.id.incident_time, item.getCreateTime());
        if (item.getCreateFile() != null && !item.getCreateFile().equals(""))
            Glide.with(helper.itemView.getContext()).load(getdimg((String) item.getCreateFile())).into((ImageView) helper.getView(R.id.incident_img));
        helper.addOnClickListener(R.id.item);
    }

    public String getdimg(String img) {
        if (img.contains(",")) {
            String str = img.split(",")[0].trim();
            return str;
        }
        return "";
    }
}
