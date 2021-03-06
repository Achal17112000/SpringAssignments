package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Cat {
    String catName;
    String ownerName;
    String breedName;

    @Autowired
    Color color;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
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
        System.out.println("*******Cat Details*******");
        System.out.println("Cat Name:" + getCatName());
        System.out.println("Owner Name:" + getOwnerName());
        System.out.println("Breed Name:" + getBreedName());
        System.out.println("Base color:" + color.getBaseColor());
        System.out.println("Texture color:" + color.getTextureColor());
    }
}
