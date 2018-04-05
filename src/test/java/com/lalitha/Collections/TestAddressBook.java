package com.lalitha.Collections;


import java.util.ArrayList;
import java.util.List;

public class TestAddressBook {
    public static void main(String[] args){
        AddressBook a1 = new AddressBook("North pine dr", 440, "Alpharetta","Ga",30022);
        AddressBook a2 = new AddressBook("Misty moon dr", 450, "Alpharetta","Ga",30022);
        AddressBook a3 = new AddressBook("Windham Way", 460, "Alpharetta","Ga",30022);
        AddressBook a4 = new AddressBook("Acreview Dr", 470, "Alpharetta","Ga",30022);
        AddressBook[] array  = new AddressBook[4];
         array[0] = a1;
         array[1] = a2;
         array[2] = a3;
         array[3] = a1;
        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("list.................................");

        List<AddressBook> listObj = new ArrayList<>();
        listObj.add(a1);
        listObj.add(a2);
        listObj.add(a3);
        listObj.add(a4);
        listObj.add(a1);
//        for(int i = 0; i<listObj.size();i++) {
//            System.out.println(listObj.get(i));
//        }
        for(AddressBook aAddressBook:listObj){
            System.out.println(aAddressBook);
        }

        System.out.println("deleted.................................");
        AddressBook deletedAddress = listObj.remove(0);
        System.out.println(deletedAddress);
        System.out.println(listObj.size());

    }
}
