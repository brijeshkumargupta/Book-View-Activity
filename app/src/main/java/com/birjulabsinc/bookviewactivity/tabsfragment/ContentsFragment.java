package com.birjulabsinc.bookviewactivity.tabsfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.birjulabsinc.bookviewactivity.R;

public class ContentsFragment extends Fragment {

    public ContentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contents, container, false);
        return view;
    }
}