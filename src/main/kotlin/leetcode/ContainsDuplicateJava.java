package leetcode;

import java.util.HashSet;
import java.util.Set;
/**
 * Java implementation for checking duplicate number
 * */
public class ContainsDuplicateJava {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int num : nums) {
            if (uniques.contains(num)) {
                return true;
            }
            uniques.add(num);
        }
        return false;
    }
}
