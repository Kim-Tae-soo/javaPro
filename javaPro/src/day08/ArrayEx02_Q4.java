package day08;

public class ArrayEx02_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 -- 내가 만든 로또 --
		int lotto[] = new int[6];
		int lottonum[] = new int[45];
		System.out.print("추천 로또 번호 : ");
		for (int i = 0; i < lotto.length; i++) {
			int num = (int) (Math.random() * (lottonum.length - 1) + 1);
			lotto[i] = num;

			System.out.print(lotto[i] + " ");
		}
		*/
		
		int[] lotto = new int[45];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		for(int i=0; i<100; i++) {
			int index=(int)(Math.random() * (lotto.length -1) +1);
			
			int temp = lotto[0];
			lotto[0] = lotto[index];
			lotto[index] = temp;
		}
		
		
		System.out.print("행운의 번호 >> ");
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}

	}

}
