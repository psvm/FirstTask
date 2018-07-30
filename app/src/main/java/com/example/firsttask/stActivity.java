package com.example.firsttask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class stActivity extends AppCompatActivity {
    private EditText mText;
    private Button mButton;

    private View.OnClickListener mOnEnterClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (isTextValid()) {
                Intent secondScreenIntent = new Intent(stActivity.this, secondActivity.class);
                secondScreenIntent.putExtra("data", mText.getText().toString());
                startActivity(secondScreenIntent);

            }

        }

    };
    private boolean isTextValid() {
            return !TextUtils.isEmpty(mText.getText());
        }


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_st);

            mText = findViewById(R.id.eText);
            mButton = findViewById(R.id.buttonEnter);
            mButton.setOnClickListener(mOnEnterClickListener);
        }
    }

