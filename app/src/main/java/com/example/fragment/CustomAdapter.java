package com.example.fragment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyHolder> {

    Context c;
    ArrayList<ModalClass> modalClasses;

    public CustomAdapter(Context c, ArrayList<ModalClass> modalClasses) {
        this.c = c;
        this.modalClasses = modalClasses;
    }

    @NonNull
    @Override
    public CustomAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.MyHolder myHolder, int i) {

        myHolder.mNama.setText(modalClasses.get(i).getNama());
        myHolder.mImBendera.setImageResource(modalClasses.get(i).getImg());
        myHolder.mDet.setText(modalClasses.get(i).getDetail());
        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(c, com.example.fragment.AnotherActivity.class);
                intent.putExtra("iNama", modalClasses.get(i).getNama());
                intent.putExtra("iDetail", modalClasses.get(i).getDetail());
                intent.putExtra("iImage", modalClasses.get(i).getImg());
                c.startActivity(intent);
            }
        });
//            @Override
//            public void onItemClickListener(View v, int position)
//            {
//
//                String gNama = modalClasses.get(position).getNama();
//                String gDet = modalClasses.get(position).getDetail();
//
//                BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImBendera.getDrawable();
//
//                Bitmap bitmap = bitmapDrawable.getBitmap();
//
//                ByteArrayOutputStream stream = new ByteArrayOutputStream();
//
//                bitmap.compress(Bitmap.CompressFormat.JPEG, 200, stream);
//
//                byte[] bytes = stream.toByteArray();
//
//                Intent intent = new Intent(c, com.example.myrecylcerview.AnotherActivity.class);
//                intent.putExtra("iNama", gNama);
//                intent.putExtra("iDetail",gDet);
//                intent.putExtra("iImage", bytes);
//                c.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return modalClasses.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        private ImageView mImBendera;
        private TextView mNama;
        private TextView mDet;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            mImBendera = itemView.findViewById(R.id.highlighterImg);
            mNama = itemView.findViewById(R.id.HighlighterTitle);
            mDet = itemView.findViewById(R.id.detailHighlighter);
        }

    }
}
