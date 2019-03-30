package com.example.random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private TextView tvOut;
    private Button first, second;
    public int one, two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvOut = findViewById(R.id.tvOut);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);

        Randomm r = new Randomm();

        one = r.RAN();
        two = r.RAN1();

        first.setText(Integer.toString(one));
        second.setText(Integer.toString(two));

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            int a = one;
            int b = two;

            int c[] = {a,b};

                int maxValue = c[0];
                for(int i=1;i < c.length;i++)
                {
                    if (c[i] > maxValue) {
                        maxValue = c[i];
                    }
                }

                    int minValue = c[0];
                    for(int i=1;i < c.length;i++)
                    {
                        if(c[i] < minValue)
                        {
                            minValue = c[i];
                        }
                    }


                if(maxValue==a)
                {
                    int total = Integer.parseInt(tvOut.getText().toString());
                    total = total + 1;
                    tvOut.setText(Integer.toString(total));
                }
                else if(maxValue!=a)
                {
                    int total = Integer.parseInt(tvOut.getText().toString());
                    total = total - 1;
                    tvOut.setText(Integer.toString(total));
                }


                Randomm r = new Randomm();

                one = r.RAN();
                two = r.RAN1();

                first.setText(Integer.toString(one));
                second.setText(Integer.toString(two));

                }
        });



        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int a = one;
                int b = two;

                int c[] = {a,b};

                int maxValue = c[0];
                for(int i=1;i < c.length;i++)
                {
                    if (c[i] > maxValue) {
                        maxValue = c[i];
                    }
                }

                int minValue = c[0];
                for(int i=1;i < c.length;i++)
                {
                    if(c[i] < minValue)
                    {
                        minValue = c[i];
                    }
                }



                if(maxValue==b)
                {
                    int total = Integer.parseInt(tvOut.getText().toString());
                    total = total + 1;
                    tvOut.setText(Integer.toString(total));
                }
                else if(maxValue!=b)
                {
                    int total = Integer.parseInt(tvOut.getText().toString());
                    total = total - 1;
                    tvOut.setText(Integer.toString(total));
                }

                Randomm r = new Randomm();

                one = r.RAN();
                two = r.RAN1();

                first.setText(Integer.toString(one));
                second.setText(Integer.toString(two));

            }
        });



    }
}
