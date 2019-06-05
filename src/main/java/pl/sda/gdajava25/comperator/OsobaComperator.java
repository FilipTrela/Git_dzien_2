package pl.sda.gdajava25.comperator;

import java.util.Comparator;

public class OsobaComperator implements Comparator<Osoba> {
    @Override
    public int compare(Osoba o1, Osoba o2) {
        if(o1.getWiek()>o2.getWiek())
            return 1;
        else if (o2.getWiek()>o1.getWiek())
            return -1;
        return 0;
    }
}
