package garhping;

import java.util.ArrayList;
import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;

public class Cnt {
	@FXML BarChart<String, Number> bc;
	
	private Series<String, Number> random;
	private Series<String, Number> sorted;
	
	private Random rand;
	
	public void initialize (){
		System.out.println("hello!");
		
		randmaize();
		selectSort();
		
	}
	
	public void randmaize(){
		this.random = new Series<>();
		rand = new Random();
		
		for (int i =0 ; i < 50; i++){
			this.random.getData().add(new Data<>(new Integer(i).toString(),rand.nextInt(100)));
		}
		bc.getData().add(random);
	}
	
	public void selectSort(){
		sorted = new Series<>();
		ArrayList<Integer> tmp = new ArrayList<>();
		for (int i =0 ; i < random.getData().size(); i ++){
			tmp.add((Integer) random.getData().get(i).getYValue());
		}
		System.out.println(tmp);
		int counter =0;
		while(!tmp.isEmpty()){
			int minIx =0;
			for (int i = 0; i < tmp.size(); i++) {
				if (tmp.get(i) > tmp.get(minIx)){
					minIx = i;
				}
			}
			sorted.getData().add(new Data<>(new Integer(counter++).toString(), tmp.remove(minIx)));
			System.out.println(counter);
		}
		bc.getData().add(sorted);
	}
}
