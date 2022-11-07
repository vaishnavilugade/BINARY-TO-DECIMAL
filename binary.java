import java.util.*;
class binary{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int dec;
		String bin;
		System.out.println("Enter the binary number:");
		bin=sc.nextLine();
		dec=Integer.parseInt(bin,2);
		System.out.println("decimal of given binary number "+bin+" is="+dec);
	}
}

		