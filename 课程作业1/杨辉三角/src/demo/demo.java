package demo;
import yanghui.*;
public class demo {
	public static void main(String[] args) {
		TriYangHui A,B;
		A = new TriYangHui(5);
		B = new TriYangHui();
		B.setN(15);
		System.out.println("���������A������Ϊ" + A.getN());
		System.out.println("���������A:");
		A.ShowTri();
		System.out.println();
		
		System.out.println("���������B������Ϊ" + B.getN());
		System.out.println("���������B:");
		B.ShowTri();
	}
}