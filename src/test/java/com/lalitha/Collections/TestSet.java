package com.lalitha.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<AddressBook> aSet = new HashSet();
        AddressBook a1 = new AddressBook("North pine dr", 440, "Alpharetta","Ga",30022);
        AddressBook a5 = new AddressBook("North pine dr", 440, "Alpharetta","Ga",30022);
        AddressBook a2 = new AddressBook("Misty moon dr", 450, "Alpharetta","Ga",30022);
        AddressBook a3 = new AddressBook("Windham Way", 460, "Alpharetta","Ga",30022);
        AddressBook a4 = new AddressBook("Acreview Dr", 470, "Alpharetta","Ga",30022);

        aSet.add(a1);
        aSet.add(a2);
        aSet.add(a3);
        aSet.add(a4);
        aSet.add(a5);
        for (AddressBook anInt : aSet) {
            System.out.println(anInt);
        }


    }
}

