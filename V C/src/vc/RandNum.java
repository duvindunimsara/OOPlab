package vc;

import java.util.Random;

public class RandNum {
	int [][] arr = new int [5][5];
	
	public RandNum() {
		Random x = new Random();
		int x1 = 100;
		for(int i=0;i<5;i++) {
			for(int j =0;j<5;j++) {
				arr[i][j]=x.nextInt(x1);
			}
		}
	}
	
	void display() {
		int min = arr[1][1];
		int max = arr[1][1];
		int tot = 0;
		
		for(int i =0;i<5;i++) {
			for(int j =0;j<5;j++) {
				System.out.println(arr[i][j] + " ");
				
				if(arr[i][j]<min) {
					min = arr[i][j];
				}
				if(arr[i][j]>max) {
					max = arr[i][j]; 
				}
				tot=tot + arr[i][j];
			}
			System.out.println();
		}
		float avg = tot / 25;
		System.out.println("min : "+min+"\nmax :"+max+"\navg : "+avg);
		
	}

}
