package com.example.aquinoacordero.intent;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Frag1 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main2,
                container, false);
        return view;
    }

    public void setText(String url) {
        TextView view = (TextView) getView().findViewById(R.id.texto);
        view.setText(url);
    }
}



