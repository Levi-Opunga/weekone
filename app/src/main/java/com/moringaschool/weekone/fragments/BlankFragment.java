package com.moringaschool.weekone.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.moringaschool.weekone.MainActivity;
import com.moringaschool.weekone.R;
import com.moringaschool.weekone.databinding.FragmentBlankBinding;

import java.text.BreakIterator;

import butterknife.BindView;
import butterknife.ButterKnife;


public class BlankFragment extends DialogFragment {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button1 = view.findViewById(R.id.page1);
        button1.setOnClickListener(v->{
        TextView text1 = (TextView) v.findViewById(R.id.disp1);
        text1.setText("rtyuio");

        });

    }
}