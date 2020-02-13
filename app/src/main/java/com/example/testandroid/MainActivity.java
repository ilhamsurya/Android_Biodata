package com.example.testandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText nama,email,telp;
    private TextView viewnama, viewemail,viewtelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        /*
        nama = (EditText) findViewById(R.id.input_nama);
        telp = (EditText) findViewById(R.id.input_telp);
        email = (EditText) findViewById(R.id.input_email);
        button=(Button) findViewById(R.id.button_submit);
        viewnama = (TextView) findViewById(R.id.text_view_nama);
        viewemail = (TextView) findViewById(R.id.text_view_email);
        viewtelp = (TextView) findViewById(R.id.text_view_telp);


        //Button init
        button = (Button) findViewById((R.id.button_submit));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 hiddenKeyboard(v);
                 String nama_input = nama.getText().toString();
                 viewnama.setText(nama_input);
                 String email_input = email.getText().toString();
                 viewemail.setText(email_input);
                 String telp_input = telp.getText().toString();
                 viewtelp.setText(telp_input);
            }
        });
        */


    }
    private void hiddenKeyboard(View v) {
        InputMethodManager keyboard = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
        keyboard.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}
