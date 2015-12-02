package com.example.aquinoacordero.intent;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by aquinoacordero on 11/26/15.
 */
public class frag2 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main,
                container, false);
        return view;
    }

    public void setText(String url) {
        TextView view = (TextView) getView().findViewById(R.id.texto);
        view.setText(url);
    }
}
