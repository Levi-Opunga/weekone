package com.moringaschool.weekone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;

import android.os.Bundle;
import android.util.Log;

import com.moringaschool.weekone.databinding.ActivitySecondBinding;
import com.moringaschool.weekone.fragments.BlankFragment;

public class secondActivity extends AppCompatActivity {
private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        int num =ShareData.getPass().length();
        String that = "Your message to Romania was:";
        if(num>=1){
            binding.inform.setText(that);
        }else{
            binding.inform.setText("    ");
        }

        binding.disp2.setText(ShareData.getPass());

        binding.send.setOnClickListener((view)-> {
            String message = binding.input2.getText().toString();
            ShareData.setPass(message);
            BlankFragment frag = new BlankFragment();
            frag.show(getSupportFragmentManager(),"selection");
        });
    }
}