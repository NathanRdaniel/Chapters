public class sheep{
    public static void main(String[] args) {
        double n = 1;   
        for(int t = 0; t <= 25; t++){
                n = n * 220/(1+ 10 * 0.83);
                System.out.println(n);
        }
    }
}