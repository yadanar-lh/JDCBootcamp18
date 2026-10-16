void main() {
    Scanner input = new Scanner(System.in);
    double ticketPrice;
    double discount;
    double finalTotal;

    System.out.print("Enter customer age : ");
    int age = input.nextInt();

    System.out.print("Enter number of tickets : ");
    int tickets = input.nextInt();

    if(age <= 0 || tickets <= 0){
        System.out.println("Error : Invalid age or ticket count entered!");
    } else {
        if(age <= 12){
            ticketPrice = 5.0;
        } else if(age < 60){
            ticketPrice = 10.0;
        } else {
            ticketPrice = 7.0;
        }

        double subTotal = tickets * ticketPrice;

        if(tickets >= 5){
            discount = subTotal * 0.10;
            finalTotal = subTotal - discount;
            System.out.println("Price per ticket : $" + ticketPrice);
            System.out.println("Subtotal (Before Discount) : $" + subTotal);
            System.out.println("Group Discount (10% applied) : $" + discount);
        } else {
            discount = 0.0;
            finalTotal = subTotal;
            System.out.println("Price per ticket : $" + ticketPrice);
        }
        System.out.println("Total Amount Due : $" + finalTotal);

    }
}