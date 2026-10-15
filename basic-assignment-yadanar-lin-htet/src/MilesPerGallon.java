void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Miles Driven : ");
    int milesDriven = input.nextInt();

    System.out.print("Enter Gallon Used : ");
    int gallonUsed = input.nextInt();

    int mpg = milesDriven/gallonUsed;

    System.out.println("MPG : %s miles per gallon".formatted(mpg));

}