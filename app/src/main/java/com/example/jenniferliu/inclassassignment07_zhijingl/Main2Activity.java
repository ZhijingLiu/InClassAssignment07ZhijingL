package com.example.jenniferliu.inclassassignment07_zhijingl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.*;
import android.content.*;
import android.*;
import android.text.*;
import android.util.*;
import android.app.*;

public class Main2Activity extends AppCompatActivity {
    Animal animal = new Animal("name","kind",2,true);

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        final RadioGroup radioGroup = (RadioGroup)findViewById(R.id.m_radio_group);
        radioGroup.setOnCheckedChangeListener((new RadioGroup.OnCheckedChangeListener()            {

            @Override
            public void onCheckedChanged(RadioGroup arg0, int selectedId) {
                switch (checkedId){
                    case R.id.mammal_radio_button:
                        animal.setKind("Mammal");
                        break;

                    case R.id.nonmammal_radio_button:
                        animal.setKind("Non-mammal");
                        break;
                }








        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        Button submitButton = (Button) findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.onClickListener(){
            public void onClick(View view){
                EditText name = (EditText)findViewById(R.id.animal_name);
                animal.setAnimalName(name.getText().toString());



                CheckBox checkBox = (CheckBox) findViewById(R.id.has_fur);
                if(checkBox.isChecked()){
                    animal.setHasFur(true);
                }else{
                    animal.setHasFur(false);
                }


                Intent intent = new Intent();
                intent.putExtra(Keys.ANIMAL,animal);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

}))

    ;}
}