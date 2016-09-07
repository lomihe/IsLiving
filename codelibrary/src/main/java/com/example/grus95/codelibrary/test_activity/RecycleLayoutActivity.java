package com.example.grus95.codelibrary.test_activity;

import android.os.Bundle;

import com.example.grus95.baselibrary.recycler_refresh_layout.realization_demo.demo.OpenProjectRecyclerFragment;
import com.example.grus95.baselibrary.ui.activity.BaseActivity;
import com.example.grus95.codelibrary.R;

public class RecycleLayoutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initFirst() {

    }

    @Override
    protected int setContentView() {
        return R.layout.activity_recycle_layout;
    }

    @Override
    protected void initView() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.recycle_fragment_container, OpenProjectRecyclerFragment.newInstance())
                .commit();
    }

    @Override
    protected void setToolbar() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initOther() {

    }
}
