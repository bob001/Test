package com.qiu.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.qiu.test.utils.HttpCallbackListener;
import com.qiu.test.utils.HttpUtil;

public class MainActivity extends AppCompatActivity {

    String address = "http://wxeis.eis.swdnkj.com/hrkweb/rest/patrol/patrolmission?useroid=%E8%A2%81%E6%96%87%E6%B5%A9";
    private String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HttpUtil.sendHttpRequest(address, new HttpCallbackListener() {
            @Override
            public void onFinish(String response) {
                //将接收的数据保存

            }

            @Override
            public void onError(Exception e) {

            }
        });
    }
}
