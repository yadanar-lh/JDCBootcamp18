void main() {
    Scanner sc = new Scanner(System.in);
    IO.print("Enter student grade : ");
    int grade = sc.nextInt();

    if(grade < 60){
        IO.println("Sorry, you failed!");
    } else if(grade < 80) {
        IO.println("You did very well!");
    } else if (grade < 90){
        IO.println("Good Job!");
    } else {
        IO.println("Excellent!");
    }

    sc.close();
}