import java.io.BufferedReader;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by a on 24/3/16.
 */

public class ShortestPathInNetwork {

public void graph(int [][]a,int source,int destination)
{

}

    public static void main(String[] args) {
        ShortestPathInNetwork aa = new ShortestPathInNetwork();
        out.println("Enter the Number of Nodes In Network");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n+1][n+1];
        System.out.println("Enter the  weight between two  Nodes \n if there is no path between two nodes enter 999");
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
            aa.graph(a,source,destination);
    }
}
