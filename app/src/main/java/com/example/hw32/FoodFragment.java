package com.example.hw32;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FoodFragment extends Fragment {
    private RecyclerView rvFood;
    private ArrayList<String> foodList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvFood = requireActivity().findViewById(R.id.rv_food);
        loadData();
        FoodAdapter foodAdapter = new FoodAdapter(foodList);
        rvFood.setAdapter(foodAdapter);
    }

    private void loadData() {
        foodList.add("Крабсбургер");
        foodList.add("Рибай");
        foodList.add("Шаурма");
        foodList.add("суши");
        foodList.add("Плов");
        foodList.add("Манты");
        foodList.add("Карбонары");
        foodList.add("Хинкали");
        foodList.add("Долма");
        foodList.add("Кебаб");
        foodList.add("ролы");
        foodList.add("Макароны");
        foodList.add("Круассан");
        foodList.add("Суши");
        foodList.add("Пицца");
        foodList.add("Пицца");
        foodList.add("Бешбармак");
        foodList.add("Пельмени");
        foodList.add("Такос");
        foodList.add("Хачапури");
        foodList.add("Борщ");
    }
}