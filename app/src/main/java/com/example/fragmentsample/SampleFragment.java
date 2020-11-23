package com.example.fragmentsample;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SampleFragment extends Fragment {
    private final String Tag = "lifecycle";

    @Override
    public void onAttach(@NonNull Context context) {
        Log.i(Tag,"onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Tag,"onCreate");
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(Tag,"onCreateView");
        return inflater.inflate(R.layout.fragment_main,
                container,false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(Tag,"onCreateView");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(Tag,"onStart");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(Tag,"onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(Tag,"onStop");
    }

    

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(Tag,"onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(Tag,"onDetach");
    }
}
