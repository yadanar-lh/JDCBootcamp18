void main() {
    int totalRainFall = 0;
    Scanner input = new Scanner(System.in);
    for(int year=1; year <= 1; year++){
        for(int month =1; month <= 12; month++){
            IO.print("Enter %s month's rainfall: ".formatted(month));
            int rainfall = input.nextInt();
//            System.out.println(month + " month's rainfall is : " + rainfall);
            totalRainFall += rainfall;
        }
    }

    int avgRainfall = totalRainFall/12;
    IO.println("A Total Rainfall is : " + totalRainFall);
    IO.println("Avg Rainfall is : " + avgRainfall);
    input.close();
}