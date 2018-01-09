package com.bess.question;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public final static int REQUEST_AREA_ONE = 1;
    public final static int REQUEST_AREA_TWO = 2;
    public final static int REQUEST_AREA_THREE = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.list);
        String[] questions = {"year?", "last year?", "next year?"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, questions);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String[] questions = null;
        if (position == 0){
            Intent intent = new Intent(this, Question1Activity.class);
            startActivityForResult(intent, REQUEST_AREA_ONE);
        }else if(position == 1){
            Intent intent = new Intent(this, Question2Activity.class);
            startActivityForResult(intent, REQUEST_AREA_TWO);
        }else{
            Intent intent = new Intent(this, Question3Activity.class);
            startActivityForResult(intent, REQUEST_AREA_THREE);
        }
    }
}
