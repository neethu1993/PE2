public class IntegerFactorial {
    public String getFactorial(int num){
     String string ="";
     int factInitial = 1;
     //logic for fcatorial
     for(int i=1 ; i <= num ; i++){
         factInitial = factInitial * i;
         string = string +"The factorial of" +" "+ i +" "+"is" +" "+ factInitial+"\n";
     }
     return string;

    }
}
