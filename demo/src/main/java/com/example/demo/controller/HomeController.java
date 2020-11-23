package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
	//static List<List<String>> f = new ArrayList<List<String>>();
	double [][] readData() {
		// TODO Auto-generated method stub
		//String csvFile = "/Users/user/Downloads/IXIC.csv";
		String csvFile = "/Users/user/git/mindful-trader/demo/src/main/java/com/example/demo/controller/test_data.csv";
		BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        double [][] f = new double [1000000][5];// = new ArrayList<List<Double>>();
        
        
        try {
        	Integer t = 0;
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] file = line.split(cvsSplitBy);

                String [] a = new String [5];// = new ArrayList<String>();
                
                for (int i=0;i<5;i++) {
                	if (i!=0){
                		a[i-1] = file[i];
                	//a.add((file[i]));
                	}
                }
                if (t!=0){
                	double [] b = new double [5];// = new ArrayList<Double>();
                	for (int i=0;i<4;i++) {
                		b[i] = Double.parseDouble(a[i]);
                	//b.add(Double.parseDouble(a.get(i)));
                	}
                f[t-1] = b;
                }
                t+=1;
            }
            /*for(int i =0;i<f.size();i++) {
            	for(int j=1;j<f.get(0).size();j++) {
            		f.get(i).get(j) = Double.parseDouble(f.get(i).get(j));
            	}
            }*/
            //System.out.println(f);
        } /*catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/ catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return f;
	}

    @GetMapping("/")
    public String hello(){
    	double [][] f = new double [1000000][5];// = new ArrayList<List<Double>>();
    	f = readData();
    	if ((int)(f[0][0])==8529) {
    	
        return "hello";
    	}
    	else {
    		//String d = "Date";
    		System.out.println(f[0][0]);//.toString().getClass().getName());
    		return "message";
    	}
    	//System.out.println((int)Double.parseDouble(f.get(1).get(1)));
    	//return "hello";
    }
    	/*return "hello";
    }*/

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message", "This is a custom message");
        
        
        return "message";
    }
}