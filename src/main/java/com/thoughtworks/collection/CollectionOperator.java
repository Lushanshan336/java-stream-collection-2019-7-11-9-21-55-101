package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int min = Math.min(left, right);
        int max = Math.max(left, right);
        if (left < right) {
            return IntStream.rangeClosed(min, max).boxed().collect(Collectors.toList());
        } else {
            return IntStream.rangeClosed(min, max).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {

        throw new NotImplementedException();
    }

    public List<Integer> popEvenElments(int[] array) {

        return Arrays.stream(array).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {

        return Arrays.stream(array).reduce(0, (a, b) -> a = b);
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}

