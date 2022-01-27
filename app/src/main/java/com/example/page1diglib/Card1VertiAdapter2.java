package com.example.page1diglib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Card1VertiAdapter2 extends RecyclerView.Adapter<Card1VertiAdapter2.MyViewHolder> {


    ArrayList<com.example.page1diglib.Card1Verti2> name;
    Context context;

    public Card1VertiAdapter2(ArrayList<com.example.page1diglib.Card1Verti2> name,Context context)
    {

        this.name = name;
        this.context=context;
    }



    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(parent.getContext()).inflate(R.layout.card1verti2,parent,false);
        MyViewHolder vHolder=new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull MyViewHolder holder, int position) {
        com.example.page1diglib.Card1Verti2 currentMath = name.get(position);

//        holder.imageCross.setImageResource(currentMath.getImageCross());
//        holder.imageView.setImageResource(currentMath.getImageView());
        holder.AText.setText(currentMath.getAText());
        holder.neetText.setText(currentMath.getNeetText());
        holder.lecText.setText(currentMath.getLecText());
        holder.vidText.setText(currentMath.getVidText());
        holder.queText.setText(currentMath.getQueText());
        holder.lecImg.setImageResource(currentMath.getLecimg());
        holder.vidImg.setImageResource(currentMath.getVidImg());
        holder.queImg.setImageResource(currentMath.getQueImg());

    }

    @Override
    public int getItemCount()
    {
        return name.size();
    }






    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView lecImg,vidImg,queImg;
        TextView AText,neetText,lecText,vidText,queText;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            AText=itemView.findViewById(R.id.Atext);
            neetText=itemView.findViewById(R.id.neetText);
            lecText=itemView.findViewById(R.id.zeroText1);
            vidText=itemView.findViewById(R.id.zeroText2);
            queText=itemView.findViewById(R.id.zeroText3);
            lecImg=itemView.findViewById(R.id.lectureImage);
            vidImg=itemView.findViewById(R.id.videoImage);
            queImg=itemView.findViewById(R.id.queImage);

        }
    }
}