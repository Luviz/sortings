package sortpkg;

import java.util.ArrayList;

public class Qiucksort {

	@SuppressWarnings({ "unchecked", "null" })
	static public <T> ArrayList<T> sortting(ArrayList<T> t){
		System.out.print("-");
		T piv;
		ArrayList<T> left ,right ,newT;
		left	= new ArrayList<T>();
		right 	= new ArrayList<T>();
		newT 	= new ArrayList<T>();
		
		if (!t.isEmpty()){
			piv = t.get(0);
			for (T a: t){
				if (0<((Comparable<T>) piv).compareTo(a)){ //left
					left.add(a);
				}else{	//right
					right.add(a);
				}
			}
			System.out.println(left.toString());
			System.out.println(right.toString());
			System.out.println("----");
			if (left.isEmpty() && right.isEmpty()){
				return null;
			}else if (right.isEmpty()){
				//right = sortting(right);
				System.out.println("left");
				left = sortting(left);
				newT.addAll(left);
				newT.add(piv);
				newT.addAll(right);
			}else if (left.isEmpty()){
				System.out.println("right");
				right = sortting(right);
				//left = sortting(left);
				newT.addAll(left);
				newT.add(piv);
				newT.addAll(right);
			}else{
				System.out.println("x2");
				right = sortting(right);
				left = sortting(left);
				newT.addAll(left);
				newT.add(piv);
				newT.addAll(right);
			}
						
			return newT;
		}
		//System.out.println("b");
		return null;
		
	}

}
