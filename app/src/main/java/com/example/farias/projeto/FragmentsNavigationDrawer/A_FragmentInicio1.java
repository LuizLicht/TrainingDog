package com.example.farias.projeto.FragmentsNavigationDrawer; /**
 * Created by farias on 18/05/16.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.farias.projeto.R;


public class A_FragmentInicio1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.a_fragment, container, false);
    }

}