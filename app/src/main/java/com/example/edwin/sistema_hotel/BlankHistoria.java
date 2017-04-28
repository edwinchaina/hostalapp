package com.example.edwin.sistema_hotel;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.edwin.sistema_hotel.carousel.CarouselAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;



public class BlankHistoria extends Fragment {

    ViewPager view_pager;

    TabLayout indicators;

    int count = 0;
        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view =inflater.inflate(R.layout.fragment_blank_historia, container, false);
        view_pager= (ViewPager) view.findViewById(R.id.view_pager);
           indicators= (TabLayout) view.findViewById(R.id.indicators);
           view_pager.setAdapter(new CustomPagerAdapter(getActivity()));
           setupPager(); //llamando al metodo
        return view;
    }

    private void setupPager(){
        //CarouselAdapter adapter = new CarouselAdapter(this);

        indicators.setupWithViewPager(view_pager, true);


    }


}
