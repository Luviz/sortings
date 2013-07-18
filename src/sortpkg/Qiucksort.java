package sortpkg;

import java.util.ArrayList;

public class Qiucksort {

	@SuppressWarnings("unchecked")
	static public <T> ArrayList<T> sortting(ArrayList<T> t){
		
		T piv;
		ArrayList<T> left ,right ,newT;
		left	= new ArrayList<T>();
		right 	= new ArrayList<T>();
		newT 	= new ArrayList<T>();
		
		if (!t.isEmpty()){
			if (t.size()==1){		//Finish check	-> one elem is sorted
				return t;
			}		
			piv = t.remove(t.size()/2);
			for (int i =0; i < t.size(); i++){			//sorting
				if (0 < ((Comparable<T>) piv).compareTo(t.get(i))){ //left
					left.add(t.get(i));
				}else{	//right
					right.add(t.get(i));
				}
			}	
			right	= sortting(right);	//sub sorting
			left 	= sortting(left);
				
			newT.addAll(left);		//building newT
			newT.add(piv);
			newT.addAll(right);
			return newT;
		}
		return new ArrayList<>();	
	}
}
