package C6;

import java.io.*;
import java.util.StringTokenizer;

public class BOARDCOVER {
	public static int H,W;
	public static int[][][] coverType = {
			{{0,0},{1,0},{0,1}},
			{{0,0},{0,1},{1,1}},
			{{0,0},{1,0},{1,1}},
			{{0,0},{1,0},{1,-1}},
	};
	public static int[][] board;
	public static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine().trim());
		for(int tc=1; tc<=t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			
			board = new int[H][W];
			
			for(int i=0; i<H; i++) {
				String row = br.readLine();
				for(int j=0; j<W; j++) {
					int ch = row.charAt(j);
					if(ch == '#') {
						board[i][j] = 1;
					} else {
						board[i][j] = 0;
					}
				}
			}
			count = cover();
			bw.flush();
			bw.write(count + "\n");
		}
		bw.close();
	}
	public static boolean set(int y, int x, int type, int delta) {
		boolean ok = true;
		for(int i=0; i<3; i++) {
			int ny = y + coverType[type][i][0];
			int nx = x + coverType[type][i][1];
			if(ny<0 || ny>=H || nx<0 || nx>=W)
				ok = false;
			else if((board[ny][nx] += delta) > 1)
				ok = false;
		}
		return ok;
	}
	public static int cover() {
		int y = -1;
		int x = -1;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				if(board[i][j] == 0) {
					y=i;
					x=j;
					break;
				}
			}
			if(y!=-1)
				break;
		}
		
		if(y == -1)	return 1;
		int ret = 0;
		for(int type=0; type<4; ++type) {
			if(set(y,x,type,1))
				ret += cover();
			set(y,x,type,-1);
		}
		return ret;
	}

	
}
