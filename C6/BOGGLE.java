package C6;
/* 재귀함수로 풀었기 때문에 RTE 가 뜬다 */
import java.io.*;

public class BOGGLE {
	static char[][] map = new char[5][5];
	static final int[] dx = {1,1,0,-1,-1,-1, 0, 1};
	static final int[] dy = {0,1,1, 1, 0,-1,-1,-1};
	
	static boolean hasWord(int y, int x, String word) {
		if(!(y>=0 && y<5 && x>=0 && x<5)) {
			return false;
		}
		if(map[y][x] != word.charAt(0)) {
			return false;
		}
		if(word.length() == 1) {
			return true;
		}
		for(int d=0; d<8; d++) {
			int nextY = y+dy[d];
			int nextX = x+dx[d];
			if(hasWord(nextY, nextX, word.substring(1))) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int c = Integer.parseInt(br.readLine());
		while(c-- > 0) {
			for(int i=0; i<5; i++) {
				String str = br.readLine();
				map[i] = str.toCharArray();
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			String word = br.readLine();
			String result = "NO";
			for(int y=0; y<5; y++) {
				for(int x=0; x<5; x++) {
					if(hasWord(y, x, word) && result.equals("NO")) {
						result = "YES";
					}
				}
			}
			bw.write(word + " " + result);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
