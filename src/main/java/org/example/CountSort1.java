package org.example;

public class CountSort1 implements Sort {



    @Override
    public void sort() {
        // not needed but interface
    }

    @Override
    public String sort(String arr) {
        // Create a count array to store the frequency of each character
        int[] count = new int[26];

        // Count each character in the input string
        for (char c : arr.toCharArray()) {
            count[c - 'a']++;
        }

        // Build the sorted string
        StringBuilder sortedString = new StringBuilder(arr.length());
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                sortedString.append((char) (i + 'a'));
            }
        }

        return sortedString.toString();
    }

}


