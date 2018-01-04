public class Rabits {
    public static void main(String[] args) {
        int n=10;
        System.out.println("第"+n+"个月兔子总数为："+fun(n));
    }
    private static int fun(int n){
        return (n==1||n==2)?1:fun(n-1)+fun(n-2);
    }
}
