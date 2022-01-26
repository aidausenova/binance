package com.ui.home;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mobileservice.myapplication77.R;
import com.ui.User;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>{
    private ArrayList<User> list;

    public HomeAdapter(ArrayList<User> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2, tv3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.symbol1);
            tv2 = itemView.findViewById(R.id.change1);
            tv3 = itemView.findViewById(R.id.gain1);
        }

        @SuppressLint("SetTextI18n")
        public void bind(User user) {
            tv1.setText("Symbol");
            tv2.setText("Change");
            tv3.setText("Gain");
            tv1.setOnClickListener(view -> {
                tv3.setText("22222");
            });
        }
    }


    /*class RecyclerViewAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)
            return ViewHolder(view)
        }
        override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
            holder.bind(userList[position])
        }
        override fun getItemCount(): Int {
            return userList.size
        }
        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(user: User) {
                val textViewName = itemView.findViewById<TextView>(R.id.firstname)
                        textViewName.text = user.Firstname
            }
        }
    }*/
}
