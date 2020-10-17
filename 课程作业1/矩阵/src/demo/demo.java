package demo;
import matrix.*;
public class demo {

	public static void main(String[] args) {
		int[][] B_mat = {{1,2,3,4},{5,6,7,8}};
		int[] B_row = {1,2};
		int[] B_column = {1,2,3,4};
		matrix A,B;
		/*
		 * 输入构造矩阵
		 * */
		System.out.println("下面将进行矩阵A的输入构造及演示:");
		A = new matrix(3,5);
		A.setmat();
		A.setrow();
		A.setcolumn();
		A.showRowMat();
		A.showMatCol();
		System.out.println();
		/*
		 * 默认参数
		 * */
		System.out.println("下面将进行矩阵B的默认参数构造及演示:");
		B = new matrix(2,4);
		B.setmat(B_mat);
		B.setrow(B_row);
		B.setcolumn(B_column);
		B.showRowMat();
		B.showMatCol();
	}
}
