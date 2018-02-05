package com.example.farias.projeto.FragmentsNavigationDrawer; /**
 * Created by farias on 18/05/16.
 */
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.farias.projeto.FragmentsGuiaRacas.FragmentA;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentB;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentC;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentD;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentE;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentF;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentG;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentH;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentI;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentJ;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentK;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentL;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentM;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentN;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentO;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentP;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentQ;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentR;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentS;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentT;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentU;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentV;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentW;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentX;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentY;
import com.example.farias.projeto.FragmentsGuiaRacas.FragmentZ;
import com.example.farias.projeto.R;


public class D_Fragment extends Fragment {

    private TabLayout tab_layout;
    private ViewPager view_pager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        final View view;
        view = inflater.inflate(R.layout.d_fragment, container, false);

        tab_layout = (TabLayout) view.findViewById(R.id.tab_layout);
        view_pager = (ViewPager) view.findViewById(R.id.view_pager);

        FragmentManager manager = getActivity().getSupportFragmentManager();
        PageAdapter adapter = new PageAdapter(manager);
        view_pager.setAdapter(adapter);
        tab_layout.post(new Runnable() {
            @Override
            public void run() {
                tab_layout.setupWithViewPager(view_pager);
            }
        });
        view_pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab_layout));

        return view;
    }

    public class PageAdapter extends FragmentStatePagerAdapter {

        public String fragments[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S",
        "T","U","V","W","X","Y","Z"};

        public PageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new FragmentA();
                case 1:
                    return new FragmentB();
                case 2:
                    return new FragmentC();
                case 3:
                    return new FragmentD();
                case 4:
                    return new FragmentE();
                case 5:
                    return new FragmentF();
                case 6:
                    return new FragmentG();
                case 7:
                    return new FragmentH();
                case 8:
                    return new FragmentI();
                case 9:
                    return new FragmentJ();
                case 10:
                    return new FragmentK();
                case 11:
                    return new FragmentL();
                case 12:
                    return new FragmentM();
                case 13:
                    return new FragmentN();
                case 14:
                    return new FragmentO();
                case 15:
                    return new FragmentP();
                case 16:
                    return new FragmentQ();
                case 17:
                    return new FragmentR();
                case 18:
                    return new FragmentS();
                case 19:
                    return new FragmentT();
                case 20:
                    return new FragmentU();
                case 21:
                    return new FragmentV();
                case 22:
                    return new FragmentW();
                case 23:
                    return new FragmentX();
                case 24:
                    return new FragmentY();
                case 25:
                    return new FragmentZ();
                default:
                    return null;
                // (61)9373-9818
            }

        }

        @Override
        public int getCount() {
            return fragments.length;
        }

        public CharSequence getPageTitle(int position){
            return fragments[position];
        }

    }
}