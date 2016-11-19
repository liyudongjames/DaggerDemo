package com.liyudong.home.mydaggerdemo;

import dagger.Component;

/**
 * Created by Administrator on 2016/11/19.
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
