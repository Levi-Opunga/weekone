package com.moringaschool.weekone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.moringaschool.weekone.fragments.BlankFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
@BindView(R.id.send)
Button sendButton;
@BindView(R.id.disp1)
TextView disp1;
@BindView(R.id.input3)
public EditText input;

public static String A;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        sendButton.setOnClickListener((view)-> {

            A = input.getText().toString();
            BlankFragment frag = new BlankFragment();
            frag.show(getSupportFragmentManager(),"selection");

        });

    }
}