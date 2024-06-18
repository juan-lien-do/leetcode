package org.example;

import org.example.ejercicios.easy.LengthOfLastWord;
import org.example.ejercicios.easy.MoveZeroes;
import org.example.ejercicios.easy.RemoveElement;
import org.example.ejercicios.hard.RegularExpressionMatching;
import org.example.ejercicios.medium.*;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] enteros = new int[]{1, 3, 2, 5, 8, 2, 2, 4, 3, 5};
        System.out.println(new RemoveElement().removeElement(enteros, 2));
        System.out.println(Arrays.toString(enteros));
    }
}
