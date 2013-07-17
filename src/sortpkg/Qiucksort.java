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
			//System.out.println("0:"+t);
			piv = t.get(t.size()/2);
			for (int i =0; i < t.size(); i++){
				if (0 < ((Comparable<T>) piv).compareTo(t.get(i))){ //left
					left.add(t.get(i));
					//System.out.print(" L: "+ t.get(i));
				}else{	//right
					//System.out.println(" R: "+ t.get(i));
					right.add(t.get(i));
				}
			}
			/*System.out.println("0left: "+left + " "+ left.size());
			System.out.println("0right: "+right+ " "+ right.size());*/
			
			if (left.isEmpty() || right.isEmpty()){
				newT.addAll(left);
				newT.addAll(right);
				return newT;
			}else {
				//System.out.println("\t\t"+ right.isEmpty() + " "+left.isEmpty());
				right = sortting(right);
				left = sortting(left);
				
				newT.addAll(left);
				newT.addAll(right);
			}
			/*System.out.println("left: "+left);
			System.out.println("right: "+right);
			System.out.println("newT: "+newT+" " +newT.size()+"\n-----------------\n\n");	*/	
			return newT;
		}
		return null;
		
	}

}
