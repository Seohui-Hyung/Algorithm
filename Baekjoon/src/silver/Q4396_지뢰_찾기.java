package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4396_지뢰_찾기 {
	int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
	int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[][] bomb = new char[n][n];
		char[][] open = new char[n][n];
		
		for(int i = 0; i < n; i++) { // 폭탄이 있는 * 위치 저장
			String s = br.readLine();
			for(int j = 0; j < n; j++) {
				bomb[i][j] = s.charAt(j);
			}
		}
		
		// 다시보기
		for(int i = 0; i < n; i++) { // 열어 놓은 곳 저장 과 동시에 8방 탐색하기...?
			String s = br.readLine();
			for(int j = 0; j < n; j++) {
				open[i][j] = s.charAt(j);
			}
		}
		
		for(int i = 0; i < 8; i++) { // 8방 탐색하면서 * 개수 세고 x를 숫자로 대체하기
			
		}
		
		System.out.println();
	}
}
