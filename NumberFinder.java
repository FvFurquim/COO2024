import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class NumberFinder {
    
    // Dado uma lista de numeros sem repeticoes "nums", encontre dois numeros que sua soma resulte em targetNum
    public static List<Integer> findSum(int targetNum, List<Integer> nums) {
		// Set com todos os elementos de nums.
		Set<Integer> otimoSet = new HashSet<>(nums);
		
        for (int num1 : nums) {
			
			int complemento = targetNum - num1;
			
			// Se o set contem o complemento, há a soma nesse set
			if (otimoSet.contains(complemento)) {
					
				return List.of(num1, complemento);
			}
        }
        
        return new LinkedList<>();
    }
}
