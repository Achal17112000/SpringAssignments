package config;

import bean.Cat;
import bean.Color;
import bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogCatConfiguration {

//    @Bean
//    public Dog getDogDetail() {
//        Dog d1 = new Dog();
//        d1.setDogName("Kalu");
//        d1.setOwnerName("Raju");
//        d1.setBreedName("tiger");
//        d1.getColor().setBaseColor("Brown");
//        d1.getColor().setTextureColor("Golden");
//        return d1;
//    }

    @Bean
    public Cat getCatDetail() {
        return new Cat();
    }

    @Bean
    public Dog getDog() { return new Dog(); }

}
