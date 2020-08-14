package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    private TextView TotaltextView;
    private EditText numberr1;
    private EditText numberr2;

    private Button Bplus;
    private Button Bmin;
    private Button Bmul;
    private Button Bdev;

    float result_num;
    int num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

      // Second Activity Back arrow key
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);


      Bundle bundle = getIntent().getExtras();
      //Pass data to string variables
      String data_1 = bundle.getString("NUMBER1");
      String data_2 = bundle.getString("NUMBER2");

      //Assign xml objects for TextViews into variable
        TextView textView  = (TextView)findViewById(R.id.editText);
        TextView textView1 = (TextView)findViewById(R.id.editText3);

        textView.setText(data_1);
        textView1.setText(data_2);


        //Answer display field
        TotaltextView = (TextView) findViewById(R.id.TXT_Total);
        //Set Text Number
        numberr1 =(EditText) findViewById(R.id.editText);
        numberr2 = (EditText)findViewById(R.id.editText3);
        //Button Set
        Bplus = (Button) findViewById(R.id.button_plus);
        Bmin  = (Button) findViewById(R.id.button2_min);
        Bmul  = (Button) findViewById(R.id.button3_multi);
        Bdev  = (Button) findViewById(R.id.button4_dev);



        Bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1= Integer.parseInt(numberr1.getText().toString());
                num2=Integer.parseInt(numberr2.getText().toString());
                result_num= num1+num2;
                TotaltextView.setText(String.valueOf(result_num));
            }
        });

        Bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1= Integer.parseInt(numberr1.getText().toString());
                num2=Integer.parseInt(numberr2.getText().toString());
                result_num= num1 - num2;
                TotaltextView.setText(String.valueOf(result_num));
            }
        });

        Bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1= Integer.parseInt(numberr1.getText().toString());
                num2=Integer.parseInt(numberr2.getText().toString());
                result_num= num1 * num2;
                TotaltextView.setText(String.valueOf(result_num));
            }
        });

        Bdev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1= Integer.parseInt(numberr1.getText().toString());
                num2=Integer.parseInt(numberr2.getText().toString());
                result_num= num1 / num2;
                TotaltextView.setText(String.valueOf(result_num));
            }
        });


        //Disable the Editable Option
        EditText edittext = (EditText)findViewById(R.id.editText);
        edittext.setEnabled(false);
        EditText edittextt = (EditText)findViewById(R.id.editText3);
        edittextt.setEnabled(false);
    }



}
