package com.example.joezv.ersblank;

import android.support.annotation.IntegerRes;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    String j = "changed";
    boolean deal = true;
    int cardsToPlay = 0; //this int is for checking to see if it is time for the pile to be picked up by a player
    boolean turn = true; //p1's turn = true, p2's turn = false
    boolean hasSlapped = false; //checks to see if a player has pressed a slap button
    boolean p1Slapped = false; //checks to see if player1 clicked their slap button
    boolean p2Slapped = false; //checks to see if player2 clicked their slap button
    String size1str;
    String size2str;
    TextView counted1;
    TextView counted2;
    ImageView card;
    ImageView card2;
    ImageView card3;


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

    public static int assignCard() {
        int s = 0;

//START SWITCHES


        switch (gameDeck.get(0)) {
            case ("2c"):
                s = R.drawable.playing_card_club_2;
                break;
            case ("2s"):
                s = R.drawable.playing_card_spade_2;
                break;
            case ("2h"):
                s = R.drawable.playing_card_heart_2;
                break;
            case ("2d"):
                s = R.drawable.playing_card_diamond_2;
                break;
            case ("3c"):
                s = R.drawable.playing_card_club_3;
                break;
            case ("3s"):
                s = R.drawable.playing_card_spade_3;
                break;
            case "3h":
                s = R.drawable.playing_card_heart_3;
                break;
            case "3d":
                s = R.drawable.playing_card_diamond_3;
                break;
            case "4c":
                s = R.drawable.playing_card_club_4;
                break;
            case "4s":
                s = R.drawable.playing_card_spade_4;
                break;
            case "4h":
                s = R.drawable.playing_card_heart_4;
                break;
            case "4d":
                s = R.drawable.playing_card_diamond_4;
                break;
            case "5c":
                s = R.drawable.playing_card_club_5;
                break;
            case "5s":
                s = R.drawable.playing_card_spade_5;
                break;
            case "5h":
                s = R.drawable.playing_card_heart_5;
                break;
            case "5d":
                s = R.drawable.playing_card_diamond_5;
                break;
            case "6c":
                s = R.drawable.playing_card_club_6;
                break;
            case "6s":
                s = R.drawable.playing_card_spade_6;
                break;
            case "6h":
                s = R.drawable.playing_card_heart_6;
                break;
            case "6d":
                s = R.drawable.playing_card_diamond_6;
                break;
            case "7c":
                s = R.drawable.playing_card_club_7;
                break;
            case "7s":
                s = R.drawable.playing_card_spade_7;
                break;
            case "7h":
                s = R.drawable.playing_card_heart_7;
                break;
            case "7d":
                s = R.drawable.playing_card_diamond_7;
                break;
            case "8c":
                s = R.drawable.playing_card_club_8;
                break;
            case "8s":
                s = R.drawable.playing_card_spade_8;
                break;
            case "8h":
                s = R.drawable.playing_card_heart_8;
                break;
            case "8d":
                s = R.drawable.playing_card_diamond_8;
                break;
            case "9c":
                s = R.drawable.playing_card_club_9;
                break;
            case "9s":
                s = R.drawable.playing_card_spade_9;
                break;
            case "9h":
                s = R.drawable.playing_card_heart_9;
                break;
            case "9d":
                s = R.drawable.playing_card_diamond_9;
                break;
            case "10c":
                s = R.drawable.playing_card_club_10;
                break;
            case "10s":
                s = R.drawable.playing_card_spade_10;
                break;
            case "10h":
                s = R.drawable.playing_card_heart_10;
                break;
            case "10d":
                s = R.drawable.playing_card_diamond_10;
                break;
            case "11c":
                s = R.drawable.playing_card_club_j;
                break;
            case "11s":
                s = R.drawable.playing_card_spade_j;
                break;
            case "11h":
                s = R.drawable.playing_card_heart_j;
                break;
            case "11d":
                s = R.drawable.playing_card_diamond_j;
                break;
            case "12c":
                s = R.drawable.playing_card_club_q;
                break;
            case "12s":
                s = R.drawable.playing_card_spade_q;
                break;
            case "12h":
                s = R.drawable.playing_card_heart_q;
                break;
            case "12d":
                s = R.drawable.playing_card_diamond_q;
                break;
            case "13c":
                s = R.drawable.playing_card_club_k;
                break;
            case "13s":
                s = R.drawable.playing_card_spade_k;
                break;
            case "13h":
                s = R.drawable.playing_card_heart_k;
                break;
            case "13d":
                s = R.drawable.playing_card_diamond_k;
                break;
            case "14c":
                s = R.drawable.playing_card_club_a;
                break;
            case "14s":
                s = R.drawable.playing_card_spade_a;
                break;
            case "14h":
                s = R.drawable.playing_card_heart_a;
                break;
            case "14d":
                s = R.drawable.playing_card_diamond_a;
                break;
            default:
                break;
        }

        return s;
    }
    public static int assignCard2() {
        int t = 0;
        switch (gameDeck.get(1)) {

            case "2c":
                t = R.drawable.playing_card_club_2;
                break;
            case "2s":
                t = R.drawable.playing_card_spade_2;
                break;
            case "2h":
                t = R.drawable.playing_card_heart_2;
                break;
            case "2d":
                t = R.drawable.playing_card_diamond_2;
                break;
            case "3c":
                t = R.drawable.playing_card_club_3;
                break;
            case "3s":
                t = R.drawable.playing_card_spade_3;
                break;
            case "3h":
                t = R.drawable.playing_card_heart_3;
                break;
            case "3d":
                t = R.drawable.playing_card_diamond_3;
                break;
            case "4c":
                t = R.drawable.playing_card_club_4;
                break;
            case "4s":
                t = R.drawable.playing_card_spade_4;
                break;
            case "4h":
                t = R.drawable.playing_card_heart_4;
                break;
            case "4d":
                t = R.drawable.playing_card_diamond_4;
                break;
            case "5c":
                t = R.drawable.playing_card_club_5;
                break;
            case "5s":
                t = R.drawable.playing_card_spade_5;
                break;
            case "5h":
                t = R.drawable.playing_card_heart_5;
                break;
            case "5d":
                t = R.drawable.playing_card_diamond_5;
                break;
            case "6c":
                t = R.drawable.playing_card_club_6;
                break;
            case "6s":
                t = R.drawable.playing_card_spade_6;
                break;
            case "6h":
                t = R.drawable.playing_card_heart_6;
                break;
            case "6d":
                t = R.drawable.playing_card_diamond_6;
                break;
            case "7c":
                t = R.drawable.playing_card_club_7;
                break;
            case "7s":
                t = R.drawable.playing_card_spade_7;
                break;
            case "7h":
                t = R.drawable.playing_card_heart_7;
                break;
            case "7d":
                t = R.drawable.playing_card_diamond_7;
                break;
            case "8c":
                t = R.drawable.playing_card_club_8;
                break;
            case "8s":
                t = R.drawable.playing_card_spade_8;
                break;
            case "8h":
                t = R.drawable.playing_card_heart_8;
                break;
            case "8d":
                t = R.drawable.playing_card_diamond_8;
                break;
            case "9c":
                t = R.drawable.playing_card_club_9;
                break;
            case "9s":
                t = R.drawable.playing_card_spade_9;
                break;
            case "9h":
                t = R.drawable.playing_card_heart_9;
                break;
            case "9d":
                t = R.drawable.playing_card_diamond_9;
                break;
            case "10c":
                t = R.drawable.playing_card_club_10;
                break;
            case "10s":
                t = R.drawable.playing_card_spade_10;
                break;
            case "10h":
                t = R.drawable.playing_card_heart_10;
                break;
            case "10d":
                t = R.drawable.playing_card_diamond_10;
                break;
            case "11c":
                t = R.drawable.playing_card_club_j;
                break;
            case "11s":
                t = R.drawable.playing_card_spade_j;
                break;
            case "11h":
                t = R.drawable.playing_card_heart_j;
                break;
            case "11d":
                t = R.drawable.playing_card_diamond_j;
                break;
            case "12c":
                t = R.drawable.playing_card_club_q;
                break;
            case "12s":
                t = R.drawable.playing_card_spade_q;
                break;
            case "12h":
                t = R.drawable.playing_card_heart_q;
                break;
            case "12d":
                t = R.drawable.playing_card_diamond_q;
                break;
            case "13c":
                t = R.drawable.playing_card_club_k;
                break;
            case "13s":
                t = R.drawable.playing_card_spade_k;
                break;
            case "13h":
                t = R.drawable.playing_card_heart_k;
                break;
            case "13d":
                t = R.drawable.playing_card_diamond_k;
                break;
            case "14c":
                t = R.drawable.playing_card_club_a;
                break;
            case "14s":
                t = R.drawable.playing_card_spade_a;
                break;
            case "14h":
                t = R.drawable.playing_card_heart_a;
                break;
            case "14d":
                t = R.drawable.playing_card_diamond_a;
                break;
            default:
                t=0;
                break;
        }

        return t;

    }


    public static int assignCard3() {
        int u = 0;
        switch (gameDeck.get(2)) {

            case "2c":
                u = R.drawable.playing_card_club_2;
                break;
            case "2s":
                u = R.drawable.playing_card_spade_2;
                break;
            case "2h":
                u = R.drawable.playing_card_heart_2;
                break;
            case "2d":
                u = R.drawable.playing_card_diamond_2;
                break;
            case "3c":
                u = R.drawable.playing_card_club_3;
                break;
            case "3s":
                u = R.drawable.playing_card_spade_3;
                break;
            case "3h":
                u = R.drawable.playing_card_heart_3;
                break;
            case "3d":
                u = R.drawable.playing_card_diamond_3;
                break;
            case "4c":
                u = R.drawable.playing_card_club_4;
                break;
            case "4s":
                u = R.drawable.playing_card_spade_4;
                break;
            case "4h":
                u = R.drawable.playing_card_heart_4;
                break;
            case "4d":
                u = R.drawable.playing_card_diamond_4;
                break;
            case "5c":
                u = R.drawable.playing_card_club_5;
                break;
            case "5s":
                u = R.drawable.playing_card_spade_5;
                break;
            case "5h":
                u = R.drawable.playing_card_heart_5;
                break;
            case "5d":
                u = R.drawable.playing_card_diamond_5;
                break;
            case "6c":
                u = R.drawable.playing_card_club_6;
                break;
            case "6s":
                u = R.drawable.playing_card_spade_6;
                break;
            case "6h":
                u = R.drawable.playing_card_heart_6;
                break;
            case "6d":
                u = R.drawable.playing_card_diamond_6;
                break;
            case "7c":
                u = R.drawable.playing_card_club_7;
                break;
            case "7s":
                u = R.drawable.playing_card_spade_7;
                break;
            case "7h":
                u = R.drawable.playing_card_heart_7;
                break;
            case "7d":
                u = R.drawable.playing_card_diamond_7;
                break;
            case "8c":
                u = R.drawable.playing_card_club_8;
                break;
            case "8s":
                u = R.drawable.playing_card_spade_8;
                break;
            case "8h":
                u = R.drawable.playing_card_heart_8;
                break;
            case "8d":
                u = R.drawable.playing_card_diamond_8;
                break;
            case "9c":
                u = R.drawable.playing_card_club_9;
                break;
            case "9s":
                u = R.drawable.playing_card_spade_9;
                break;
            case "9h":
                u = R.drawable.playing_card_heart_9;
                break;
            case "9d":
                u = R.drawable.playing_card_diamond_9;
                break;
            case "10c":
                u = R.drawable.playing_card_club_10;
                break;
            case "10s":
                u = R.drawable.playing_card_spade_10;
                break;
            case "10h":
                u = R.drawable.playing_card_heart_10;
                break;
            case "10d":
                u = R.drawable.playing_card_diamond_10;
                break;
            case "11c":
                u = R.drawable.playing_card_club_j;
                break;
            case "11s":
                u = R.drawable.playing_card_spade_j;
                break;
            case "11h":
                u = R.drawable.playing_card_heart_j;
                break;
            case "11d":
                u = R.drawable.playing_card_diamond_j;
                break;
            case "12c":
                u = R.drawable.playing_card_club_q;
                break;
            case "12s":
                u = R.drawable.playing_card_spade_q;
                break;
            case "12h":
                u = R.drawable.playing_card_heart_q;
                break;
            case "12d":
                u = R.drawable.playing_card_diamond_q;
                break;
            case "13c":
                u = R.drawable.playing_card_club_k;
                break;
            case "13s":
                u = R.drawable.playing_card_spade_k;
                break;
            case "13h":
                u = R.drawable.playing_card_heart_k;
                break;
            case "13d":
                u = R.drawable.playing_card_diamond_k;
                break;
            case "14c":
                u = R.drawable.playing_card_club_a;
                break;
            case "14s":
                u = R.drawable.playing_card_spade_a;
                break;
            case "14h":
                u = R.drawable.playing_card_heart_a;
                break;
            case "14d":
                u = R.drawable.playing_card_diamond_a;
                break;
            default:
                u=0;
                break;
        }

        return u;

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

    public void picUpdater(){
        //possibly get switch parameter?
        //runs switch statement and changes current png files showing on three images
    }

    public void gameBoss() {

        // This switch statement deals with the number of cards to play before someone wins the pile
        switch (rank(0)) {
            case 14:
                cardsToPlay = 4; // jack = 11, queen = 12, king = 13, ace = 14
                break;
            case 13:
                cardsToPlay = 3;
                break;
            case 12:
                cardsToPlay = 2;
                break;
            case 11:
                cardsToPlay = 1;
                break;
            default:
                break;
        }
        // if the deck is not slappable and one of the players wins the pile, run this method
        if (cardsToPlay == 0) {
            if (turn) {
                while (gameDeck.size() > 0) {
                    p1Deck.add(gameDeck.get(0));
                    gameDeck.remove(gameDeck.get(0));
                    picUpdater();
                }
            }
            if (!turn) {
                while (gameDeck.size() > 0) {
                    p2Deck.add(gameDeck.get(0));
                    gameDeck.remove(gameDeck.get(0));
                    picUpdater();
                }
            }
        }

        if (p1Deck.size() == 0 || p2Deck.size() == 0) {
            onStop(); //game ends
        }
    }

    public void gameBoss1() {
        // checks if a player slapped, then if the pile is slappable
        // if they should slap, they get the pile and if not they lose the bottom card of their deck as a penalty

        if (hasSlapped) {
            if (isSlappable()) {
                if (p1Slapped) {
                    while (gameDeck.size() > 0) {
                        p1Deck.add(gameDeck.get(0));
                        gameDeck.remove(gameDeck.get(0));
                        picUpdater();
                    }
                }
                if (p2Slapped) {
                    while (gameDeck.size() > 0) {
                        p2Deck.add(gameDeck.get(0));
                        gameDeck.remove(gameDeck.get(0));
                        picUpdater();
                    }
                }
            } else {
                if (p1Slapped) {
                    gameDeck.add(p1Deck.get(0));
                    p1Deck.remove(p1Deck.get(0));
                    picUpdater();
                }
                if (p2Slapped) {
                    gameDeck.add(p2Deck.get(0));
                    p2Deck.remove(p2Deck.get(0));
                    picUpdater();
                }
            }
        }
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button Deck1 = (Button)findViewById(R.id.Deck1);
        final Button Deck2 = (Button)findViewById(R.id.Deck2);
        final Button Slap1 = (Button)findViewById(R.id.Slap1);
        final Button Slap2 = (Button)findViewById(R.id.Slap2);
        card = (ImageView)findViewById(R.id.imageView);
        card2 = (ImageView)findViewById(R.id.imageView2);
        card3 = (ImageView)findViewById(R.id.imageView3);
        counted1 = (TextView)findViewById(R.id.count1);
        counted2 = (TextView)findViewById(R.id.count2);
        shuffle();
        while (deal) {
            //deal to player 1
            for (int i = 0; i < 26; i++) {
                p1Deck.add(gameDeck.get(0));
                gameDeck.remove(0);
            }

            for (int i = 0; i < 26; i++) {
                p2Deck.add(gameDeck.get(0));
                gameDeck.remove(0);
            }
            deal = false;
        }
        int size1 = p1Deck.size();
        int size2 = p2Deck.size();
        String size1str = String.valueOf(size1);
        String size2str = String.valueOf(size2);
        counted1.setText(size1str);
        counted2.setText(size2str);

        gameBoss1();





        Slap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameDeck.size() > 0 && p1Deck.size() > 0 && p2Deck.size() > 0) { //checks to see if arrays have stuff in them (avoiding nullPointerException)

                    hasSlapped = true;
                    p1Slapped = true;

                }
            }
        });

        Slap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gameDeck.size() > 0 && p1Deck.size() > 0 && p2Deck.size() > 0) { //checks to see if arrays have stuff in them (avoiding nullPointerException)

                    hasSlapped = true;
                    p2Slapped = true;
                }
            }
        });

        Deck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counted1.setText(String.valueOf(p1Deck.size()));
                if (turn) {
                    if (gameDeck.size() >= 0 && p1Deck.size() > 0) { //checks to see if arrays have stuff in them (avoiding nullPointerException)
                        gameDeck.add(0, p1Deck.get(0));
                        p1Deck.remove(0);
                        //assigns image to card
                        int s = assignCard();
                        card.setImageResource(s);
                        if (gameDeck.size()>1) {
                            int t = assignCard2();
                            card2.setImageResource(t);
                        }
                        if (gameDeck.size()>2) {
                            int u = assignCard3();
                            card3.setImageResource(u);
                        }



                        gameBoss();

                        counted1.setText(String.valueOf(p1Deck.size()));

                    }
                }

                turn = false; //change to player 2's turn
            }
        });

        Deck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counted2.setText(String.valueOf(p2Deck.size()));
                if (!turn) {
                    if (gameDeck.size() >= 0 && p2Deck.size() > 0) { //checks to see if arrays have stuff in them (avoiding nullPointerException)
                        gameDeck.add(0, p2Deck.get(0));
                        p2Deck.remove(0);
                        //assigns image to card
                        int s = assignCard();
                        card.setImageResource(s);
                        if (gameDeck.size()>1) {
                            int t = assignCard2();
                            card2.setImageResource(t);
                        }
                        if (gameDeck.size()>2) {
                            int u = assignCard3();
                            card3.setImageResource(u);
                        }

                        gameBoss();
                        counted2.setText(String.valueOf(p2Deck.size()));
                    }
                }

                turn = true; //change to player 1's turn
            }
        });
    }
}
