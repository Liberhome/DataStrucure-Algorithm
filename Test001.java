import java.util.Arrays;

public class Test001 {
    //随机生成数组
    public static int[] generateRandomArray(int size,int value){
        int[] arr =new int[((int) ((size + 1) * Math.random()))];
        for (int i = 0; i < arr.length; i++) {
            //这样可以随机产生正负数
            arr[i]=(int)((value+1)*Math.random())-(int)(value*Math.random());
        }
        return arr;
    }

    //Absolutely right method
    public static void rightMethod(int[] arr){
        Arrays.sort(arr);//这样一个系统提供的函数(绝对正确喽~
    }

    //大样本测试 而且数组长度较短 几乎穷尽了所有情况 这就是对数器
    public static void main(String[] args) {
        int testTime=500000;
        int size=10;
        int value=100;//(value再+—100之间)
        boolean succeed=true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1=generateRandomArray(size,value);
            int[] arr2=copyArray(arr1);
            int[] arr3=copyArray(arr1);
            bubbleSort(arr1);
            rightMethod(arr2);
            if(!isEqual(arr1,arr2)){
                succeed=false;
                printArray(arr3);
                break;
            }
        }
        System.out.println(succeed?"Nice":"Fu*k");
    }

    private static void printArray(int[] arr) {
        if (arr==null){
            return ;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    //copy数组
    public static int[] copyArray(int[] arr){
        if (arr==null){
            return null;
        }
        int[] res=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i]=arr[i];
        }
        return res;
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int e = arr.length - 1; e > 0; e--) {
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    //判断两个数组是否相等
    public static boolean isEqual(int[] arr1,int[] arr2){
        if ((arr1==null&&arr2!=null)||(arr2==null&&arr1!=null)){
            return false;
        }
        if (arr1==null&&arr2==null){
            return true;
        }
        if (arr1.length!=arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}











