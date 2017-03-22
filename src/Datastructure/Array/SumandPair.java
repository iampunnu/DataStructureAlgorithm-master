package Datastructure.Array;

/**
 * Created by PRAVEEN SINGH on 2/14/2017.
 */
public class SumandPair {
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,6,7,5};
        int value=6;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==value){
                    System.out.println(arr[i]+","+arr[j]);
                }

            }
        }
    }
}
