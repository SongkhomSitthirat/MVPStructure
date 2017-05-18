package com.example.promptnow003.mvpstructure;

import android.app.Application;

import com.example.promptnow003.mvpstructure.tool.Contextor;

/**
 * Created by PromptNow003 on 18/5/2560.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
