package com.example.recyclerview_horizontal_clickable_cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Card_RecyclerViewAdapter card_recyclerViewAdapter;
    private ArrayList<CardInfo> cardInfoArrayList;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView_main);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        cardInfoArrayList = new ArrayList<>();

        card_recyclerViewAdapter = new Card_RecyclerViewAdapter(this,cardInfoArrayList);
        recyclerView.setAdapter(card_recyclerViewAdapter);

        setupCardRecycelerView();
    }

    private void setupCardRecycelerView(){
        CardInfo cardInfo = new CardInfo("Github","TypeToCode");
        cardInfoArrayList.add(cardInfo);

        cardInfo = new CardInfo("Instagram","typetocode");
        cardInfoArrayList.add(cardInfo);

        cardInfo = new CardInfo("Twitter","typetocode");
        cardInfoArrayList.add(cardInfo);

        cardInfo =  new CardInfo("Email","typetocode@gmail.com");
        cardInfoArrayList.add(cardInfo);
    }
}
