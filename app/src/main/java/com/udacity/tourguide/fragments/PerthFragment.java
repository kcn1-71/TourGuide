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

public class PerthFragment extends Fragment {

    public PerthFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> words = new ArrayList<>();
        words.add(new Attraction(getString(R.string.perth_name2), getString(R.string.perth_discript2)));
        words.add(new Attraction(getString(R.string.perth_name1), getString(R.string.perth_discript1), R.drawable.perth_fringe));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), words, R.color.category_perth);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
