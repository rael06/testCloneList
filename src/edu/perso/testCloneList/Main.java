package edu.perso.testCloneList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int LIST_SIZE = 10;
    private List<String> originalList;

    private Main(List<String> strings) {
        originalList = strings;
        test(originalList);
    }

    private void test(List<String> list) {

        List<String> duplicatedList = cloneList(list);

        duplicatedList.remove(1);
        list.forEach(System.out::println);
        duplicatedList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Main(initList());
    }

    public List<String> cloneList(List<String> list) {
        return new ArrayList<>(list);
    }

    private static List<String> initList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < LIST_SIZE; i++) {
            list.add("Line n°" + (i + 1));
        }
        return list;
    }
}
