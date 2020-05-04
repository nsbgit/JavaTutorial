package d;

import java.util.Scanner;

public class D {

	private static int n;
	private static char[][] maze = new char[350][350];
	private static int[][] mazeInit = new int[350][350];
	private static int regCount;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				maze[i][j]=sc.next().charAt(0);
			}
		}
		
		
		// put 0 over all O cell and -1 to X
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(maze[i][j] == 'O') {
					mazeInit[i][j] = 0;
				} else {
					mazeInit[i][j] = -1;
				}
					
			}
		}
		
		
		
		int flag=0;
		int a=0,b=0;
		do {
			for(int i=a; i<n; i++)
			{
				for(int j=b; j<n; j++) 
				{
					if(mazeInit[i][j] != -1) {
						mazeInit[i][j]++;
						
						if(i ==0 && j ==0) {
							mazeInit[i][j+1]++;
							mazeInit[i+1][j]++;
						} else if(i == 0 && j !=0 && j != n-1) {
							mazeInit[i-1][j]++;
							mazeInit[i][j+1]++;
							mazeInit[i+1][j]++;
						} else if(i == 0 && j == n-1) {
							mazeInit[i-1][j]++;
							mazeInit[i][j+1]++;
						} else if(i != 0 && j != n-1) {
							mazeInit[i][j-1]++;
							mazeInit[i-1][j]++;
							mazeInit[i][j+1]++;
						} else if(i == n-1 && j == n-1) {
							mazeInit[i-1][j]++;
							mazeInit[i][j-1]++;
						} else if(i==n-1 && j != 0) {
							mazeInit[i-1][j]++;
							mazeInit[i][j-1]++;
							mazeInit[i+1][j]++;
						} else if(i == n-1 && j == 0) {
							mazeInit[i][j-1]++;
							mazeInit[i+1][j]++;
						} else if(i == 0 && j != n-1) {
							mazeInit[i][j-1]++;
							mazeInit[i+1][j]++;
							mazeInit[i][j+1]++;						
						} else {
							mazeInit[i-1][j]++;
							mazeInit[i][j-1]++;
							mazeInit[i][j+1]++;
							mazeInit[i+1][j]++;
						}
						
					}
				}
				
				
			}
			regCount++;
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(mazeInit[i][j] == 0) {
						a=i;
						b=j;
						flag=1;
					}
				}
			}
		} while(flag==1);
			
		System.out.println(regCount);
		
		
		
		
		
		
		
		
		

	}

}
