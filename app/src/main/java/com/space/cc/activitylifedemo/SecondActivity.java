package com.space.cc.activitylifedemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Map;
import java.util.Set;

public class SecondActivity extends BaseActivity {
    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button but1=findViewById(R.id.but_02);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            FirstActivity.actionStart(SecondActivity.this,EMPTY_MAP);
            }
        });
    }
    /**
     *
     *@author CF
     *created at 2018/10/21/021  21:59
     */
    public  static void actionStart(Context context, Map<String,String> map){
        startAction(context, map,SecondActivity.class);
    }
}
