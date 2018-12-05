import java.util.ArrayList;
import java.util.Scanner;

public class backjoon1546 {

	static ArrayList<Integer> scorelist = new ArrayList<Integer>();
	static ArrayList<Float> maxlist = new ArrayList<Float>();
	static int m_max=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		System.out.print("시험본과목의 개수: ");
		int n = scan.nextInt();
		float sum = 0;
		
		for(int i=0; i<n; i++) {
			int score = scan.nextInt();
			scorelist.add(score);
		}
		
		for(int originscore : scorelist) {
			m_max = max(originscore);  //최고값갱신
		}
		
		for(int originscore : scorelist) {
			maxlist.add(originscore/(float)m_max*100);	
		}
		
		for(float newscore : maxlist) {
			sum += newscore;
		}
		
		System.out.println(sum/n);
	}
	
	static int max(int a) {
		return m_max<a ? a : m_max;
	}

}
