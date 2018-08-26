package ua.odessa;

import org.junit.Test;
import ua.odessa.bondary.*;

import java.io.IOException;

public class SignHashSearcherTest {

    @Test
    public void TestSignHashSearch() throws IOException {

        String[] dictionary = Dictionary.loadDictionary("company.dic");

        SignHashIndexer indexer = new SignHashIndexer(new EnglishAlphabet());

        DamerauLevensteinMetric metric = new DamerauLevensteinMetric(2);

        SignHashSearcher searcher = new SignHashSearcher((SignHashIndex)indexer.createIndex(dictionary), metric, 2);

        for (Integer i: searcher.search("watsco")) {
            System.out.println(dictionary[i]);
        }

    }
}
