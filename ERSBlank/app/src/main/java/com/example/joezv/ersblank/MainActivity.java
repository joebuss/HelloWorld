package com.example.joezv.ersblank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static String[] gameDeck = {"2c", "2d", "2h", "2s", "3c", "3d", "3h", "3s",
            "4c", "4d", "4h", "4s", "5c", "5d", "5h", "5s", "6c", "6d", "6h", "6s",
            "7c", "7d", "7h", "7s", "8c", "8d", "8h", "8s", "9c", "9d", "9h", "9s",
            "10c", "10d", "10h", "10s", "11c", "11d", "11h", "11s", "12c", "12d", "12h", "12s",
            "13c", "13d", "13h", "13s", "14c", "14d", "14h", "14s"};
    private static String[] p1Deck;
    private static String[] p2Deck;

    public static int Rank(int num){

        String cardSuit = gameDeck[num];
        String card = cardSuit.substring(0,1);
        return Integer.parseInt(card);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Deck1 = (Button)findViewById(R.id.Deck1);
        Button Deck2 = (Button)findViewById(R.id.Deck2);
        Button Slap1 = (Button)findViewById(R.id.Slap1);
        Button Slap2 = (Button)findViewById(R.id.Slap2);

        Slap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Slap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Deck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("hello world");
            }
        });

        Deck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
