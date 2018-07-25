package ua.odessa.bondary;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cleanser implements Normalizer {

    private HashMap <String,String> replaceMap;


    public String normalize(String word) {
       String clearWord = word.toLowerCase()
               .replaceAll(" l.c."," limited partner ")
               .replaceAll(" inc."," corporation ")
               .replaceAll(" inc"," corporation ")
               .replaceAll(" ltd"," limited ")
               .trim()
               ;
         return clearWord;
    }
}

