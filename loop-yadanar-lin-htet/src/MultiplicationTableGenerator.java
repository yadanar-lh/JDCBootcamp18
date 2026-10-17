void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number for the multiplication table : ");
    int number = input.nextInt();

    System.out.print("Enter the maximum multiplier limit (e.g., 12) : ");
    int limit = input.nextInt();

    System.out.println("Multiplication Table for " + number + ":");
    System.out.println("----------------------------");

    for(int counter = 1; counter <= limit; counter++){
        int product = number * counter;
        System.out.println("%d * %d = %d".formatted(number,counter,product));
    }
}