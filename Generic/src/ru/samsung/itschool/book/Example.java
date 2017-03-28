package ru.samsung.itschool.book;

class Pair<K, V>{
    public K k;
    public V v;
    public Pair(K k, V v)
    {
            this.k = k;
            this.v = v;
    }
}

public class Example{
    public static Pair<Integer, Integer> getMinAndMax(Integer[] arr){
            if (arr == null || arr.length == 0){
                    return new Pair<Integer, Integer>(null, null);
            }

            Integer max = arr[0];
            Integer min = arr[0];
            for (int i = 1; i < arr.length; i++){
                    if (arr[i] > max) max = arr[i];
                    if (arr[i] < min) min = arr[i]; 
            }

            return new Pair<Integer, Integer>(min, max);
    }


    public static void main(String [] args){

            Integer[] arr = new Integer[]{1, 2, 3, 10, -4, -10, 0, 57, 5, 3};

            Pair<Integer, Integer> result =  getMinAndMax(arr);

            System.out.println("Minimum in integer array " + result.k);
            System.out.println("Maximum in integer array " + result.v);
    }
}