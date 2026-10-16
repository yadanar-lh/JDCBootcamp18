void main() {
    final double SQ_FEET_PER_ACRE = 43560.0;
    Scanner input = new Scanner(System.in);

    System.out.print("Total Square Feet : ");
    double totalSquareFeet = input.nextDouble();

    double acres = totalSquareFeet/SQ_FEET_PER_ACRE;

    System.out.println("Total Acres : %s acres".formatted(acres));

}