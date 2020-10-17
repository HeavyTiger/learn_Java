package matrix;
import java.util.Scanner;
public class matrix {
	private int[][] mat;		//矩阵
	private int[] row;		//行向量
	private int[] column;		//列向量
	
	public matrix(int m,int n) {		//m,n表示行数和列数
		mat = new int[m][n];
		row = new int[m];
		column = new int[n];
	}
	/*
	 * 私有成员变量mat的setter和getter方法
	 * */
	public void setmat() {		//需要输入数据
		Scanner input = new Scanner(System.in);
		int temp;
		System.out.println("请输入数据构造矩阵:");
		for(int i = 0;i < mat.length;i++) {
			for(int j = 0;j < mat[i].length;j++) {
				System.out.print("请输入第"+ (i + 1) +"行第"+ (j + 1) +"列的数:");
				temp = input.nextInt();
				this.mat[i][j] = temp;
			}
		}
	}
	public void setmat(int[][] TempMat) {		//重载setmat()；需要提供2维数组矩阵
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
	 * 私有成员变量row的setter和getter方法
	 * */
	public void setrow() {		//需要输入数据
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数据构造行向量:");
		int temp;
		for(int i = 0;i < row.length;i++) {
			System.out.print("请输入第"+ (i + 1) +"列的数:");
			temp = input.nextInt();
			this.row[i] = temp;
		}
	}
	public void setrow(int[] temp) {		//重载setrow()；需要提供一维行矩阵
		int i = 0;
		for(int num:temp) {
			this.row[i++] = num;
		}
	}
	public int[] getrow() {
		return this.row;
	}
	/*
	 * 私有成员变量column的setter和getter方法
	 * */
	public void setcolumn() {		//需要输入数据
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数据构造列向量:");
		int temp;
		for(int i = 0;i < column.length;i++) {
			System.out.print("请输入第"+ (i + 1) +"行的数:");
			temp = input.nextInt();
			this.column[i] = temp;
		}
	}
	public void setcolumn(int[] temp) {		//重载setcolumn()；需要提供一维行矩阵
		int i = 0;
		for(int num:temp) {
			this.column[i++] = num;
		}
	}
	public int[] getcolumn() {
		return this.column;
	}
	/*
	 * 展示矩阵与行列向量的乘积
	 * */
	public int[] showMatCol() {		//输出矩阵乘以列向量,并返回结果
		int[] temp = new int[this.mat.length];		//设置temp数组以储存相乘的结果;
		int sum = 0;
		System.out.println("得到的列向量为:");
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
	public int[] showRowMat() {		//输出行向量乘以矩阵,并返回结果
		int[] temp = new int[this.mat[0].length];		//设置temp数组以储存相乘的结果;
		int sum = 0;
		System.out.println("得到的行向量为:");
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