package com.pkk.android.contact;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class contactadapter extends RecyclerView.Adapter<contactadapter.myviewholder>{

    private static LayoutInflater layoutinflator;
    List<MainActivity.ContactModel> list;

    void setlist(List<MainActivity.ContactModel> list){
        this.list=list;
    }

    contactadapter(Context context){
        layoutinflator = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutinflator.inflate(R.layout.listitem, viewGroup, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder myviewholder, int i) {
        myviewholder.name.setText(list.get(i).name);
        myviewholder.phone.setText(list.get(i).mobileNumber);
        myviewholder.contact.setId(Integer.parseInt(list.get(i).id));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class myviewholder extends RecyclerView.ViewHolder{
        public TextView name;
        public CardView contact;
        public TextView phone;
        public TextView email;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            phone = itemView.findViewById(R.id.phone);
            email = itemView.findViewById(R.id.email);
            contact = itemView.findViewById(R.id.contact);
        }
    }
}
