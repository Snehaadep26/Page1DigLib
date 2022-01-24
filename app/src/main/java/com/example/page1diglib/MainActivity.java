package com.example.page1diglib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Card1Hori> cardHori;
    ArrayList<Card1Verti> cardVert;
    RecyclerView recyclerView1,recyclerView2,recyclerView3;
    Card1HoriAdapter cardHoriAdapter;
    Card1VertiAdapter cardVertiAdapter1,cardVertiAdapter2;
    RecyclerView.LayoutManager layoutManager1,layoutManager2,layoutManager3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        cardHori.add(new Card1Hori(R.drawable.notes,"0","Lecture Notes"));
        cardHori.add(new Card1Hori(R.drawable.videos,"0","Videos"));
        cardHori.add(new Card1Hori(R.drawable.quebank,"0","Question banks"));


    }


    public void buildRecyclerView() {

        recyclerView1 = findViewById(R.id.recyler1);
        recyclerView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(layoutManager1);
        cardHoriAdapter = new Card1HoriAdapter(cardHori);
        recyclerView1.setAdapter(cardHoriAdapter);
    }
    public void createCard1() {
        cardVert=new ArrayList<>();
        cardVert.add(new Card1Verti("A","NEET","0","0","0",R.drawable.notes1,R.drawable.video1,R.drawable.quebank1));
        cardVert.add(new Card1Verti("A","NEET","0","0","0",R.drawable.notes1,R.drawable.video1,R.drawable.quebank1));


    }


    public void createCard2() {
        cardVert=new ArrayList<>();
        cardVert.add(new Card1Verti("A","NEET","0","0","0",R.drawable.notes1,R.drawable.video1,R.drawable.quebank1));


    }
    public void buildRecyclerView1() {

        recyclerView2 = findViewById(R.id.recyler2);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        cardVertiAdapter1 = new Card1VertiAdapter(cardVert);
        recyclerView2.setAdapter(cardVertiAdapter1);
    }
    public void buildRecyclerView2() {

        recyclerView2 = findViewById(R.id.recyler3);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        cardVertiAdapter1 = new Card1VertiAdapter(cardVert);
        recyclerView2.setAdapter(cardVertiAdapter1);
    }
    public void buildRecyclerView3() {

        recyclerView2 = findViewById(R.id.recyler4);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        cardVertiAdapter1 = new Card1VertiAdapter(cardVert);
        recyclerView2.setAdapter(cardVertiAdapter1);
    }
    public void buildRecyclerView4() {

        recyclerView2 = findViewById(R.id.recyler5);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        cardVertiAdapter1 = new Card1VertiAdapter(cardVert);
        recyclerView2.setAdapter(cardVertiAdapter1);
    }

}