/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buckedSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mikey
 */
public class bucked {
public BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
public String entrada;

public int[] leerArreglo(int n) throws IOException{
    int[] a = new int[n]; 
    System.out.println("================================");
    for(int i =0; i<a.length; i++){
        System.out.println("Escriba el valor del arreglo [ " + i + " ]: ");
        entrada = bufer.readLine();
        a[i] = Integer.parseInt(entrada);
    }
    return a;
}

public void imprimirArreglo(int[]a){
    System.out.println("============================");
    System.out.println("Imprimiendo arreglo: ");
    for(int i = 0; i<a.length; i++){
        System.out.printf("%4d", a[i]);
        System.out.println();
    }
}
}
