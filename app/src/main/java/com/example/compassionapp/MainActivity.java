package com.example.compassionapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    CardView card,circularimgcard,cardphoto;
    LinearLayout droplinear,reagalelinear,giveAgiftlinear,weatherlinear,myCommunity,childrenlinear,praynow;
    ImageView play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar);

        card=findViewById(R.id.card1);
        circularimgcard=findViewById(R.id.circularimgcard);
        cardphoto=findViewById(R.id.cardphoto);
        droplinear=findViewById(R.id.droplinear);
        reagalelinear=findViewById(R.id.reagalelinear);
        giveAgiftlinear=findViewById(R.id.giveAgiftlinear);
        weatherlinear=findViewById(R.id.weatherlinear);
        myCommunity=findViewById(R.id.myCommunity);
        childrenlinear=findViewById(R.id.childrenlinear);
        praynow=findViewById(R.id.praynow);
        play=findViewById(R.id.playimg);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"3rd card has been clicked",Toast.LENGTH_SHORT).show();
            }
        });

        circularimgcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"circular image card view has been clicked",Toast.LENGTH_SHORT).show();
            }
        }); cardphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"my photo card view has been clicked",Toast.LENGTH_SHORT).show();
            }
        }); droplinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"tell me more has been clicked",Toast.LENGTH_SHORT).show();
            }
        }); reagalelinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"reagale card has been clicked",Toast.LENGTH_SHORT).show();
            }
        }); giveAgiftlinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"give a gift has been clicked",Toast.LENGTH_SHORT).show();
            }
        }); weatherlinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"weather has been clicked",Toast.LENGTH_SHORT).show();
            }
        }); myCommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"my community has been clicked",Toast.LENGTH_SHORT).show();
            }
        }); childrenlinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"children has been clicked",Toast.LENGTH_SHORT).show();
            }
        }); praynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"pray now has been clicked",Toast.LENGTH_SHORT).show();
            }
        }); play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"play button has been clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}