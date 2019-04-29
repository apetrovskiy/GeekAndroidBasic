package ru.geekbrains.lifecycleactivity;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        String instanceState;
        if (null == savedInstanceState) {
            instanceState = "Первый запуск!";
        } else {
            instanceState = "Повторный запуск!";
        }
        showActivityStatus(instanceState + " - onCreate()");
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

    private void showActivityStatus(String s) {
        Toast.makeText(
                getApplicationContext(),
                s,
                Toast.LENGTH_SHORT).show();
    }
}
