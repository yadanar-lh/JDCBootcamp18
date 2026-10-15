void main() {
    int [] numbers = {2,4,7,1,5,11};
    int searchNumber = 11;
    int index = linearSearch(numbers, searchNumber);
    System.out.println(searchNumber + " found at : " + index);

}

int linearSearch(int[] numbers, int searchNumber){
    int i = 0;
    while(i < numbers.length && numbers[i] != searchNumber){
        i++;
    }
    if(i == numbers.length){
        return -1;
    } else{
        return i;
    }

}