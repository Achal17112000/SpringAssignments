package test;

import bean.Cat;
import bean.Color;
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
        Color color = context.getBean(Color.class);
        color.setBaseColor("Black");
        color.setTextureColor("Brown");
        d1.setDogName("Rubby");
        d1.setOwnerName("Rony");
        d1.setBreedName("Wild");
        d1.setColor(color);
        d1.show();

        Cat c1 = context.getBean(Cat.class);
        Color color1 = context.getBean(Color.class);
        color1.setBaseColor("White");
        color1.setTextureColor("Black");
        c1.setCatName("Lilly");
        c1.setBreedName("Wild");
        c1.setOwnerName("Rahul");
        c1.setColor(color);
        c1.show();


//        Dog d1 = (Dog) context.getBean("dog");
//        Cat c1 = (Cat) context.getBean("cat");
//        c1.setCatName("Lilly");
//        c1.setBreedName("fadf");
//        c1.setOwnerName("fefwef");
//        c1.show();

    }
}
