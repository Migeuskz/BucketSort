/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buckedSort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import static java.util.Objects.hash;

/**
 *
 * @author Mikey
 */
public class TestingBucked {
    
    
    public static void main(String[] args) {
     int globalMax  = 21;//numero del arreglo mas Grande
     int globalMin = 1;//numero mas pequeño del arreglo
     int noOfBuckets = 5;//numero de buckets que vamos a definir
     
     int arreglo[] = {11,9,21,8,17,19,13,1,2};
     
     for(int j =0; j<arreglo.length; j++){
         System.out.print(arreglo[j] + " - ");
     }
     
     int rango = globalMax -globalMin;//calculasmos el ranglo primero restamos el maximo con el minimo
     int buckedRango = (int)Math.ceil(rango)/noOfBuckets;//dividimos el resultado de la resta por eñ numero de buckets que hemos definino
     
     List<Integer>[]buckets = new List[noOfBuckets];//esta pripiedad es un arreglo de listas, que será igual al numero de buckets definidos
     
     for(int i = 0; i<noOfBuckets; i++){//con este ciclo recorremos el arreglo de la lista y lo inicializamos con un index para cada bucked con una LinkedList
         buckets[i] = new LinkedList<>();
     }
     
     for(int num : arreglo){//aquí las inicializamos la listas con sus index: 0,1,2,3,4. por que ya se inicializo con una lista
         buckets[hash(num,buckedRango,noOfBuckets)].add(num);/*aqui se empujr o añadir los numeros del arreglo a las listas,
         pero se necisita una condición para acomodar  esos numeros. Por ende se utiliza una hash function.
         hash function: Primero llama a buckets(es el arreglo).
         (num,buckedRango,noOfBuckets) =  este codigo determina como se íra acomodando nuestro codigo dependiendo a como agreguemos ese rangon o numero con el 
         .add(num).
         */
     }
     
     for(List<Integer> bucket : buckets){//este ciclo ordena los buckets con sus linkList
         Collections.sort(bucket);//esto sucede con esta función 
     }
     
     int i = 0;
     
     for(List<Integer>bucket : buckets){//los separo y los uno al arreglo inicial, es decir lor ordeno en su forma correcta
         for(int num : bucket){
             arreglo[i++] = num;
         }
     }
     
        System.out.println("");
        for(int j = 0; j<arreglo.length; j++){
            System.out.println(arreglo[j] + " -  ");
        }
    }
    
    public static int hash(int num, int hashValue, int numberOfBuckets){//Esta es la hash Function 
        /*Su parametros son: 
        num = al elemento o numero que solicito.
        hashValue = que es el buckedRango es decir el numero de elementos que va a tener cada bucket.
        numberOfBuckets = el numero de buckets que ya teniamos*/
        int bucketNumber = num / hashValue;//Inicializa el bucket para saber en donde pondre cada elemento
        if(bucketNumber == numberOfBuckets){
            bucketNumber--;
        }
        return bucketNumber;
   }
}
