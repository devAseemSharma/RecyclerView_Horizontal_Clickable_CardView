package com.example.recyclerview_horizontal_clickable_cardview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Card_RecyclerViewAdapter extends RecyclerView.Adapter<Card_RecyclerViewAdapter.MyCardViewHolder> {


    private Context context;
    private ArrayList<CardInfo> cardInfoArrayList;

    public Card_RecyclerViewAdapter(Context context, ArrayList<CardInfo> cardInfoArrayList){
        this.context = context;
        this.cardInfoArrayList = cardInfoArrayList;
    }

    @NonNull
    @Override
    public Card_RecyclerViewAdapter.MyCardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview,viewGroup,false);
        return new MyCardViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyCardViewHolder myCardViewHolder, int i) {
        CardInfo cardInfo = cardInfoArrayList.get(i);
        myCardViewHolder.textView_socialname.setText(cardInfo.getSocialname());
        myCardViewHolder.textView_username.setText(cardInfo.getUsername());
    }

    @Override
    public int getItemCount() {
        return cardInfoArrayList.size();
    }

    public class MyCardViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        RelativeLayout relativeLayout;
        TextView textView_socialname,textView_username;
        public MyCardViewHolder(@NonNull final View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.cardView_main);
            relativeLayout = itemView.findViewById(R.id.rootCardLayout);
            textView_socialname = itemView.findViewById(R.id.social_textView);
            textView_username = itemView.findViewById(R.id.username_textView);

            cardView.setCardBackgroundColor(Color.parseColor("#95a5a6"));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    relativeLayout.setBackground(ContextCompat.getDrawable(context,R.drawable.gradient));

                    switch (getAdapterPosition()){
                        case 0:
                            Toast.makeText(context,""+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            break;

                        case 1:
                            Toast.makeText(context,""+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            break;

                        case 2:
                            Toast.makeText(context,""+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            break;

                        case 3 :
                            Toast.makeText(context,""+getAdapterPosition(),Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            });
        }
    }
}
