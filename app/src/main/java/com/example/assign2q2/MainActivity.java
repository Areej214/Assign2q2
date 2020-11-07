package com.example.assign2q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.OptionalDataException;


public class MainActivity extends AppCompactActivity
{
    String email[]={"abc@gmail.com","def@gmail.com","ghi@gmail.com","jkl@gmail.com","mno@gmail.com","pqr@gmail.com","stu@gmail.com","uvw@gmail.com","xyz@gmail.com","areej@gmail.com"};
    int passward[]={1,2,3,4,5,6,7,8,9,10};
    EditText ed1;
    EditText ed2;

    protected void onCreate(Bundle savedInstancesState)
    {
        Object savedInstanceState = new Object();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText) findViewById(R.id.email);
        passward=(EditText)findViewById(R.id.passward);
        signin=(Button) findViewById(R.id.signin);
        msg=(TextView) finndViewById(R.id.msg);
    }

    private void setContentView(int activity_main) {
    }

    public void signIn(View v)
    {
        OptionalDataException emails;
        String email = emails.getText().toString();
        for (int i=0;i< emails.length; i++)
            if ((email.matches(String.valueOf(i)))&&(p.matches(passward[i]))){
        msg.setText("you have successfully signed in.");
    }
    else
        {
            msg.setText("Invalid email and Passward.");
        }
    }

}


