void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter seconds : ");
    int seconds = sc.nextInt();
    sc.nextLine();
    double ans = 0;


    if(seconds >= 86400){
        ans = seconds/86400;
        System.out.println("The numbers of days in seconds : " + ans);
    } else if (seconds >= 3600){
        ans = seconds/3600;
        System.out.println("The numbers of hours in seconds : " + ans);
    } else if (seconds >= 60){
        ans = seconds/60;
        System.out.println("The numbers of minutes in seconds : " + ans);
    } else {
        ans = seconds;
        System.out.println("The numbers of seconds : " + ans);
    }


}