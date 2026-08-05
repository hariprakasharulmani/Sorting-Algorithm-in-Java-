// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,3,5};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int left, int right){
        if(left<right){
            int pIndex = partition(arr,left,right);
            quickSort(arr,left,pIndex-1);
            quickSort(arr,pIndex+1,right);
        }
    }
    public static int partition(int[] arr,int left,int right){
        int i=left;
        int j = right;
        int pivot = arr[left];
        while(i<j){
            while(i<=right && arr[i]<=pivot){
                i++;
            }
            while(j>=left && arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;
        return j;
    }
}
