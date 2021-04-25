package com.websarva.wings.android.quiz_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvAnswers = findViewById(R.id.lvAnswers);
        lvAnswers.setOnItemClickListener(new ListItemClickListener());
    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String item = (String) parent.getItemAtPosition(position);
            String show;

            if (position == 2) {
                show = "正解です";
            }
            else {
                show = "違います";
            }

            Toast.makeText(MainActivity.this, show, Toast.LENGTH_LONG).show();
        }
    }
}