package com.bitm.sagar.mybitm;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by SAGAR on 30-03-2018.
 * **/

public class StaffLogin extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.stafflogin_layout);

    }

    public void mainActivityPage(View view) {

        Intent jump=new Intent(this,MainActivity.class);
        jump.putExtra("Calling activity","MainActivity");
        this.startActivity(jump);

    }

    public void jumpToStaffsignup(View view) {


    }

    public void jumpToStudentSignin(View view) {

        Intent jump=new Intent(this,StudentLogin.class);
        jump.putExtra("Calling activity","MainActivity");
        this.startActivity(jump);

    }
}
