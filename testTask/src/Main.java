import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {

        Port port = new Port();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1-5,6,78");
        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList.add("7,9-11");
        arrayList3.add("2,6-7");
        ArrayList<ArrayList<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(arrayList);


        arrayList2.add(arrayList3);


         System.out.println(arrayList2.toString());
         System.out.println(port.arrayOfSubsequentNumbers(arrayList));
         System.out.println(port.toArrayOfInteger(arrayList2));

    }

}
