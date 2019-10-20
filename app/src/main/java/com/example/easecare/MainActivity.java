package com.example.easecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSubmit;
    private EditText txtFirstDigit, txtSecondDigit, txtThirdDigit, txtFourthDigit, txtFifthDigit;

    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFirstDigit = (EditText) findViewById(R.id.etFirst);
        txtSecondDigit = (EditText) findViewById(R.id.etSecond);
        txtThirdDigit = (EditText) findViewById(R.id.etThird);
        txtFourthDigit = (EditText) findViewById(R.id.etFourth);
        txtFifthDigit = (EditText) findViewById(R.id.etFifth);

        btnSubmit = (Button) findViewById(R.id.btnConfirm);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                password = "";
                password += txtFirstDigit.getText().toString() + txtSecondDigit.getText().toString() + txtThirdDigit.getText().toString();
                password += txtFourthDigit.getText().toString() + txtFifthDigit.getText().toString();

                System.out.println(">>>>>>>>>>>>>>Here" + password);
                if(password.equals("hack9")) {
                    Intent mainMenu = new Intent(MainActivity.this, MainPage.class);
                    startActivity(mainMenu);
                }
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
