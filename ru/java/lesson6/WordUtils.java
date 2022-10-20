package ru.java.lesson6;

import java.util.Arrays;

public class WordUtils {
    public static String reverseWords(String inputText) {
        String[] words = inputText.split(" ");
        Arrays.sort(words);
        return Arrays.toString(words);
    }

    private WordUtils() {

    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - " + WordUtils.reverseWords(""));
        System.out.println("Ввод одного слова - " + WordUtils.reverseWords("word"));
        System.out.println("Ввод двух слов - " + WordUtils.reverseWords("слова два zzz"));
    }
}
