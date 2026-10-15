void main() {
    Scanner sc = new Scanner(System.in);

    IO.print("Enter Speed : ");
    double speed = sc.nextDouble();

    IO.print("Enter HoursTravel : ");
    int traveledHours = sc.nextInt();

    int hours = 1;
    while(hours <= traveledHours){
        double distance = hours * speed;
        System.out.println("At %s hour, you have traveled %s miles.".formatted(hours,distance));
        hours++;
    }

}