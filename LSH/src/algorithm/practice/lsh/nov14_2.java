package algorithm.practice.lsh;

public class nov14_2 {

	public static int expressions(int num) {
		int answer = 0;	
		//String formula = "n*(a+(n-1))/2";
		
		for(int a = 1; a<num+1; a++) {
			for(int n = 1; n<num+1;n++ )
				if((double)n*(2*a+n-1)/2 == num) {
					answer+=1;
				}
		}
		return answer;
	}

	public static void main(String args[]) {
		System.out.println(expressions(8));
	}
}
