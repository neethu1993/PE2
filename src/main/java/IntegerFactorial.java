public class IntegerFactorial {
    public String getFactorial(int num){
     String string =" ";
     int factInitial = 1;
     for(int i=0 ; i <= num ; i++){
         factInitial = factInitial * 1;
         string = string + "The factorial of" +" "+ i +" "+ "is" +" "+ factInitial + "\n";
     }
     return string;

    }
}
