package config;

import bean.Cat;
import bean.Color;
import bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogCatConfiguration {

    @Bean
    public Color getColor() { return new Color(); }
    @Bean
    public Cat getCatDetail() {
        return new Cat();
    }

    @Bean
    public Dog getDog() { return new Dog(); }

}
