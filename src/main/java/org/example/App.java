package org.example;

import org.example.ejercicios.easy.LengthOfLastWord;
import org.example.ejercicios.easy.MoveZeroes;
import org.example.ejercicios.hard.RegularExpressionMatching;
import org.example.ejercicios.medium.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println(new RegularExpressionMatching().isMatch("aa", "a*"));
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
