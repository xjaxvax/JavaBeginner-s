public class Main4_8{
	public static void main(String[] args){
		int[] score={20,30,40,50,80};
		int sum=score[1]+score[2]+score[4]+score[5];
		int avg=sum/score.length;
		System.out.println("合計点:"+sum);
		System.out.println("平均点:"+avg);
	}
}
