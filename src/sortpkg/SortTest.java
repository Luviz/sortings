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
		int x = 200000;
		for(int i =0; i < x; i ++){
			int nr = rand.nextInt(x);
			//if (!numbers.contains(new Integer(nr))){
				numbers.add(nr);
			/*}else {
				i--;
			}*/
		}
		System.out.println();
		
		System.out.println("sorting...");
		long start = System.currentTimeMillis();
		//ArrayList<Integer> t = Qiucksort.sortting(numbers);		//quick sort
		DuledubelEged.sorting(numbers.toArray());					//Cocktail-sort
		long stop = System.currentTimeMillis();
		/*for (int i = 0 ; i<10; i++ ){
			System.out.print(t.get(i)+" ");
		}
		System.out.print("... ...");
		/*for (int i = t.size()-10 ; i<t.size(); i++ ){
			System.out.print(t.get(i)+" ");
		}
		System.out.println("\n"+t.size());
		*/
		System.out.println("\n"+(stop - start));
		System.out.println("\n"+(stop - start)/1000/60+":"+(stop - start)/1000%60+"."+(stop - start)%1000);
		System.out.println("done");
	}

}
