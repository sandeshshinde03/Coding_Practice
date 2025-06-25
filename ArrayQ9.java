//Calculate the sum of the elements of the array
//Find the average of all elements in an array
public class ArrayQ9 {
    public static int arrCalculate(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static float avg(int [] arr){
        int addition=arrCalculate(arr);
        int length=arr.length;
        float avg=addition/length;
        return avg;
    }
    public static void main(String []args){
        int [] arr={1,2,3,4,6,5,7,8,9};
        int sum=arrCalculate(arr);
        System.out.println("Sum of array of elements: "+sum);
        float average=avg(arr);
        System.out.println("Average of all elements in array: "+average);
    }
}
