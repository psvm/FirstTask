package com.example.firsttask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends Activity {


    private TextView secondText;
    private Button secondButton;

    private View.OnClickListener mSecondClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        secondText = findViewById(R.id.secondText);
        Intent intent = getIntent();
        String name = intent.getStringExtra("data");
        secondText.setText(name);
        secondButton = findViewById(R.id.secondButtonEnter);
        secondButton.setOnClickListener(mSecondClickListener);

   //     Bundle bundle = getIntent().getExtras();
    //    secondText.setText(bundle.get(NAME).toString());
    }
}
