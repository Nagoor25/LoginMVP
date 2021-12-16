package com.example.loginmvp.presenter

import android.text.TextUtils
import com.example.loginmvp.view.LoginView

class LoginPresenterImpl(var loginView: LoginView) :LoginPresenter {

    override fun handleUserLogin(username: String, password: String) {
      if((TextUtils.isEmpty(username)||(TextUtils.isEmpty(password)))){
          loginView.showValidationErrorMess()
      }
        else{
            if(username.equals("nagoor")&&password.equals("1234")){
                loginView.loginSuccessfull()
            }else{
                loginView.loginFail()
            }
      }
    }
}