package com.udacity.tourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.udacity.tourguide.Attraction;
import com.udacity.tourguide.R;
import com.udacity.tourguide.adapters.AttractionAdapter;

import java.util.ArrayList;

public class SydneyFragment extends Fragment {

    public SydneyFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> words = new ArrayList<Attraction>();
        words.add(new Attraction(getString(R.string.sydney_name1), getString(R.string.sydney_discript1),R.drawable.sydney_garden));
        words.add(new Attraction(getString(R.string.sydney_name2), getString(R.string.sydney_discript2), R.drawable.sydney_art_gallery));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), words, R.color.category_sydney);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
