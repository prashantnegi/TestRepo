import java.util.Scanner;
public class distrats {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i,j,n=5;
        int inf=999;
        int v=0;
        int[] distance=new int[5];

        int[][] graph = new int [n][n];
        int[] sptSet=new int[5];
        int[] visited=new int[5];
        System.out.println("ENTER GRAPH");
        for( i=0;i<n;i++) {
            sptSet[i] = 0;
            visited[i] = 0;

            for (j = 0; j < n; j++) {
                graph[i][j] = scan.nextInt();
                if (graph[i][j] <= 0) {
                    graph[i][j] = inf;
                }
            }
        }
        System.out.println("ENTER SOURCE");
       int  src=scan.nextInt();
        distance=graph[src];
        visited[src]=1;
        distance[src]=0;
        for( i=0;i<n;i++){
            inf=999;
            for(j=0;j<5;j++){
                if((inf > distance[j]) && (visited[j]!=1)){
                    inf=distance[j];
                    v=j;
                }
            }
            visited[v]=1;
            for(j=0;j<5;j++){
                if((inf + graph[j][v]< distance[j])&& visited[j]!=1){
                    distance[j]=inf + graph[j][v];
                }
            }
        }
        for(i=0;i<5;i++){
            System.out.print("|"+ distance[i]);
        }
    }

 }
