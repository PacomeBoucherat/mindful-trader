package algorithmwork;

/*
 * Class to run algorithm on test data as java application
 */

public class RunAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running Algo..");
		
		// Made-up data for testing 
		double[]   opens1  = {100.0 , 100.0 , 100.0 , 100.0};
		double[]   maxs1   = {100.0 , 100.0 , 100.0 , 200.0};
		double[]   mins1   = {100.0 , 100.0 , 100.0 , 80.0 };
		double[]   closes1 = {100.0 , 100.0 , 100.0 , 90.0 };
		double[][] data1   = {opens1,maxs1,mins1,closes1};

		double[]   opens2  = {10.0 , 12.0 , 14.0 , 8.0};
		double[]   maxs2   = { 1.0 ,  1.0 , 10.0 , 1.0};
		double[]   mins2   = { 1.0 ,  1.0 ,  1.0 , 1.0};
		double[]   closes2 = { 1.0 ,  1.0 ,  1.0 , 1.0};
		double[][] data2   = {opens2,maxs2,mins2,closes2};

		double[]   opens3  = {10.0 , 11.0 , 13.0 , 17.0 , 25.0 , 41.0};
		double[]   maxs3   = {10.0 , 10.0 , 10.0 , 10.0 , 10.0 , 10.0};
		double[]   mins3   = {10.0 , 10.0 , 10.0 , 10.0 , 10.0 , 10.0};
		double[]   closes3 = {10.0 , 10.0 , 10.0 , 10.0 , 10.0 , 10.0};
		double[][] data3   = {opens3,maxs3,mins3,closes3};

		int[] torun = {1,2};
		
		
		System.out.println("Creating algorithm objects...");
		
		Algorithm algo1 = new Algorithm(data1);
		Algorithm algo2 = new Algorithm(data2);
		Algorithm algo3 = new Algorithm(data3);
		
		System.out.println("Running algorithms...");
		
		algo1.runAlgo(torun);
		System.out.println("Algo1 run.");
		System.out.println(algo1.solution.getListOfResults());
		System.out.println(algo1.solution.getFinalAdvice());
		
		algo2.runAlgo(torun);
		System.out.println("Algo2 run.");
		System.out.println(algo2.solution.getListOfResults());
		System.out.println(algo2.solution.getFinalAdvice());

		algo3.runAlgo(torun);
		System.out.println("Algo3 run.");
		System.out.println(algo3.solution.getListOfResults());
		System.out.println(algo3.solution.getFinalAdvice());

		
		
		
	}

}
