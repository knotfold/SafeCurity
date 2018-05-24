package com.example.pcwin.safecurity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Tab1QuickButtons extends Fragment {


    private Button buttonProtCiv;
    private Button buttonBombe;
    private Button buttonCruzRoja;
    private Button buttonPolice;



    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, Bundle
            savedInstanceState){
        View rootView = inflater.inflate(R.layout.tab1_quick_buttons, container, false);

        buttonProtCiv = (Button) rootView.findViewById(R.id.buttonProtCiv);
        buttonBombe = (Button) rootView.findViewById(R.id.buttonBomberos);
        buttonCruzRoja = (Button) rootView.findViewById(R.id.buttonCruzRoja);
        buttonPolice = (Button) rootView.findViewById(R.id.buttonPolice);


        return rootView;

    }

}

