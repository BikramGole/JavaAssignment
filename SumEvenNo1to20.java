public class SumEvenNo1to20{
    public static void main(String[] args){
        int sumFor=0;
        for(int i=2;i<=20;i+=2){
            sumFor+=i;
        }
        System.out.println("Sum using for loop = "+sumFor);

        int sumWhile=0;
        int i=2;
        while(i<=20){
            sumWhile+=i;
            i+=2;
        }
        System.out.println("Sum using while loop = "+sumWhile);
    }
}
