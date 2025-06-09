package com.tugas.utils.iconfont;

import java.awt.Color;
import javax.swing.Icon;

public class GoogleMaterialIcon {
    private GoogleMaterialDesignIcon icon;
    private GradientType gradientType;
    private Color color1;
    private Color color2;
    private int size;

    public GoogleMaterialDesignIcon getIcon() {
        return this.icon;
    }

    public void setIcon(GoogleMaterialDesignIcon icon) {
        this.icon = icon;
    }

    public GradientType getGradientType() {
        return this.gradientType;
    }

    public void setGradientType(GradientType gradientType) {
        this.gradientType = gradientType;
    }

    public Color getColor1() {
        return this.color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return this.color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public GoogleMaterialIcon(GoogleMaterialDesignIcon icon, GradientType gradientType, Color color1, Color color2, int size) {
        this();
        this.icon = icon;
        this.gradientType = gradientType;
        this.color1 = color1;
        this.color2 = color2;
        this.size = size;
   }

    public GoogleMaterialIcon() {
        this.icon = GoogleMaterialDesignIcon.IMAGE;
        this.gradientType = GradientType.HORIZONTAL;
        this.color1 = new Color(127, 0, 255);
        this.color2 = new Color(225, 0, 255);
        this.size = 15;
        IconFont iconFont = GoogleMaterialDesignIcon.getIconFont();
        System.out.println("Registering iconFont: " + (iconFont != null));
        IconFontSwing.register(iconFont);
   }

    public Icon toIcon() {
        return IconFontSwing.buildIcon(this.icon, (float)this.size, this.color1, this.color2, this.gradientType);
    }
}
