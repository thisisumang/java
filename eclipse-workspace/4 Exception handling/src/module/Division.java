package module;
// Throw  and Throws
class Division{
	int fun(int a, int b) throws UserDefinedException
	{
		if(b==0)
			throw new UserDefinedException("yiu");
		return a/b;
	}
	void print()
	{
		try {
			System.out.println(fun(3,0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
