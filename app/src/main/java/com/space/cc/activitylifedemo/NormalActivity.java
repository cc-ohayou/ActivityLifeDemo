package com.space.cc.activitylifedemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import java.util.Map;
import java.util.Set;

public class NormalActivity extends BaseActivity {
    private static final String TAG = "NormalActivity";
    private static String tmpDataKey="tmpData02";
   /**
    * @description
    * @author CF
    * created at
    */
   public static void actionStart(Context context, Map<String, String> map) {
       startAction(context, map, NormalActivity.class);
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        if (savedInstanceState != null) {
            String tmpDta = savedInstanceState.getString(tmpDataKey);
            Log.w(TAG, tmpDta);
        }
        Log.w(TAG, "create ");

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(tmpDataKey,"sdfsdfsdf");
        Log.w(TAG,"saveInstance");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w(TAG,"start ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG,"stop ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG,"destory ");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w(TAG,"pause ");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.w(TAG,"resume ");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG,"restart ");

    }
}
