package com.example.appzest;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class IntroFragment1 extends Fragment {

    public IntroFragment1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_intro1, container, false);
        ImageView image2 = view.findViewById(R.id.image2);
        image2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), LoginActivity.class);
            startActivity(intent);
            requireActivity().finish();
        });
        return view;
    }
}