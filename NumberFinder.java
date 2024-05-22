import java.util.LinkedList;
import java.util.List;

public class NumberFinder {
    
    // Dado uma lista de numeros sem repeticoes "nums", encontre dois numeros que sua soma resulte em targetNum
    public static List<Integer> findSum(int targetNum, List<Integer> nums) {
        for (int num1 : nums) {
            for (int num2 : nums) {
                int sum = num1 + num2;
                if (sum == targetNum) {
                    return List.of(num1, num2);
                }
            }
        }
        
        return new LinkedList<>();
    }
}
