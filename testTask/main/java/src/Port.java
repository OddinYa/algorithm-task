import java.util.ArrayList;
import java.util.List;

public class Port {
    /** Метод, преобразовывающий массив строк indexes в массив
     *  последовательностей чисел.
     * @param indexes Массив строк.
     * @return Массив последовательностей чисел.
     */

    public static ArrayList<Integer> arrayOfSubsequentNumbers(ArrayList<String> indexes) {

        ArrayList<Integer> result = new ArrayList<>();

        for (String s : indexes) {
            result.addAll(stingToInteger(s));
        }

        return result;
    }

    /** Метод, возвращающий все возможные упорядоченные пары элементов
     *    полученных массивов чисел.
     * @param indexes Двумерный массив строк.
     * @return Двумерный массив чисел.
     */

    public static ArrayList<ArrayList<Integer>> toAllPossibleOrderedPairs(ArrayList<ArrayList<String>> indexes) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (ArrayList<String> strArray : indexes) {
            result.add(arrayOfSubsequentNumbers(strArray));
        }

        return arrayIntegerArrayToAllPossibleOrderedPairs(result);

    }

    private static ArrayList<Integer> stingToInteger(String string) {

        ArrayList<Integer> result = new ArrayList<>();
        String[] strArr;

        strArr = string.split(",");
        for (String e : strArr) {
            if (e.contains("-")) {

                String temp = "";

                for (int i = 0; i < e.length(); i++) {
                    if (e.charAt(i) == '-') {

                        int abs;
                        int numbOne = Integer.parseInt(e.substring(0, i));
                        int numbTwo = Integer.parseInt(e.substring(i + 1)) + 1;
                        if(numbOne>numbTwo){
                            abs = numbTwo-1;
                            numbTwo = numbOne+1;
                            numbOne = abs;
                        }
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

    private static ArrayList<ArrayList<Integer>> arrayIntegerArrayToAllPossibleOrderedPairs(ArrayList<ArrayList<Integer>>
                                                                                             toPossibleOrderedPairs) {

        ArrayList<ArrayList<Integer>> resutl = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        if (toPossibleOrderedPairs.size() <= 1) {
            for (Integer e : toPossibleOrderedPairs.get(0)) {
                temp.add(e);
                resutl.add(arrayInteger(temp));
                temp.clear();
            }
        }
        int countElem = 0 ;
        for(ArrayList<Integer> e : toPossibleOrderedPairs){
            if(countElem<e.size()){
                countElem=e.size();
            }
        }
       
        int count = 0;
        ArrayList<Integer> first = toPossibleOrderedPairs.get(0);
        for (int i = 0; i < first.size(); ) {
            temp.add(first.get(i));
            for (int j = 1; j < toPossibleOrderedPairs.size(); j++) {
                if (toPossibleOrderedPairs.get(j).size() == 1) {
                    temp.add(toPossibleOrderedPairs.get(j).get(0));
                    count++;
                } else {
                    for (int k = 0; k < 1; k++) {
                        temp.add(toPossibleOrderedPairs.get(j).get(count));
                        count++;
                    }
                }
            }
            if (count == countElem) {
                i++;
                count = 0;
            }
            resutl.add(arrayInteger(temp));
            temp.clear();
        }


        return resutl;
    }

    private static ArrayList<Integer> arrayInteger(ArrayList<Integer> numbs) {

        ArrayList<Integer> arrayList = new ArrayList<>(numbs);
        return arrayList;
    }
}
