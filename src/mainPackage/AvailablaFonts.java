package mainPackage;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AvailablaFonts {
    public static void main(String[] args) {
        ArrayList<String> fontNames = new ArrayList<>();
        fontNames.addAll(Arrays.asList(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames()));
        for(String name:fontNames)
        {
            System.out.println(name);
        }
    }
}
