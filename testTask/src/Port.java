import java.util.ArrayList;
import java.util.List;

public class Port implements StringOfArrayToArrayOfInteger, StringArrayToInteger {

    public Port() {
    }

    @Override
    public ArrayList<Integer> arrayOfSubsequentNumbers(ArrayList<String> indexes) {
        ArrayList<Integer> result = new ArrayList<>();
        for (String s : indexes) {
            result.addAll(stingToInteger(s));
        }
        return result;
    }

    @Override
    public ArrayList<ArrayList<Integer>> toArrayOfInteger(ArrayList<ArrayList<String>> indexes) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (ArrayList<String> strArray : indexes) {
            result.add(arrayOfSubsequentNumbers(strArray));
        }


        return arrayIntegerArrayToAllPossibleOrderedPairs(result);


    }

    private ArrayList<Integer> stingToInteger(String string) {

        ArrayList<Integer> result = new ArrayList<>();
        String[] strArr;

        strArr = string.split(",");
        for (String e : strArr) {
            if (e.contains("-")) {

                String temp = "";

                for (int i = 0; i < e.length(); i++) {
                    if (e.charAt(i) == '-') {
                        int numbOne = Integer.parseInt(e.substring(0, i));
                        int numbTwo = Integer.parseInt(e.substring(i + 1)) + 1;
                        for (int j = numbOne; j < numbTwo; j++) {
                            temp += j + ",";
                        }
                        List<Integer> req = stingToInteger(temp);
                        result.addAll(req);
                    }
                }
            } else result.add(Integer.parseInt(e));
        }
        return result;
    }

    //Не работает...
    private ArrayList<ArrayList<Integer>> arrayIntegerArrayToAllPossibleOrderedPairs(ArrayList<ArrayList<Integer>>
                                                                                             toPossibleOrderedPairs) {

        ArrayList<ArrayList<Integer>> resutl = new ArrayList<>();

        if (toPossibleOrderedPairs.size() <= 1) {
            return toPossibleOrderedPairs;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> first = toPossibleOrderedPairs.get(0);
        for (int i = 0; i < first.size(); i++) {
            temp.add(first.get(i));
            for (int j = 1; j < toPossibleOrderedPairs.size(); j++) {
                for (int k = i; k < toPossibleOrderedPairs.get(j).size();) {
                    temp.add(toPossibleOrderedPairs.get(j).get(k));
                    break;
                }
                resutl.add(arrayInteger(temp));
            }
        }


        return resutl;
    }

    private ArrayList<Integer> arrayInteger(ArrayList<Integer> numbs) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(numbs);
        return arrayList;

    }
}
