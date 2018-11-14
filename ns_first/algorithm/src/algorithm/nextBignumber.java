package algorithm;

import java.util.Scanner;

public class nextBignumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = Integer.toBinaryString(n);
		char array[] = new char[s.length()];
		int zerocount=0;
		boolean check=true;
		int onecount=0;
	
		
		for(int i=0; i<s.length(); i++) {
			array[i] = s.charAt(i);
		}
		
		for(int i=0; i<array.length; i++){
			if(array[i] == '0') {
				zerocount++;
			}else
				onecount++;
			
			if(zerocount==2 && check) {
				array[i] = '1' ;
				array[i+1]= '0';
				onecount--;
				check = false;
			}
		}
		if(!check) {
			for(int i=array.length-1; i>0; i--) {
				if(array[i]=='0') {
					System.out.println("위치"+i);
					array[i] = '1';
					array[i-1]='0';
					onecount--;
					if(onecount==0)
						break;
				}
			}
		}
		
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
		
		
		scan.close();
	}//숫자비교해서 함수로 돌려보기

}
