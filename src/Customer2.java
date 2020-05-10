import java.util.Scanner;

public class Customer2 {
    String name;
    String password;
    String newPassword;
    Scanner sc = new Scanner(System.in);

    public void changePwd() {

        System.out.println("请你输入用户名：");
        name = sc.next();
        System.out.println("请你输入密码：");
        password = sc.next();
        boolean flag = isLogin(name,password);
        if(flag==false){
            System.out.println("登录失败！");
            changePwd();
        }
        while (flag) {
            System.out.println("请输入新密码：");
            password = sc.next();
            System.out.println("请输入确认密码：");
            newPassword = sc.next();
            if (password.equals(newPassword)) {
                System.out.println("密码修改成功！新密码" + password);
                break;
            } else {
                System.out.println("两次密码输入不一致！");

            }
        }

    }

    public boolean isLogin(String name, String password) {
        boolean flag = false;
        if (name.equals("admin") && password.equals("123456")) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        Customer2 customer2 = new Customer2();
        customer2.changePwd();
    }
}
