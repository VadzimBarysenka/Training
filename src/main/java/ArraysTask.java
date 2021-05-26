public class ArraysTask {

    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] nums;
        nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 5;
        nums[4] = 8;
        int[][] multiNums = {{9, 8, 7, 6}, {5, 4, 2, 1}};
        int[][] multiArr = new int[2][2];
        multiArr[0][0] = 1;
        multiArr[0][1] = 3;
        multiArr[1][0] = 5;
        multiArr[1][1] = 9;
        System.out.println(multiArr[0][0]);
    }

}
