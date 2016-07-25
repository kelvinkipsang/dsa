public static int Divide(int num1, int num2) {
    if(num2 == 0){
        return num1;
    }
    return Divide(num2, num1%num2);
}
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter first number to find GCD");
    int num1 = scanner.nextInt();
    System.out.println("Please enter second number to find GCD");
    int num2 = scanner.nextInt();
    System.out.println("GCD of two numbers " + num1 +" and " + num2 +" is :" + Divide(num1,num2));
}
