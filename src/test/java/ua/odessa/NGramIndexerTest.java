package ua.odessa;

import org.junit.Test;
import ua.odessa.bondary.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class NGramIndexerTest {

    @Test
    public void TestCreateIndex() {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("companies.txt").getFile());
        assertTrue(file.exists());

        try (FileReader reader = new FileReader(file)){

            Cleanser cleanser = new Cleanser();

            String[] dictionary = Dictionary.createDictionary(reader, cleanser);
            System.out.println(dictionary.length);
            Dictionary.saveDictionary(dictionary,"company.dic");

            NGramIndexer nGramIndexer = new NGramIndexer(new EnglishAlphabet());
            Index index =  nGramIndexer.createIndex(dictionary);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
