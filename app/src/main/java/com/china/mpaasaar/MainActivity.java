package com.china.mpaasaar;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.alipay.mobile.framework.app.ui.BaseActivity;
import com.mpaas.configservice.adapter.api.MPConfigService;

public class MainActivity extends BaseActivity {

    private TextView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById = (TextView) findViewById(R.id.con);
    }

    public void getSwitch(View view) {
        String lywtest = MPConfigService.getConfig("lywtest");
        viewById.setText(lywtest);
    }
}