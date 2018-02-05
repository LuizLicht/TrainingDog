package com.example.farias.projeto;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
// Material Drawer -------------------------------------------------------
import com.example.farias.projeto.FragmentsNavigationDrawer.A_FragmentInicio1;
import com.example.farias.projeto.FragmentsNavigationDrawer.B_FragmentTreino2;
import com.example.farias.projeto.FragmentsNavigationDrawer.C_FragmentDicas3;
import com.example.farias.projeto.FragmentsNavigationDrawer.D_Fragment;
import com.example.farias.projeto.FragmentsNavigationDrawer.E_FragmentAgenda5;
import com.example.farias.projeto.FragmentsNavigationDrawer.F_FragmentConfiguracoes6;
import com.example.farias.projeto.FragmentsNavigationDrawer.G_FragmentAjudaEFeedback7;
import com.example.farias.projeto.FragmentsNavigationDrawer.H_FragmentSobre8;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

public class MainActivity extends AppCompatActivity{

    private AccountHeader headerNavigationLeft = null;
    private Drawer navigationDrawerLeft = null;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


            setContentView(R.layout.activity_main);
            final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);



        getSupportFragmentManager().beginTransaction()
                .add(R.id.content_frame, new A_FragmentInicio1())
                .commit();


        headerNavigationLeft = new AccountHeaderBuilder()
                .withActivity(this)
                .withCompactStyle(false)
                .withSavedInstance(savedInstanceState)
                .withThreeSmallProfileImages(false)
                .withHeaderBackground(R.color.colorPrimary)
                .addProfiles(
                        new ProfileDrawerItem().withName("Fred")
                .withIcon(R.drawable.dog)).withDividerBelowHeader(true)
                .withHeaderBackground(R.color.colorPrimary)
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean current) {

                        return false;
                    }
                })
                .build();

        navigationDrawerLeft = new DrawerBuilder(this)
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggleAnimated(true)
                .withDrawerGravity(Gravity.LEFT)
                .withSavedInstance(savedInstanceState)
                .withAccountHeader(headerNavigationLeft)
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem idraweritem) {

                        if(position == 1){
                            replaceFragment(new A_FragmentInicio1());
                        }else if(position == 2){
                            replaceFragment(new B_FragmentTreino2());
                        }else if(position == 3){
                            replaceFragment(new C_FragmentDicas3());
                        }else if(position == 4){
                            replaceFragment(new D_Fragment());
                        }else if(position == 5){
                            replaceFragment(new E_FragmentAgenda5());
                        }else if (position == 7){
                            replaceFragment(new F_FragmentConfiguracoes6());
                        }else if (position == 8){
                        replaceFragment(new G_FragmentAjudaEFeedback7());
                        }else if (position == 9){
                        replaceFragment(new H_FragmentSobre8());
                    }
                        return false;
                    }
                    private void replaceFragment(Fragment frag) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, frag, "TAG").commit();
                    }
                })
                .build();

        navigationDrawerLeft.addItem(new PrimaryDrawerItem().withName("inicio")
                .withIcon(R.drawable.inicio).withSetSelected(true));
        navigationDrawerLeft.addItem(new PrimaryDrawerItem().withName("treino")
                .withIcon(R.drawable.treino));
        navigationDrawerLeft.addItem(new PrimaryDrawerItem().withName("dicas")
                .withIcon(R.drawable.dicas));
        navigationDrawerLeft.addItem(new PrimaryDrawerItem().withName("Guia de raças").withIcon(R.drawable.guiaracas));
        navigationDrawerLeft.addItem(new PrimaryDrawerItem().withName("agenda").withIcon(R.drawable.agenda));
        navigationDrawerLeft.addItem(new DividerDrawerItem());
        navigationDrawerLeft.addItem(new PrimaryDrawerItem().withName("Configurações"));
        navigationDrawerLeft.addItem(new PrimaryDrawerItem().withName("Ajuda e feedback"));
        navigationDrawerLeft.addItem(new PrimaryDrawerItem().withName("Sobre"));

        }




}








