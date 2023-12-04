package DAA_FINAL;

import java.util.*;
public class Prims {
	public void prims(int G[][],int v) {
		int inf=9999999;
		int no_edge;
		boolean[]selected=new boolean[v];
		Arrays.fill(selected, false);
		no_edge=0;
		selected[0]=true;
		System.out.println("Edge :Weight");
		while(no_edge<v-1) {
			int min=inf;
			int x=0;
			int y=0;
			for(int i=0;i<v;i++) {
				if(selected[i]==true) {
					for(int j=0;j<v;j++) {
						if(!selected[j] && G[i][j]!=0) {
							if(min>G[i][j]) {
								min=G[i][j];
								x=i;
								y=j;
							}
						}
					}
				}
			}
			System.out.println(x+"-"+y+":"+G[x][y]);
			selected[y]=true;
			no_edge++;
		}
	}
	public static void main(String[] args) {
		Prims obj=new Prims();
		int v=5;
		int [][] G= {
				{0,9,75,0,0},
				{9,0,95,19,42},
				{75,95,0,51,66},
				{0,19,51,0,31},
				{0,42,66,31,0}
		};
		obj.prims(G, v);
	}
}

