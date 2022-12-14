//ch04-1
//水仙花數
public class Main {
    public static void main(String[] args) {
        for (int i = 100; i<999; i++){
            System.out.println(i);
            int units = i % 10;  //個
            int tens = (i % 10) % 10; //十
            int hundreds = (i / 10) % 10; //百
            int sum =(int) (Math.pow(units,3) + Math.pow(tens,3) + Math.pow(hundreds,3));

            if (sum == i){
                System.out.println(i);
            }
        }
    }
}
