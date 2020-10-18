package lex_assignments;

//using System;
import java.util.*;
class Assignment2
{
	public static void main(String[] args)
	{
		//for input use:
		//String inputString = (Console.ReadLine()); 
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[][] arr = new String[n][];
		for(int i=0;i<n;i++) {
			String input = sc.nextLine();
			arr[i] = input.split(" "); 
		}
		sc.close();
		int max = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
//				System.out.println("i : "+i+", j: "+j+", arr[i][j] : "+arr[i][j]);
				int maxVal = bfs(i, j, arr,0);
				System.out.println("i : "+i+", j: "+j+", maxVal : "+maxVal);
				if(max < maxVal)
					max = maxVal;
			}
		}
//			Console.WriteLine(max);
		System.out.println(max);
	}

public static int bfs(int i, int j, String[][] arr, int max) {
	int n=arr.length;
	if(arr[i][j].equals("T")) {
		System.out.println("i : "+i+" j : "+j);
		arr[i][j]="D";
		max++;
		int[] rows = {-1,0,1,0};
		int[] cols = {0,1,0,-1};
		System.out.println("rows.length : "+rows.length);
		for(int k=0;k<rows.length;k++) {
			int row = i+rows[k];
			int col = j+cols[k];
			System.out.println("row : "+row+" col : "+col);
			if(row>=0 && row<n && col>=0 && col<n && arr[row][col].equals("T")) {
				max = bfs(row, col, arr, max);
			}
		}
		return max;
	}
	else 
		return max;
	}
}