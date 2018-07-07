package com.example.android.tourguide;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of museums of mars!!
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("it's red", "The red Museum", R.drawable.color_red, R.raw.color_red));
        places.add(new Place("it's better than red", "The dead museum", R.drawable.color_mustard_yellow,
                R.raw.color_mustard_yellow));
        places.add(new Place("dusty yellow", "Museum of museums", R.drawable.color_dusty_yellow,
                R.raw.color_dusty_yellow));
        places.add(new Place("green", "Museum cubed", R.drawable.color_green, R.raw.color_green));
        places.add(new Place("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        places.add(new Place("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_museums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }


}
