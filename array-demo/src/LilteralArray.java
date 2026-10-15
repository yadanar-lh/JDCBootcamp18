void main() {
    int[] nums = {1,2,3,4,5,6};

    int num1 = 5;
    double num2 = 3.0;

    num1 += num2; //Type conversion (+=)

    int sum = 0;
    sum += nums[0];
    sum += nums[1];
    sum += nums[2];
    sum += nums[3];
    sum += nums[4];
    sum += nums[5];
    System.out.println(sum);

    for(int i = 0; i < nums.length; i++){
        sum += nums[i];
    }

    int i = 0;
    while (i<nums.length){
        sum += nums[i];
        i++;
    }

    System.out.println(sum);

    int[] numbers = new int[6];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    numbers[4] = 5;
    numbers[5] = 6;
}