package lex_assignments;


import java.util.*;
import java.io.*;

class Assignment7
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        int n=Integer.parseInt(inputString);
        int[] X= new int[n];
        int[] Y= new int[n];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++) {
            inputString = s.nextLine();
            String[] inputs = inputString.split(" ");
            int x=Integer.parseInt(inputs[0]);
            int y=Integer.parseInt(inputs[1]);
            for(int k=x;k<=y;k++) {
                if(map.containsKey(k)) {
                    map.put(k,map.get(k)+1);
                }
                else {
                    map.put(k,1);
                }
                System.out.println("key : "+k +" value  : "+map.get(k));
            }
        }
        int maxStudents=0, minChocolates=Collections.max(map.keySet());
        
        for(int key : map.keySet()) {
            
            if(map.get(key)>maxStudents && key<minChocolates) {
                maxStudents = map.get(key);
                minChocolates = key;
            }
        }
        System.out.println(maxStudents+" "+minChocolates);
    }
    
}
