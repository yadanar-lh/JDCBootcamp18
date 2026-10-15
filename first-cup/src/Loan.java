void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Salary : ");
    int salary = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter years on Job : ");
    int yearsOnJob = sc.nextInt();
    sc.nextLine();

    if(salary >= 30000){
        if(yearsOnJob >= 2){
            System.out.println("Great! You are qualified for Loan.");
        } else {
            System.out.println("You are on the way! Years on Job must have at least 2 years.");
        }
    } else {
        System.out.println("Sorry, Your salary must be greater than 30000 to qualify loan.");
    }


}