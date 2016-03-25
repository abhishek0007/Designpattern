import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by a on 24/3/16.
 */

public class ShortestPathInNetwork {


public int minDistance(ArrayList<Integer> dist, ArrayList<Boolean> sptSet,int n)
    {
        int min = Integer.MAX_VALUE;
        int min_index=0;
        int v;
        for (v = 0; v < n; v++)
            if (sptSet.get(v) == false && dist.get(v) <= min)
            {min = dist.get(v);
        min_index = v;}

        return min_index;
    }


    public int  graph(int [][]a,int source,int destination,int n)
{

    ArrayList<Integer> dist=  new ArrayList();
    ArrayList<Boolean> sptSet =  new ArrayList();

    for (int i = 0; i < n; i++)
    {
        dist.add(Integer.MAX_VALUE);
    sptSet.add(false);
    }

    dist.set(source, 0);
    ShortestPathInNetwork nj = new ShortestPathInNetwork();
    for (int count = 0; count < n-1; count++)
    {
        int u = minDistance(dist, sptSet, n);
//        System.out.print(u+" ");
        sptSet.set(u, true);

        int vp;
        boolean kk = false;
        for ( vp = 0; vp < n; vp++)
        {
             if((a[u][vp])!=0)
             kk =true;
             else kk = false;
            if ((!sptSet.get(vp))&& kk && (dist.get(u) != Integer.MAX_VALUE) && (dist.get(u) +a[u][vp] < dist.get(vp)))
                dist.set(vp, dist.get(u) + a[u][vp]);
        }
    }

//for(int kk=0;kk<n;kk++)
  //      System.out.println(kk+"  "+dist.get(kk));
        return dist.get(destination);
}

    public static void main(String[] args) {
        ShortestPathInNetwork aa = new ShortestPathInNetwork();
        out.println("Enter the Number of Nodes In Network");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // int n = 5;
        int[][] a = new int[n+1][n+1];
        System.out.println("Enter the  weight between two  Nodes if there is no path between two nodes enter 0");

     /* int  a[][] =
        {
            {0,4,1,0,0},
            {4,0,4,0,4},
            {1,2,0,4,0},
            {0,0,4,0,4},
            {0,4,0,4,0}};


       */
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {

                        if(i==j)
                            a[i][j]=0;
                        else  if(a[i][j]==0) {
                            System.out.println("Enter Weight between Node"+i+" and "+j);

                int weight = sc.nextInt();
                            if(weight==999)
                           {

                                  }
              else{   a[i][j] = weight;
                            a[j][i] = weight;
                            }

            }
            }
        }

        System.out.println("\n\n\nAdjacency Matrix  of given network \n\n");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("Enter the source Node and Destination Node");
        int source = sc.nextInt();
        int destination = sc.nextInt();
         int Mindistance = aa.graph(a, source, destination, n);
        System.out.println("Minimum Distance between Node "+source+" and "+destination+"  "+"is"+Mindistance);
    }
}
