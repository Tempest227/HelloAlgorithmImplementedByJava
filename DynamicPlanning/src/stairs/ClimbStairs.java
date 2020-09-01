package stairs;

public class ClimbStairs {

	public static void main(String[] args) {
		/*假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
		每次你可以爬 1 或 2 个台阶。
		你有多少种不同的方法可以爬到楼顶呢？
		注意：给定 n 是一个正整数。*/
		
		/*输入： 2   输出： 2  解释： 有两种方法可以爬到楼顶。
		1.  1 阶 + 1 阶
		2.  2 阶*/
		
		System.out.println(climbStairs(5));

	}
	
	public static int climbStairs(int n){		
		if (n == 0){
			return 0;
		}
		if (n == 1){
			return 1;
		}
		if (n == 2){
			return 2;
		}
		
		return climbStairs(n-1)+climbStairs(n-2);
	}

}
