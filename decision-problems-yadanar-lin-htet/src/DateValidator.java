void main() {
    Scanner input = new Scanner(System.in);

    int maxDays;
    boolean isLeapYear = false;

    System.out.print("Enter year (e.g, 2026) : ");
    int year = input.nextInt();

    System.out.print("Enter month (1-12) : ");
    int month = input.nextInt();

    System.out.print("Enter day (1-31) : ");
    int day = input.nextInt();

    if(month < 1 || month > 12){
        System.out.println("Invalid Date : Month must be between 1 and 12!");
    } else {
        if (month == 4 || month == 6 || month == 9 || month == 11){
            maxDays = 30;
        } else if (month == 2){
            if(year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))){
                isLeapYear = true;

                maxDays = 29;
            } else {
                isLeapYear = false;

                maxDays = 28;
            }
        } else {
            maxDays = 31;
        }

        if(isLeapYear){
            System.out.println("%d is a Leap Year 🎉".formatted(year));
        } else {
            System.out.println("%d is not a leap Year 🙅🏼‍♂️".formatted(year));
        }

        if(day >=1 && day <= maxDays){
            System.out.println("Valid Date : %d/%d/%d".formatted(day,month,year));
        } else {
            System.out.println("Invalid Date : Day must be between 1 and %d for month %d".formatted(maxDays,month));
        }
    }

}