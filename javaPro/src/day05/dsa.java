package day05;

public class dsa {
	public static void main(String[] args) {
	
	
	System.out.println("5번 문제");
	for(int i=1; i<=4; i++){
        for(int j=5-i; j>0; j--){
            System.out.print(" ");
        }
        for(int j=1; j<=i*2-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
	System.out.println();
	System.out.println("------------------------");
	System.out.println();	
	
	System.out.println("6번 문제");
    for(int i=1; i<=4; i++){
        for(int j=0; j < i; j++){
            System.out.print(" ");
        }
        for(int j=(5-i)*2-1; j>0; j--){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();
	System.out.println("------------------------");
	System.out.println();	
	}
}
