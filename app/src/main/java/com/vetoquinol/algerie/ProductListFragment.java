package com.vetoquinol.algerie;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.GridLayoutAnimationController;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class ProductListFragment extends Fragment {
    GridView gridview ;
    //My list of image ( ic stande for images comprissed ) the tumbnails images
    int[] content ;

    LinearLayout backgroundimg ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.c2_productlist_fragment,container,false);

        //getting the infos :
        final int itemList = this.getArguments().getInt("itemList",0);
        final int itemPostion = this.getArguments().getInt("itemPostion",0);
        //get selected item
        //final String selectedcase = selectedItem(itemList,itemPostion);

        //Toast.makeText(getActivity(),"seleced is : " +selectedcase ,Toast.LENGTH_SHORT).show();

        backgroundimg = (LinearLayout) v.findViewById(R.id.backgroundimg);

        //SetCOntent : acording to selected category
        setContent(itemList,itemPostion);
        //GRID VIEW :

        gridview = v.findViewById(R.id.gridview);
        //animation
        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.slidup);
        GridLayoutAnimationController controller = new GridLayoutAnimationController(animation, .2f, .2f);
        gridview.setLayoutAnimation(controller);
        //Loading Images :
        CustomAdapter customAdapter = new CustomAdapter();
        gridview.setAdapter(customAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //goto Notice activity :
                Bundle bundle = new Bundle();

                bundle.putInt("productposition",content[i]); //

                ProductListselectedFragment nextFragment = new ProductListselectedFragment();
                nextFragment.setArguments(bundle);

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.
                        beginTransaction()
                        .setCustomAnimations(R.anim.slidinleft, R.anim.slidoutleft)
                        .replace(R.id.container, nextFragment,"notice")
                        .addToBackStack("list")
                        .commit();
            }
        });



        //END OF GRIDVIEW



        //Go back
        v.setFocusableInTouchMode(true);
        v.requestFocus();
        v.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if( keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {
                    Fragment fragment = new ProductFragment();
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.container, fragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    return true;
                }
                return false;
            }
        });
        //End of go back
        return v;
    }




    //get The selected item from the dropDownList
    public String setContent(int itemList, int itemPostion)
    {

        // case 1
        if (itemList == 0 )
        {
            if (itemPostion == 0)
            {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    backgroundimg.setBackground(getResources().getDrawable(R.drawable.equins_bg));
                }


                content = new int[]{R.drawable.avemix_c_ve, R.drawable.calmagine_c_ve,
                        R.drawable.frecardyl_c_ve,R.drawable.cortamethasone_c_ve,
                        R.drawable.theracalcium_c_ve,R.drawable.fercobsang_c_ve,
                        R.drawable.vitac_c_ve,R.drawable.aluspray_c_ve,

                };

                return " equins ";
            }
            if (itemPostion == 1)
            {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    backgroundimg.setBackground(getResources().getDrawable(R.drawable.bovins_bg));
                }
                content = new int[]{R.drawable.penhistastrep_c_ve, R.drawable.longamox_c_ve,
                        R.drawable.longicine_c_ve,R.drawable.avemix_c_ve,
                        R.drawable.marbocyl10_c_ve,R.drawable.cortamethasone_c_ve,
                        R.drawable.tolfine_c_ve,R.drawable.diurizonepoudre_c_ve,
                        R.drawable.diurizone_c_ve, R.drawable.biomectin1_c_ve,
                        R.drawable.lodevil_c_ve,R.drawable.theracalcium_c_ve,
                        R.drawable.fercobsang_c_ve, R.drawable.vitac_c_ve,
                        R.drawable.aluspray_c_ve,R.drawable.corebral_c_ve

                };

                return " bovins ";
            }
            if (itemPostion == 2)
            {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    backgroundimg.setBackground(getResources().getDrawable(R.drawable.ovins_bg));
                }

                content = new int[]{R.drawable.longamox_c_ve, R.drawable.longicine_c_ve,
                        R.drawable.avemix_c_ve,R.drawable.biomectin1_c_ve,
                        R.drawable.theracalcium_c_ve,R.drawable.fercobsang_c_ve,
                        R.drawable.fercobsang_c_ve,R.drawable.vitac_c_ve,
                        R.drawable.aluspray_c_ve, R.drawable.corebral_c_ve

                };

                return " ovins ";
            }
            if (itemPostion == 3)
            {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    backgroundimg.setBackground(getResources().getDrawable(R.drawable.caprins_bg));
                }
                content = new int[]{R.drawable.penhistastrep_c_ve, R.drawable.cortamethasone_c_ve,
                        R.drawable.fercobsang_c_ve,R.drawable.vitac_c_ve,
                        R.drawable.corebral_c_ve
                };

                return " caprins ";
            }
            if (itemPostion == 4)
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    backgroundimg.setBackground(getResources().getDrawable(R.drawable.chien_bg));
                }
                content = new int[]{R.drawable.penhistastrep_c_ve, R.drawable.calmagine_c_ve,
                        R.drawable.frecardyl_c_ve,R.drawable.aluspray_c_ve,
                        R.drawable.cortamethasone_c_ve,
                        R.drawable.theracalcium_c_ve,R.drawable.fercobsang_c_ve,
                        R.drawable.vitac_c_ve,R.drawable.corebral_c_ve
                };
                return " chien ";
            }
            if (itemPostion == 5)
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    backgroundimg.setBackground(getResources().getDrawable(R.drawable.chat_bg));
                }
                content = new int[]{R.drawable.penhistastrep_c_ve, R.drawable.calmagine_c_ve,
                        R.drawable.frecardyl_c_ve,R.drawable.aluspray_c_ve,
                        R.drawable.cortamethasone_c_ve,
                        R.drawable.theracalcium_c_ve,R.drawable.fercobsang_c_ve,
                        R.drawable.vitac_c_ve
                };
                return " chat ";
            }
            if (itemPostion == 6)
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    backgroundimg.setBackground(getResources().getDrawable(R.drawable.volailles_bg));
                }
                content = new int[]{R.drawable.avemix_c_ve, R.drawable.vitac_c_ve,
                        R.drawable.aluspray_c_ve,R.drawable.ascophos_c_as,
                        R.drawable.eservitad3ekb_c_as,
                        R.drawable.eservitb_c_as,R.drawable.eservitad3e100_c_as,
                        R.drawable.aminovitamin_c_as,
                        R.drawable.eservitb_c_as,R.drawable.eservitad3e100_c_as,
                        R.drawable.amprolium25_c_as,R.drawable.amoxione1kg_c_as,
                        R.drawable.amoxione1k100g_c_as,R.drawable.amoxione1k100g_c_as,
                        R.drawable.ascorequil_c_as
                };
                return " volailles ";
            }if (itemPostion == 7)
        {

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                backgroundimg.setBackground(getResources().getDrawable(R.drawable.lapin_bg));
            }
            content = new int[]{R.drawable.avemix_c_ve, R.drawable.theracalcium_c_ve

            };
            return " Lapin ";
        }

        }

        // case 2
        if (itemList == 1 )
        {
            if (itemPostion == 0)
            {
                content = new int[]{R.drawable.marbocyl10_c_ve, R.drawable.longamox_c_ve,
                        R.drawable.penhistastrep_c_ve,
                        R.drawable.avemix_c_ve,R.drawable.enrobioflox10_c_ve
                };
                return " antibiotique " ;
            }
            if (itemPostion == 1)
            {
                content = new int[]{R.drawable.calmagine_c_ve
                };
                return " antispasmodique ";
            }
            if (itemPostion == 2)
            {
                content = new int[]{R.drawable.tolfine_c_ve, R.drawable.cortamethasone_c_ve

                };
                return " douleur-inflammation ";
            }
            if (itemPostion == 3)
            {

                content = new int[]{R.drawable.diurizone_c_ve, R.drawable.diurizonepoudre_c_ve

                };
                return" diurétique ";
            }
            if (itemPostion == 4)
            {
                content = new int[]{R.drawable.biomectin1_c_ve

                };
                return" antiparasitaire ";
            }
            if (itemPostion == 5)
            {
                content = new int[]{R.drawable.frecardyl_c_ve
                };
                return " cardiologie-respiratoire ";
            }
            if (itemPostion == 6)
            {
                content = new int[]{R.drawable.vitac_c_ve, R.drawable.corebral_c_ve,
                R.drawable.theracalcium_c_ve, R.drawable.fercobsang_c_ve

                };

                return " vitamine et minéraux ";
            }if (itemPostion == 7)
        {

            content = new int[]{R.drawable.lodevil_c_ve
            };
            return " neonatalogie ";
        }

        }

        //case 3

        if (itemList == 2 )
        {
            if (itemPostion == 0 )
            {
                content = new int[]{R.drawable.avemix_c_ve, R.drawable.calmagine_c_ve,
                        R.drawable.frecardyl_c_ve,R.drawable.cortamethasone_c_ve,
                        R.drawable.theracalcium_c_ve,R.drawable.fercobsang_c_ve,
                        R.drawable.vitac_c_ve,R.drawable.aluspray_c_ve,
                        R.drawable.penhistastrep_c_ve, R.drawable.longamox_c_ve,
                        R.drawable.longicine_c_ve,R.drawable.marbocyl10_c_ve,
                        R.drawable.enrobioflox10_c_ve,R.drawable.tolfine_c_ve,
                        R.drawable.diurizone_c_ve,
                        R.drawable.diurizonepoudre_c_ve,R.drawable.biomectin1_c_ve,
                        R.drawable.lodevil_c_ve,R.drawable.corebral_c_ve


                };
                return  " vetoquinol ";


            }

        }

        content = new int[]{

                R.drawable.aminovitamin_c_as,

                R.drawable.amoxione1kg_c_as,

                R.drawable.amoxione100g_c_as,

                R.drawable.amprolium25_c_as,

                R.drawable.ascophos_c_as,

                R.drawable.ascorequil_c_as,

                R.drawable.eritromicina200_c_as,

                R.drawable.eservitad3e100_c_as,

                R.drawable.eservitad3ekb_c_as,

                R.drawable.eservitb_c_as,

                R.drawable.vitaminae100l_c_as

        };



        return  " ascor ";

    }

    //Adapter :
    //Class Of Custom Adapter :
    private class CustomAdapter  extends BaseAdapter {


        @Override
        public int getCount() {
            return content.length ;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            View view1 = getLayoutInflater().inflate(R.layout.mylist,null);
            ImageView image = view1.findViewById(R.id.images);
            image.setImageResource(content[i]);



            return view1;
        }


    }
}
