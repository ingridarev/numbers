import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;

public class MyExercises implements Exercises {
    @Override
    public Integer findSmallest(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    @Override
    public Integer findLargest(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    @Override
    public boolean isEqual(Object lhs, Object rhs) {
        return lhs.equals(rhs);
    }

    @Override
    public boolean isSameObject(Object lhs, Object rhs) {
        return lhs == rhs;
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        List<Integer> iterated = new ArrayList<>();
        if (iterator.hasNext()) {
            iterated.add(iterator.next());
        }
        return iterated;
    }

    @Override
    public int computeSumOfNumbers(int numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers; i++) {
            sum += i;
        }
        return sum;
    }

    @Override
    public int computeSumOfNumbers(int number, NumberFilter filter) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (filter.accept(i)) {
                sum += i;
            }
        }
        return sum;
    }

    @Override
    public List<Integer> computeNumbersUpTo(int number) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (Integer number : list) {
            if (!occurrences.containsKey(number)) {
                occurrences.put(number, 1);
            } else {
                int value = occurrences.get(number);
                value++;
                occurrences.put(number, value);
            }
        }
        return occurrences;
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int from, int to) {
        return null;
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter filter) {
        return null;
    }
}
