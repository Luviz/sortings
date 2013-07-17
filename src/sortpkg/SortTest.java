package sortpkg;


import java.util.ArrayList;
import java.util.Random;

public class SortTest {


	/**
	 * here u run ur tester for the sorter!
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Start");
		Random rand = new Random(123);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i =0; i < 50; i ++){
			numbers.add(rand.nextInt(50));
		}
		System.out.println();
		/*for (Object a : numbers.toArray()){
			System.out.print(a +" ");
		}*/
		System.out.println("sorting...");
		//DuledubelEged<Integer> d = new DuledubelEged<>();
		long start = System.currentTimeMillis();
		Object[] t = Qiucksort.sortting(numbers).toArray();
		long stop = System.currentTimeMillis();

		for (int i = 0 ; i<10; i++ ){
			System.out.print(t[i]+" ");
		}
		System.out.println("...");
		for (int i = t.length-20 ; i<t.length; i++ ){
			System.out.print(t[i]+" ");
		}
		
		System.out.println("\n"+(stop - start)/1000);
		System.out.println("done");
	}

}
