package dubbodemo.test;


import dubbodemo.contract.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        context.start();
        HelloService helloService = (HelloService) context.getBean("helloService"); // 获取bean
        String message = "";
        try {
            message = helloService.sayHello("yangxiaochen03");
            System.out.println(" the message from server is:" + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
