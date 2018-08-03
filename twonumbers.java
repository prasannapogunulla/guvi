static int findSum(int N, int K)
	{
		int ans = 0;
		int y = N / K;
		int x = N % K;
		ans = (K * (K - 1) / 2) * y + (x * (x + 1)) / 2;
    return ans;
	}
	static public void main(String[] args)
	{
		int N , K;
		Scnner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		System.out.println("enter N and K values:");
		System.out.println(findSum(N, K));
	}
}

