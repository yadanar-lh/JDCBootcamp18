void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Your Weight in Pounds : ");
    double weight = sc.nextDouble();
    sc.nextLine();

    System.out.print("Enter Your Height in Inches : ");
    double height = sc.nextDouble();
    sc.nextLine();

    double bmi = (weight * 703) / (height * height);

    if( bmi >= 18.5 && bmi <= 25 ){
        System.out.println("Your BMI " + bmi + " is normal.");
    } else if (bmi < 18.5 ){
        System.out.println("Your BMI " + bmi + " is underweight.");
    } else {
        System.out.println("Your BMI " + bmi + " is overweight.");
    }
    sc.close();
}