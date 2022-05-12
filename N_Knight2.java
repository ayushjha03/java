class N_Knight2
{
    
    private static  double rec(int x, int y, int N, int step, double mem[][][])
    {
        double count = 0;
        if(x>=0 && x<N && y>=0 && y<N)
        {
            if(mem[x][y][step]!=0) return mem[x][y][step];
            
            if(step==0) return 1;
            
            count+= rec(x-2, y+1, N, step-1, mem);
            count+= rec(x-2, y-1, N, step-1, mem);
            count+= rec(x-1, y+2, N, step-1, mem);
            count+= rec(x-1, y-2, N, step-1, mem);
            count+= rec(x+1, y+2, N, step-1, mem);
            count+= rec(x+1, y-2, N, step-1, mem);
            count+= rec(x+2, y+1, N, step-1, mem);
            count+= rec(x+2, y-1, N, step-1, mem);
            
            mem[x][y][step] = count;
        }
        
        
        return count;
        
        
    }
    
    public static double findProb(int N, int start_x, int start_y, int step)
    {
        double mem[][][] = new double[N][N][step+1];
        
        double count = rec(start_x, start_y, N, step, mem);
        return count/Math.pow(8, step);
    }
    public static void main(String []args)
    {
        // N = 8, x = 0, y = 0, K = 3
        int N=8;
        int x=0;
        int y=0;
        int k=3;
        System.out.println(findProb(N,x,y,k));
    }
}
