package sortpkg;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import sortpkg.btree.Node;

public class SortTest {


	/**
	 * here u run ur tester for the sorter!
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Start");
		Random rand = new Random(1);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int x = 100000;
		for (int i = 0; i < x; i++) {
			int nr = rand.nextInt(x);
			numbers.add(nr);
		}
		System.out.println();
		
		//sorting starts
		System.out.println("sorting...");
		long start = System.currentTimeMillis();
		//ArrayList<Integer> t = Qiucksort.sortting(numbers);		//quick sort
		//DuledubelEged.sorting(numbers.toArray());					//Cocktail-sort
		
	
		
		long stop = System.currentTimeMillis();
		BSort bs = new BSort(numbers);
		Node tmp = bs.getEndLeft(bs.getRoot());
		System.out.println(tmp.root.value);
		System.out.println("----");
		ArrayList<Integer> a = bs.sort();
		System.out.println(a);
		System.out.println("bsort");
		//good job you are losing half of u values
		System.out.println(a.size() + " "+ numbers.size() +" " + (float)a.size()/(float)numbers.size()); 

		System.out.println("\n"+(stop - start));
		System.out.println("\n"+(stop - start)/1000/60+":"+(stop - start)/1000%60+"."+(stop - start)%1000);
		System.out.println("done");
		
		///*
		//HTML Table
		try {
			BufferedWriter writeOut = new BufferedWriter(new FileWriter(new File("out.html")));
			writeOut.write("<html>\n<table>\n");
			for (int i = 0 ; i < numbers.size() ; i++){
				writeOut.write("<tr><td>"+new Integer(i).toString()+"</td><td>"+numbers.get(i).toString()+"</td><td>"+/*t.get(i)+*/"</td></tr>\n");
			}
			writeOut.write("</table>\n</html>");
			writeOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//*/
	}

}
