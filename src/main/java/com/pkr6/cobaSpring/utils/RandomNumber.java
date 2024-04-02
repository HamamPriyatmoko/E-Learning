/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pkr6.cobaSpring.utils;

/**
 *
 * @author ROG G512
 */
public class RandomNumber {

    public static long getRandom(long min, long max) {
        long number = min + (long) (Math.random() * (max - min));
        return number;
    }
}

