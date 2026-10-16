void main() {
    Scanner input = new Scanner(System.in);
    double baseBill;
    double surcharge;
    double totalBill;

    System.out.print("Enter total electricity units consumed : ");
    double units = input.nextDouble();

    if(units <= 100){
        baseBill = units * 35;
    } else if (units <= 200){
        baseBill = (100 * 35) + ((units - 100) * 50);
    } else {
        baseBill = (100 * 35) + (100 * 50) + ((units - 200) * 70);
    }

    if(baseBill > 50000){
        surcharge = baseBill * 0.05;
        totalBill = baseBill + surcharge;
        System.out.println("Base Bill : " + baseBill + " MMK");
        System.out.println("Surcharge (5%) : " + surcharge + " MMK");
    } else {
        surcharge = 0;
        totalBill = baseBill;
        System.out.println("Base Bill : " + baseBill + " MMK");
    }
    System.out.println("Total Electricity Bill Payable : " + totalBill + " MMK");
}