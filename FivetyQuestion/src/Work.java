import java.util.Scanner;//导入键盘输入数据包
public class Work {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();//接收数据
        Work work=new Work();//定义work对象
        String i=work.print(x);//调用work对象的print方法，传入键盘输入数据并获取结果
        System.out.println(i);
    }
    /*
    定义print方法，接收键盘传入数据，并返回结果
     */
    public String print(int i){
        return  (i>=100)?"A":(70<=i&&i<100)?"B":(50<=i&&i<70)?"C":(30<=i&&i>50)?"D":(0<=i&&i<30)?"E":"fault";
    }
}
