package lex_assignments;


import java.util.Scanner;

class Assignment6
{
    static int X, Y, N, W;
    static double P1, P2;
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        int T=Integer.parseInt(inputString);
        for(int i=0;i<T;i++) {
            inputString = s.nextLine();
            String[] inputs = inputString.split(" ");
            X = Integer.parseInt(inputs[0]);
            Y = Integer.parseInt(inputs[1]);
            N = Integer.parseInt(inputs[2]);
            W = Integer.parseInt(inputs[3]);
            P1 = Integer.parseInt(inputs[4])/100.0;
            P2 = Integer.parseInt(inputs[5])/100.0;
            
            System.out.println(getResult(N,0)*100);
        }
        //System.out.println("Hello");
    }
    static int[][] visit = new int[1000+10][10000+10];
    static double[][] f = new double[1000+10][10000+10];
    static int cas;
    public static double getResult(int n, int val) {
        if(val>=W) return 1.0 ;
    	if(n==0) return 0.0 ;

    	double ret = f[n][val];
    	int vis = visit[n][val];

    	if(vis==cas) return ret ;
    	ret = 0.0 ;
    	vis = cas ;

    	double x = P1*getResult(n-1,val+X)+(1-P1)*getResult(n-1,val);
    	double y = P2*getResult(n-1,val+Y)+(1-P2)*getResult(n-1,val);

    	return ret = max(x,y) ;
    }
    
    public static double max(double x, double y) {
        if(x > y)
            return x;
        else return y;
    }
}