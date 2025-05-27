package com.tpmsh.Arrays_Hashing.Medium;

import java.util.ArrayList;
import java.util.List;

public class StringUsageMedium {

    // Encode and Decode Strings
    // https://neetcode.io/problems/string-encode-and-decode
    /**
     *Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.
     * Please implement encode and decode
     */
    public String encode(List<String> strs) {
        char delimiter = ';';
        StringBuilder builder = new StringBuilder();
        for (String str : strs) builder.append(str.length()).append(delimiter).append(str);
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        int i = 0;
        char delimiter = ';';
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != delimiter) {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            decodedStrings.add(str.substring(i, j));
            i = j;
        }
        return decodedStrings;
    }
}





















