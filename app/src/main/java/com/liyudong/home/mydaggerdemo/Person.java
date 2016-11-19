package com.liyudong.home.mydaggerdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/19.
 */

public class Person {
    private String name;
    private int age;
    private Context context;

    public Person(){

    }

    public Person(Context context){
        this.context = context;
    }

    public Person(Context context,String name, int age){
        this.context = context;
        this.name = name;
        this.age = age;
    }

    public void selfIntroduction(){
        if(context != null) {
            Toast.makeText(context, "我是" + name + "今年" + age + "岁", Toast.LENGTH_SHORT).show();
        }
    }

    public String doSome(){
        return "Dagger成功了？";
    }
}
