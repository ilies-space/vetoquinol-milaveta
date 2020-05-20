package com.vetoquinol.algerie;



import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.vetoquinol.algerie.adapters.ProductExpandableListViewAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductListselectedFragment extends Fragment {
    private ExpandableListView expandableListView;
    private ProductExpandableListViewAdapter productExpandableListViewAdapter;
    private List<String> listDataGroup;
    private HashMap<String, List<String>> listDataChild;
    int c1,c2,t1,t2;


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.c3_productdetails_fragment,container,false);

        //selecterd product :
        final int productposition = this.getArguments().getInt("productposition",0);

        //Toast.makeText(getContext(), ""+productposition, Toast.LENGTH_LONG).show();
        // initializing the views
        expandableListView = v.findViewById(R.id.expandableListViewproduct);
        // initializing the list of child & groups
        listDataChild = new HashMap<>();
        listDataGroup = new ArrayList<>();


        //Display notice :

        getNotice(productposition);

        return v;
    }

    public void getNotice(int productposition){

        switch (productposition) {

            case R.drawable.avemix_c_ve:
                Avemix();
                break;

            case R.drawable.theracalcium_c_ve:
                Theracalcium();
                break;

            case R.drawable.calmagine_c_ve:
                Calmagine();
                break;

            case R.drawable.fercobsang_c_ve:
                Fercobsang();

                break;

            case R.drawable.cortamethasone_c_ve:
                Cortamethasone();
                break;

            case R.drawable.frecardyl_c_ve:
                Frecardyl();
                break;

            case R.drawable.vitac_c_ve:
                Vitac();
                break;

            case R.drawable.aluspray_c_ve:
                Alluspray();
                break;

            case R.drawable.penhistastrep_c_ve:
                Penhistastrep();
                break;

            case R.drawable.longamox_c_ve:
                Longamox();
                break;

            case R.drawable.longicine_c_ve:
                Longicine();
                break;

            case R.drawable.corebral_c_ve:
                Corebral();
                break;

            case R.drawable.marbocyl10_c_ve:
                Marbocyl();
                break;

            case R.drawable.tolfine_c_ve:
                Tolfine();
                break;

            case R.drawable.diurizonepoudre_c_ve:
                Diurizonepodure();
                break;

            case R.drawable.diurizone_c_ve:
                Diurizonesolution();
                break;

            case R.drawable.biomectin1_c_ve:
                Biomectin();
                break;


            case R.drawable.lodevil_c_ve:
                Lodevil();
                break;

            case R.drawable.enrobioflox10_c_ve:
                Enrobioflox();
                break;

            //// ASCOR ////

            case R.drawable.aminovitamin_c_as:
                Aminovitamin();
                break;



            case R.drawable.amoxione1kg_c_as:
                Amoxione1kg();
                break;

            case R.drawable.amoxione100g_c_as:
                Amoxione100g();
                break;

            case R.drawable.amprolium25_c_as:
                Amprolium25();
                break;

            case R.drawable.ascophos_c_as:
                Ascophos();
                break;

            case R.drawable.ascorequil_c_as:
                Ascorequil();
                break;

            case R.drawable.eritromicina200_c_as:
                Eritromicina200();
                break;

            case R.drawable.eservitad3e100_c_as:
                Eservitad3e100();
                break;

            case R.drawable.eservitad3ekb_c_as:
                Eservitad3ekb();
                break;

            case R.drawable.eservitb_c_as:
                EserviB();
                break;

            case R.drawable.vitaminae100l_c_as:
                Vitaminae100l();
                break;


            default:
                //Toast.makeText(getContext(), "pas de notice", Toast.LENGTH_SHORT).show();
        }


    }

    //Product Vetoquinol :

    public void Alluspray(){


        c1 =R.color.aluspray1;
        c2 =R.color.aluspray2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.aluspray_n_ve);
        expandableListView.addHeaderView(header);
        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlealuspray1));
        listDataGroup.add(getString(R.string.titlealuspray2));
        listDataGroup.add(getString(R.string.titlealuspray3));
        listDataGroup.add(getString(R.string.titlealuspray4));
        listDataGroup.add(getString(R.string.titlealuspray5));
        listDataGroup.add(getString(R.string.titlealuspray6));
        listDataGroup.add(getString(R.string.titlealuspray7));
        listDataGroup.add(getString(R.string.titlealuspray8));
        listDataGroup.add(getString(R.string.titlealuspray9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemaluspray1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemaluspray2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemaluspray3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemaluspray4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemaluspray5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemaluspray6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemaluspray7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemaluspray8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemaluspray9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);



    }

    public void Theracalcium(){

        c1 =R.color.theracalcium1;
        c2 =R.color.theracalcium2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );
        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.theracalcium_n_ve);
        expandableListView.addHeaderView(header);

        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.title1));
        listDataGroup.add(getString(R.string.title2));
        listDataGroup.add(getString(R.string.title3));
        listDataGroup.add(getString(R.string.title4));
        listDataGroup.add(getString(R.string.title5));
        listDataGroup.add(getString(R.string.title6));
        listDataGroup.add(getString(R.string.title7));
        listDataGroup.add(getString(R.string.title8));
        listDataGroup.add(getString(R.string.title9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.item1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.item2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.item3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.item4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.item5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.item6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.item7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.item8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.item9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);



    }

    public void Avemix(){

        c1 =R.color.avemix1;
        c2 =R.color.avemix2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );

        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);
        headerimage.setImageResource(R.drawable.avemixpoudre_n_ve);
        expandableListView.addHeaderView(header);
        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titleavemix1));
        listDataGroup.add(getString(R.string.titleavemix2));
        listDataGroup.add(getString(R.string.titleavemix3));
        listDataGroup.add(getString(R.string.titleavemix4));
        listDataGroup.add(getString(R.string.titleavemix5));
        listDataGroup.add(getString(R.string.titleavemix6));
        listDataGroup.add(getString(R.string.titleavemix7));
        listDataGroup.add(getString(R.string.titleavemix8));
        listDataGroup.add(getString(R.string.titleavemix9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemavemix1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemavemix2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemavemix3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemavemix4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemavemix5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemavemix6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemavemix7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemavemix8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemavemix9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);


    }

    public void Calmagine(){

        c1 =R.color.calmagine1;
        c2 =R.color.calmagine2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );

        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);


        headerimage.setImageResource(R.drawable.calmagine_n_ve);
        expandableListView.addHeaderView(header);
        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlecalmagine1));
        listDataGroup.add(getString(R.string.titlecalmagine2));
        listDataGroup.add(getString(R.string.titlecalmagine3));
        listDataGroup.add(getString(R.string.titlecalmagine4));
        listDataGroup.add(getString(R.string.titlecalmagine5));
        listDataGroup.add(getString(R.string.titlecalmagine6));
        listDataGroup.add(getString(R.string.titlecalmagine7));
        listDataGroup.add(getString(R.string.titlecalmagine8));
        listDataGroup.add(getString(R.string.titlecalmagine9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcalmagine1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcalmagine2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcalmagine3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcalmagine4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcalmagine5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcalmagine6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcalmagine7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcalmagine8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcalmagine9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);



    }

    public void Cortamethasone(){


        c1 =R.color.cortamethasone1;
        c2 =R.color.cortamethasone2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.cortamethasone_n_ve);
        expandableListView.addHeaderView(header);
        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlecortamethasone1));
        listDataGroup.add(getString(R.string.titlecortamethasone2));
        listDataGroup.add(getString(R.string.titlecortamethasone3));
        listDataGroup.add(getString(R.string.titlecortamethasone4));
        listDataGroup.add(getString(R.string.titlecortamethasone5));
        listDataGroup.add(getString(R.string.titlecortamethasone6));
        listDataGroup.add(getString(R.string.titlecortamethasone7));
        listDataGroup.add(getString(R.string.titlecortamethasone8));
        listDataGroup.add(getString(R.string.titlecortamethasone9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcortamethasone1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcortamethasone2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcortamethasone3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcortamethasone4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcortamethasone5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcortamethasone6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcortamethasone7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcortamethasone8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcortamethasone9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);



    }

    public void Fercobsang(){


        c1 =R.color.fercobsang1;
        c2 =R.color.fercobsang2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.fercobsang_n_ve);
        expandableListView.addHeaderView(header);
        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlefercobsang1));
        listDataGroup.add(getString(R.string.titlefercobsang2));
        listDataGroup.add(getString(R.string.titlefercobsang3));
        listDataGroup.add(getString(R.string.titlefercobsang4));
        listDataGroup.add(getString(R.string.titlefercobsang5));
        listDataGroup.add(getString(R.string.titlefercobsang6));
        listDataGroup.add(getString(R.string.titlefercobsang7));
        listDataGroup.add(getString(R.string.titlefercobsang8));
        listDataGroup.add(getString(R.string.titlefercobsang9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfercobsang1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfercobsang2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfercobsang3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfercobsang4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfercobsang5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfercobsang6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfercobsang7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfercobsang8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfercobsang9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();

        expandableListView.setAdapter(productExpandableListViewAdapter);



    }

    public void Frecardyl(){

        c1 =R.color.Frecardyl1;
        c2 =R.color.Frecardyl2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.frecardyl_n_ve);
        expandableListView.addHeaderView(header);
        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlefrecardyl1));
        listDataGroup.add(getString(R.string.titlefrecardyl2));
        listDataGroup.add(getString(R.string.titlefrecardyl3));
        listDataGroup.add(getString(R.string.titlefrecardyl4));
        listDataGroup.add(getString(R.string.titlefrecardyl5));
        listDataGroup.add(getString(R.string.titlefrecardyl6));
        listDataGroup.add(getString(R.string.titlefrecardyl7));
        listDataGroup.add(getString(R.string.titlefrecardyl8));
        listDataGroup.add(getString(R.string.titlefrecardyl9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfrecardyl1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfrecardyl2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfrecardyl3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfrecardyl4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfrecardyl5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfrecardyl6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfrecardyl7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfrecardyl8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemfrecardyl9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);



    }

    public void Vitac(){

        c1 =R.color.vitac1;
        c2 =R.color.vitac2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );

        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.vita_cvetoquinol_n_ve);
        expandableListView.addHeaderView(header);
        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlevitac1));
        listDataGroup.add(getString(R.string.titlevitac2));
        listDataGroup.add(getString(R.string.titlevitac3));
        listDataGroup.add(getString(R.string.titlevitac4));
        listDataGroup.add(getString(R.string.titlevitac5));
        listDataGroup.add(getString(R.string.titlevitac6));
        listDataGroup.add(getString(R.string.titlevitac7));
        listDataGroup.add(getString(R.string.titlevitac8));
        listDataGroup.add(getString(R.string.titlevitac9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitac1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitac2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitac3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitac4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitac5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitac6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitac7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitac8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitac9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);



    }

    public void Longicine(){

        c1 =R.color.Longicine1;
        c2 =R.color.Longicine2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.longicine_n_ve);
                expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlelongicine1));
        listDataGroup.add(getString(R.string.titlelongicine2));
        listDataGroup.add(getString(R.string.titlelongicine3));
        listDataGroup.add(getString(R.string.titlelongicine4));
        listDataGroup.add(getString(R.string.titlelongicine5));
        listDataGroup.add(getString(R.string.titlelongicine6));
        listDataGroup.add(getString(R.string.titlelongicine7));
        listDataGroup.add(getString(R.string.titlelongicine8));
        listDataGroup.add(getString(R.string.titlelongicine9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongicine1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongicine2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongicine3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongicine4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongicine5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongicine6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongicine7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongicine8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongicine9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();

        expandableListView.setAdapter(productExpandableListViewAdapter);



    }

    public void Longamox(){
        c1 =R.color.Longamox1;
        c2 =R.color.Longamox2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );



        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.longamox_n_ve);
                expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlelongamox1));
        listDataGroup.add(getString(R.string.titlelongamox2));
        listDataGroup.add(getString(R.string.titlelongamox3));
        listDataGroup.add(getString(R.string.titlelongamox4));
        listDataGroup.add(getString(R.string.titlelongamox5));
        listDataGroup.add(getString(R.string.titlelongamox6));
        listDataGroup.add(getString(R.string.titlelongamox7));
        listDataGroup.add(getString(R.string.titlelongamox8));
        listDataGroup.add(getString(R.string.titlelongamox9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongamox1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongamox2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongamox3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongamox4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongamox5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongamox6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongamox7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongamox8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlongamox9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);



    }

    public void Lodevil(){


        c1 =R.color.Lodevil1;
        c2 =R.color.Lodevil2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );

        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.lodevil_n_ve);
                expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlelodevil1));
        listDataGroup.add(getString(R.string.titlelodevil2));
        listDataGroup.add(getString(R.string.titlelodevil3));
        listDataGroup.add(getString(R.string.titlelodevil4));
        listDataGroup.add(getString(R.string.titlelodevil5));
        listDataGroup.add(getString(R.string.titlelodevil6));
        listDataGroup.add(getString(R.string.titlelodevil7));
        listDataGroup.add(getString(R.string.titlelodevil8));
        listDataGroup.add(getString(R.string.titlelodevil9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlodevil1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlodevil2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlodevil3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlodevil4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlodevil5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlodevil6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlodevil7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlodevil8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemlodevil9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();

        expandableListView.setAdapter(productExpandableListViewAdapter);



    }

    public void Diurizonepodure(){



        c1 =R.color.Diurizonep1;
        c2 =R.color.Diurizonep2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.diurizonepoudre_n_ve);
                expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlediurizonepodure1));
        listDataGroup.add(getString(R.string.titlediurizonepodure2));
        listDataGroup.add(getString(R.string.titlediurizonepodure3));
        listDataGroup.add(getString(R.string.titlediurizonepodure4));
        listDataGroup.add(getString(R.string.titlediurizonepodure5));
        listDataGroup.add(getString(R.string.titlediurizonepodure6));
        listDataGroup.add(getString(R.string.titlediurizonepodure7));
        listDataGroup.add(getString(R.string.titlediurizonepodure8));
        listDataGroup.add(getString(R.string.titlediurizonepodure9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonepodure1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonepodure2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonepodure3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonepodure4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonepodure5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonepodure6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonepodure7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonepodure8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonepodure9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);


    }

    public void Corebral(){

        c1 =R.color.Corebral1;
        c2 =R.color.Corebral2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.corebral_n_ve);
                expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlecorebral1));
        listDataGroup.add(getString(R.string.titlecorebral2));
        listDataGroup.add(getString(R.string.titlecorebral3));
        listDataGroup.add(getString(R.string.titlecorebral4));
        listDataGroup.add(getString(R.string.titlecorebral5));
        listDataGroup.add(getString(R.string.titlecorebral6));
        listDataGroup.add(getString(R.string.titlecorebral7));
        listDataGroup.add(getString(R.string.titlecorebral8));
        listDataGroup.add(getString(R.string.titlecorebral9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcorebral1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcorebral2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcorebral3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcorebral4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcorebral5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcorebral6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcorebral7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcorebral8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemcorebral9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);


    }

    public void Diurizonesolution(){


        c1 =R.color.Diurizone1;
        c2 =R.color.Diurizone2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.diurizone_n_ve);
                expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlediurizonesolution1));
        listDataGroup.add(getString(R.string.titlediurizonesolution2));
        listDataGroup.add(getString(R.string.titlediurizonesolution3));
        listDataGroup.add(getString(R.string.titlediurizonesolution4));
        listDataGroup.add(getString(R.string.titlediurizonesolution5));
        listDataGroup.add(getString(R.string.titlediurizonesolution6));
        listDataGroup.add(getString(R.string.titlediurizonesolution7));
        listDataGroup.add(getString(R.string.titlediurizonesolution8));
        listDataGroup.add(getString(R.string.titlediurizonesolution9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonesolution1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonesolution2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonesolution3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonesolution4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonesolution5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonesolution6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonesolution7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonesolution8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemdiurizonesolution9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);



    }

    public void Biomectin(){


        c1 =R.color.Biomectin1;
        c2 =R.color.Biomectin2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.biomectin1_n_ve);
                expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlebiomectin1));
        listDataGroup.add(getString(R.string.titlebiomectin2));
        listDataGroup.add(getString(R.string.titlebiomectin3));
        listDataGroup.add(getString(R.string.titlebiomectin4));
        listDataGroup.add(getString(R.string.titlebiomectin5));
        listDataGroup.add(getString(R.string.titlebiomectin6));
        listDataGroup.add(getString(R.string.titlebiomectin7));
        listDataGroup.add(getString(R.string.titlebiomectin8));
        listDataGroup.add(getString(R.string.titlebiomectin9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itembiomectin1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itembiomectin2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itembiomectin3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itembiomectin4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itembiomectin5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itembiomectin6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itembiomectin7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itembiomectin8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itembiomectin9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);




    }

    public void Tolfine(){


        c1 =R.color.Tolfine1;
        c2 =R.color.Tolfine2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.tolfine_n_ve);
                expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titletolfine1));
        listDataGroup.add(getString(R.string.titletolfine2));
        listDataGroup.add(getString(R.string.titletolfine3));
        listDataGroup.add(getString(R.string.titletolfine4));
        listDataGroup.add(getString(R.string.titletolfine5));
        listDataGroup.add(getString(R.string.titletolfine6));
        listDataGroup.add(getString(R.string.titletolfine7));
        listDataGroup.add(getString(R.string.titletolfine8));
        listDataGroup.add(getString(R.string.titletolfine9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemtolfine1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemtolfine2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemtolfine3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemtolfine4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemtolfine5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemtolfine6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemtolfine7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemtolfine8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemtolfine9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();

        expandableListView.setAdapter(productExpandableListViewAdapter);


    }

    public void Enrobioflox(){


        c1 =R.color.Enrobioflox1;
        c2 =R.color.Enrobioflox2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.enrobioflox10_n_ve);
                expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titleenrobioflox1));
        listDataGroup.add(getString(R.string.titleenrobioflox2));
        listDataGroup.add(getString(R.string.titleenrobioflox3));
        listDataGroup.add(getString(R.string.titleenrobioflox4));
        listDataGroup.add(getString(R.string.titleenrobioflox5));
        listDataGroup.add(getString(R.string.titleenrobioflox6));
        listDataGroup.add(getString(R.string.titleenrobioflox7));
        listDataGroup.add(getString(R.string.titleenrobioflox8));
        listDataGroup.add(getString(R.string.titleenrobioflox9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemenrobioflox1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemenrobioflox2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemenrobioflox3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemenrobioflox4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemenrobioflox5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemenrobioflox6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemenrobioflox7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemenrobioflox8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemenrobioflox9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();

        expandableListView.setAdapter(productExpandableListViewAdapter);



    }

    public void Marbocyl(){

        c1 =R.color.Marbocyl1;
        c2 =R.color.Marbocyl2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.marbocyl10_n_ve);
                expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlemarbocyl1));
        listDataGroup.add(getString(R.string.titlemarbocyl2));
        listDataGroup.add(getString(R.string.titlemarbocyl3));
        listDataGroup.add(getString(R.string.titlemarbocyl4));
        listDataGroup.add(getString(R.string.titlemarbocyl5));
        listDataGroup.add(getString(R.string.titlemarbocyl6));
        listDataGroup.add(getString(R.string.titlemarbocyl7));
        listDataGroup.add(getString(R.string.titlemarbocyl8));
        listDataGroup.add(getString(R.string.titlemarbocyl9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemmarbocyl1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemmarbocyl2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemmarbocyl3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemmarbocyl4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemmarbocyl5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemmarbocyl6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemmarbocyl7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemmarbocyl8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemmarbocyl9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();

        expandableListView.setAdapter(productExpandableListViewAdapter);



    }

    public void Penhistastrep(){

        c1 =R.color.penhista1;
        c2 =R.color.penhista2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );

        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.penhistastrep_n_ve);
                expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlePenhistastrep1));
        listDataGroup.add(getString(R.string.titlePenhistastrep2));
        listDataGroup.add(getString(R.string.titlePenhistastrep3));
        listDataGroup.add(getString(R.string.titlePenhistastrep4));
        listDataGroup.add(getString(R.string.titlePenhistastrep5));
        listDataGroup.add(getString(R.string.titlePenhistastrep6));
        listDataGroup.add(getString(R.string.titlePenhistastrep7));
        listDataGroup.add(getString(R.string.titlePenhistastrep8));
        listDataGroup.add(getString(R.string.titlePenhistastrep9));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemPenhistastrep1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemPenhistastrep2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemPenhistastrep3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemPenhistastrep4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemPenhistastrep5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemPenhistastrep6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemPenhistastrep7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemPenhistastrep8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemPenhistastrep9);
        for (String item : array) {
            title9.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);


    }


    //Product Ascro  :


    public void Aminovitamin(){

            c1 =R.color.Aminovitamin1;
            c2 =R.color.Aminovitamin2;
            t1  =R.color.white;
            t2  =R.color.black;
            expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

            // initializing the adapter object
            productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                    ,c1,c2,t1,t2
            );

            //header
            View header=getLayoutInflater().inflate(R.layout.nav_header,null);
            ImageView headerimage =  header.findViewById(R.id.imageView2);



            headerimage.setImageResource(R.drawable.aminovitamin_n_as);
            expandableListView.addHeaderView(header);


            //DATA :
            // Adding group data
            listDataGroup.add(getString(R.string.titleaminovitamin1));
            listDataGroup.add(getString(R.string.titleaminovitamin2));
            listDataGroup.add(getString(R.string.titleaminovitamin3));
            listDataGroup.add(getString(R.string.titleaminovitamin4));
            listDataGroup.add(getString(R.string.titleaminovitamin5));
            listDataGroup.add(getString(R.string.titleaminovitamin6));
            listDataGroup.add(getString(R.string.titleaminovitamin7));
            listDataGroup.add(getString(R.string.titleaminovitamin8));
            listDataGroup.add(getString(R.string.titleaminovitamin9));
            listDataGroup.add(getString(R.string.titleaminovitamin10));
            // array of strings
            String[] array;
            // list of title1
            List<String> title1 = new ArrayList<>();
            array = getResources().getStringArray(R.array.itemaminovitamin1);
            for (String item : array) {
                title1.add(item);
            }
            // list of title2
            List<String> title2 = new ArrayList<>();
            array = getResources().getStringArray(R.array.itemaminovitamin2);
            for (String item : array) {
                title2.add(item);
            }

            // list of title3
            List<String> title3 = new ArrayList<>();
            array = getResources().getStringArray(R.array.itemaminovitamin3);
            for (String item : array) {
                title3.add(item);
            }
            // list of title4
            List<String> title4  = new ArrayList<>();
            array = getResources().getStringArray(R.array.itemaminovitamin4);
            for (String item : array) {
                title4.add(item);
            }
            // list of title5
            List<String> title5 = new ArrayList<>();
            array = getResources().getStringArray(R.array.itemaminovitamin5);
            for (String item : array) {
                title5.add(item);
            }
            // list of title6
            List<String> title6   = new ArrayList<>();
            array = getResources().getStringArray(R.array.itemaminovitamin6);
            for (String item : array) {
                title6.add(item);
            }
            // list of title7
            List<String> title7  = new ArrayList<>();
            array = getResources().getStringArray(R.array.itemaminovitamin7);
            for (String item : array) {
                title7.add(item);
            }
            // list of title5
            List<String> title8 = new ArrayList<>();
            array = getResources().getStringArray(R.array.itemaminovitamin8);
            for (String item : array) {
                title8.add(item);
            }

            // list of title6
            List<String> title9   = new ArrayList<>();
            array = getResources().getStringArray(R.array.itemaminovitamin9);
            for (String item : array) {
                title9.add(item);
            }

            // list of title6
            List<String> title10   = new ArrayList<>();
            array = getResources().getStringArray(R.array.itemaminovitamin10);
            for (String item : array) {
                title10.add(item);
            }

            listDataChild.put(listDataGroup.get(0), title1);
            listDataChild.put(listDataGroup.get(1), title2);
            listDataChild.put(listDataGroup.get(2), title3);
            listDataChild.put(listDataGroup.get(3), title4);
            listDataChild.put(listDataGroup.get(4), title5);
            listDataChild.put(listDataGroup.get(5), title6 );
            listDataChild.put(listDataGroup.get(6), title7 );
            listDataChild.put(listDataGroup.get(7), title8 );
            listDataChild.put(listDataGroup.get(8), title9 );
            listDataChild.put(listDataGroup.get(9), title10 );

            // notify the adapter
            productExpandableListViewAdapter.notifyDataSetChanged();
            expandableListView.setAdapter(productExpandableListViewAdapter);


            }

    public void Amoxione1kg(){

        c1 =R.color.AmoxiOne1kg1;
        c2 =R.color.AmoxiOne1kg2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);


        headerimage.setImageResource(R.drawable.amoxione1kg_n_as);
        expandableListView.addHeaderView(header);

        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titleamoxione1kg1));
        listDataGroup.add(getString(R.string.titleamoxione1kg2));
        listDataGroup.add(getString(R.string.titleamoxione1kg3));
        listDataGroup.add(getString(R.string.titleamoxione1kg4));
        listDataGroup.add(getString(R.string.titleamoxione1kg5));
        listDataGroup.add(getString(R.string.titleamoxione1kg6));
        listDataGroup.add(getString(R.string.titleamoxione1kg7));
        listDataGroup.add(getString(R.string.titleamoxione1kg8));
        listDataGroup.add(getString(R.string.titleamoxione1kg9));
        listDataGroup.add(getString(R.string.titleamoxione1kg10));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione1kg1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione1kg2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione1kg3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione1kg4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione1kg5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione1kg6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione1kg7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione1kg8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione1kg9);
        for (String item : array) {
            title9.add(item);
        }

        // list of title6
        List<String> title10   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione1kg10);
        for (String item : array) {
            title10.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        listDataChild.put(listDataGroup.get(9), title10 );

        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);
    }

    public void Amoxione100g(){

        c1 =R.color.AmoxiOne100g1;
        c2 =R.color.AmoxiOne100g2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );


        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);


        headerimage.setImageResource(R.drawable.amoxione100g_n_as);
        expandableListView.addHeaderView(header);

        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titleamoxione100g1));
        listDataGroup.add(getString(R.string.titleamoxione100g2));
        listDataGroup.add(getString(R.string.titleamoxione100g3));
        listDataGroup.add(getString(R.string.titleamoxione100g4));
        listDataGroup.add(getString(R.string.titleamoxione100g5));
        listDataGroup.add(getString(R.string.titleamoxione100g6));
        listDataGroup.add(getString(R.string.titleamoxione100g7));
        listDataGroup.add(getString(R.string.titleamoxione100g8));
        listDataGroup.add(getString(R.string.titleamoxione100g9));
        listDataGroup.add(getString(R.string.titleamoxione100g10));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione100g1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione100g2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione100g3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione100g4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione100g5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione100g6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione100g7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione100g8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione100g9);
        for (String item : array) {
            title9.add(item);
        }

        // list of title6
        List<String> title10   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamoxione100g10);
        for (String item : array) {
            title10.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        listDataChild.put(listDataGroup.get(9), title10 );

        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);
    }

    public void Amprolium25(){
        c1 =R.color.Amprolium1;
        c2 =R.color.Amprolium2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );

        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.amprolium25_n_as);
        expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titleamprolium1));
        listDataGroup.add(getString(R.string.titleamprolium2));
        listDataGroup.add(getString(R.string.titleamprolium3));
        listDataGroup.add(getString(R.string.titleamprolium4));
        listDataGroup.add(getString(R.string.titleamprolium5));
        listDataGroup.add(getString(R.string.titleamprolium6));
        listDataGroup.add(getString(R.string.titleamprolium7));
        listDataGroup.add(getString(R.string.titleamprolium8));
        listDataGroup.add(getString(R.string.titleamprolium9));
        listDataGroup.add(getString(R.string.titleamprolium10));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamprolium1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamprolium2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamprolium3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamprolium4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamprolium5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamprolium6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamprolium7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamprolium8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamprolium9);
        for (String item : array) {
            title9.add(item);
        }

        // list of title6
        List<String> title10   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemamprolium10);
        for (String item : array) {
            title10.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        listDataChild.put(listDataGroup.get(9), title10 );

        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);    }

    public void Ascophos(){

        c1 =R.color.Ascophos1;
        c2 =R.color.Ascophos2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );

        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);



        headerimage.setImageResource(R.drawable.ascophos_n_as);
        expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titleascophos1));
        listDataGroup.add(getString(R.string.titleascophos2));
        listDataGroup.add(getString(R.string.titleascophos3));
        listDataGroup.add(getString(R.string.titleascophos4));
        listDataGroup.add(getString(R.string.titleascophos5));
        listDataGroup.add(getString(R.string.titleascophos6));
        listDataGroup.add(getString(R.string.titleascophos7));
        listDataGroup.add(getString(R.string.titleascophos8));
        listDataGroup.add(getString(R.string.titleascophos9));
        listDataGroup.add(getString(R.string.titleascophos10));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascophos1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascophos2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascophos3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascophos4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascophos5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascophos6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascophos7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascophos8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascophos9);
        for (String item : array) {
            title9.add(item);
        }

        // list of title6
        List<String> title10   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascophos10);
        for (String item : array) {
            title10.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        listDataChild.put(listDataGroup.get(9), title10 );

        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);    }

    public void Ascorequil(){

        c1 =R.color.Ascorequil1;
        c2 =R.color.Ascorequil2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );

        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);

        headerimage.setImageResource(R.drawable.ascorequil_n_as);
        expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titleascorequil1));
        listDataGroup.add(getString(R.string.titleascorequil2));
        listDataGroup.add(getString(R.string.titleascorequil3));
        listDataGroup.add(getString(R.string.titleascorequil4));
        listDataGroup.add(getString(R.string.titleascorequil5));
        listDataGroup.add(getString(R.string.titleascorequil6));
        listDataGroup.add(getString(R.string.titleascorequil7));
        listDataGroup.add(getString(R.string.titleascorequil8));
        listDataGroup.add(getString(R.string.titleascorequil9));
        listDataGroup.add(getString(R.string.titleascorequil10));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascorequil1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascorequil2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascorequil3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascorequil4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascorequil5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascorequil6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascorequil7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascorequil8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascorequil9);
        for (String item : array) {
            title9.add(item);
        }

        // list of title6
        List<String> title10   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemascorequil10);
        for (String item : array) {
            title10.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        listDataChild.put(listDataGroup.get(9), title10 );

        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);


    }

    public void Eritromicina200(){

        c1 =R.color.Eritromicina2001;
        c2 =R.color.Eritromicina2002;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );

        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);

        headerimage.setImageResource(R.drawable.eritromicina200_n_as);
        expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titleeritromicina1));
        listDataGroup.add(getString(R.string.titleeritromicina2));
        listDataGroup.add(getString(R.string.titleeritromicina3));
        listDataGroup.add(getString(R.string.titleeritromicina4));
        listDataGroup.add(getString(R.string.titleeritromicina5));
        listDataGroup.add(getString(R.string.titleeritromicina6));
        listDataGroup.add(getString(R.string.titleeritromicina7));
        listDataGroup.add(getString(R.string.titleeritromicina8));
        listDataGroup.add(getString(R.string.titleeritromicina9));
        listDataGroup.add(getString(R.string.titleeritromicina10));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeritromicina1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeritromicina2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeritromicina3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeritromicina4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeritromicina5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeritromicina6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeritromicina7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeritromicina8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeritromicina9);
        for (String item : array) {
            title9.add(item);
        }

        // list of title6
        List<String> title10   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeritromicina10);
        for (String item : array) {
            title10.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        listDataChild.put(listDataGroup.get(9), title10 );

        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);


    }

    public void Eservitad3e100(){

        c1 =R.color.EservitAD3E1001;
        c2 =R.color.EservitAD3E1002;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );

        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);

        headerimage.setImageResource(R.drawable.eservitad3e100_n_as);
        expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titleeservitad3e1));
        listDataGroup.add(getString(R.string.titleeservitad3e2));
        listDataGroup.add(getString(R.string.titleeservitad3e3));
        listDataGroup.add(getString(R.string.titleeservitad3e4));
        listDataGroup.add(getString(R.string.titleeservitad3e5));
        listDataGroup.add(getString(R.string.titleeservitad3e6));
        listDataGroup.add(getString(R.string.titleeservitad3e7));
        listDataGroup.add(getString(R.string.titleeservitad3e8));
        listDataGroup.add(getString(R.string.titleeservitad3e9));
        listDataGroup.add(getString(R.string.titleeservitad3e10));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3e1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3e2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3e3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3e4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3e5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3e6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3e7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3e8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3e9);
        for (String item : array) {
            title9.add(item);
        }

        // list of title6
        List<String> title10   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3e10);
        for (String item : array) {
            title10.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        listDataChild.put(listDataGroup.get(9), title10 );

        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);


    }

    public void Eservitad3ekb(){

        c1 =R.color.EservitAD3EKB1;
        c2 =R.color.EservitAD3EKB2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );

        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);

        headerimage.setImageResource(R.drawable.eservitad3ekb_n_as);
        expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titleeservitad3ek1));
        listDataGroup.add(getString(R.string.titleeservitad3ek2));
        listDataGroup.add(getString(R.string.titleeservitad3ek3));
        listDataGroup.add(getString(R.string.titleeservitad3ek4));
        listDataGroup.add(getString(R.string.titleeservitad3ek5));
        listDataGroup.add(getString(R.string.titleeservitad3ek6));
        listDataGroup.add(getString(R.string.titleeservitad3ek7));
        listDataGroup.add(getString(R.string.titleeservitad3ek8));
        listDataGroup.add(getString(R.string.titleeservitad3ek9));
        listDataGroup.add(getString(R.string.titleeservitad3ek10));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3ek1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3ek2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3ek3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3ek4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3ek5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3ek6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3ek7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3ek8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3ek9);
        for (String item : array) {
            title9.add(item);
        }

        // list of title6
        List<String> title10   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitad3ek10);
        for (String item : array) {
            title10.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        listDataChild.put(listDataGroup.get(9), title10 );

        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);


    }

    public void EserviB(){

        c1 =R.color.Eservitb1;
        c2 =R.color.Eservitb2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );

        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);

        headerimage.setImageResource(R.drawable.eservitb_n_as);
        expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titleeservitb1));
        listDataGroup.add(getString(R.string.titleeservitb2));
        listDataGroup.add(getString(R.string.titleeservitb3));
        listDataGroup.add(getString(R.string.titleeservitb4));
        listDataGroup.add(getString(R.string.titleeservitb5));
        listDataGroup.add(getString(R.string.titleeservitb6));
        listDataGroup.add(getString(R.string.titleeservitb7));
        listDataGroup.add(getString(R.string.titleeservitb8));
        listDataGroup.add(getString(R.string.titleeservitb9));
        listDataGroup.add(getString(R.string.titleeservitb10));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitb1);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitb2);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitb3);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitb4);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitb5);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitb6);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitb7);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitb8);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitb9);
        for (String item : array) {
            title9.add(item);
        }

        // list of title6
        List<String> title10   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemeservitb10);
        for (String item : array) {
            title10.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        listDataChild.put(listDataGroup.get(9), title10 );

        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);


    }

    public void Vitaminae100l(){

        c1 =R.color.Vitaminae1;
        c2 =R.color.Vitaminae2;
        t1  =R.color.white;
        t2  =R.color.black;
        expandableListView.setGroupIndicator(getResources().getDrawable(R.drawable.arrowwhite));

        // initializing the adapter object
        productExpandableListViewAdapter = new ProductExpandableListViewAdapter(getContext(), listDataGroup, listDataChild
                ,c1,c2,t1,t2
        );

        //header
        View header=getLayoutInflater().inflate(R.layout.nav_header,null);
        ImageView headerimage =  header.findViewById(R.id.imageView2);

        headerimage.setImageResource(R.drawable.vitaminae100l_n_as);
        expandableListView.addHeaderView(header);


        //DATA :
        // Adding group data
        listDataGroup.add(getString(R.string.titlevitaminae1001));
        listDataGroup.add(getString(R.string.titlevitaminae1002));
        listDataGroup.add(getString(R.string.titlevitaminae1003));
        listDataGroup.add(getString(R.string.titlevitaminae1004));
        listDataGroup.add(getString(R.string.titlevitaminae1005));
        listDataGroup.add(getString(R.string.titlevitaminae1006));
        listDataGroup.add(getString(R.string.titlevitaminae1007));
        listDataGroup.add(getString(R.string.titlevitaminae1008));
        listDataGroup.add(getString(R.string.titlevitaminae1009));
        listDataGroup.add(getString(R.string.titlevitaminae10010));
        // array of strings
        String[] array;
        // list of title1
        List<String> title1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitaminae1001);
        for (String item : array) {
            title1.add(item);
        }
        // list of title2
        List<String> title2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitaminae1002);
        for (String item : array) {
            title2.add(item);
        }

        // list of title3
        List<String> title3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitaminae1003);
        for (String item : array) {
            title3.add(item);
        }
        // list of title4
        List<String> title4  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitaminae1004);
        for (String item : array) {
            title4.add(item);
        }
        // list of title5
        List<String> title5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitaminae1005);
        for (String item : array) {
            title5.add(item);
        }
        // list of title6
        List<String> title6   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitaminae1006);
        for (String item : array) {
            title6.add(item);
        }
        // list of title7
        List<String> title7  = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitaminae1007);
        for (String item : array) {
            title7.add(item);
        }
        // list of title5
        List<String> title8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitaminae1008);
        for (String item : array) {
            title8.add(item);
        }

        // list of title6
        List<String> title9   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitaminae1009);
        for (String item : array) {
            title9.add(item);
        }

        // list of title6
        List<String> title10   = new ArrayList<>();
        array = getResources().getStringArray(R.array.itemvitaminae10010);
        for (String item : array) {
            title10.add(item);
        }

        listDataChild.put(listDataGroup.get(0), title1);
        listDataChild.put(listDataGroup.get(1), title2);
        listDataChild.put(listDataGroup.get(2), title3);
        listDataChild.put(listDataGroup.get(3), title4);
        listDataChild.put(listDataGroup.get(4), title5);
        listDataChild.put(listDataGroup.get(5), title6 );
        listDataChild.put(listDataGroup.get(6), title7 );
        listDataChild.put(listDataGroup.get(7), title8 );
        listDataChild.put(listDataGroup.get(8), title9 );
        listDataChild.put(listDataGroup.get(9), title10 );

        // notify the adapter
        productExpandableListViewAdapter.notifyDataSetChanged();
        expandableListView.setAdapter(productExpandableListViewAdapter);


    }










}
