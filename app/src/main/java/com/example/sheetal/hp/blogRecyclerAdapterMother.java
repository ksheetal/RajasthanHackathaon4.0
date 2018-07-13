package com.example.sheetal.hp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class blogRecyclerAdapterMother extends RecyclerView.Adapter<blogRecyclerAdapterMother.ViewHolder> {

    private Context context;
    private List<blog> blogList;

    public blogRecyclerAdapterMother(Context context, List<blog> blogList) {
        this.context = context;
        this.blogList = blogList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView ChildName;
        public TextView ChildDOB1;
        public TextView ChildFatherName;

        String userid;

        public ViewHolder(View view,Context ctx ) {
            super(view);
            context = ctx;

            ChildName = (TextView) view.findViewById(R.id.ChildName);
            ChildDOB1 = (TextView) view.findViewById(R.id.ChildDOB);
            ChildFatherName= (TextView) view.findViewById(R.id.ChildFatherName);

            userid = null;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(this, "Hello world!!", Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
    @Override
    public blogRecyclerAdapterMother.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.postrowmother,parent,false);
        return new ViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(blogRecyclerAdapterMother.ViewHolder holder, int position) {

        blog blogg = blogList.get(position);

        holder.ChildName.setText("Mother Name - " + blogg.getChildName());
        holder.ChildDOB1.setText("Expecting Baby - " + blogg.getChildDOB());
        holder.ChildFatherName.setText("Baby's Father Name - " + blogg.getChildFatherName());
    }

    @Override
    public int getItemCount() {
        return blogList.size();
    }
}
