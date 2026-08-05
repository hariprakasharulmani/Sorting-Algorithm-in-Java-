// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,3,5};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int left, int right){
            if(left>=right) return;
            
            int mid = left+(right-left)/2;
            
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            
            int leftArray[] = new int[mid-left+1];
            int rightArray[] = new int[right-mid];
            
            int j = 0;
            for(int i=left;i<=mid;i++){
                leftArray[j++] = arr[i];
            }
            
            j = 0;
            for(int i=mid+1;i<=right;i++){
                rightArray[j++] = arr[i];
            }
            
            int p1 = 0;
            int p2 = 0;
            
            int[] result = new int[right-left+1];
            
            j=0;
            while(p1 < leftArray.length && p2 < rightArray.length){
                if(leftArray[p1]<=rightArray[p2]){
                    result[j++] = leftArray[p1];
                    p1++;
                }
                else{
                    result[j++] = rightArray[p2];
                    p2++;
                }
            }
            
            while(p1<leftArray.length){
                result[j++] = leftArray[p1];
                    p1++;
            }
            while(p2 < rightArray.length){
                result[j++] = rightArray[p2];
                    p2++;
            }
            for(int i=0;i<result.length;i++){
                arr[left + i] = result[i];
            }
    }
}
