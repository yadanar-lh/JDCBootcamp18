void main() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter num1 : ");
    int num1 = input.nextInt();

    System.out.print("Enter num2 : ");
    int num2 = input.nextInt();

    while(num1 != num2){
        if (num1 > num2) {
            num1 -= num2;
        } else {
            num2 -= num1;
        }
    }

    System.out.println("Great Common Diviser : " + num1);
}