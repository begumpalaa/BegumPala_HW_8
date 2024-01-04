package org.example;

import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String metin1 = "Test Tekrarlı Harfler";
        String metin2 = "Repeated Character";

        String yeniMetin = birlestirTekrarliKarakterler(metin1, metin2);

        System.out.println("Metin 1: " + metin1);
        System.out.println("Metin 2: " + metin2);
        System.out.println("Yeni Metin: " + yeniMetin);
    }

    public static String birlestirTekrarliKarakterler(String metin1, String metin2) {
        Set<Character> tekrarliKarakterler = new HashSet<>();

        for (char karakter : metin1.toCharArray()) {
            if (metin2.toLowerCase().contains(String.valueOf(karakter))) {
                tekrarliKarakterler.add(karakter);
            }
        }


        for (char karakter : metin2.toCharArray()) {
            if (metin1.toLowerCase().contains(String.valueOf(karakter))) {
                tekrarliKarakterler.add(karakter);
            }
        }


        StringBuilder yeniMetin = new StringBuilder();
        for (char karakter : tekrarliKarakterler) {
            yeniMetin.append(karakter);
        }
        return yeniMetin.toString();
    }
}

