package com.example.cartoon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartoonAdapter extends RecyclerView.Adapter {

    ArrayList<Cartoon> C_Array;
    Context context;

    public CartoonAdapter(ArrayList<Cartoon> c_Array, Context context) {
        C_Array = c_Array;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cartoon_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((ViewHolder)holder).img.setImageResource(C_Array.get(position).getImage());
        ((ViewHolder)holder).name.setText(C_Array.get(position).getName());
        ((ViewHolder)holder).rating.setText(C_Array.get(position).getRating()+"");
        ((ViewHolder)holder).year.setText(C_Array.get(position).getYear()+"");
    }

    @Override
    public int getItemCount() {
        return C_Array.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView img;
        public TextView name;
        public TextView rating;
        public TextView year;
        public View view;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView);
            rating = itemView.findViewById(R.id.textView3);
            year = itemView.findViewById(R.id.textView5);


        }
    }

}
