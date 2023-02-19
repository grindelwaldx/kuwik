package com.example.kuwik;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class MessageSender extends AsyncTask<String,Void,Void> {

    DataOutputStream dos;
    Socket s;
    PrintWriter pw;
    @Override
    protected Void doInBackground(String... voids) {
        String ip = voids[0];
        String message = voids[1];
        try {
            s = new Socket(ip,7800);
            pw = new PrintWriter(s.getOutputStream());
            pw.write("Connected success");
            pw.write(message);
            pw.flush();
            pw.close();
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

