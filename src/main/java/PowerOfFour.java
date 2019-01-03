public class PowerOfFour {
    String reverse(int num){
        if(num == 0)
            return "0";
        while(num != 1)
        {
            if(num % 4 != 0)
                return "Not a Power of 4";
            num = num / 4;
        }
        return "Power of 4";

    }
}
