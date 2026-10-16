void main() {
    Scanner input = new Scanner(System.in);
    String grade;

    System.out.print("Enter attendance percentage (%) : ");
    double attendanceRate = input.nextDouble();

    System.out.print("Enter examScore : ");
    double examScore = input.nextDouble();

    if(attendanceRate >= 75 ){
        if(examScore >= 90){
            grade = "A";
        } else if(examScore >= 80){
            grade = "B";
        } else if(examScore >= 70){
            grade = "C";
        } else if(examScore >= 60){
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Student Final Result : " + grade);
    } else {
        grade = "F";
        System.out.println("Student Final Result : " + grade + " (Failed: Attendance below 75%)");
    }
}