package pl.sda.gdajava25.comperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("abc", "bca", 16);
        Osoba osoba2 = new Osoba("abc", "bca", 26);
        Osoba osoba3 = new Osoba("abc", "bca", 36);
        Osoba osoba4 = new Osoba("abc", "bca", 17);
        Osoba osoba5 = new Osoba("abc", "bca", 19);
        Osoba osoba6 = new Osoba("abc", "bca", 23);
        Osoba osoba7 = new Osoba("abc", "bca", 61);
        List<Osoba> osobaList = new ArrayList<>(Arrays.asList(osoba1, osoba2, osoba3, osoba4, osoba5, osoba6, osoba7));
        OsobaComperator osobaComperator = new OsobaComperator();
        Collections.sort(osobaList,osobaComperator);
        osobaList.forEach(System.out::println);

    }
}
