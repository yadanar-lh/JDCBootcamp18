void main() {
    Scanner sc = new Scanner(System.in);
    int packagePrice = 99;

    System.out.print("Enter Numbers of Package : ");
    int packages = sc.nextInt();
    double discountRate = 0.0;

    if(packages >=100){
        discountRate = 0.5;
    } else if (packages >= 50 && packages < 100){
        discountRate = 0.4;
    } else if (packages >= 20 && packages < 50){
        discountRate = 0.3;
    } else if (packages >= 10 && packages < 20){
        discountRate = 0.2;
    } else {
        discountRate = 0.0;
    }

    double totalAmount = packagePrice * packages;
    double discountAmount = totalAmount * discountRate;
    double finalTotalAmount = totalAmount - discountAmount;

    System.out.println("Total Amount : $" + totalAmount);
    System.out.println("Discount Amount : $" + discountAmount);
    System.out.println("Discount Rate : " + discountRate);
    System.out.println("Final Amount : $"+ finalTotalAmount);
}