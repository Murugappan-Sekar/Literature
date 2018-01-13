package com.example.murugappansekar.literature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Startup extends AppCompatActivity {

    Button bHost,bJoin,bDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        bHost=(Button)findViewById(R.id.bHost);
        bJoin=(Button)findViewById(R.id.bJoin);
        bDetails=(Button)findViewById(R.id.bDetails);

        bHost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Startup.this,NetworkInfo.getIPAddress(true), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
