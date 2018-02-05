package com.example.farias.projeto.FragmentsNavigationDrawer; /**
 * Created by farias on 18/05/16.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.farias.projeto.R;


public class C_FragmentDicas3 extends Fragment {

    public C_FragmentDicas3() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.c_fragment, container, false);
    }

}