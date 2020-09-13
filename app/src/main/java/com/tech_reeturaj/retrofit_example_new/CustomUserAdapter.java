package com.tech_reeturaj.retrofit_example_new;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tech_reeturaj.retrofit_example_new.model.User;

import java.util.List;

public class CustomUserAdapter extends RecyclerView.Adapter<CustomUserAdapter.MyView> {
    private List<User> userList;

    public CustomUserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyView holder, int position) {
        User user = userList.get(position);
        holder.tname.setText(user.getName());
        holder.temail.setText(user.getEmail());
        holder.tcompany.setText(user.getCompany().getName());
        holder.twebsite.setText(user.getWebsite());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    static class MyView extends RecyclerView.ViewHolder {
        private TextView tcompany, tname, twebsite, temail;

        public MyView(@NonNull View itemView) {
            super(itemView);
            tcompany = itemView.findViewById(R.id.company);
            tname = itemView.findViewById(R.id.name);
            twebsite = itemView.findViewById(R.id.website);
            temail = itemView.findViewById(R.id.email);
        }
    }
}
