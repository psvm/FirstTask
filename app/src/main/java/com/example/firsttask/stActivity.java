package com.example.firsttask;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class stActivity extends AppCompatActivity {
    private EditText mText;
    private Button mButton;

    private View.OnClickListener mOnEnterClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (isTextValid()) {
                showMessage(mText.getText());
            }
        }


    };
        private boolean isTextValid() {
            return !TextUtils.isEmpty(mText.getText());
        }
    private void showMessage(Editable text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
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

