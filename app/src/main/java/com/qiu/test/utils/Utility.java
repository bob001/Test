package com.qiu.test.utils;

import android.content.Context;
import android.text.TextUtils;

import com.qiu.test.db.TourInspectionDB;
import com.qiu.test.model.TourInspectionDev;
import com.qiu.test.model.TourInspectionTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by lenovo on 2016/10/7.
 */

public class Utility {
    /**
     * 解析和处理服务器返回的json数据，并将解析出来的数据存储到数据库中
     */
    public synchronized static boolean handleResponse(TourInspectionDB tourInspectionDB, String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONObject jsonObject = new JSONObject(response);
//            JSONObject data = jsonObject.getJSONObject("msg");
                JSONArray dataArray = jsonObject.getJSONArray("msg");
                for(int i = 0;i < dataArray.length();i++) {
                    TourInspectionTask tourInspectionTask = new TourInspectionTask();
                    JSONObject data = dataArray.getJSONObject(i);
                    int taskId = data.getInt("id");
                    tourInspectionTask.setId(taskId);
                    tourInspectionTask.setCategory(data.getString("xslx"));
                    tourInspectionTask.setWritePerson(data.getString("bzr"));
                    tourInspectionTask.setExecPerson(data.getString("yxr"));
                    tourInspectionTask.setExecDate(data.getString("bzsj"));
                    tourInspectionTask.setState_backfill(0);//暂时用0，目前字段中没有回填字段
                    tourInspectionTask.setDept(data.getString("bzbm"));
                    tourInspectionDB.saveTourInspectionTask(tourInspectionTask);
                    JSONArray dataDevArr = data.getJSONArray("xssb");
                    for(int j = 0;j < dataDevArr.length();j++) {
                        JSONObject dataDev =  dataDevArr.getJSONObject(i);
                        TourInspectionDev tourInspectionDev = new TourInspectionDev();
                        tourInspectionDev.setId(dataDev.getInt("id"));
                        tourInspectionDev.setDevId(dataDev.getString("dev_id"));
                        tourInspectionDev.setDevName(dataDev.getString("dev_name"));
                        tourInspectionDev.setDevType(dataDev.getString("dev_type"));
                        tourInspectionDev.setLocation(dataDev.getString("dev_loc"));
                        tourInspectionDev.setPretourKey(dataDev.getString("yxzd"));
                        tourInspectionDev.setRemarks(dataDev.getString("yxbz"));
                        tourInspectionDev.setTaskId(taskId);
                        tourInspectionDev.setTourDate(dataDev.getString("xsrq"));
                        tourInspectionDev.setTourPerson(dataDev.getString("xsr"));
                        tourInspectionDev.setTourKey(dataDev.getString("xszd"));
                        tourInspectionDev.setTourEnd(dataDev.getString("xsjg"));
                        tourInspectionDev.setTourRemarks(dataDev.getString("xsbz"));
                        tourInspectionDB.saveTourInspectionDev(tourInspectionDev);
                    }
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
