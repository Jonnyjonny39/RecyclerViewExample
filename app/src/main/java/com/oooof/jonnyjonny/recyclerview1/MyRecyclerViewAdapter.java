package com.oooof.jonnyjonny.recyclerview1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private List<Person>persons;
    private Context context;

    public MyRecyclerViewAdapter(List<Person>persons,Context context){
        this.persons=persons;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Person person=persons.get(position);
        holder.txtname.setText(person.getName());
        holder.txtJob.setText(person.getJob());


    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtname;
        public TextView txtJob;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname=(TextView)itemView.findViewById(R.id.txtPersonName);
            txtJob=(TextView)itemView.findViewById(R.id.txtPersonJob);
        }
    }
}
