package Datastructure.Array;

/**
 * Created by PRAVEEN SINGH on 2/14/2017.
 */
public class FindDuplicate {
    public static void main(String args[]){
        int arr[]={1,2,3,3,4,4};
        int element1;
        int element2;
        for(int i=0;i<arr.length-1;i++){
            element1=arr[i];
            element2=arr[i+1];
            if(element1==element2){
                System.out.println(element2);
        }
    }}
}
