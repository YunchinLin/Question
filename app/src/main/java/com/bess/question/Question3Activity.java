package com.bess.question;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Question3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        ListView listView = (ListView) findViewById(R.id.list);
        String[] questions = {"year?", "last year?", "next year?"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, questions);
        listView.setAdapter(adapter);
    }
}
