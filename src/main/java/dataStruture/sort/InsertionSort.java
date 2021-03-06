package dataStruture.sort;

/**
 * 插入排序
 */
public class InsertionSort implements ISort{
    @Override
    public void sort(int[] a) {
        int j;

        for (int i = 0 ; i < a. length; i++){
            int temp = a[i];
            for(j = i; j>0 && temp < a[j-1]; j--){
                a[j]= a[j-1];
            }
            a[j] = temp;
        }
    }
}
