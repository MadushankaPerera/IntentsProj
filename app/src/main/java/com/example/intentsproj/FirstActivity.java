package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    private static Button btnOK;

    private EditText n1;
    private EditText n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        onClickButton();
    }

    public void onClickButton(){

        btnOK = (Button)findViewById(R.id.buttonOk);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(".SecondActivity");

                EditText n1 = (EditText)findViewById(R.id.editText1);
                EditText n2 = (EditText) findViewById(R.id.editText2);
                String number1 = n1.getText().toString();
                String number2 = n2.getText().toString();
                intent.putExtra("NUMBER1", number1);
                intent.putExtra("NUMBER2", number2);

                startActivity(intent);
            }
        });


    }


}
