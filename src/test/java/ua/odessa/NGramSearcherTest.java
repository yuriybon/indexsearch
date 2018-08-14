package ua.odessa;

import org.junit.Test;
import ua.odessa.bondary.*;

import java.io.IOException;


public class NGramSearcherTest {

    @Test
    public void TestNGramSearcher() throws IOException {
        String[] dictionary = Dictionary.loadDictionary("company.dic");

        NGramIndexer nGramIndexer = new NGramIndexer(new EnglishAlphabet());
        NGramIndex index = (NGramIndex) nGramIndexer.createIndex(dictionary);
        DamerauLevensteinMetric metric = new DamerauLevensteinMetric(2);
        NGramSearcher searcher = new NGramSearcher( index, metric,2,true);

        for (Integer i: searcher.search("watsco")) {
            System.out.println("result "+i);
        }


    }
}
