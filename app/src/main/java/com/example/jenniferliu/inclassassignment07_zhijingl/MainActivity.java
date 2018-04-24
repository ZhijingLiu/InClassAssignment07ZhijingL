package com.example.jenniferliu.inclassassignment07_zhijingl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.util.*;
import android.*;
import android.content.*;
import android.app.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButton = (Button)findViewById(R.id.submit_button);
        mButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                addAnimal(this);
            }

            public void AddAnimal(View.OnClickListener view){
                Intent intent = new Intent(this,Main2Activity.class);
                startActivityForResult(intent,RequestCode.ADD_ANIMAL);
            }

            protected void onActivityResult(int requestCode, int resultCode, Intent data){
                if (requestCode == RequestCode.ADD_ANIMAL && resultCode == RESULT_OK){
                    Animal animal = (Animal) data.getSerializableExtra(Keys.Animal);
                    display(animal);
                }
            }

            protected void display(Animal animal){
                TextView textView = findViewById(R.id.display_text_view);
                textView.setText("Animal: " + animal.getAnimalName() + "\nNumber of legs: " + animal.getLegs() +
                        "\nHas Fur? " + animal.isHasFur()+"\nkind: "+ animal.getKind());
            }
        });
    }
}
