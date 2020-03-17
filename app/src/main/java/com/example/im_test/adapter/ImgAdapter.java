package com.example.im_test.adapter;

import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.im_test.R;

import java.util.List;

public class ImgAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public ImgAdapter(@Nullable List<String> data) {
        super(R.layout.gv_filter_image,data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setVisible(R.id.iv_del,false);
        Glide.with(helper.itemView.getContext()).load(item).into((ImageView) helper.getView(R.id.fiv));

    }
}
