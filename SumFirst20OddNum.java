public class SumFirst20OddNum{
    public static void main(String[] args){
        int sum=0;
        for(int i=0;i<=40;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }

        int j=0,sum2=0;
        while(j<=40){
            if(j%2!=0){
                sum2+=j;
            }
            j++;
        }
        System.out.println(sum);
        System.out.println(sum2);
    }
}
