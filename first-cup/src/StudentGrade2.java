void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Student Grade : ");
    int grade = sc.nextInt();

    if(grade >= 90 && grade <= 100){
        System.out.println("Excellent");
    } else if(grade >= 80){
        System.out.println("Good Job");
    } else if(grade >= 60){
        System.out.println("You did well");
    } else {
        System.out.println("Sorry, You Failed!");
    }
    sc.close();
}