package sortpkg;

public class DuledubelEged<T>{

	@SuppressWarnings("unchecked")
	static public <T> T[]  sorting(T[] t){
		int c =0;
		long tStart = System.currentTimeMillis();
		long etot =0; //Estimated tot time
		while(c < t.length/2){
			int min = t.length/2,max = t.length/2;
			int count=0;
			for (int i = c; i < t.length-c; i++){
				//System.out.print(t[i]);
				if (0<((Comparable<T>) t[min]).compareTo(t[i])){
					min = i; 			//find min
				}
				if (0>((Comparable<T>) t[max]).compareTo(t[i])){
					max = i;			//find max
				}
				count++;
			}
//			System.out.println("-----------");
			//swaping!
			T temp = t[c];	//min
			t[c] = t[min];
			t[min] = temp;
			
			temp = t[t.length-c-1];	//max
			t[t.length-c-1] = t[max];
			t[max] = temp;
			
			//System.out.println(t[c]+" "+t[t.length-c-1]);
			
			c++;
			
			etot = (100*(System.currentTimeMillis()-tStart))/10;
			for(int i =0; i < 100 ; i+=10){	
				if (c*100 == (t.length/2)*i){
					long tStop = System.currentTimeMillis();
					etot = (100*(System.currentTimeMillis()-tStart))/i;
					long eta = (etot - tStop +tStart);
					System.out.println(i+"%\t- "+ (tStop -tStart)/1000/60+":"+(tStop -tStart)/1000%60+"."+(tStop -tStart)%1000 + "\t " +
							"ETA: "+eta/1000/60+":"+eta/1000%60+"."+eta%1000+"\t" +
									"count: "+ count);
				}
			}
			
		
		}
		return t;
	}
}
