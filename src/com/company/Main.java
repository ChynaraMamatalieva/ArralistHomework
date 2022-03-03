package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> jupSan = new ArrayList<>();
        ArrayList<Integer> takSan = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int a = random.nextInt(1, 100);
            arrayList.add(a);
            if (a % 2 == 0) {
                jupSan.add(a);
            } else {
                takSan.add(a);
            }
        }
        System.out.println("ArrayList: "+arrayList);
        System.out.println("Jup sandar: "+jupSan);
        System.out.println("Tak sandar: "+takSan);

    }
}

