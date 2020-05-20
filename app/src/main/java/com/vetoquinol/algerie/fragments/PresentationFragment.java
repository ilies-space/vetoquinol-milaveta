package com.vetoquinol.algerie.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.vetoquinol.algerie.adapters.PresentationExpandableListViewAdapter;
import com.vetoquinol.algerie.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PresentationFragment extends Fragment {

    private ExpandableListView expandableListView;

    private PresentationExpandableListViewAdapter presentationExpandableListViewAdapter;

    private List<String> listDataGroup;

    private HashMap<String, List<String>> listDataChild;

    String urlHistoire = "https://www.vetoquinol.com/fr/content/l-histoire-de-vetoquinol-d-hier-a-aujourd-hui";
    String urlmission = "https://www.vetoquinol.com/fr/content/écouter-comprendre-et-répondre-aux-besoins-de-nos-clients";
    String urlresarch = "https://www.vetoquinol.com/fr/contenu/innovation-creativite-recherche-equipe-AMM";
    String urlcles = "https://www.vetoquinol.com/fr/content/vetoquinol-en-quelques-chiffres";
    String urlculter = "https://www.vetoquinol.com/fr/contenu/valeurs-culture-philosophie";
    String urlproduction = "https://www.vetoquinol.com/fr/content/vetoquinol-la-performance-industrielle-à-coeur";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.b_presentation_fragment,container,false);


        //Expandlbe List :
        // initializing the views
        expandableListView = v.findViewById(R.id.expandableListView);

        // initializing the objects
        initObjects();

        // preparing list data
        initListData();


        //Open Links :
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {


                if(i==0)
                {
                    Toast.makeText(getContext(), "En savoir plus sur : Histoire", Toast.LENGTH_SHORT).show();

                    openLink(urlHistoire);

                }else if (i==1)
                {

                    Toast.makeText(getContext(), "En savoir plus sur : Culture et valeurs", Toast.LENGTH_SHORT).show();
                    openLink(urlculter);


                }else if (i ==2)
                {

                    Toast.makeText(getContext(), "En savoir plus sur : Notre mission", Toast.LENGTH_SHORT).show();
                    openLink(urlmission);




                }else if (i == 3)
                {
                    Toast.makeText(getContext(), "En savoir plus sur : Recherche et développement", Toast.LENGTH_SHORT).show();
                    openLink(urlresarch);



                }else if (i == 4)
                {
                    Toast.makeText(getContext(), "En savoir plus sur : Production ", Toast.LENGTH_SHORT).show();
                    openLink(urlproduction);





                }else if (i == 5)
                {


                    Toast.makeText(getContext(), "En savoir plus sur : Chiffres clés", Toast.LENGTH_SHORT).show();
                    openLink(urlcles);



                }
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
        presentationExpandableListViewAdapter = new PresentationExpandableListViewAdapter(getContext(), listDataGroup, listDataChild);

        // setting list adapter
        expandableListView.setAdapter(presentationExpandableListViewAdapter);

    }


    private void initListData() {


        // Adding group data
        listDataGroup.add(getString(R.string.Histoire));
        listDataGroup.add(getString(R.string.culture));
        listDataGroup.add(getString(R.string.mission_title));
        listDataGroup.add(getString(R.string.recharche));
        listDataGroup.add(getString(R.string.production));
        listDataGroup.add(getString(R.string.chiffres));


        // array of strings
        String[] array;

        // list of Histoire
        List<String> Histoire = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_Histoire);
        for (String item : array) {
            Histoire.add(item);
        }

        // list of culture
        List<String> culture = new ArrayList<>();
        array = getResources().getStringArray(R.array.Culture_info);
        for (String item : array) {
            culture.add(item);
        }

        // list of mission
        List<String> mission = new ArrayList<>();
        array = getResources().getStringArray(R.array.mission);
        for (String item : array) {
            mission.add(item);
        }

        // list of Recherche
        List<String> Recherche  = new ArrayList<>();
        array = getResources().getStringArray(R.array.recharche_info);
        for (String item : array) {
            Recherche .add(item);
        }

        // list of Production
        List<String> Production = new ArrayList<>();
        array = getResources().getStringArray(R.array.Production_info);
        for (String item : array) {
            Production.add(item);
        }

        // list of Chiffres
        List<String> Chiffres   = new ArrayList<>();
        array = getResources().getStringArray(R.array.chiffres_info);
        for (String item : array) {
            Chiffres.add(item);
        }



        // Adding child data
        listDataChild.put(listDataGroup.get(0), Histoire);
        listDataChild.put(listDataGroup.get(1), culture);
        listDataChild.put(listDataGroup.get(2), mission);
        listDataChild.put(listDataGroup.get(3), Recherche);
        listDataChild.put(listDataGroup.get(4), Production);
        listDataChild.put(listDataGroup.get(5), Chiffres );


        // notify the adapter
        presentationExpandableListViewAdapter.notifyDataSetChanged();
    }


    public void openLink( String link )
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(link)));

    }

}
