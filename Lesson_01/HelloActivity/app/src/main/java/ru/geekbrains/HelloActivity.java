package ru.geekbrains;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        TextView greeting = (TextView) findViewById(R.id.greeting);
        int currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (5 <= currentHour && currentHour < 12){
            greeting.setText("Good morning GeekBrain!");
        }
        else if (12 <= currentHour && currentHour < 6) {
            greeting.setText("Good afternoon GeekBrains!");
        }
        else if (6 <= currentHour && currentHour < 9) {
            greeting.setText("Good evening GeekBrains!");
        }
        else {
            greeting.setText("Good night GeekBrains!");
        }
    }
}
