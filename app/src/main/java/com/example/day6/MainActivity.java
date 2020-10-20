package com.example.day6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private TextView displayMessage;
    private Button button;
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    private String check1, check2, check3, check4;
    private ArrayList<String> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();



      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              if (list.size() > 0) {

                  String result = " ";
                  for (String s : list) {
                      result += s + " , ";
                  }

                  displayMessage.setText(result + " selected");


              }
              else
                  displayMessage.setText("No Checkbox selected");
          }


      });


    }

    private void initViews() {
        displayMessage = findViewById(R.id.displayMessage);
        button = findViewById(R.id.button);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);

    }



    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()){
            case R.id.checkBox1:

                if(checked){
                    check1 = checkBox1.getText().toString();
                    list.add(check1);

                } else if ( !checked && list.contains(check1)) {
                    list.remove(check1);
                }
                     break;

            case R.id.checkBox2:

                if(checked){
                    check2 = checkBox2.getText().toString();
                    list.add(check2);

                } else  if(!checked && list.contains(check2)){
                    list.remove(check2);
                }

                break;

            case R.id.checkBox3:

                if(checked){
                    check3 = checkBox3.getText().toString();
                    list.add(check3);

                } else if(!checked && list.contains(check3)){
                    list.remove(check3);
                }
          break;

            case R.id.checkBox4:

                if(checked){
                    check4 = checkBox4.getText().toString();
                    list.add(check4);

                } else if(!checked && list.contains(check4)){
                    list.remove(check4);
                }
                break;

        }


    }


}
