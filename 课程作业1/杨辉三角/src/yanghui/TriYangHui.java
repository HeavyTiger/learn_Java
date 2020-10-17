package yanghui;
public class TriYangHui {
	private int N;	//杨辉三角形的行数
	private int[][] Tri;	//储存杨辉三角的二维数组
	public TriYangHui() {
		this.N = 0;	//默认是0行
	}
	public TriYangHui(int Line) {
		if(Line <= 0) {
			if(Line < 0) System.out.println("不能设置负数行数，已将行数设置成0!");
			this.N = 0;
			return;
		}
		this.N = Line;
		CreateTri();
	}
	public void setN(int Line) {
		this.N = Line;
		CreateTri();
	}
	public int getN() {
		return this.N;
	}
	public void setTri(int[][] temp) {
		this.Tri = temp;
	}
	public int[][] getTri() {
		return this.Tri;
	}
	protected void CreateTri() {
		Tri = new int[N][N];
		for(int i = 0;i < N;i++) {
			for(int j = 0;j < i + 1;j++) {
				if(i == j || j == 0) {
					Tri[i][j] = 1;	//开头元素或行尾元素赋值1;
					continue;
				}
				if(i >= 2) {
					Tri[i][j] = Tri[i - 1][j - 1] + Tri[i - 1][j];
				}
			}
		}
	}
	public void ShowTri() {		//打印表格
		for(int[] temp:this.Tri) {
			 for(int num:temp) 
				if(num != 0) System.out.printf("%5d", num);
			 System.out.println();
		}
	}
}
