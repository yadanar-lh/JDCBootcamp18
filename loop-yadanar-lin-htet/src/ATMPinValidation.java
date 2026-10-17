void main() {
    final String CORRECT_PIN = "1234";
    final int MAX_ATTEMPTS = 3;
    int attempts = 0;
    boolean accessGranted = false;

    while(attempts < MAX_ATTEMPTS && accessGranted == false){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your 4-digit PIN : ");
        String enteredPin = input.nextLine();

        attempts += 1;

        if(enteredPin.equals(CORRECT_PIN)){
            accessGranted = true;
        } else {
            if(attempts < MAX_ATTEMPTS){
                System.out.println("Incorrect PIN! Attempts remaining : " + (MAX_ATTEMPTS - attempts));
            }
        }
    }

    if(accessGranted == true){
        System.out.println("PIN accepted. Access granted.");
    } else {
        System.out.println("Account Locked! Please contact your bank!");
    }
}