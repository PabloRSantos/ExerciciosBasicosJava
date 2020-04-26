/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Artur
 */
public class JavaApplication45 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] v = {
            100, 200, 300,
            400, 500, 600,
            700, 800, 900, 1000
        };
        for (int i = 0; i < (v.length - 1); i++) {

           
            int j = r.nextInt(v.length);

            //troca o conteúdo dos índices i e j do vetor
            int temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
        

        for (int n = 0; n < v.length; n++) {
            System.out.println(v[n]);
        }

    }
}
