package com.qiu.test.utils;

/**
 * Created by lenovo on 2016/9/30.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);

}
