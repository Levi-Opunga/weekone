package com.moringaschool.weekone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.moringaschool.weekone.databinding.ActivityThirdBinding;
import com.moringaschool.weekone.fragments.BlankFragment;

public class thirdActivity extends AppCompatActivity {
private ActivityThirdBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThirdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        int num =ShareData.getPass().length();
        String that = "Your message to NASA was:";
        if(num>=1){
            binding.textView.setText(that);
        }else{
            binding.textView.setText("    ");
        }

        binding.disp3.setText(ShareData.getPass());




        binding.send.setOnClickListener((view)-> {
            String message = binding.input3.getText().toString();
            ShareData share = new ShareData();
            share.setPass(message);
            BlankFragment frag = new BlankFragment();
            frag.show(getSupportFragmentManager(),"selection");
        });


    }
}