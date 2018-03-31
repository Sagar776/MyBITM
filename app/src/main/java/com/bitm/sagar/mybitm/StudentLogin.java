package com.bitm.sagar.mybitm;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by SAGAR on 30-03-2018.
 */

public class StudentLogin extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentlogin_layout);

    }


    public void staffLoginPage(View view) {

        Intent jump=new Intent(this,StaffLogin.class);
        jump.putExtra("Calling activity","MainActivity");
        this.startActivity(jump);

    }

    public void mainActivityPage(View view) {

        Intent jump=new Intent(this,MainActivity.class);
        jump.putExtra("Calling activity","MainActivity");
        this.startActivity(jump);

    }
}
