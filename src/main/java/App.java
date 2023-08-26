import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat catBean =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(catBean.getMessage());
        Cat catBean1 =
                (Cat) applicationContext.getBean("Cat");
        System.out.println(catBean1.getMessage());


        System.out.println(bean.equals(bean1));
        System.out.println(catBean.equals(catBean1));
    }
}