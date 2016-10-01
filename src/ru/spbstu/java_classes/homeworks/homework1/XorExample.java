package ru.spbstu.java_classes.homeworks.homework1;


import java.util.Arrays;

public class XorExample {

    public static void main(String[] args) {
        int[] bytes = {41, 75, 17, 53, 28};
        int[] encoded = new int[bytes.length];
        int[] decoded = new int[bytes.length];

        encoded[0] = bytes[0];
        for(int i = 1; i < bytes.length; i++)
            encoded[i] = bytes[i] ^ encoded[i - 1];

        decoded[0] = encoded[0];
        for(int i = 1; i < encoded.length; i++)
            decoded[i] = encoded[i] ^ encoded[i - 1];

        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(encoded));
        System.out.println(Arrays.toString(decoded));
    }

}
