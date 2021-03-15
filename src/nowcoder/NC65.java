package nowcoder;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * <p>
 * n≤39
 *
 * @author JiaweiMao
 * @version 0.0.1
 * @since 17 Feb 2021, 3:11 PM
 */
public class NC65
{
    /**
     * 递归实现，优点是代码简单，缺点是慢
     */
    public int Fibonacci(int n)
    {
        if (n == 0 || n == 1)
            return n;

        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    /**
     * 递归实现，优点是代码简单，缺点是慢
     */
    public int Fibonacci2(int n)
    {
        if (n == 0 || n == 1)
            return n;

        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }


    public static void main(String[] args)
    {
        System.out.println(new NC65().Fibonacci(4));
    }
}
