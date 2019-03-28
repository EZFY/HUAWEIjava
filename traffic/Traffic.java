package traffic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Traffic {

	public static void main(String[] args) {
		readFile("cross.txt");
		writeFile();
	}
	
	public static void readFile(String pathname) {
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader)) { 
             String line= br.readLine();
             String[] data; 
            	
            	if(pathname.equals("car.txt")) {
            		ArrayList<Car> cars = new ArrayList<Car>();
            		 while ((line = br.readLine()) != null) {
            			 
            		 }
            	}
            	else if(pathname.equals("road.txt")) {
            		ArrayList<Road> roads = new ArrayList<Road>();
            		 while ((line = br.readLine()) != null) {
            			 
            		 }
            		
            	}
            	else if(pathname.equals("cross.txt")) {
            		ArrayList<Cross> crosses = new ArrayList<Cross>();
            		while ((line = br.readLine()) != null) {
	            		Cross cross = new Cross();
	            		line=line.replace(" ","");
	            		line=line.substring(1,line.length()-1);
	            		cross.setdata(line.split(","));
	            		crosses.add(cross);
	            		System.out.println(line);
            		}
            		System.out.println(crosses.get(0).getdata());
            		System.out.println(crosses.get(1).getdata()[0]);
            	}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	
    public static void writeFile() {
        try {
            File writeName = new File("answer.txt"); 
            writeName.createNewFile(); 
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)) {
                out.write("我会写入文件啦1\r\n");
                out.write("我会写入文件啦2\r\n"); 
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
