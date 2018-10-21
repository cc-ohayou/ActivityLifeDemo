package com.space.cc.activitylifedemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Map;
import java.util.Set;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button but01 = findViewById(R.id.first_button);
        but01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(FirstActivity.this,
                        "click on but01", Toast.LENGTH_SHORT).show();*/
                //跳转到另外一个活动页面
                //跳转到系统浏览器 打开网页
//                Intent  intent=new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));
                //调用系统拨号界面
//                intent.setData(Uri.parse("tel:10086"));
                SecondActivity.actionStart(FirstActivity.this,EMPTY_MAP);
            }
        });
    }


    /**
     *方便找出都有哪里调用启动了此活动  模板快捷键 as
     *@author CF
     *created at 2018/10/21/021  21:42
     */
    public  static void actionStart(Context context, Map<String,String> map){
        startAction(context, map,FirstActivity.class);
    }


}
