package com.example.loginmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginmvp.presenter.LoginPresenterImpl
import com.example.loginmvp.view.LoginView
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginPresenterImpl= LoginPresenterImpl(this)
        login.setOnClickListener {
            val usern=username.text.toString()
            val passw=password.text.toString()
            loginPresenterImpl.handleUserLogin(usern,passw)
        }
    }

    override fun showValidationErrorMess() {
        Toast.makeText(this,"Please enter Username and Password",Toast.LENGTH_LONG).show()
    }

    override fun loginSuccessfull() {
        Toast.makeText(this,"Login successful",Toast.LENGTH_LONG).show()
    }

    override fun loginFail() {
        Toast.makeText(this,"Invalid Username or password",Toast.LENGTH_LONG).show()
    }
}