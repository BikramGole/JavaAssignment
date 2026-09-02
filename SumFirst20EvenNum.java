//Wap to sum of the first 20 even number

public class SumFirst20EvenNum{
    public static void main(String[] args){
        int i,sum=0;
        for(i=1;i<=20;i++){
            sum+=2*i;
        }
        System.out.println("The sum of first 20 Even Number is " + sum);
    }
}
