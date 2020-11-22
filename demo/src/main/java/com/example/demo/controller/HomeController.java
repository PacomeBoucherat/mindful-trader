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
	List<List<String>> readData() {
		// TODO Auto-generated method stub
		//String csvFile = "/Users/user/Downloads/IXIC.csv";
		String csvFile = "/Users/user/git/mindful-trader/demo/src/main/java/com/example/demo/controller/test_data.csv";
		BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        List<List<String>> f = new ArrayList<List<String>>();
        
        
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] file = line.split(cvsSplitBy);

                List<String> a = new ArrayList<String>();
                for (int i=0;i<5;i++) {
                	a.add(file[i]);
                }
                f.add(a);
            }
            System.out.println(f);
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
    	/*List<List<String>> f = new ArrayList<List<String>>();
    	f = readData();
    	if ((int)Double.parseDouble(f.get(1).get(1))==8529) {
    	
        return "hello";
    	}
    	else {
    		//String d = "Date";
    		System.out.println(f.get(1).get(1));//.toString().getClass().getName());
    		return "message";
    	}
    	//System.out.println((int)Double.parseDouble(f.get(1).get(1)));
    	//return "hello";
    }*/
    	return "hello";
    }

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message", "This is a custom message");
        
        
        return "message";
    }
}