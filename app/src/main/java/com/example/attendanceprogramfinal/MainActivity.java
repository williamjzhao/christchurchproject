package com.example.attendanceprogramfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void EmployeePageButton(View view) {
        Intent EmployeePage = new Intent(this, EmployeePage.class);
        startActivity(EmployeePage);


    }

    public void ChildPageButton(View view) {
        Intent ChildPage = new Intent(this, ChildPage.class);
        startActivity(ChildPage);
    }
}
