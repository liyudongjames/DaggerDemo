package com.liyudong.home.mydaggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainComponent component = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        component.inject(this);
        Toast.makeText(this, person.doSome(), Toast.LENGTH_SHORT).show();

    }
}
