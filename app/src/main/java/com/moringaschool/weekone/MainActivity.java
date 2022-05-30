package com.moringaschool.weekone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.moringaschool.weekone.fragments.BlankFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
@BindView(R.id.send)
Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        sendButton.setOnClickListener((view)-> {
            BlankFragment frag = new BlankFragment();
            frag.show(getSupportFragmentManager(),"selection");

        });

    }
}