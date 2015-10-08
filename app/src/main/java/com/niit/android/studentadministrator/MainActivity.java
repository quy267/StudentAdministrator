package com.niit.android.studentadministrator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button buttonOk;
    private Button buttonCanel;
    private Button buttonBrowse;
    private Button buttonRegister;
    private Button buttonView;
    private Spinner spinnerCountry;
    private Spinner spinnerTrade;
    private EditText editTextYourName;
    private EditText editTextPhone;
    private EditText editTextEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBrowse = (Button) findViewById(R.id.button_Browse);
        buttonCanel = (Button) findViewById(R.id.button_Cancel);
        buttonOk = (Button) findViewById(R.id.button_OK);
        buttonRegister = (Button) findViewById(R.id.button_Register);
        buttonView = (Button) findViewById(R.id.button_View);
        spinnerCountry = (Spinner) findViewById(R.id.spinner_country);
        spinnerTrade = (Spinner) findViewById(R.id.spinner_trade);
        editTextEmail = (EditText) findViewById(R.id.text_email);
        editTextPhone = (EditText) findViewById(R.id.text_phone_number);
        editTextYourName = (EditText) findViewById(R.id.text_your_name);
        buttonBrowse.setOnClickListener(this);
        buttonView.setOnClickListener(this);
        buttonRegister.setOnClickListener(this);
        buttonOk.setOnClickListener(this);
        buttonCanel.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_Browse:
                break;
            case R.id.button_OK:
                break;
            case R.id.button_Cancel:
                break;
            case R.id.button_View:
                break;
            case R.id.button_Register:
                if (editTextYourName.getText().toString().trim().isEmpty()) {
                    Toast.makeText(this, "You did not enter a username", Toast.LENGTH_SHORT).show();
                    return;
                } else if (editTextPhone.getText().toString().trim().isEmpty()) {
                    Toast.makeText(this, "You did not enter a phone number", Toast.LENGTH_SHORT).show();
                    return;
                } else if (editTextEmail.getText().toString().trim().isEmpty()) {
                    Toast.makeText(this, "You did not enter a email", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    String yourName = editTextYourName.getText().toString();
                    String phoneNumber = editTextPhone.getText().toString();
                    String email = editTextEmail.getText().toString();
                    CheckValidation objValidation = new CheckValidation();
                    if (objValidation.checkPhoneNumber(phoneNumber)) {
                        Toast.makeText(this, "Register success", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        Toast.makeText(this, "Register fail.Please check register information ", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }


        }
    }
}
