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
		for(int i =0; i < 25000000; i ++){
			int nr = rand.nextInt(1000000);
			//if (!numbers.contains(new Integer(nr))){
				numbers.add(nr);
			/*}else {
				i--;
			}*/
		}
		System.out.println();
		
		System.out.println("sorting...");
		long start = System.currentTimeMillis();
		ArrayList<Integer> t = Qiucksort.sortting(numbers);
		long stop = System.currentTimeMillis();
		for (int i = 0 ; i<10; i++ ){
			System.out.print(t.get(i)+" ");
		}
		System.out.print("... ...");
		for (int i = t.size()-10 ; i<t.size(); i++ ){
			System.out.print(t.get(i)+" ");
		}
		System.out.println("\n"+t.size());
		
		System.out.println("\n"+(stop - start));
		System.out.println("\n"+(stop - start)/1000);
		System.out.println("done");
	}

}
