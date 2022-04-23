
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        //int[] array = {3, 1, 5, 99, 3, 12};
        int[] array = {-1, 3, 1, 2};
        indexOfSmallestFrom(array,1);
        sort(array);
    }

    public static int smallest(int[] array){
        int smallest=-9999;
        if(array.length==0){
            return smallest;
        }
        smallest=array[0];
        for(int number:array){
            if(number<=smallest){
                smallest=number;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
       int smallest= smallest(array);
       if(array.length==0){
            return -9999;
        }
       for(int i=0;i<array.length;i++){
           if(array[i]==smallest){
               return i;
           }
       } 
       return -9999;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        
        if(table.length==0){
            return -9999;
        }
        int smallest=table[startIndex];
        int index=startIndex;
        for(int i=startIndex;i<table.length;i++){
            if(table[i]<=smallest){
                index=i;
                smallest=table[i];
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2){
        if((index1<array.length)&&(index2<array.length)){
            int temp=array[index1];
            array[index1]=array[index2];
            array[index2]=temp;
            
        }
    }
    public static void sort(int[] array){
        
        for(int i=0;i<array.length;i++){
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}

