package ru.geekbrains.weather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static ru.geekbrains.weather.ActivityConsts.CITY;

public class MainActivity extends AppCompatActivity {
    EditText cityBox;
    private String city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cityBox = findViewById(R.id.city);
        findViewById(R.id.getCityWeatherBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                city = cityBox.getText().toString();
            }
        });
        Intent intentSwitchToSecondActivity =
                new Intent(MainActivity.this, SecondActivity.class);
        intentSwitchToSecondActivity.putExtra(CITY, city);
        MainActivity.this.startActivity(intentSwitchToSecondActivity);
    }
}
