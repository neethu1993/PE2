public class StudentAvgGrade {
    //getting the minimium value
    public int StudentMin(int num, int arr[]){
        int min = arr[0];
        for(int i = 0; i < num; i++){
            if(arr[i] < min){
                min = arr[i];

            }
        }
        return min;

    }
    //getting maximum value
    public int StudentMax(int num, int arr[]){
        int max = arr[0];
        for(int i = 0; i < num; i++){
            if(arr[i] > max){
                max = arr[i];

            }
        }
        return max;
    }
    //getting the average
    public float StudentAvg(int num , int arr[]){

        int sum = 0;
        if(num != 0) {
            for (int i = 0; i < num; i++) {
                sum += arr[i];
            }
            return (sum / num);
        }
        else
            return -1;
    }

}
