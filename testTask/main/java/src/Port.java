import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Port {
    /**
     * Метод, преобразовывающий массив строк indexes в массив
     * последовательностей чисел.
     *
     * @param indexes Массив строк.
     * @return Массив последовательностей чисел.
     */

    public static ArrayList<Integer> arrayOfSubsequentNumbers(ArrayList<String> indexes) {

        ArrayList<Integer> result = new ArrayList<>();
        if (indexes.size() == 0) {
            return result;
        }
        for (String s : indexes) {
            if (s == null) {
                continue;
            } else if (s.equals("")) {
                continue;
            }
            result.addAll(stingToInteger(s));
        }

        return result;
    }

    /**
     * Метод, возвращающий все возможные упорядоченные пары элементов
     * полученных массивов чисел.
     *
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
        var integersList = Arrays.stream(string.split(","))
                .map(value ->{
                    if(value.contains("-")) {
                        var values = Arrays.stream(value.split("-"))
                                .mapToInt(Integer::parseInt)
                                .toArray();
                        return IntStream
                                .rangeClosed(values[0],values[1])
                                .boxed()
                                .collect(Collectors.toList());
                    }else {
                        return List.of(Integer.parseInt(value));
                    }
                }).flatMap(Collection::stream).collect(Collectors.toList());

        return (ArrayList<Integer>) integersList;
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

        int countElem = 0;

        for (ArrayList<Integer> e : toPossibleOrderedPairs) {
            if (countElem < e.size()) {
                countElem = e.size();
            }
        }
        int count = 0;

        ArrayList<Integer> first = toPossibleOrderedPairs.get(0);
        for (int i = 0; i < first.size(); ) {
            temp.add(first.get(i));
            for (int j = 1; j < toPossibleOrderedPairs.size(); j++) {
                if (toPossibleOrderedPairs.get(j).size() == 1) {
                    temp.add(toPossibleOrderedPairs.get(j).get(0));

                } else {
                    for (int k = 0; k < 1; k++) {

                        temp.add(toPossibleOrderedPairs.get(j).get(count));
                    }
                }
            }

            count++;

            if (count >= countElem
                    || ((count >= toPossibleOrderedPairs
                    .get(toPossibleOrderedPairs.size() - 1).size())
                    && (toPossibleOrderedPairs
                    .get(toPossibleOrderedPairs.size() - 1).size() != 1))) {

                i++;
                count = 0;

            }
            resutl.add(arrayInteger(temp));
            temp.clear();
        }

        return resutl;
    }

    private static ArrayList<Integer> arrayInteger(ArrayList<Integer> numbs) {

        return new ArrayList<>(numbs);
    }
}
