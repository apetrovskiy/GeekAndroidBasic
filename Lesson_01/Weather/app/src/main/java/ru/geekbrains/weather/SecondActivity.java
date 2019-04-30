package ru.geekbrains.weather;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static ru.geekbrains.weather.ActivityConsts.CITY;

public class SecondActivity extends AppCompatActivity {
    TextView cityView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String value = intent.getStringExtra(CITY);
        cityView.setText(value);
    }
}
