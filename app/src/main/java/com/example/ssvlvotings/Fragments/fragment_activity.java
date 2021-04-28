package com.example.ssvlvotings.Fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.ssvlvotings.R;
import com.example.ssvlvotings.currentuser;
import com.example.ssvlvotings.login;

public class fragment_activity extends AppCompatActivity {
    TextView yourname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_viewinfo);
        setContentView(R.layout.activity_fragment_activity);

        yourname = findViewById(R.id.Firstname);
        yourname.setText(currentuser.firstname);

    }
}