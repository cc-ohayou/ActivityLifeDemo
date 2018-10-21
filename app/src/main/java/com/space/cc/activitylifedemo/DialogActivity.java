package com.space.cc.activitylifedemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Map;

public class DialogActivity extends BaseActivity {
    private static final String TAG = "DialogActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        Log.w(TAG,"create ");

    }

    /**
     * @description
     * @author CF
     * created at
     */
    public  static void actionStart(Context context, Map<String,String> map){
            startAction(context, map,DialogActivity.class);
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
