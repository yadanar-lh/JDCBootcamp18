void main() {
    add(2);
    add(3);
    add(6);

    System.out.println(Arrays.toString(numbers));
    System.out.println("Element : " + element);

}

int[] numbers = new int[10];
int index = 0;
int element = 0;
void add(int num){
    numbers[index++] = num;
    element++;
}