package com.algoplay.visualgo.Sharmin;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.algoplay.visualgo.R;

import java.util.Stack;

public class Stackactivity extends AppCompatActivity {

    Button push,pop;
    ImageView blue,red,green;
    Stack<Integer> mylist=new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stackactivity);
        push=findViewById(R.id.button1);
        setTitle("STACK");
        pop=findViewById(R.id.popbtn);
        blue=findViewById(R.id.blue);
        green=findViewById(R.id.green);
        red=findViewById(R.id.red);

        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mylist.isEmpty()){
                    mylist.add(1);
                    pushNow(1);

                }
                else if (mylist.size()==1){
                    mylist.add(2);
                    pushNow(2);
                }
                else if (mylist.size()==2){
                    mylist.add(3);
                    pushNow(3);}

                }
        });


        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             if (mylist.isEmpty()){
                 Toast.makeText(Stackactivity.this, "UNDER FLOW ", Toast.LENGTH_SHORT).show();
             }else{
                 int a =mylist.pop();
                 if (a==1)popNow(1);
                 else if (a==2)popNow(2);
                 else if (a==3)popNow(3);
             }

            }
        });




    }

    private void popNow(int i) {
        switch (i){
            case 1:
                Animatepop(blue);
                break;
            case 2:
                Animatepop(green);
                break;
            case 3:
                Animatepop(red);
                break;
        }
    }

    private void Animatepop(ImageView view) {

        ObjectAnimator leftanim = ObjectAnimator.ofFloat(view, "translationY",  0);

        leftanim.setDuration(500);

        leftanim.start();

    }


    private void pushNow(int i) {
        switch (i){
            case 1:
                AnimatePush(blue);
                break;
            case 2:
                AnimatePush(green);
                break;
            case 3:
                AnimatePush(red);
                break;
        }

    }

    private  void AnimatePush(View view){
        ObjectAnimator leftanim = ObjectAnimator.ofFloat(view, "translationY",  600f);

        leftanim.setDuration(500);

        leftanim.start();
    }
}
