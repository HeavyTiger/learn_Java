package demo;
import matrix.*;
public class demo {

	public static void main(String[] args) {
		int[][] B_mat = {{1,2,3,4},{5,6,7,8}};
		int[] B_row = {1,2};
		int[] B_column = {1,2,3,4};
		matrix A,B;
		/*
		 * ���빹�����
		 * */
		System.out.println("���潫���о���A�����빹�켰��ʾ:");
		A = new matrix(3,5);
		A.setmat();
		A.setrow();
		A.setcolumn();
		A.showRowMat();
		A.showMatCol();
		System.out.println();
		/*
		 * Ĭ�ϲ���
		 * */
		System.out.println("���潫���о���B��Ĭ�ϲ������켰��ʾ:");
		B = new matrix(2,4);
		B.setmat(B_mat);
		B.setrow(B_row);
		B.setcolumn(B_column);
		B.showRowMat();
		B.showMatCol();
	}
}
