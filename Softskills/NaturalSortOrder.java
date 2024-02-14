package Softskills;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NaturalSortOrder {
    public static List<String> naturalSort(List<String> strings) {
        strings.sort(Comparator.comparing(NaturalSortOrder::extractNumericParts).thenComparing(Comparator.naturalOrder()));
        return strings;
    }

    private static String extractNumericParts(String str) {
        StringBuilder numericParts = new StringBuilder();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            numericParts.append(matcher.group());
        }
        return numericParts.toString();
    }

    public static void main(String[] args) {
        List<String> testStrings = new ArrayList<>();
        testStrings.add("file1.txt");
        testStrings.add("file10.txt");
        testStrings.add("file2.txt");
        testStrings.add("file20.txt");
        testStrings.add("file3.txt");

        List<String> sortedStrings = naturalSort(testStrings);

        System.out.println("Sorted List:");
        for (String str : sortedStrings) {
            System.out.println(str);
        }
    }
}
