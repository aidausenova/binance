package com.mobileservice.myapplication77;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.SecondActivity;
import com.mobileservice.myapplication77.R;

public class MainActivity extends AppCompatActivity {

    EditText login,password;
    Button input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.editTextTextPersonName2);
        password=findViewById(R.id.editTextTextPersonName);
        input=findViewById(R.id.button);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        input.setOnClickListener(v -> {
            if(login.getText().toString().equals("")&&password.getText().toString().equals("")){
                builder.setMessage("Неправильный ввод");
                builder.create();
                builder.show();
            }
            else{
                builder.setMessage("Успешный вход!");
                builder.create();
                builder.show();
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

}