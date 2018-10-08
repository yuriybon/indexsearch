package ua.odessa;

import org.junit.Test;
import ua.odessa.bondary.*;

import java.io.IOException;

public class BKTreeSearcherTest {

    @Test
    public void searchTest() throws IOException {
        String[] dictionary = Dictionary.loadDictionary("company.dic");

        DamerauLevensteinMetric metric = new DamerauLevensteinMetric(2);
        BKTreeIndexer indexer = new BKTreeIndexer(metric);

        BKTreeIndex index = (BKTreeIndex) indexer.createIndex(dictionary);

        BKTreeSearcher searcher = new BKTreeSearcher(index, metric, 2);

        for (Integer i: searcher.search("watsco")) {
            System.out.println(dictionary[i]);
        }

    }

}
