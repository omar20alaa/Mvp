package com.mvp.mvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.mvp.mvp.newActivity.NewActivity;

public class MainActivity extends AppCompatActivity implements MainContract.view {

    Button toast_btn;
    Button intent_btn;
    Button show_progress;
    Button hide_progress;
    ProgressBar progress_bar;

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
        initClicks();
    }

    private void initClicks() {
        toast_btn = findViewById(R.id.toast_btn);
        intent_btn = findViewById(R.id.intent_btn);
        show_progress = findViewById(R.id.show_progress);
        hide_progress = findViewById(R.id.hide_progress);
        progress_bar = findViewById(R.id.progress_bar);

        toast_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.clickToastBtn();
            }
        });

        intent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.intentToNewActivity();
            }
        });

        show_progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.clickShow();
            }
        });

        hide_progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.clickHide();
            }
        });

    }

    @Override
    public void displayMessage() {
        Toast.makeText(this, "omaaaaar", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void clickIntent() {
        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }

    @Override
    public void showProgressBar() {
        progress_bar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        progress_bar.setVisibility(View.GONE);
    }
}
