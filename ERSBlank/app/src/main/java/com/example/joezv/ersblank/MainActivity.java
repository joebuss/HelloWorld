package com.example.joezv.ersblank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int cardsToPlay;
    boolean hasSlapped = false;
    boolean p1Slapped = false;
    boolean p2Slapped = false;

    private static String[] gameDeckArr = {"2c", "2d", "2h", "2s", "3c", "3d", "3h", "3s",
            "4c", "4d", "4h", "4s", "5c", "5d", "5h", "5s", "6c", "6d", "6h", "6s",
            "7c", "7d", "7h", "7s", "8c", "8d", "8h", "8s", "9c", "9d", "9h", "9s",
            "10c", "10d", "10h", "10s", "11c", "11d", "11h", "11s", "12c", "12d", "12h", "12s",
            "13c", "13d", "13h", "13s", "14c", "14d", "14h", "14s"};
    private static ArrayList<String> p1Deck = new ArrayList<>();
    private static ArrayList<String> p2Deck = new ArrayList<>();

    private static ArrayList<String> gameDeck = new ArrayList<>(Arrays.asList(gameDeckArr));

    public static int rank(int num){

        String cardSuit = gameDeck.get(num);
        String cardNum = cardSuit.substring(cardSuit.length()-1, cardSuit.length());//gets letter at end of string
        String card = cardSuit.replace(cardNum, "");//replaces letter with nothing
        return Integer.parseInt(card);

    }

    public static void shuffle(){

        Collections.shuffle(gameDeck);
    }

    // this method checks to see if the pile is slappable
    public static Boolean isSlappable() {
        if (rank(1) == rank(0)) {
            return true;
        } // two in a row check
        else if (rank(0) == rank(2)) {
            return true;
        } // sandwich check
        else if (rank(0) - 1 == rank(1) || rank(0) + 1 == rank(1)) {
            return true;
        } // consecutive check
        else if ((rank(0) < 14 && rank(0) > 10) && (rank(1) < 14 && rank(1) > 10)) {
            return true;
        } // two face cards check
        return false;
    }

    public void gameBoss() {
        // This switch statement deals with the number of cards to play before someone wins the pile
        switch (rank(0)) {
            case 14: cardsToPlay += 1; // jack = 11, queen = 12, king = 13, ace = 14
            case 13: cardsToPlay += 1;
            case 12: cardsToPlay += 1;
            case 11: cardsToPlay += 1;
                break;
            default: break;
        }

        if (hasSlapped) {
            if (isSlappable() == true) {
                if (p1Slapped == true) {
                    for (int i = 0; i < gameDeck.size(); i++) {
                        p1Deck.add(gameDeck.get(0));
                        //append p1Deck
                        //remove element from gameDeck
                    }
                    if (p2Slapped) {
                    }
                }
            }
        }


        if (p1Deck.size() == 52 || p2Deck.size() == 52) {
            onStop(); //game ends
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Deck1 = (Button)findViewById(R.id.Deck1);
        Button Deck2 = (Button)findViewById(R.id.Deck2);
        Button Slap1 = (Button)findViewById(R.id.Slap1);
        Button Slap2 = (Button)findViewById(R.id.Slap2);
        ImageView card = (ImageView)findViewById(R.id.imageView);
        int s = R.drawable.playing_card_club_3;

        card.setImageResource(s);

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
