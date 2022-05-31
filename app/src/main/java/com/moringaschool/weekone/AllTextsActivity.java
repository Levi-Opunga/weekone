package com.moringaschool.weekone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AllTextsActivity extends AppCompatActivity {
    @BindView(R.id.listView)
    ListView mListView;
    @BindView(R.id.locationTextView)
    TextView mLocationTextView;

    public class TextArrayAdapter extends ArrayAdapter {
        public ArrayList<AppTexts> list;

        public TextArrayAdapter(Context context, int resource, ArrayList<AppTexts> list) {
            super(context, resource);
            this.list = list;
        }

        @Override
        public Object getItem(int position) {
            AppTexts text = list.get(position);
            return String.format("From %s To %s \nMessage was : %s", text.getFrom(), text.getTo(), text.getMessage());
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_texts);
        ButterKnife.bind(this);
        TextArrayAdapter adapter = new TextArrayAdapter(this, android.R.layout.simple_list_item_1, ShareData.getAllMessages());
        mListView.setAdapter(adapter);


        mListView.setOnItemClickListener((adapterView, view, position, l) -> {
            String message = (String)((TextView) view).getText().toString();

            Toast.makeText(AllTextsActivity.this,    message, Toast.LENGTH_LONG).show();
        });
    }
}
