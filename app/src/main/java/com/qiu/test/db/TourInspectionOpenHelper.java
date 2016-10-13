package com.qiu.test.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lenovo on 2016/10/7.
 */

public class TourInspectionOpenHelper extends SQLiteOpenHelper {

    /**
     * 巡检任务表建表语句
     */
    public static final String CREATE_TOURINSPECTIONTASK = "create table tourinspection_task (" +
            "id integer primary key," +
            "category text," +
            "write_person text," +
            "exec_person text," +
            "exec_date text," +
            "state_backfill integer," +
            "dept text)";

    /**
     * 巡检设备表建表语句
     */
    public static final String CREATE_TOURINSPECTIONDEV = "create table tourinspection_dev (" +
            "id integer primary key," +
            "dev_id text," +
            "dev_name text," +
            "dev_type text," +
            "location text," +
            "pretour_key text ," +
            "remarks text," +
            "task_id integer," +  //对应巡检任务表的主键，是表的外键
            //回填信息
            "tour_date text," +
            "tour_person text," +
            "tour_key text," +
            "tour_end text," +
            "tour_remarks text)";

    public TourInspectionOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TOURINSPECTIONTASK);//创建巡检任务表
        sqLiteDatabase.execSQL(CREATE_TOURINSPECTIONDEV);//创建巡检设备表

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
