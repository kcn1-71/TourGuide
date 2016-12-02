package com.udacity.tourguide;

public class Attraction {

    private String mName;
    private String mDescriptionShort;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(String name, String descriptionShort, int imageResourceId) {
        mName = name;
        mDescriptionShort = descriptionShort;
        mImageResourceId = imageResourceId;
    }

    public Attraction(String name, String descriptionShort) {
        mName = name;
        mDescriptionShort = descriptionShort;
    }

    public String getName() {
        return mName;
    }

    public String getDescriptionShort() {
        return mDescriptionShort;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
