import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

class PortTest {




    @Test
    void arrayOfSubsequentNumbersCheckWorkOK(){

        List<String> str = new ArrayList<>();
        str.add("1-5,7,9-11");

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        expected.add(7);
        expected.add(9);
        expected.add(10);
        expected.add(11);

        List<Integer> actual = Port.arrayOfSubsequentNumbers(str);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void arrayOfSubsequentNumbersCheckWorkOKRandomNumbs(){

        List<String> str = new ArrayList<>();
        str.add("2-4,10,9-11,4");
        str.add("5,56");

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(10);
        expected.add(9);

        expected.add(10);
        expected.add(11);
        expected.add(4);
        expected.add(5);
        expected.add(56);

        List<Integer> actual = Port.arrayOfSubsequentNumbers(str);

        Assertions.assertEquals(expected,actual);
    }
    @Test()
    void arrayOfSubsequentNumbersCheckNotException(){

        List<String> str = new ArrayList<>();
        str.add("");

        List<Integer> expected = new ArrayList<>();

        List<Integer> actual = Port.arrayOfSubsequentNumbers(str);

        Assertions.assertEquals(expected,actual);
    }
    @Test()
    void arrayOfSubsequentNumbersCheckNotNullException(){

        List<String> str = new ArrayList<>();
        str.add(null);

        List<Integer> expected = new ArrayList<>();

        List<Integer> actual = Port.arrayOfSubsequentNumbers(str);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void toAllPossibleOrderedPairsCheckException(){

        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("");
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("");
        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add("");
        List<List<String>> arrayList = new ArrayList<>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);

        List<List<Integer>> expected = new ArrayList<>();


        List<List<Integer>> actual = new ArrayList<>();

        actual = Port.toAllPossibleOrderedPairs(arrayList);


        Assertions.assertEquals(expected,actual);
    }
    @Test
    void toAllPossibleOrderedPairsCheckNotNullException(){

        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add(null);
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add(null);
        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add(null);
        List<List<String>> arrayList = new ArrayList<>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);

        List<List<Integer>> expected = new ArrayList<>();


        List<List<Integer>> actual = new ArrayList<>();

        actual = Port.toAllPossibleOrderedPairs(arrayList);


        Assertions.assertEquals(expected,actual);
    }

    @Test
    void toAllPossibleOrderedPairsCheckWorkOK(){

        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1,3-5");
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("2");
        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add("3-4");
        List<List<String>> arrayList = new ArrayList<>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);

        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> arrayInteger1 = new ArrayList<>();
        arrayInteger1.add(1);
        arrayInteger1.add(2);
        arrayInteger1.add(3);
        List<Integer> arrayInteger2 = new ArrayList<>();
        arrayInteger2.add(1);
        arrayInteger2.add(2);
        arrayInteger2.add(4);
        List<Integer> arrayInteger3 = new ArrayList<>();
        arrayInteger3.add(3);
        arrayInteger3.add(2);
        arrayInteger3.add(3);
        List<Integer> arrayInteger7 = new ArrayList<>();
        arrayInteger7.add(3);
        arrayInteger7.add(2);
        arrayInteger7.add(4);
        List<Integer> arrayInteger8 = new ArrayList<>();
        arrayInteger8.add(4);
        arrayInteger8.add(2);
        arrayInteger8.add(3);
        List<Integer> arrayInteger4 = new ArrayList<>();
        arrayInteger4.add(4);
        arrayInteger4.add(2);
        arrayInteger4.add(4);
        List<Integer> arrayInteger5 = new ArrayList<>();
        arrayInteger5.add(5);
        arrayInteger5.add(2);
        arrayInteger5.add(3);
        List<Integer> arrayInteger6 = new ArrayList<>();
        arrayInteger6.add(5);
        arrayInteger6.add(2);
        arrayInteger6.add(4);

        expected.add(arrayInteger1);
        expected.add(arrayInteger2);
        expected.add(arrayInteger3);
        expected.add(arrayInteger7);
        expected.add(arrayInteger8);
        expected.add(arrayInteger4);
        expected.add(arrayInteger5);
        expected.add(arrayInteger6);

        List<List<Integer>> actual = new ArrayList<>();

        actual = Port.toAllPossibleOrderedPairs(arrayList);


