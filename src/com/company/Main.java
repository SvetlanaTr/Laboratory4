package com.company;
import javafx.print.Collation;

import java.util.*;

import static java.util.Collections.sort;

public class Main {

    public static void main(String[] args) {

      // Integer[] arrayA = { 1, 2, 3, 4 , 5 };
        // Integer[] arrayB = { 4, 5, 6, 7 };

       // int sizeA = 0;  //размеры соответствующих массивов
        //int sizeB = 0;
       // int maxA, minA, maxB, minB;  //задают диапазон значений элементов
        // массивов

        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.print("Введите длинну множества А: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int arrayA[] = new int[size]; // Создаём массив int размером в size
        System.out.print("Введите элементы множества А: ");
        for (int i = 0; i < size; i++) {
            arrayA[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Полученое множество А = {");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + arrayA[i]); // Выводим на экран, полученный массив
        }System.out.print(" }");
        System.out.println();

        int arrayB[] =new int[size];
        System.out.print ("Полученое множество B = {");
        for (int i = 0; i < size; i++) {
            arrayB[i] = arrayA[i]*2;
            System.out.print (" " + arrayB[i]); // Выводим на экран, полученный массив
        }
        System.out.print(" }");
        System.out.println();
        //составляю соответствие
        System.out.println("Полученое функциональное соответствие");
        System.out.print(" Q = { ");
        for (int x = 0; x < size; x++ ){
            System.out.print("("+ arrayA[x]+","+arrayB[x]+")");
        }
        System.out.print(" }");
        System.out.println();
        // выполняю инверсию соответствия
        System.out.println("Инверсия соответствия");
        System.out.print(" Q^(-1) = { ");
        for (int z = size-1; z >= 0 ; z-- ){
            System.out.print("("+ arrayA[z]+","+arrayB[z]+")");
        }
        System.out.print(" }");
    }
}
