package com.example.spinner;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ListView lV;
    Spinner spin;
    TextView tVLastName, tVName, tVBirthDate, tVNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        lV = (ListView) findViewById(R.id.lV);
        spin = (Spinner) findViewById(R.id.spin);
        tVLastName = (TextView) findViewById(R.id.tVLastName);
        tVName = (TextView) findViewById(R.id.tVName);
        tVBirthDate = (TextView) findViewById(R.id.tVBirthDate);
        tVNumber = (TextView) findViewById(R.id.tVNumber);
    }
}