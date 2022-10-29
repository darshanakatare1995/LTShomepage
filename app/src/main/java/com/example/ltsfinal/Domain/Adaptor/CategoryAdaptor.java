package com.example.ltsfinal.Domain.Adaptor;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ltsfinal.Domain.CategoryDomain;
import com.example.ltsfinal.R;
import com.example.ltsfinal.agriculturecat;
import com.example.ltsfinal.astrologycat;
import com.example.ltsfinal.couriercat;
import com.example.ltsfinal.fitnesscat;
import com.example.ltsfinal.pestcontrolcat;
import com.example.ltsfinal.sportscat;
import com.example.ltsfinal.weddingactivity;

import java.time.Instant;
import java.util.ArrayList;

public class CategoryAdaptor extends RecyclerView.Adapter<CategoryAdaptor.ViewHolder> {
    ArrayList<CategoryDomain>categoryDomains;


    public CategoryAdaptor(ArrayList<CategoryDomain> categoryDomains){
        this.categoryDomains = categoryDomains;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_category,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.categoryName.setText(categoryDomains.get(position).getTitle());
        String picUrl = "";
        switch (position){
            case 0: {
                picUrl = "agri";
                holder.mainlayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.agriback));
                break;
            }
            case 1: {
                picUrl = "astro";
                holder.mainlayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.astroback));
                break;
            }
            case 2: {
                picUrl = "cou";
                holder.mainlayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.couback));
                break;
            }
            case 3: {
                picUrl = "fit";
                holder.mainlayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.fitback));
                break;
            }
            case 4: {
                picUrl = "pest";
                holder.mainlayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.pestback));
                break;
            }
            case 5: {
                picUrl = "sports";
                holder.mainlayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.spback));
                break;
            }
            case 6: {
                picUrl = "wed";
                holder.mainlayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.wedback));
                break;
            }

        }
        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.categorypic);

        holder.mainlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Selected item"+position, Toast.LENGTH_SHORT).show();

            }
        });
        switch (position){
            case 0 :
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), agriculturecat.class);
                        view.getContext().startActivity(intent);

                    }
                });
                break;

            case 1 :
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), astrologycat.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 2 :
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), couriercat.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 3 :
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), fitnesscat.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 4 :
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), pestcontrolcat.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 5 :
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), sportscat.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
            case 6 :
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), weddingactivity.class);
                        view.getContext().startActivity(intent);
                    }
                });
                break;
        }
    }


    @Override
    public int getItemCount() {
        return categoryDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView categoryName;
        ImageView categorypic;
        LinearLayout mainlayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName=itemView.findViewById(R.id.categoryName);
            categorypic=itemView.findViewById(R.id.CategoryPic);
            mainlayout=itemView.findViewById(R.id.mainlayout);
        }
    }

}
