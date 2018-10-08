package ua.odessa.bondary;

import org.junit.Test;


public class DamerauLevensteinMetricTest {


    @Test
    public void testGetDistance() {
        DamerauLevensteinMetric metric = new DamerauLevensteinMetric();

        org.junit.Assert.assertEquals(1, metric.getDistance("AAA","AAB"));
        System.out.println(metric.getDistance("abbott","advance"));
        System.out.println(metric.getDistance("acterna","advance"));
        //abercrombie advantica
        System.out.println(metric.getDistance("abercrombie","advantica"));
//        org.junit.Assert.assertEquals(1, metric.getDistance("abbott","advance"));
        // dictionary[index]=="abbott"

//        dict[index]=abbott
//        dictionary[childWord]=advance
//        dict[index]=acterna
//        dictionary[childWord]=advance
    }
}
