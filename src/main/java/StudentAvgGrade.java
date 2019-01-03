public class StudentAvgGrade {
    public int StudentMin(int num, int arr[]){
        int min = arr[0];
        for(int i = 0; i < num; i++){
            if(arr[i] < min){
                min = arr[i];
                return min;
            }
        }
        return -1;
    }
    public int StudentMax(int num, int arr[]){
        int max = arr[0];
        for(int i = 0; i < num; i++){
            if(arr[i] > max){
                max = arr[i];
                return max;
            }
        }
        return -1;
    }
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
