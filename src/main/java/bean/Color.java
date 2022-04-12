package bean;

import org.springframework.stereotype.Component;

@Component
public class Color {
    String baseColor;
    String textureColor;

    public String getBaseColor() {
        return baseColor;
    }

    public void setBaseColor(String baseColor) {
        this.baseColor = baseColor;
    }

    public String getTextureColor() {
        return textureColor;
    }

    public void setTextureColor(String textureColor) {
        this.textureColor = textureColor;
    }
}
