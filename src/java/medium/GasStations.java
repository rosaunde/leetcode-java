package medium;

public class GasStations {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int idx = 0;
        int total = 0;

        for(int i = 0 ; i < gas.length ; i++) {
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (sum < 0) {
                sum = 0;
                idx = -1;
            } else if (idx == -1) {
                idx = i;
            }
        }
        return total >= 0 ? idx : -1;
    }
}