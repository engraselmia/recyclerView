package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.Myviewholder> {

    Context context;
    String [] title,description;
    int[] image;

public Adapter(Context context,String[] title,String[] description,int[] image){

    this.context=context;
    this.title=title;
    this.description=description;
    this.image=image;

}

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recycle,viewGroup,false);

        return new Myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {

        holder.titletext.setText(title[position]);
        holder.descriptionText.setText(description[position]);
        holder.imageView.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return description.length;
    }

    public class Myviewholder extends RecyclerView.ViewHolder {

    TextView titletext,descriptionText;
    ImageView imageView;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);

            titletext =itemView.findViewById(R.id.titleTV);
            descriptionText =itemView.findViewById(R.id.descTV);
            imageView =itemView.findViewById(R.id.imageView);
        }
    }

}
