package com.vetoquinol.algerie.fragments;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.vetoquinol.algerie.R;
import com.vetoquinol.algerie.adapters.ImageAdapter;

import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {
    ViewPager viewPager;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.a_home_fragment,container,false);

        //initialising views :
        viewPager = v.findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(getContext());

        //put image list from ImageAdapter in viewPager
        viewPager.setAdapter(adapter);

        //auto scroll image after 8 sec
        Timer timer = new Timer();
        timer.schedule(new MyTimerTask(),2000,2000);

        //return the view :
        return v;
    }

    //This Function to make auto scroll after certain time :
    public class MyTimerTask extends TimerTask
    {
        @Override
        public void run() {
            if (getActivity() != null)
            {
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        if (viewPager.getCurrentItem()==0)
                        {
                            viewPager.setCurrentItem(1,true);

                        }else if (viewPager.getCurrentItem()==1)
                        {
                            viewPager.setCurrentItem(2,true);

                        }
                        else if (viewPager.getCurrentItem()==2)
                        {
                            viewPager.setCurrentItem(3,true);


                        }else if (viewPager.getCurrentItem()==3)
                        {
                            viewPager.setCurrentItem(4,true);

                        }else if (viewPager.getCurrentItem()==4)
                        {
                            viewPager.setCurrentItem(5,true);
                        }
                        else if (viewPager.getCurrentItem()==5)
                        {
                            viewPager.setCurrentItem(6,true);

                        }else if (viewPager.getCurrentItem()==6)
                        {
                            viewPager.setCurrentItem(7,true);

                        }
                        //
                        else if (viewPager.getCurrentItem()==7)
                        {
                            viewPager.setCurrentItem(8,true);

                        }else if (viewPager.getCurrentItem()==8)
                        {
                            viewPager.setCurrentItem(9,true);

                        }
                        //
                        else if (viewPager.getCurrentItem()==9)
                        {
                            viewPager.setCurrentItem(10,true);

                        }else if (viewPager.getCurrentItem()==10)
                        {
                            viewPager.setCurrentItem(11,true);

                        }


                        else
                        {
                            viewPager.setCurrentItem(0,true);
                        }



                    }
                });
            }

        }
    }



}
