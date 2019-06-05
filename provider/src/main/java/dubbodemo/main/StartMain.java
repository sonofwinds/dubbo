package dubbodemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class StartMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        context.start();
        System.out.println(" app run ");
        try {
            System.in.read(); // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
