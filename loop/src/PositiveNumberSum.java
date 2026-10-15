void main() {
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    IO.print("Enter Positive Number First : ");
    int num = sc.nextInt(); //counter controll variable

    while( num >= 0){
        sum += num;
        System.out.print("Enter positive number(negative number to quit): ");
        num = sc.nextInt();
    }

    System.out.println("Sum : " + sum);

}
