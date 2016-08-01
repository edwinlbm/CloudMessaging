package com.cloud.cloudmessaging.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by edwin on 31/07/16.
 */
public class MyFireBaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {

        //Getting registration token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        //Displaying token on logcat
        Log.d(TAG, "Refreshed token: " + refreshedToken);

    }

    private void sendRegistrationToServer(String token) {
        //You can implement this method to store the token on your server

    }
}