package com.example.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void editText(View v){
        View article = findViewById(R.id.article);
        article.setVisibility(View.GONE);

        View edit = findViewById(R.id.edit_article);
        edit.setVisibility(View.VISIBLE);

        Button edit_button = findViewById(R.id.comment);
        edit_button.setText("Save Changes");
        edit_button.setOnClickListener(this::changeText);

    }
    public void changeText(View v){
        TextView article =(TextView) findViewById(R.id.article);
        article.setVisibility(View.VISIBLE);

        EditText edit =(EditText) findViewById(R.id.edit_article);
        edit.setVisibility(View.GONE);

        String edition = edit.getText().toString();
        article.setText(edition);

        Button edit_button = findViewById(R.id.comment);
        edit_button.setText("Add comments");
        edit_button.setOnClickListener(this::editText);

    }
}