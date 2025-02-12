public class Main{
    public static void main(String[] args){
        IntegerSum sumOfTwo = (a,b) -> a + b;
        System.out.println("Sum of 5 and 10 is " + sumOfTwo.sum(5, 10));
    }
}

interface IntegerSum {
    int sum(int a, int b);
}