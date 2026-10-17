void main() {
    Scanner input = new Scanner(System.in);

    double price;
    double totalAmount = 0.0;
    double averagePrice = 0.0;
    int itemCount = 0;

    System.out.print("Enter item price (or -1 to finish) : ");
    price = input.nextDouble();

    while(price != -1){
        itemCount += 1;
        totalAmount += price;

        System.out.print("Enter next item price (or -1 to finish) : ");
        price = input.nextDouble();
    }

    if(itemCount > 0){
        averagePrice = totalAmount/itemCount;
        System.out.println("Total items purchases : " + itemCount);
        System.out.println("Total amount payable : $" + totalAmount);
        System.out.println("Average price per item : $" + averagePrice);
    } else {
        System.out.println("No items were entered!");
    }


}