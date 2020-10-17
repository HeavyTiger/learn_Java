package matrix;
import java.util.Scanner;
public class matrix {
	private int[][] mat;		//����
	private int[] row;		//������
	private int[] column;		//������
	
	public matrix(int m,int n) {		//m,n��ʾ����������
		mat = new int[m][n];
		row = new int[m];
		column = new int[n];
	}
	/*
	 * ˽�г�Ա����mat��setter��getter����
	 * */
	public void setmat() {		//��Ҫ��������
		Scanner input = new Scanner(System.in);
		int temp;
		System.out.println("���������ݹ������:");
		for(int i = 0;i < mat.length;i++) {
			for(int j = 0;j < mat[i].length;j++) {
				System.out.print("�������"+ (i + 1) +"�е�"+ (j + 1) +"�е���:");
				temp = input.nextInt();
				this.mat[i][j] = temp;
			}
		}
	}
	public void setmat(int[][] TempMat) {		//����setmat()����Ҫ�ṩ2ά�������
		int i = 0,j = 0;
		for(int[] TempRow:TempMat) {
			for(int TempNum:TempRow) {
				this.mat[i][j] = TempNum;
				j++;
			}
			j = 0;
			i++;
		}
	}
	public int[][] getmat() {
		return this.mat;
	}
	/*
	 * ˽�г�Ա����row��setter��getter����
	 * */
	public void setrow() {		//��Ҫ��������
		Scanner input = new Scanner(System.in);
		System.out.println("���������ݹ���������:");
		int temp;
		for(int i = 0;i < row.length;i++) {
			System.out.print("�������"+ (i + 1) +"�е���:");
			temp = input.nextInt();
			this.row[i] = temp;
		}
	}
	public void setrow(int[] temp) {		//����setrow()����Ҫ�ṩһά�о���
		int i = 0;
		for(int num:temp) {
			this.row[i++] = num;
		}
	}
	public int[] getrow() {
		return this.row;
	}
	/*
	 * ˽�г�Ա����column��setter��getter����
	 * */
	public void setcolumn() {		//��Ҫ��������
		Scanner input = new Scanner(System.in);
		System.out.println("���������ݹ���������:");
		int temp;
		for(int i = 0;i < column.length;i++) {
			System.out.print("�������"+ (i + 1) +"�е���:");
			temp = input.nextInt();
			this.column[i] = temp;
		}
	}
	public void setcolumn(int[] temp) {		//����setcolumn()����Ҫ�ṩһά�о���
		int i = 0;
		for(int num:temp) {
			this.column[i++] = num;
		}
	}
	public int[] getcolumn() {
		return this.column;
	}
	/*
	 * չʾ���������������ĳ˻�
	 * */
	public int[] showMatCol() {		//����������������,�����ؽ��
		int[] temp = new int[this.mat.length];		//����temp�����Դ�����˵Ľ��;
		int sum = 0;
		System.out.println("�õ���������Ϊ:");
		for(int i = 0;i < this.mat.length;i++) {
			for(int j = 0;j < this.column.length;j++) {
				sum += mat[i][j] * column[j];
			}
			System.out.println(sum);
			temp[i] = sum;
			sum = 0;
		}
		return temp;
	}
	public int[] showRowMat() {		//������������Ծ���,�����ؽ��
		int[] temp = new int[this.mat[0].length];		//����temp�����Դ�����˵Ľ��;
		int sum = 0;
		System.out.println("�õ���������Ϊ:");
		for(int i = 0;i < this.mat[0].length;i++) {
			for(int j = 0;j < this.row.length;j++) {
				sum += mat[j][i] * row[j];
			}
			System.out.print(sum + "  ");
			temp[i] = sum;
			sum = 0;
		}
		System.out.println();
		return temp;
	}	
}