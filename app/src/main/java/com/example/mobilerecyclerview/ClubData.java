package com.example.mobilerecyclerview;

import java.util.ArrayList;

public class ClubData {
    private static String [] clubName={
            "Ayam Geprek",
            "Bubur Ayam",
            "Mie Goreng",
            "Mie Kuah",
            "Nasi Goreng",
            "Rendang Ayam",
            "Rendang Sapi",
            "Sapo Tahu",
            "Soto Ayam",
            "Steak"
    };
    private static String [] clubDetail={
            "Ayam Geprek adalah makanan yang diolah dengan seksama sehingga menghasilkan rasa yang menggugah selera",
            "Bubur Ayam adalah makanan yang diolah dengan seksama sehingga menghasilkan rasa yang menggugah selera",
            "Mie Goreng adalah makanan yang diolah dengan seksama sehingga menghasilkan rasa yang menggugah selera",
            "Mie Kuah adalah makanan yang diolah dengan seksama sehingga menghasilkan rasa yang menggugah selera",
            "Nasi Goreng adalah makanan yang diolah dengan seksama sehingga menghasilkan rasa yang menggugah selera",
            "Rendang Ayam adalah makanan yang diolah dengan seksama sehingga menghasilkan rasa yang menggugah selera",
            "Rendang Sapi adalah makanan yang diolah dengan seksama sehingga menghasilkan rasa yang menggugah selera",
            "Sapo Tahu adalah makanan yang diolah dengan seksama sehingga menghasilkan rasa yang menggugah selera",
            "Soto Ayam adalah makanan yang diolah dengan seksama sehingga menghasilkan rasa yang menggugah selera",
            "Steak adalah makanan yang diolah dengan seksama sehingga menghasilkan rasa yang menggugah selera"
    };
    private static int[] clubImage={
            R.drawable.ayamgeprek,
            R.drawable.buburayam,
            R.drawable.miegor,
            R.drawable.mikuah,
            R.drawable.nasgor,
            R.drawable.rendangayam,
            R.drawable.sapi,
            R.drawable.sapotahu,
            R.drawable.sotoayam,
            R.drawable.steak
    };

    static ArrayList<Club> getlistData(){
        ArrayList<Club> list = new ArrayList<>();
        for (int position=0; position <clubName.length; position++){
            Club club = new Club();
            club.setName(clubName[position]);
            club.setDetail(clubDetail[position]);
            club.setPhoto(clubImage[position]);
            list.add(club);
        }
        return list;
    }
}
