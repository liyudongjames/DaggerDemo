package com.liyudong.home.mydaggerdemo;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/11/19.
 */

@Module
public class MainModule {

    private Context mContext;
    private String mName;
    private int mAge;

    @Provides
    Person providerPerson(){
        return new Person();
    }

    @Provides
    Context providerContext(){
        return mContext;
    }

    @Provides
    String providerName(){
        return mName;
    }

    @Provides
    int providerAge(){
        return mAge;
    }

    @Provides
    Person providerPersonByContext(Context context,String name ,int age){
        return new Person(context,name ,age);
    }
}
