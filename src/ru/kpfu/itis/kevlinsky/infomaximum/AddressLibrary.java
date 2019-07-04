package ru.kpfu.itis.kevlinsky.infomaximum;

import java.util.*;

public class AddressLibrary {
    private Map<Address, Integer> addresses = new HashMap<>();
    private static AddressLibrary instance;

    public static AddressLibrary getInstance(){
        if (instance == null){
            instance = new AddressLibrary();
        }
        return instance;
    }

    private AddressLibrary(){}

    public void addAddress(Address address){
        if (addresses.containsKey(address)) {
            int oldValue = addresses.get(address);
            addresses.replace(address, oldValue, oldValue + 1);
        } else {
            addresses.put(address, 1);
        }
    }

    public void writeDuplicates(){
        Iterator<Map.Entry<Address, Integer>> it = addresses.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = it.next();
            Address address = (Address) entry.getKey();
            int repetitions = (int) entry.getValue();
            if (repetitions > 1){
                System.out.println("Address --> " + address.toString() + " Repetitions --> " + repetitions);
            }
        }
    }

    public int size(){
        return this.addresses.size();
    }
}
