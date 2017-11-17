package com.thitiphat.myapplication;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int counter = 0;
    TextView tvNum;
    CounterViewModel counterViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClick = findViewById(R.id.btnClick);
        btnClick.setOnClickListener(this);

        tvNum = findViewById(R.id.tvNum);

        counterViewModel = ViewModelProviders.of(this).get(CounterViewModel.class);
        display();
    }

    @Override
    public void onClick(View view) {
        counterViewModel.setCounter(counterViewModel.getCounter() + 1);
        display();
    }

    public void display() {
        tvNum.setText(String.valueOf(counterViewModel.getCounter()));
    }
}
