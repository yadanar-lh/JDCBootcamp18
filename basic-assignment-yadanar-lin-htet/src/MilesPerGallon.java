void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Miles Driven : ");
    double milesDriven = input.nextDouble();

    System.out.print("Enter Gallon Used : ");
    double gallonUsed = input.nextDouble();

    double mpg = milesDriven/gallonUsed;

    System.out.println("MPG : %.1f miles per gallon".formatted(mpg));

}