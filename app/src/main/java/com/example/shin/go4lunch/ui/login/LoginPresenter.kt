package com.example.shin.go4lunch.ui.login

import android.app.Activity
import android.content.Intent
import android.widget.Toast
import com.example.shin.go4lunch.R
import com.example.shin.go4lunch.ui.firtsactivity.FirtsActivity
import com.firebase.ui.auth.AuthUI
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import java.util.*


class LoginPresenter : LoginContract.Presenter {

    private val RC_SIGN_IN = 123


    override fun userIsLogged(activity: Activity) {

        val context = activity.applicationContext

        if ( FirebaseAuth.getInstance().currentUser != null){
            val intent = Intent(context, FirtsActivity::class.java)
            activity.startActivity(intent)
        }else{
            activity.startActivityForResult( AuthUI.getInstance()
                    .createSignInIntentBuilder()
                    .setTheme(R.style.LoginTheme)
                    .setAvailableProviders(Arrays.asList(
                            AuthUI.IdpConfig.FacebookBuilder().build(),
                            AuthUI.IdpConfig.GoogleBuilder().build()))
                    .setIsSmartLockEnabled(false, true)
                    .build(),RC_SIGN_IN)
        }
    }







}