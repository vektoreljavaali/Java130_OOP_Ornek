package com.vektorel.utility;

import com.vektorel.repository.entity.Hizmetli;
import com.vektorel.repository.entity.Mudur;
import com.vektorel.repository.entity.Muhendis;

import java.util.ArrayList;
import java.util.List;

public class StaticValues {
    public static List<Mudur> mudurList = new ArrayList<>();
    public static List<Muhendis> muhendisList = new ArrayList<>();
    public static List<Hizmetli> hizmetliList = new ArrayList<>();

    /**
     * Soru birisi gelip bunu elle(kod ile) sıfırlar ise??
     */
    private static int prs_sirano = 0;

    public static int getPrs_sirano(){
        prs_sirano++;
        return prs_sirano;
    }

}
