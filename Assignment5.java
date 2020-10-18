package lex_assignments;


import java.util.*;
import java.io.*;

class Assignment5
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        int T= Integer.parseInt(inputString);
        for(int i=0;i<T;i++) {
            inputString = s.nextLine();
        	int N= Integer.parseInt(inputString);
            inputString = s.nextLine();
            String[] inputs = inputString.split(" ");
            List<Integer> costs = new ArrayList<Integer>();
            for(String input : inputs) {
                costs.add(Integer.parseInt(input));
            }
            Collections.sort(costs);
            System.out.println(getResult(costs,0));
        }
        //System.out.println("Hello");
        s.close();
    }
    
    public static int getResult(List<Integer> inputCosts, int cost) {
    	System.out.println(inputCosts);
        if(inputCosts.size()==0) {
            return cost;
        }
        else if(inputCosts.size()==1) {
            return cost +inputCosts.get(0);
        }
        else if(inputCosts.size()==2) {
            return cost +inputCosts.get(1);
        }
        else {
//            cost += getMax(inputCosts.get(0), inputCosts.get(1));
        	cost+=inputCosts.get(1);
            inputCosts.remove(1);
            cost+=inputCosts.get(0);
//            reached.add(inputCosts.get(0));
//            inputCosts.remove(0);
//            if(inputCosts.size() > 0) {
//                int min = Collections.min(reached);
//            	inputCosts.add(min);
//                reached.remove(Integer.valueOf(min));
//                cost += min;
//            }
            return getResult(inputCosts, cost);
        }
        
    }
    
    public static int getMax(int num1, int num2){
        if(num1 > num2)
            return num1;
        else return num2;
    }
}
