import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {

        Port port = new Port();
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1,3-5");
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("2");
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("3-4");


        ArrayList<ArrayList<String>> arrayListAll = new ArrayList<>();
        arrayListAll.add(arrayList1);
        arrayListAll.add(arrayList2);
       // arrayListAll.add(arrayList3);
        arrayListAll.add(arrayList4);






         System.out.println(arrayListAll.toString());
         //System.out.println(port.arrayOfSubsequentNumbers(arrayList1));
         System.out.println(port.toArrayOfInteger(arrayListAll));

    }

}
