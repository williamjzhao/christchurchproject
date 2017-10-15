package com.example.attendanceprogramfinal;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by 1947083026 on 5/1/2017.
 */

public class QRResults extends Activity {
    public static final String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qrresults);


        // This is the message that the QR code holds. Will be changed when the QR code holds data

    }


    public void ClockOutButton(View view) {
        Intent QRResults = getIntent();
        Intent QRResultIn = new Intent(QRResults.this, ClockOutPage.class);
        QRResultIn.putExtra(EXTRA_MESSAGE, QRResults.getStringExtra(EmployeePage.EXTRA_MESSAGE));

        startActivity(QRResultIn);

    }

    public void ClockInButton(View view) {
        Intent QRResults = getIntent();
        Intent QRResultIn = new Intent(QRResults.this, ClockInPage.class);
        QRResultIn.putExtra(EXTRA_MESSAGE, QRResults.getStringExtra(EmployeePage.EXTRA_MESSAGE));

        startActivity(QRResultIn);
    }
}