void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Penny : ");
    int penny = sc.nextInt();

    System.out.print("Enter Nickle : ");
    int nickle = sc.nextInt();

    System.out.print("Enter Dime : ");
    int dime = sc.nextInt();

    System.out.print("Enter Quarter :  ");
    int quarter = sc.nextInt();

    int subTotal = (penny * 1) + (nickle * 5) + (dime * 10) + (quarter * 25);

    if(subTotal == 100){
        System.out.println("Congratulations! You Got 1 Dollar! You Win the Game 🎉");
    } else if(subTotal > 100){
        System.out.println("Your amount is greater than 1 Dollar 🙂‍↔️");
    } else {
        System.out.println("Your amount is less than 1 Dollar 😂");
    }
}