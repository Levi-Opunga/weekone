package com.moringaschool.weekone.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.moringaschool.weekone.AppTexts;
import com.moringaschool.weekone.MainActivity;
import com.moringaschool.weekone.R;
import com.moringaschool.weekone.ShareData;
import com.moringaschool.weekone.databinding.FragmentBlankBinding;
import com.moringaschool.weekone.secondActivity;
import com.moringaschool.weekone.thirdActivity;

import java.text.BreakIterator;

import butterknife.BindView;
import butterknife.ButterKnife;


public class BlankFragment extends DialogFragment {
private FragmentBlankBinding binding;
    public static final String TAG = BlankFragment.class.getSimpleName();


ShareData viewModel ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBlankBinding.inflate(inflater, container,false);
        return binding.getRoot();
        // Inflate the layout for this fragment

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button1 = view.findViewById(R.id.page1);
        button1.setOnClickListener(v->{
            AppTexts newText = new AppTexts(ShareData.getPass(),ShareData.origin,"Dessert");
            ShareData.AllMessages.add(newText);
            Log.d(TAG,newText.getMessage().toString());
Intent intent = new Intent(getActivity(),MainActivity.class);
startActivity(intent);

        });
        binding.page2.setOnClickListener(v->{
            AppTexts newText = new AppTexts(ShareData.getPass(),ShareData.origin,"Romania");
            Log.d(TAG,newText.getMessage().toString());
            ShareData.AllMessages.add(newText);
            Intent intent = new Intent(getActivity(), secondActivity.class);
            startActivity(intent);
        });
        binding.page3.setOnClickListener(v->{
            AppTexts newText = new AppTexts(ShareData.getPass(),ShareData.origin,"NASA Station");
            Log.d(TAG,newText.getMessage().toString());
            Log.d(TAG,String.valueOf(ShareData.getAllMessages().size()));
            ShareData.AllMessages.add(newText);
            Intent intent = new Intent(getActivity(), thirdActivity.class);
            startActivity(intent);
        });

    }
}