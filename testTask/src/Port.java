import java.util.ArrayList;

public interface Port {

    /**Метод, преобразовывающий массив строк indexes в массив
     * последовательностей чисел;
     * @param indexes Массив строк.
     * @return Массив последовательных чисел типа Integer.
     */
    ArrayList<Integer> arrayOfSubsequentNumbers(ArrayList<String> indexes);

    /**Метод, возвращающий все возможные упорядоченные пары элементов
     * полученных массивов чисел.
     * @param indexes Массив массивов строк.
     * @return Массив массивов всех возможных пар элементов типа Integer.
     */

    ArrayList<ArrayList<Integer>> toArrayOfInteger(ArrayList<ArrayList<String>> indexes);
}
