void main() {
    Scanner input = new Scanner(System.in);

    double classTotal = 0.0;
    double classAvg = 0.0;

    System.out.print("Enter the number of students : ");
    int numStudents = input.nextInt();

    System.out.print("Enter the number of subjects per student : ");
    int numSubjects = input.nextInt();

    for(int student = 1; student <= numStudents; student++){
        double studentTotal = 0.0;
        System.out.printf("""
                
                Student %d Score Entry:
                -----------------------
                """,student);

        for(int subject = 1; subject <= numSubjects; subject++){
            System.out.print("Enter score for subject %d : ".formatted(subject));
            double score = input.nextDouble();
            studentTotal += score;
        }

        double studentAvg = studentTotal/numSubjects;
        classTotal += studentAvg;
        System.out.println("###");
        System.out.println("Student %d Average Score : %.2f\n".formatted(student,studentAvg));
    }

    classAvg = classTotal/numStudents;
    System.out.printf("""
            =====================================
            Overall Class Average Score : %.2f
            """,classAvg);

}