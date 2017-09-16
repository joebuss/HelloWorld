package com.example.joezv.ersblank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int cardsToPlay = 0;
    Boolean p1Slapped = false;
    Boolean p2Slapped = false;

    private static String[] gameDeck = {"2c", "2d", "2h", "2s", "3c", "3d", "3h", "3s",
            "4c", "4d", "4h", "4s", "5c", "5d", "5h", "5s", "6c", "6d", "6h", "6s",
            "7c", "7d", "7h", "7s", "8c", "8d", "8h", "8s", "9c", "9d", "9h", "9s",
            "10c", "10d", "10h", "10s", "11c", "11d", "11h", "11s", "12c", "12d", "12h", "12s",
            "13c", "13d", "13h", "13s", "14c", "14d", "14h", "14s"};
    private static String[] p1Deck;
    private static String[] p2Deck;

<<<<<<< HEAD
    public static int rank(int num){
=======
    public static int rank(int num) {
>>>>>>> dbfca5b8fb757164ce4a177973f06c4314dc2376

        String cardSuit = gameDeck[num];
<<<<<<< HEAD
        String card = cardSuit.substring(0, 1);
=======
        String cardNum = cardSuit.substring(cardSuit.length()-1, cardSuit.length());//gets letter at end of string
        String card = cardSuit.replace(cardNum, "");//replaces letter with nothing
>>>>>>> 194d080b27c85cd295ff42a3320b649b4a11b6e5
        return Integer.parseInt(card);

    }

<<<<<<< HEAD
    public static void shuffle(String[] gameDeck){
=======
<<<<<<< HEAD


    // this method checks to see if the pile is slappable
    public static Boolean isSlappable() {

        if (gameDeck[1].rank(1) == gameDeck[0].rank(0)) {
            return true;
        } // two in a row check

        else if (gameDeck[].rank(0) == gameDeck[].rank(2)) {
            return true;
        } // sandwich check

        else if (gameDeck[].rank(0) - 1 == gameDeck[].rank(1) || gameDeck[].rank(0) + 1 == gameDeck[].rank(1)) {
            return true;
        } // consecutive check

        else if ((gameDeck[].rank(0) < 14 && gameDeck[].rank(0) > 10) && (gameDeck[].rank(1) < 14 gameDeck[].rank(1) > 10)) {
            return true;
        } // two face cards check

        return false;
    }

    public static Boolean hasSlapped() {

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

        if (hasSlapped()) {
            if (isSlappable() == true) {
                if () {
                    for (i = 0, i < gameDeck[].length, i++) {

                    }
                }
            }
        }

        if (p1Deck[].length == 52 || p2Deck[].length == 52) {
            onStop(); //game ends
        }
    }



=======
    public static void Shuffle(String[] gameDeck){
>>>>>>> dbfca5b8fb757164ce4a177973f06c4314dc2376

        int index;
        String temp;
        Random rand = new Random();
        for (int x = gameDeck.length -1; x > 0; x--)
        {
            index = rand.nextInt(x + 1);
            temp = gameDeck[index];
            gameDeck[index] = gameDeck[x];
            gameDeck[x] = temp;
        }
    }

>>>>>>> 194d080b27c85cd295ff42a3320b649b4a11b6e5
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
                p1Slapped = true;
            }
        });

        Slap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2Slapped = true;
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
