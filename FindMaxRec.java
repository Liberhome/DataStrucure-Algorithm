public class FindMaxRec {
    public static int getMax(int[] arr,int L, int R){
        if (L==R){
            return arr[L];
        }
        int mid=(L+R)/2;
        int maxLeft=getMax(arr,L,mid);
        int maxRight=getMax(arr,mid+1,R);
        return Math.max(maxLeft,maxRight);
    }

    public static void main(String[] args) {
        int[] arr={3,555,46,3,9,1,33};
        System.out.println(getMax(arr,0,arr.length-1));
    }
}
