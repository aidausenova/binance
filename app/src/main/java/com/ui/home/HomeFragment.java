package com.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mobileservice.myapplication77.R;
import com.ui.User;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private HomeAdapter homeAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);

        ArrayList<User> liset = new ArrayList<>();
        User user = new User();
        user.setText1("test1");
        user.setText2("test2");
        user.setText3("test3");
        liset.add(user);
        liset.add(user);
        liset.add(user);
        liset.add(user);
        liset.add(user);
        liset.add(user);
        liset.add(user);
        liset.add(user);
        liset.add(user);
        liset.add(user);
        liset.add(user);

        Log.d("TEST",""+liset.size());
        homeAdapter = new HomeAdapter(liset);
        recyclerView.setAdapter(homeAdapter);

    }
}