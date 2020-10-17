package demo;
import yanghui.*;
public class demo {
	public static void main(String[] args) {
		TriYangHui A,B;
		A = new TriYangHui(5);
		B = new TriYangHui();
		B.setN(15);
		System.out.println("杨辉三角形A的行数为" + A.getN());
		System.out.println("杨辉三角形A:");
		A.ShowTri();
		System.out.println();
		
		System.out.println("杨辉三角形B的行数为" + B.getN());
		System.out.println("杨辉三角形B:");
		B.ShowTri();
	}
}