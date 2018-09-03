package com.example.shin.go4lunch.ui.login

import android.app.Activity
import android.content.Context

interface LoginContract {

    interface View{
        fun setLogginGo4Lunch()

    }

    interface Presenter{
        fun userIsLogged(activity: Activity)

            }
}