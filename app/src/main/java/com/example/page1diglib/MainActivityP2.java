package com.example.page1diglib;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivityP2 extends AppCompatActivity {
    ArrayList<com.example.page1diglib.Card1Hori2> cardHori;
    ArrayList<com.example.page1diglib.Card1Verti2> cardVert;
    RecyclerView recyclerView1,recyclerView2,recyclerView3;
    Card1HoriAdapter2 cardHoriAdapter;
    Card1VertiAdapter2 cardVertiAdapter1,cardVertiAdapter2;
    RecyclerView.LayoutManager layoutManager1,layoutManager2,layoutManager3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2main);
        createCard();
        buildRecyclerView();
        createCard1();
        buildRecyclerView1();
        buildRecyclerView3();

        createCard2();

        buildRecyclerView2();
        buildRecyclerView4();



    }
    public void createCard() {
        cardHori=new ArrayList<>();
        cardHori.add(new com.example.page1diglib.Card1Hori2(R.drawable.notes,"0","Lecture Notes","+100 from last week "));
        cardHori.add(new com.example.page1diglib.Card1Hori2(R.drawable.videos,"0","Videos",""));
        cardHori.add(new com.example.page1diglib.Card1Hori2(R.drawable.quebank,"0","Question banks","-50 from last week"));


    }


    public void buildRecyclerView() {

        recyclerView1 = findViewById(R.id.recyler1);
        recyclerView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(layoutManager1);
        cardHoriAdapter = new Card1HoriAdapter2(cardHori,MainActivityP2.this);
        recyclerView1.setAdapter(cardHoriAdapter);
    }
    public void createCard1() {
        cardVert=new ArrayList<>();
        cardVert.add(new com.example.page1diglib.Card1Verti2("A","NEET","0","0","0",R.drawable.notes1,R.drawable.video1,R.drawable.quebank1));
        cardVert.add(new com.example.page1diglib.Card1Verti2("A","NEET","0","0","0",R.drawable.notes1,R.drawable.video1,R.drawable.quebank1));


    }


    public void createCard2() {
        cardVert=new ArrayList<>();
        cardVert.add(new com.example.page1diglib.Card1Verti2("A","NEET","0","0","0",R.drawable.notes1,R.drawable.video1,R.drawable.quebank1));


    }
    public void buildRecyclerView1() {

        recyclerView2 = findViewById(R.id.recyler2);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        cardVertiAdapter1 = new Card1VertiAdapter2(cardVert,MainActivityP2.this);
        recyclerView2.setAdapter(cardVertiAdapter1);
    }
    public void buildRecyclerView2() {

        recyclerView2 = findViewById(R.id.recyler3);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        cardVertiAdapter1 = new Card1VertiAdapter2(cardVert,MainActivityP2.this);
        recyclerView2.setAdapter(cardVertiAdapter1);
    }
    public void buildRecyclerView3() {

        recyclerView2 = findViewById(R.id.recyler4);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        cardVertiAdapter1 = new Card1VertiAdapter2(cardVert,MainActivityP2.this);
        recyclerView2.setAdapter(cardVertiAdapter1);
    }
    public void buildRecyclerView4() {

        recyclerView2 = findViewById(R.id.recyler5);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        cardVertiAdapter1 = new Card1VertiAdapter2(cardVert,MainActivityP2.this);
        recyclerView2.setAdapter(cardVertiAdapter1);
    }

}