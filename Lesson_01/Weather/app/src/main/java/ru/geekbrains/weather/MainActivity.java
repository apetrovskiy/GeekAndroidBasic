package ru.geekbrains.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
    }
}
