package com.example.gmail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterEmail extends RecyclerView.Adapter<AdapterEmail.MyViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;

    public AdapterEmail(Context ct, String str1[], String str2[], int img[]){
        context = ct;
        data1 = str1;
        data2 = str2;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.TextView1.setText(data1[position]);
        holder.TextView2.setText(data2[position]);
        holder.myImageView.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView TextView1, TextView2;
        ImageView myImageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            TextView1 = itemView.findViewById(R.id.TextView1);
            TextView2 = itemView.findViewById(R.id.TextView2);
            myImageView = itemView.findViewById(R.id.myImageView);
        }
    }
}
