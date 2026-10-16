void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Celsius : ");
    double celsius = input.nextDouble();

    double fahrenheit = ((9.0 / 5.0) * celsius) + 32.0;

    System.out.println("Fahrenheit : %s °F".formatted(fahrenheit));
}