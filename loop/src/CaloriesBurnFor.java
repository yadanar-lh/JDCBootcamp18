void main() {
    double caloriesPerMinutes = 3.9;
    for(int minute = 10; minute <= 30; minute+=5){
        System.out.println("Calories Burnt %s minutes at %s calories."
                .formatted(minute,(minute*caloriesPerMinutes)));
    }

    System.out.println("While");

    int minute = 10;
    while(minute <= 30){
        System.out.println("Calories Burnt %s minutes at %s calories."
                .formatted(minute,(minute*caloriesPerMinutes)));
        minute+=5;
    }
}