package com.ming.lucky;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 幸运生成器
 */
public class LuckyGenerator {

    public static void main(String[] args) {
        List<Integer> luckyListBefore = new ArrayList<>();
        List<Integer> luckyListAfter = new ArrayList<>();
        int[] luckPoolBefore = new int[35];
        int[] luckPoolAfter = new int[12];
        for (int i = 0; i < 35; i++){
            luckPoolBefore[i] = i + 1;
        }
        for (int i = 0; i < 12; i++){
            luckPoolAfter[i] = i + 1;
        }
        int random;
        int count = 0;
        while (count<5){
            random = (int)(Math.random()*100)%35;
            if (luckPoolBefore[random] != 0){
                luckPoolBefore[random] = 0;
                luckyListBefore.add(random+1);
                count++;
            }
        }
        Collections.sort(luckyListBefore);
        count = 0;
        while (count<2){
            random = (int)(Math.random()*100)%12;
            if (luckPoolAfter[random] != 0){
                luckPoolAfter[random] = 0;
                luckyListAfter.add(random+1);
                count++;
            }
        }
        Collections.sort(luckyListAfter);
        System.out.println("您的幸运号为：");
        for (Integer before:luckyListBefore){
            System.out.print(before + " ");
        }
        for (Integer after:luckyListAfter){
            System.out.print(after + " ");
        }
    }
}
