void main() {
    int numShares = 1000;
    double buyPrice = 32.87;
    double sellPrice = 33.92;
    double commissionRate = 0.02;

    double amountPaid = numShares * buyPrice;
    double buyCommission = amountPaid * commissionRate;
    double totalPaid = amountPaid + buyCommission;

    double amountSold = numShares * sellPrice;
    double sellCommission = amountSold * commissionRate;
    double totalReceived = amountSold - sellCommission;

    double profitOrLoss = totalReceived - totalPaid;

    System.out.println("Amount Paid : $%s".formatted(amountPaid));
    System.out.println("BuyCommission : $%s".formatted(buyCommission));
    System.out.println("Amount Sold : $%s".formatted(amountSold));
    System.out.println("Sell Commission : $%s".formatted(sellCommission));

    if (profitOrLoss > 0) {
        System.out.println("Joe Got the Profit of $%.1f".formatted(profitOrLoss));
    } else if (profitOrLoss < 0){
        System.out.println("Joe Got the Loss of $%.1f".formatted(profitOrLoss));

    } else {
        System.out.println("No Profit or Loss!");
    }
}