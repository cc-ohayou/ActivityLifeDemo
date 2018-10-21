package com.space.cc.activitylifedemo;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";
    private static String tmpDataKey="tmpData";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            String tmpDta=savedInstanceState.getString(tmpDataKey);
            Log.w(TAG,tmpDta);
        }
        setContentView(R.layout.activity_main);
        Button butDialog=findViewById(R.id.start_dialog_act);
        Button butNormal=findViewById(R.id.start_normal_act);
        butNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               FirstActivity.actionStart(MainActivity.this,EMPTY_MAP);
            }
        });
        butDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondActivity.actionStart(MainActivity.this,EMPTY_MAP);
            }
        });
        Log.w(TAG,"create ");

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tmpData=((EditText)findViewById(R.id.edit_message)).getText().toString();
        outState.putString(tmpDataKey,tmpData);
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
