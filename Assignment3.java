package lex_assignments;

import java.util.*;

class Assignment3
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        int n = Integer.parseInt(inputString);
        int[] k_values = new int[n];
        String[] input_values = new String[n];
        for(int i=0;i<n;i++) {
            inputString = s.nextLine();
            String[] inputs = inputString.split(" ");
            k_values[i] = Integer.parseInt(inputs[0]);
            input_values[i] = inputs[1];
		}
        s.close();
        for(int i=0;i<n;i++) {
        	System.out.println(getResult(k_values[i], input_values[i]));
        }
        
    }
    
    public static String getResult(int k, String str) {
        String s1="";
//        System.out.println();
        //char temp = str.charAt(0);
        while(!str.equals("")) {
        	//System.out.println(str);
            char temp=str.charAt(0);
            int index=0;
            for(int i=1;i<k && i<str.length();i++) {
                if(temp < str.charAt(i)) {
                    temp = str.charAt(i);
                    index = i;
                }
            }
//            s1 = s1+temp;
            str = str.substring(0,index)+str.substring(index+1);
            s1 = str+s1+temp;
        }
        return s1;
	}
}