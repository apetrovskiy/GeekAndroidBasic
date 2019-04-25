package ru.geekbrains.helloactivity;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Calendar;
import ru.geekbrains.R;

public class HelloActivity extends AppCompatActivity implements GreetingStrings {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        TextView greeting = (TextView) findViewById(R.id.greeting);
        BuilderGreetingPhrase builderGreetingPhrase =
                new BuilderGreetingPhrase(
                        this,
                        Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
        greeting.setText(builderGreetingPhrase.get());
    }

    @Override
    public String getHelloer() {
        return getResources().getString(R.string.helloer);
    }

    @Override
    public String getMorning() {
        return getResources().getString(R.string.morning);
    }

    @Override
    public String getAfternoon() {
        return getResources().getString(R.string.afternoon);
    }

    @Override
    public String getEvening() {
        return getResources().getString(R.string.evening);
    }

    @Override
    public String getNight() {
        return getResources().getString(R.string.night);
    }
}
