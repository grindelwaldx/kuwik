package com.example.kuwik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;

    DataOutputStream dos;
    Socket s;
    PrintWriter pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.ipAddress);
        e2 = (EditText) findViewById(R.id.message);
    }

   public void sendMessage(View v){
        MessageSender messageSender = new MessageSender();
        messageSender.execute(e1.getText().toString(),e2.getText().toString());
    }


}