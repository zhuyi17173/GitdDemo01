import java.util.Scanner;

public class Customer {
    //积分、卡类型
    int point;
    String type;

   /* public void show(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入你的积分：");
        point = sc.nextInt();
        if (point>500 && point<=1000){
            System.out.println("你是我们青铜用户");
        }else if (point>1000 && point<=2000){
            System.out.println("你是我们白银用户");
        }else if (point>2000){
            System.out.println("你是我们黄金用户");
        }
    }*/
   public void show(int point){
       if (point>500 && point<=1000){
           System.out.println("你是我们青铜用户");
       }else if (point>1000 && point<=2000){
           System.out.println("你是我们白银用户");
       }else if (point>2000){
           System.out.println("你是我们黄金用户");
       }
   }

    public void show(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入你的积分：");
        point = sc.nextInt();
        System.out.println("请你输入你的卡号类型：");
        type = sc.next();
        if (point>500 && point<=1000 || type.equals("青铜")){
            System.out.println("你是我们9折优惠！");
        }else if (point>1000 && point<=2000 && type.equals("白银")){
            System.out.println("你是我们8折优惠！");
        }else if (point>2000 || type.equals("黄金")){
            System.out.println("你是我们7折优惠！");
        }
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
       /* Scanner sc = new Scanner(System.in);
        System.out.println("请你输入你的积分：");
        customer.point=sc.nextInt();
        customer.show(customer.point);*/
        customer.show();
    }
}
