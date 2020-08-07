package easy;

public class RobHouses{
    public static int rob(int[] nums) {
        int ifRobbedPrevious = 0;
        int ifDidntRobPrevious = 0;

        for(int i = 0; i < nums.length; i++){
            int rob = ifDidntRobPrevious + nums[i];

            int dontRob = Math.max(ifRobbedPrevious, ifDidntRobPrevious);

            ifRobbedPrevious = rob;
            ifDidntRobPrevious = dontRob;
        }

        return Math.max(ifRobbedPrevious, ifDidntRobPrevious);
    }
}