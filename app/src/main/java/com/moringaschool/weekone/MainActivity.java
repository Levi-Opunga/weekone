package com.moringaschool.weekone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.moringaschool.weekone.databinding.ActivityMainBinding;
import com.moringaschool.weekone.databinding.ActivitySecondBinding;
import com.moringaschool.weekone.fragments.BlankFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
//@BindView(R.id.send)
//Button sendButton;
//@BindView(R.id.disp1)
//TextView disp1;
//@BindView(R.id.input3)
//public EditText input;
public static String A;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        ButterKnife.bind(this);


        String that = "Your message to the desert was:";
        if(ShareData.clicked&& ShareData.getPass().length()>1){
            binding.textView6.setText(that);
        }else{
            binding.textView6.setText("    ");
        }

        binding.disp1.setText(ShareData.getPass());


        binding.send.setOnClickListener((view)-> {
           String message = binding.input3.getText().toString();
            ShareData share = new ShareData();
            share.setPass(message);
            BlankFragment frag = new BlankFragment();
            frag.show(getSupportFragmentManager(),"selection");
        });


    }
}