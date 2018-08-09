// Java program to generate subsets of length k for a given set
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
class Combination{
 
	private static void getSubsets(List<GraphInfo.CustomVertex> superSet, int k, int idx, Set<GraphInfo.CustomVertex> current,List<Set<GraphInfo.CustomVertex>> solution) {
	    //successful stop clause
	    if (current.size() == k) {
	        solution.add(new HashSet<GraphInfo.CustomVertex>(current));
	        return;
	    }
	    //unsuccessful stop clause
	    if (idx == superSet.size()) return;
	    GraphInfo.CustomVertex x = superSet.get(idx);
	    current.add(x);
	    //"guess" x is in the subset
	    getSubsets(superSet, k, idx+1, current, solution);
	    current.remove(x);
	    //"guess" x is not in the subset
	    getSubsets(superSet, k, idx+1, current, solution);
	}

	public static List<Set<GraphInfo.CustomVertex>> getSubsets(List<GraphInfo.CustomVertex> superSet, int k) {
		List<Set<GraphInfo.CustomVertex>> res = new ArrayList<>();
	    getSubsets(superSet, k, 0, new HashSet<GraphInfo.CustomVertex>(), res);
	    return res;
	}
 
}
 
