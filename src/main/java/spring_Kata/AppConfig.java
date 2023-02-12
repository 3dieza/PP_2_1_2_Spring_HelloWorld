package spring_Kata;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScans("src.main.java.spring_Kata")
public class AppConfig {
 
    @Bean(name="helloworld")
//    @Scope("prototype")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="catBean")
    @Scope("prototype")
    public Cat catBean(){
        Cat catBean = new Cat();
        catBean.setAge(5);
        catBean.setName("KotoPes");
        return catBean;
    }

}