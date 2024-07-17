public class findMaxAndMin {
    static class Pair{
        int min;
        int max;
    }

    public static Pair getMinMax(int[] arr, int i, int j){
        Pair minmax = new Pair();
        Pair minmaxLeft  = new Pair();
        Pair minmaxRight = new Pair();

        //1. Small Problem
        // if number of elements is equal to 1
        if(i == j){
            minmax.min = arr[i];
            minmax.max = arr[i];
            return minmax;
        }

        // if number of element is 2 then it is also considered as small problem
        else if(i == j - 1){
            if(arr[i] > arr[j]){
                minmax.max = arr[i];
                minmax.min = arr[j];
            }else{
                minmax.max = arr[j];
                minmax.min = arr[i];
            }
            return minmax;
        }

        //2. big problem case will solve it using Divide and Conquer
        else{
            //1. Divide 
            int mid = i + (j - i)/2;
            //2. Conquer
            minmaxLeft = getMinMax(arr, i, mid);
            minmaxRight = getMinMax(arr, mid + 1, j);
            //3. Combine
            if(minmaxLeft.min < minmaxRight.min){
                minmax.min = minmaxLeft.min;
            }
            else{
                minmax.min = minmaxRight.min;
            }

            if(minmaxLeft.max > minmaxRight.max){
                minmax.max = minmaxLeft.max;
            }
            else{
                minmax.max = minmaxRight.max;
            }
            return minmax;
        }
    }
    public static void main(String[] args) {
        int[] arr = {50,45,11,9,15,75,89,97};

        Pair minmax = getMinMax(arr, 0, arr.length - 1);
        System.out.println("The smallest in array: "+minmax.min);
        System.out.println("The largest in array: "+minmax.max);
    }
}