        Assertions.assertEquals(expected,actual);
    }
    @Test
    void toAllPossibleOrderedPairsCheckWorkOKRandomNumbs(){

        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1,2-3");
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("2,5-8");
        List<List<String>> arrayList = new ArrayList<>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);

        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> arrayInteger1 = new ArrayList<>();
        arrayInteger1.add(1);
        arrayInteger1.add(2);
        List<Integer> arrayInteger2 = new ArrayList<>();
        arrayInteger2.add(1);
        arrayInteger2.add(5);
        List<Integer> arrayInteger3 = new ArrayList<>();
        arrayInteger3.add(1);
        arrayInteger3.add(6);
        List<Integer> arrayInteger4 = new ArrayList<>();
        arrayInteger4.add(1);
        arrayInteger4.add(7);
        List<Integer> arrayInteger5 = new ArrayList<>();
        arrayInteger5.add(1);
        arrayInteger5.add(8);
        List<Integer> arrayInteger6 = new ArrayList<>();
        arrayInteger6.add(2);
        arrayInteger6.add(2);
        List<Integer> arrayInteger7 = new ArrayList<>();
        arrayInteger7.add(2);
        arrayInteger7.add(5);
        List<Integer> arrayInteger8 = new ArrayList<>();
        arrayInteger8.add(2);
        arrayInteger8.add(6);
        List<Integer> arrayInteger9 = new ArrayList<>();
        arrayInteger9.add(2);
        arrayInteger9.add(7);
        List<Integer> arrayInteger10 = new ArrayList<>();
        arrayInteger10.add(2);
        arrayInteger10.add(8);
        List<Integer> arrayInteger11 = new ArrayList<>();
        arrayInteger11.add(3);
        arrayInteger11.add(2);
        List<Integer> arrayInteger12 = new ArrayList<>();
        arrayInteger12.add(3);
        arrayInteger12.add(5);
        List<Integer> arrayInteger13 = new ArrayList<>();
        arrayInteger13.add(3);
        arrayInteger13.add(6);
        List<Integer> arrayInteger14 = new ArrayList<>();
        arrayInteger14.add(3);
        arrayInteger14.add(7);
        List<Integer> arrayInteger15 = new ArrayList<>();
        arrayInteger15.add(3);
        arrayInteger15.add(8);

        expected.add(arrayInteger1);
        expected.add(arrayInteger2);
        expected.add(arrayInteger3);
        expected.add(arrayInteger4);
        expected.add(arrayInteger5);
        expected.add(arrayInteger6);
        expected.add(arrayInteger7);
        expected.add(arrayInteger8);

        expected.add(arrayInteger9);
        expected.add(arrayInteger10);
        expected.add(arrayInteger11);
        expected.add(arrayInteger12);
        expected.add(arrayInteger13);
        expected.add(arrayInteger14);
        expected.add(arrayInteger15);

        List<List<Integer>> actual = new ArrayList<>();

        actual = Port.toAllPossibleOrderedPairs(arrayList);

        Assertions.assertEquals(expected,actual);

    }
    @Test
    void toAllPossibleOrderedPairsCheckWorkFirstArraySizeOne(){

        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1");
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("2,5-8");
        List<List<String>> arrayList = new ArrayList<>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);

       List<List<Integer>> expected = new ArrayList<>();

        List<Integer> arrayInteger1 = new ArrayList<>();
        arrayInteger1.add(1);
        arrayInteger1.add(2);
        List<Integer> arrayInteger2 = new ArrayList<>();
        arrayInteger2.add(1);
        arrayInteger2.add(5);
        List<Integer> arrayInteger3 = new ArrayList<>();
        arrayInteger3.add(1);
        arrayInteger3.add(6);
        List<Integer> arrayInteger4 = new ArrayList<>();
        arrayInteger4.add(1);
        arrayInteger4.add(7);
        List<Integer> arrayInteger5 = new ArrayList<>();
        arrayInteger5.add(1);
        arrayInteger5.add(8);


        expected.add(arrayInteger1);
        expected.add(arrayInteger2);
        expected.add(arrayInteger3);
        expected.add(arrayInteger4);
        expected.add(arrayInteger5);


        List<List<Integer>> actual = new ArrayList<>();

        actual = Port.toAllPossibleOrderedPairs(arrayList);

        Assertions.assertEquals(expected,actual);

    }
    @Test
    void toAllPossibleOrderedPairsCheckWorkFirstArrayAndLastArraySizeOne(){

        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1");
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("2,5-8");
        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add("2");
        List<List<String>> arrayList = new ArrayList<>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);

        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> arrayInteger1 = new ArrayList<>();
        arrayInteger1.add(1);
        arrayInteger1.add(2);
        arrayInteger1.add(2);
        List<Integer> arrayInteger2 = new ArrayList<>();
        arrayInteger2.add(1);
        arrayInteger2.add(5);
        arrayInteger2.add(2);
        List<Integer> arrayInteger3 = new ArrayList<>();
        arrayInteger3.add(1);
        arrayInteger3.add(6);
        arrayInteger3.add(2);
        List<Integer> arrayInteger4 = new ArrayList<>();
        arrayInteger4.add(1);
        arrayInteger4.add(7);
        arrayInteger4.add(2);
        List<Integer> arrayInteger5 = new ArrayList<>();
        arrayInteger5.add(1);
        arrayInteger5.add(8);
        arrayInteger5.add(2);


        expected.add(arrayInteger1);
        expected.add(arrayInteger2);
        expected.add(arrayInteger3);
        expected.add(arrayInteger4);
        expected.add(arrayInteger5);


        List<List<Integer>> actual = new ArrayList<>();

        actual = Port.toAllPossibleOrderedPairs(arrayList);

        Assertions.assertEquals(expected,actual);

    }



}
