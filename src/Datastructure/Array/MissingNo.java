package Datastructure.Array;

import java.util.stream.IntStream;

/**
 * Created by PRAVEEN SINGH on 2/14/2017.
 */
public class MissingNo {
    public static void main(String args[]){

        int sum=0;
        int idx=-1;

        int arr[] = IntStream.range(1,100).toArray();
//        for (int b : arr){
//            System.out.println(b);
//        }
        arr[55] = 0;
        arr[56] = 0;


        for(int i=0;i<99;i++){
            if(arr[i]==0)
                System.out.println(i);
            sum+=arr[i];
        }
        int count=((arr.length+1)*arr.length)/2;
        System.out.println(count-sum);
}
}
