/*
Begin
    Declare Integer balance;
    set balance = 60 lakh;

    If balance3 >= 60 lakh:
        Display "Buy Iphone.";
    Else:
        Display "Buy Android Phone.";
    EndIf

End
 */

void main() {
    int balance = 6000000;

    if(balance >= 6000000){
        IO.println("Buy an Iphone.");
    } else {
        IO.println("Buy a Android Phone.");
    }
}