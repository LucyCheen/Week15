//氣泡排序演算法
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int turn = 1;
        for (int i=arr.length-1 ; i>0 ; i--){
            int earlrStop = 1;
            for (int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){    //由小到大
                    int temp = arr[j];  //temp暫放 兩數交換
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    earlrStop = 0;
                }
            }
            if(earlrStop==1) break;
            for (int k = 0; k < arr.length; k++) {
                if(k==(arr.length-1-turn))
                    System.out.print(arr[k] + "[");
                else if (k==arr.length-1)
                    System.out.print(arr[k] + "]");
                else
                    System.out.print(arr[k] + " ");
            }
            System.out.println();
            turn++;
        }
    }
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1,};
        bubbleSort(array);
        for (int i:array)
            System.out.print(i + " ");
    }
}
