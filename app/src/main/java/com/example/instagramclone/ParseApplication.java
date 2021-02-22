package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("8UubW2j3jO2biqMsy3b1vVTgeHoGGnlhTVsEeJIl")
                .clientKey("2CUDNkDRaRBhuuY4zO7dWsbToEExuTFhNgqIACJP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}