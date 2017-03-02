package kr.co.mash_up.crema.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import kr.co.mash_up.crema.R;
import kr.co.mash_up.crema.UserManager;
import kr.co.mash_up.crema.util.Defines;
import teaspoon.annotations.OnUi;

/**
 * Created by sun on 2017. 1. 25..
 */

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_main);

        boolean isSigned = UserManager.getInstance().isSigned();

        if (isSigned) {
            startHomeActivity();
        } else {
            startSignInActivity();
        }
    }


    @OnUi(delay = 3000)
    private void startSignInActivity() {
        Intent intent = new Intent(Defines.INTENT_SIGN_IN_ACTIVITY);
        startActivity(intent);
        finish();
    }


    @OnUi(delay = 3000)
    private void startHomeActivity() {
        Intent intent = new Intent(Defines.INTENT_NEARBY_CAFE_ACTIVITY);
        startActivity(intent);
        finish();
    }
}

