package com.example.edwin.sistema_hotel;



public enum ModelObject {


    PINK(R.color.pink_color, R.layout.view_pink),
    PINK2 (R.color.pink_color2, R.layout.view_pink2);

    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {

        mLayoutResId = layoutResId;
    }

     public int getLayoutResId() {
        return mLayoutResId;
    }

}
