import java.util.Scanner;

public class Visitor {
    private String name;
    private int age;


    public void show() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入姓名：");
        name = input.next();
        if ("n".equals(name)){
            System.out.println("程序退出！");
            return;
        }
        System.out.print("请输入年龄：");
        age = input.nextInt();
        while (true) {

            if (age >= 18 && age <= 60) {        //判断年龄
                System.out.println(name +"年龄为"+age+",价格为20元");
                show();
                break;
            } else {
                System.out.println(name + "的年龄为：" + age + "，免费");
                show();
                break;
            }
        }
    }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Visitor v = new Visitor();

            v.show();

        }
}
