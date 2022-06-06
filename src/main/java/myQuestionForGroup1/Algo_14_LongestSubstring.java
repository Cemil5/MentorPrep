package myQuestionForGroup1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Comparator.comparing;

/*
Question #14
Longest Substring Without Duplication
Difficulty : Medium Category : Strings
Write a function that takes in a string and returns its longest substring without duplicate characters.
You can assume that there will only be one longest substring without duplication.
Sample Input string = "clementisacap"
Sample Output = "mentisac"
Sample Input string = "abcabcbb"
Sample Output = "abc"
Sample Input string = "cydeo"
Sample Output = "cydeo"


 */
public class Algo_14_LongestSubstring {
    @DataProvider(name = "input")
    public Object[][] inputMethod() {
        return new Object[][]{
                {"abcabcbb", "abc"},
                {"clementisacap", "mentisac"},
                {"pwwkew", "wke"},
                {"asljlj", "aslj"},
                {"ohomm", "hom"},
                {"bbbbb", "b"},
                {"Cydeo", "Cydeo"},
                {"au", "au"},
                {"aab", "ab"},
                {" ", " "},
                {"", ""},
        };
    }

    @Test(dataProvider = "input")
    public void test(String input, String expected) {
        System.out.println(input + " " + expected);
        Assert.assertEquals(longestNonDuplicateString(input), expected);
        // Assert.assertEquals(bestLongestSubstringWithoutDuplication(input), expected);
        //  Assert.assertEquals(removeDuplicate(input), expected);
    }

    public String longestNonDuplicateString (String text){  // Gadir

        String addChar = "";
        String result = "";
        int maxLength = 0;
        for (int i = 0; i < text.length(); i++) {

            if (addChar.contains(text.charAt(i) + "")) {
                addChar = addChar.substring(addChar.indexOf(text.charAt(i)) + 1) + text.charAt(i);
                continue;
            }
            addChar += text.charAt(i);

            if (addChar.length() > maxLength) {
                maxLength = addChar.length();
                result = addChar;
            }
        }
        return result;
    }


    public static String longestSubstringWithNestedLoop (String str) {     // dilara
        int max = 0;
        String longest = ""; // will hold the longest substring
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                if (!(temp.contains(str.charAt(j) + ""))) { // forms the temp substring
                    temp += str.charAt(j);
                } else break; // breaks out of the inner loop when detects a duplicate
            }
            if (temp.length() > max) { // compares the substring length to max substring
                max = temp.length();
                longest = temp;
            }
        }
        return longest;
    }

    // my final solution with String                        // best solution for me
    public static String longestSubstring(String str) {
        if (str.length() <= 1) return str;
        String substr = "";
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!substr.contains(ch + "")) {
                substr += ch;
            } else {
                if (longest.length() < substr.length()) {
                    longest = substr;
                }
                substr = substr.substring(substr.indexOf(ch) + 1) + ch;
            }
        }
        if (longest.length() < substr.length()) {
            longest = substr; // checks if longest contains the substr with last character of str
        }
        return longest;
    }

    public static String longestSubstring2(String str) {
        if (str.isEmpty()) return "";
        int longestStart = 0;
        int longestEnd = 1;
        int currentStartIdx = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.substring(0, i).contains(c + "")) {
                currentStartIdx = Math.max(currentStartIdx, str.substring(0, i).lastIndexOf(c + "") + 1);
            }
            // if you find a longer substring update longest here!!!
            if (longestEnd - longestStart < i + 1 - currentStartIdx) {
                longestEnd = i + 1;
                longestStart = currentStartIdx;
            }
        }
        return str.substring(longestStart, longestEnd);
    }

    // my solution with Map
    public static String myLongestSubstringMap(String str) {
        if (str.length() == 1) return str;
        int count = 0;
        String substr = "";
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!substr.contains(c + "")) {
                substr += c;
            } else {
                int ind = substr.indexOf(c);
                map.put(substr, substr.length());
                if (ind != substr.length()) substr = substr.substring(ind + 1) + c;
                else substr = "" + c;
            }
        }
        if (!map.containsKey(substr)) {     // checks if map contains the substr with last character of str
            map.put(substr, substr.length());
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                substr = entry.getKey();
            }
        }
        return substr;
    }

    // O(n) time | O(min(n, a)) space
    public static String longestSubstringWithoutDuplication(String str) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int longestStart = 0;
        int longestEnd = 1;
        int currentStartIdx = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (lastSeen.containsKey(c)) {
                //               currentStartIdx = Math.max(currentStartIdx, lastSeen.get(c) + 1);
//                System.out.println(currentStartIdx);
                currentStartIdx = Math.max(currentStartIdx, str.substring(0, i).lastIndexOf(c + "") + 1);
//                System.out.println(currentStartIdx);
            }
            // if you find a longer substring update longest here!!!
            if (longestEnd - longestStart < i + 1 - currentStartIdx) {
                longestEnd = i + 1;
                longestStart = currentStartIdx;
            }
            lastSeen.put(c, i);
        }
        String result = str.substring(longestStart, longestEnd);
        return result;
    }


    public static String maxSubstringFinder(String str) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<String> subStrings = new ArrayList<>();
        if (str.isEmpty()) return "";
        for (int i = 0; i < str.length(); i++) {                 // ---------O(n)------------------------------------------
            if (map.containsKey(str.charAt(i))) {              // if iteration finds any dublicate char at this index....
                subStrings.add(result.toString());            // Add fabricated String to ArrayList....................
                result.setLength(0);                          // Clear String Builder........
                i = map.get(str.charAt(i));                   // Move i to first occurance of dublicated character.....
                map.clear();                                  // Clear HashMap.......................
            } else {
                result.append(str.charAt(i));                 // Until a dublicate exist...move pointer rigth and append new character
                map.put(str.charAt(i), i);                    // Put Character with its index..........................
                if (i == str.length() - 1)
                    subStrings.add(result.toString());  // edge case -> end of String and no dublicate character
            }
        }
        System.out.println(subStrings);
        return subStrings.stream().max(comparing(String::length)).get();
    }

    private static String getLongestNonDupSubstringMySol1(String source) {
        ArrayList<SubString> subStrings = new ArrayList<>();

        subStrings.add(new SubString(source.charAt(0), 0));

        for (int i = 1; i < source.length(); i++) {
            char currentChar = source.charAt(i);
            int finalI = i;
            subStrings.forEach(s -> s.addWithControl(currentChar, finalI));
            subStrings.add(new SubString(currentChar, finalI));
        }

        subStrings.sort((o1, o2) -> o2.getLength() > o1.getLength() ? 1 : -1);

        return subStrings.get(0).substring;
    }
}

class SubString {
    public String substring;
    public int startIndex, endIndex;
    public char startingChar;
    public boolean isClosed = false;

    public SubString(char startingChar, int startIndex) {
        this.startingChar = startingChar;
        this.startIndex = startIndex;
        substring = String.valueOf(startingChar);
    }

    public void addWithControl(char charToAdd, int index) {
        if (!isClosed) {
            isClosed = substring.contains(String.valueOf(charToAdd));

            if (!isClosed) {
                endIndex = index;
                substring += charToAdd;
            }
        }
    }

    public int getLength() {
        return endIndex - startIndex + 1;
    }
}

