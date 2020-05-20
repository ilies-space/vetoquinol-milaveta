package com.vetoquinol.algerie.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.vetoquinol.algerie.R;

public class PartnerFragment extends Fragment {

    String linkblog1 = "https://www.djazairess.com/fr/elwatan/100776";
    String linkblog2 = "https://www.lesoirdalgerie.com/regions/le-groupe-boussouf-porte-flambeau-dune-agriculture-moderne-2968";
    String linkblog3 = "https://cherif.eljazeir.com/2011/09/30/entretien-avec-malik-boussouf-pdg-du-centre-de-dveloppement-intgr-de-la-filire-avicole-les-services-de-contrle-doivent-jouer-leur-rle/";
    String linkblog4 = "http://www.lestrepublicain.com/index.php?option=com_k2&view=item&id=13299:un-v%C3%A9ritable-coup-de-fouet&Itemid=580";
    String linkblog5 = "https://www.radioalgerie.dz/news/fr/article/20161204/96079.html";
    String linkblog6 = "https://www.afrique-agriculture.org/articles/reportage/lalgerie-mise-sur-lagriculture";


    ImageView vid1,vid2,vid3;
    TextView link1,link2,link3,link4,link5,link6;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.d_partner_fragment,container,false);

        vid1 = (ImageView) v.findViewById(R.id.vid1);
        vid2 = (ImageView) v.findViewById(R.id.vid2);
        vid3 = (ImageView) v.findViewById(R.id.vid3);

        link1 = (TextView) v.findViewById(R.id.link1);
        link2 = (TextView) v.findViewById(R.id.link2);
        link3 = (TextView) v.findViewById(R.id.link3);
        link4 = (TextView) v.findViewById(R.id.link4);
        link5 = (TextView) v.findViewById(R.id.link5);
        link6 = (TextView) v.findViewById(R.id.link6);

        vid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=RwmA5W4mkZ8"));
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);

            }
        });


        vid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=Ug20clBZfaM"));
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);

            }
        });

        vid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=M1FemYAR-pg"));
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);

            }
        });






        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLink( linkblog1 );
            }
        });



        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLink( linkblog2 );
            }
        });



        link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLink( linkblog3 );
            }
        });

        link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLink( linkblog4 );
            }
        });



        link5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLink( linkblog5 );
            }
        });



        link6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLink( linkblog6 );
            }
        });


        //return view:
        return v;
    }


    public void openLink( String link )
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(link)));

    }
}
