void main() {
    int hour = 0;
    int minutes = 0;
    int seconds = 0;

   while(hour < 24){

       while(minutes < 60){

           while (seconds < 60){
               IO.println("%s:%s:%s".formatted(hour,minutes,seconds));
               seconds++;
           }
           seconds = 0;
           minutes++;
       }
       minutes =0;
       hour++;
   }
}