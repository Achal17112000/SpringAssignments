package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Dog {
    String dogName;
    String ownerName;
    String breedName;

    @Autowired
    Color color;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void show() {
        System.out.println("*******Dog Detail*******");
        System.out.println("Dog Name:" + getDogName());
        System.out.println("Owner Name:" + getOwnerName());
        System.out.println("Breed Name:" + getBreedName());
        System.out.println("Base color:" + color.getBaseColor());
        System.out.println("Texture color:" + color.getTextureColor());
    }
}
