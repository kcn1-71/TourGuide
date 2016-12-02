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

public class MelbourneFragment extends Fragment {

    public MelbourneFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> words = new ArrayList<>();
        words.add(new Attraction(getString(R.string.melbourne_name1), getString(R.string.melbourne_discript1), R.drawable.melbourne_rooftop));
        words.add(new Attraction(getString(R.string.melbourne_name3), getString(R.string.melbourne_discript3)));
        words.add(new Attraction(getString(R.string.melbourne_name2), getString(R.string.melbourne_discript2), R.drawable.melbourne_hosier));
        words.add(new Attraction(getString(R.string.melbourne_name4), getString(R.string.melbourne_discript4)));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), words, R.color.category_melbourne);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
