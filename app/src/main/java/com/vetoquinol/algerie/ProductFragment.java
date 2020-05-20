package com.vetoquinol.algerie;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.vetoquinol.algerie.fragments.HomeFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ProductFragment extends Fragment {

    // Array of strings...
    ListView simpleList,simpleList2;

    private ExpandableListView expandableListView;

    private ExpandableListViewAdapter expandableListViewAdapter;

    private List<String> listDataGroup;

    private HashMap<String, List<String>> listDataChild;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)  {
        View v = inflater.inflate(R.layout.c1_product_fragment,container,false);



        // initializing the views
        expandableListView = v.findViewById(R.id.expandableListView);


        // initializing the objects
        initObjects();

        // preparing list data
        initListData();

        //Onclick Listnedr :

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
                @Override
                public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {

                    // Toast.makeText(getContext(), "i :"+i+" il :"+i1+"l:"+1, Toast.LENGTH_SHORT).show();



                        Bundle bundle = new Bundle();
                        bundle.putInt("itemList",i); //
                        bundle.putInt("itemPostion",i1); //

                        ProductListFragment nextFragment = new ProductListFragment();
                        nextFragment.setArguments(bundle);

                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()


                                .replace(R.id.container, nextFragment,"p2").addToBackStack("p2").commit();


                    //

                    return true;
            }
        });



        return v;
    }




    private void initObjects() {

        // initializing the list of groups
        listDataGroup = new ArrayList<>();

        // initializing the list of child
        listDataChild = new HashMap<>();

        // initializing the adapter object
        expandableListViewAdapter = new ExpandableListViewAdapter(getContext(), listDataGroup, listDataChild);

        // setting list adapter
        expandableListView.setAdapter(expandableListViewAdapter);

    }

    /*
     * Preparing the list data
     *
     * Dummy Items
     */
    private void initListData() {


        // Adding group data
        listDataGroup.add(getString(R.string.text_especes));
        listDataGroup.add(getString(R.string.text_thearpeutique));
        listDataGroup.add(getString(R.string.text_Laboratoire));

        // array of strings
        String[] array;

        // list of especes
        List<String> especes = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_especes);
        for (String item : array) {
            especes.add(item);
        }

        // list of thearpeutique
        List<String> thearpeutique = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_thearpeutique);
        for (String item : array) {
            thearpeutique.add(item);
        }

        // list of Laboratoire
        List<String> Laboratoire = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_Laboratoire);
        for (String item : array) {
            Laboratoire.add(item);
        }



        // Adding child data
        listDataChild.put(listDataGroup.get(0), especes);
        listDataChild.put(listDataGroup.get(1), thearpeutique);
        listDataChild.put(listDataGroup.get(2), Laboratoire);


        // notify the adapter
        expandableListViewAdapter.notifyDataSetChanged();
    }





}


