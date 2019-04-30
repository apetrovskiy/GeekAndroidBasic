package ru.geekbrains.lifecycleactivity;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static ru.geekbrains.lifecycleactivity.R.id.toSecondActivityBtn;

public class LifeCycleActivity extends AppCompatActivity {
    String instanceState = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        if (null == savedInstanceState) {
            instanceState = "Первый запуск!";
        } else {
            instanceState += "Повторный запуск!";
        }
        showActivityStatus(instanceState + " - onCreate()");
        findViewById(toSecondActivityBtn).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LifeCycleActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        showActivityStatus("onStart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        showActivityStatus("Повторный запуск!! - onRestoreInstanceState()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showActivityStatus("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showActivityStatus("onPause()");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        showActivityStatus("onSaveInstanceState()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showActivityStatus("onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showActivityStatus("onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showActivityStatus("onDestroy()");
    }

    private void showActivityStatus(String status) {
        instanceState += "\r\n";
        instanceState += status;
        Log.i(this.getClass().getName(), "----------================================================================-------");
        Log.i(this.getClass().getName(), status);
        Toast.makeText(
                getApplicationContext(),
                instanceState,
                Toast.LENGTH_LONG).show();
    }
}
