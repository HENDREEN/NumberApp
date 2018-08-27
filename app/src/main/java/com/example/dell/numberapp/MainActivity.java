package com.example.dell.numberapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button next;
    Button previous;
    Button player;
    ImageView numberImage;
    TextView numner_text;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next=findViewById(R.id.next);
        previous=findViewById(R.id.previous);
        player=findViewById(R.id.player);
        //....................
        numberImage=findViewById(R.id.number_image);
        numner_text=findViewById(R.id.number_text);
        //.............................................
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count<10) {
                    count = count+1;
                    changingNumberOnImageAndText();
                }
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count>0) {
                    count = count - 1;
                    changingNumberOnImageAndText();
                }

            }
        });
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count==0){

                }
                else if(count==1){

                }
                else if(count==2){

                }
                else if(count==3){

                }
                else if(count==4){

                }
                else if(count==5){

                }
                else if(count==6){

                }
                else if(count==7){

                }
                else if(count==8){

                }
                else if(count==9){

                }
                else if(count==10){

                }
            }
        });
    }
    public void changingNumberOnImageAndText(){
        if(count==0){
            numner_text.setText("Zero");
            numberImage.setImageResource(R.drawable.zero);
        }
        else if(count==1){
            numner_text.setText("One");
            numberImage.setImageResource(R.drawable.one);
        }
        else if(count==2){
            numner_text.setText("Two");
            numberImage.setImageResource(R.drawable.two);
        }
        else if(count==3){
            numner_text.setText("Three");
            numberImage.setImageResource(R.drawable.three);
        }
        else if(count==4){
            numner_text.setText("Four");
            numberImage.setImageResource(R.drawable.four);
        }
        else if(count==5){
            numner_text.setText("Five");
            numberImage.setImageResource(R.drawable.five);
        }
        else if(count==6){
            numner_text.setText("six");
            numberImage.setImageResource(R.drawable.six);
        }
        else if(count==7){
            numner_text.setText("Seven");
            numberImage.setImageResource(R.drawable.seven);
        }
        else if(count==8){
            numner_text.setText("Eight");
            numberImage.setImageResource(R.drawable.eight);
        }
        else if(count==9){
            numner_text.setText("Nine");
            numberImage.setImageResource(R.drawable.nine);
        }
        else if(count==10){
            numner_text.setText("Ten");
            numberImage.setImageResource(R.drawable.ten);
        }
    }

}
