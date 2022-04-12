package test;

import bean.Cat;
import bean.Dog;
import config.DogCatConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DogCatTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
        context.register(DogCatConfiguration.class);
        context.refresh();

        Dog d1 = context.getBean(Dog.class);
//        d1.show();

        Cat c1 = context.getBean(Cat.class);
        c1.setCatName("Lilly");
        c1.setBreedName("fadf");
        c1.setOwnerName("fefwef");
        c1.show();


//        Dog d1 = (Dog) context.getBean("dog");
//        Cat c1 = (Cat) context.getBean("cat");
//        c1.setCatName("Lilly");
//        c1.setBreedName("fadf");
//        c1.setOwnerName("fefwef");
//        c1.show();

    }
}
