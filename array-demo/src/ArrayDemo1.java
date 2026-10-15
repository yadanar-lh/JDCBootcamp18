void main() {
    Scanner sc = new Scanner(System.in);
    int[] numsArray = new int[5];
    int i=0;
    while(i < numsArray.length){
        System.out.print("Enter Number : ");
        numsArray[i] = sc.nextInt();
        i++;
    }
    System.out.println("You Entered : 1");
    for(int j = 0; j<numsArray.length;j++){
        System.out.println(numsArray[j]);
    }
}