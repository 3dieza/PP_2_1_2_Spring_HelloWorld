
package spring_Kata;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        System.out.println(bean==bean2);

        Cat catBean1 = (Cat) applicationContext.getBean("catBean");
//        System.out.println("Котэ зовут: "+catBean1.getName()+" и возраст у него: "+catBean1.getAge());
        System.out.println(catBean1);

        Cat catBean2 = (Cat) applicationContext.getBean("catBean");
        System.out.println(catBean2);
        System.out.println(catBean1==catBean2);
    }
}