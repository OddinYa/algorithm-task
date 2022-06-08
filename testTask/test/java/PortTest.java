import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

class PortTest {




    @Test
    void arrayOfSubsequentNumbersCheckWorkOK(){

        ArrayList<String> str = new ArrayList<>();
        str.add("1-5,7,9-11");

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        expected.add(7);
        expected.add(9);
        expected.add(10);
        expected.add(11);

        ArrayList<Integer> actual = Port.arrayOfSubsequentNumbers(str);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void arrayOfSubsequentNumbersCheckWorkOKRandomNumbs(){

        ArrayList<String> str = new ArrayList<>();
        str.add("2-4,10,9-11,4");
        str.add("5,56");

        ArrayList<Integer> expected = new ArrayList<>();
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

        ArrayList<Integer> actual = Port.arrayOfSubsequentNumbers(str);

        Assertions.assertEquals(expected,actual);
    }
    @Test()
    void arrayOfSubsequentNumbersCheckNotException(){

        ArrayList<String> str = new ArrayList<>();
        str.add("");

        ArrayList<Integer> expected = new ArrayList<>();

        ArrayList<Integer> actual = Port.arrayOfSubsequentNumbers(str);

        Assertions.assertEquals(expected,actual);
    }
    @Test()
    void arrayOfSubsequentNumbersCheckNotNullException(){

        ArrayList<String> str = new ArrayList<>();
        str.add(null);

        ArrayList<Integer> expected = new ArrayList<>();

        ArrayList<Integer> actual = Port.arrayOfSubsequentNumbers(str);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void toAllPossibleOrderedPairsCheckException(){

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("");
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("");
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();


        ArrayList<ArrayList<Integer>> actual = new ArrayList<>();

        actual = Port.toAllPossibleOrderedPairs(arrayList);


        Assertions.assertEquals(expected,actual);
    }
    @Test
    void toAllPossibleOrderedPairsCheckNotNullException(){

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add(null);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add(null);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add(null);
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();


        ArrayList<ArrayList<Integer>> actual = new ArrayList<>();

        actual = Port.toAllPossibleOrderedPairs(arrayList);


        Assertions.assertEquals(expected,actual);
    }

    @Test
    void toAllPossibleOrderedPairsCheckWorkOK(){

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1,3-5");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("2");
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("3-4");
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();

        ArrayList<Integer> arrayInteger1 = new ArrayList<>();
        arrayInteger1.add(1);
        arrayInteger1.add(2);
        arrayInteger1.add(3);
        ArrayList<Integer> arrayInteger2 = new ArrayList<>();
        arrayInteger2.add(1);
        arrayInteger2.add(2);
        arrayInteger2.add(4);
        ArrayList<Integer> arrayInteger3 = new ArrayList<>();
        arrayInteger3.add(3);
        arrayInteger3.add(2);
        arrayInteger3.add(3);
        ArrayList<Integer> arrayInteger7 = new ArrayList<>();
        arrayInteger7.add(3);
        arrayInteger7.add(2);
        arrayInteger7.add(4);
        ArrayList<Integer> arrayInteger8 = new ArrayList<>();
        arrayInteger8.add(4);
        arrayInteger8.add(2);
        arrayInteger8.add(3);
        ArrayList<Integer> arrayInteger4 = new ArrayList<>();
        arrayInteger4.add(4);
        arrayInteger4.add(2);
        arrayInteger4.add(4);
        ArrayList<Integer> arrayInteger5 = new ArrayList<>();
        arrayInteger5.add(5);
        arrayInteger5.add(2);
        arrayInteger5.add(3);
        ArrayList<Integer> arrayInteger6 = new ArrayList<>();
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

        ArrayList<ArrayList<Integer>> actual = new ArrayList<>();

        actual = Port.toAllPossibleOrderedPairs(arrayList);


        Assertions.assertEquals(expected,actual);
    }
    @Test
    void toAllPossibleOrderedPairsCheckWorkOKRandomNumbs(){

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1,2-3");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("2,5-8");
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();

        ArrayList<Integer> arrayInteger1 = new ArrayList<>();
        arrayInteger1.add(1);
        arrayInteger1.add(2);
        ArrayList<Integer> arrayInteger2 = new ArrayList<>();
        arrayInteger2.add(1);
        arrayInteger2.add(5);
        ArrayList<Integer> arrayInteger3 = new ArrayList<>();
        arrayInteger3.add(1);
        arrayInteger3.add(6);
        ArrayList<Integer> arrayInteger4 = new ArrayList<>();
        arrayInteger4.add(1);
        arrayInteger4.add(7);
        ArrayList<Integer> arrayInteger5 = new ArrayList<>();
        arrayInteger5.add(1);
        arrayInteger5.add(8);
        ArrayList<Integer> arrayInteger6 = new ArrayList<>();
        arrayInteger6.add(2);
        arrayInteger6.add(2);
        ArrayList<Integer> arrayInteger7 = new ArrayList<>();
        arrayInteger7.add(2);
        arrayInteger7.add(5);
        ArrayList<Integer> arrayInteger8 = new ArrayList<>();
        arrayInteger8.add(2);
        arrayInteger8.add(6);
        ArrayList<Integer> arrayInteger9 = new ArrayList<>();
        arrayInteger9.add(2);
        arrayInteger9.add(7);
        ArrayList<Integer> arrayInteger10 = new ArrayList<>();
        arrayInteger10.add(2);
        arrayInteger10.add(8);
        ArrayList<Integer> arrayInteger11 = new ArrayList<>();
        arrayInteger11.add(3);
        arrayInteger11.add(2);
        ArrayList<Integer> arrayInteger12 = new ArrayList<>();
        arrayInteger12.add(3);
        arrayInteger12.add(5);
        ArrayList<Integer> arrayInteger13 = new ArrayList<>();
        arrayInteger13.add(3);
        arrayInteger13.add(6);
        ArrayList<Integer> arrayInteger14 = new ArrayList<>();
        arrayInteger14.add(3);
        arrayInteger14.add(7);
        ArrayList<Integer> arrayInteger15 = new ArrayList<>();
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

        ArrayList<ArrayList<Integer>> actual = new ArrayList<>();

        actual = Port.toAllPossibleOrderedPairs(arrayList);

        Assertions.assertEquals(expected,actual);

    }
    @Test
    void toAllPossibleOrderedPairsCheckWorkFirstArraySizeOne(){

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("2,5-8");
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();

        ArrayList<Integer> arrayInteger1 = new ArrayList<>();
        arrayInteger1.add(1);
        arrayInteger1.add(2);
        ArrayList<Integer> arrayInteger2 = new ArrayList<>();
        arrayInteger2.add(1);
        arrayInteger2.add(5);
        ArrayList<Integer> arrayInteger3 = new ArrayList<>();
        arrayInteger3.add(1);
        arrayInteger3.add(6);
        ArrayList<Integer> arrayInteger4 = new ArrayList<>();
        arrayInteger4.add(1);
        arrayInteger4.add(7);
        ArrayList<Integer> arrayInteger5 = new ArrayList<>();
        arrayInteger5.add(1);
        arrayInteger5.add(8);


        expected.add(arrayInteger1);
        expected.add(arrayInteger2);
        expected.add(arrayInteger3);
        expected.add(arrayInteger4);
        expected.add(arrayInteger5);


        ArrayList<ArrayList<Integer>> actual = new ArrayList<>();

        actual = Port.toAllPossibleOrderedPairs(arrayList);

        Assertions.assertEquals(expected,actual);

    }
    @Test
    void toAllPossibleOrderedPairsCheckWorkFirstArrayAndLastArraySizeOne(){

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("2,5-8");
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("2");
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();

        ArrayList<Integer> arrayInteger1 = new ArrayList<>();
        arrayInteger1.add(1);
        arrayInteger1.add(2);
        arrayInteger1.add(2);
        ArrayList<Integer> arrayInteger2 = new ArrayList<>();
        arrayInteger2.add(1);
        arrayInteger2.add(5);
        arrayInteger2.add(2);
        ArrayList<Integer> arrayInteger3 = new ArrayList<>();
        arrayInteger3.add(1);
        arrayInteger3.add(6);
        arrayInteger3.add(2);
        ArrayList<Integer> arrayInteger4 = new ArrayList<>();
        arrayInteger4.add(1);
        arrayInteger4.add(7);
        arrayInteger4.add(2);
        ArrayList<Integer> arrayInteger5 = new ArrayList<>();
        arrayInteger5.add(1);
        arrayInteger5.add(8);
        arrayInteger5.add(2);


        expected.add(arrayInteger1);
        expected.add(arrayInteger2);
        expected.add(arrayInteger3);
        expected.add(arrayInteger4);
        expected.add(arrayInteger5);


        ArrayList<ArrayList<Integer>> actual = new ArrayList<>();

        actual = Port.toAllPossibleOrderedPairs(arrayList);

        Assertions.assertEquals(expected,actual);

    }



}
