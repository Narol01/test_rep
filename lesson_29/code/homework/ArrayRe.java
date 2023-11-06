package homework;

public class ArrayRe {

    double arrayArrage(int[] array){
        double count=0;
        double sum=0;
        for (int i = 0; i < array.length; i++){
            if(array[i]%2==0){
                count++;
                sum +=array[i];
            }
        }
        return sum/count;
    }
}
