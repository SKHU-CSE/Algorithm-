import java.util.Scanner;

public class backjoon4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float average[];
		int savescore[];
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();  //케이스수
		average = new float[n];
		for(int i=0; i<n; i++) {
			
			int num = scan.nextInt();  //학생수
			savescore = new int[num];
			for(int j=0; j<num; j++) {
				
				savescore[j] = scan.nextInt();  //배열에각점수저장
				average[i] += savescore[j];  //학생점수더함
			}
			average[i] /= num;  //평균
			float over=0;
			for(int k=0; k<num; k++) {
				
				if(average[i]<savescore[k]) {  //평균보다큰학생
					over++;
				}
			}	
			average[i] = over/num*100;  //비율
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(String.format("%.3f", average[i])+"%");
		}
		
	}

}
