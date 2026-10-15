void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Birth Month (1-12) : ");
    int birthMonth = sc.nextInt();
    sc.nextLine();

    while(birthMonth < 1 || birthMonth > 12){
        System.out.println("Pls enter the valid number");
        birthMonth = sc.nextInt();
        sc.nextLine();
    }

    System.out.println("Your birth month: " + birthMonth);
}