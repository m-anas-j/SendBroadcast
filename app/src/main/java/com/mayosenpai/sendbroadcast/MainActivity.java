 package com.mayosenpai.sendbroadcast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendButtonClicked(View view)
    {
        Intent i = new Intent();
        i.setAction("com.mayosenpai.sendbroadcast");
        //i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        EditText sendMsg = (EditText)findViewById(R.id.sendMsg);
        String myMsg = sendMsg.getText().toString();
        i.putExtra("msgFromSendBroadcast",myMsg);
        //Button sendButton = (Button)findViewById(R.id.sendButton);
        i.setType("text/plain");
        sendBroadcast(i);
        startActivity(Intent.createChooser(i, getResources().getText(R.string.app_name)));
        Toast.makeText(this,myMsg,Toast.LENGTH_LONG).show();
    }

}
