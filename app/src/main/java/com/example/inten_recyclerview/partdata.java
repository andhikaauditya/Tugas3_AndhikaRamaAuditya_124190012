package com.example.inten_recyclerview;

import java.util.ArrayList;

public class partdata {
    private static String[] namaharga = new String[]{"Bodyset Vespa LX","Dasi Vespa Sprint","Foostep Primavera-Sprint",
            "Karbon Vespa LX","Stoplamp Vespa LX","Hendle Rem Zilioni Universal"};

    private static int[] gambar = new int[]{R.drawable.body,R.drawable.dasi,
            R.drawable.footstep,R.drawable.karbonlx,R.drawable.lampu,R.drawable.rem};

    public static ArrayList<partmodel> getListdata(){
        partmodel partmodel =null;
        ArrayList<partmodel> list = new ArrayList<partmodel>();
        for (int i=0; i<namaharga.length; i++){
            partmodel = new partmodel();
            partmodel.setGambarpart(gambar[i]);
            partmodel.setNamapart(namaharga[i]);
            list.add(partmodel);
        }
        return list;
    }
}
