package SpringBoot.SpringBoot.model;

import lombok.Getter;
import lombok.Setter;

public class ForMassiv {
    @Getter
    @Setter
    private int[] massiv;

    public String toString(int[] temp) {
        String str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i]) + " ";
        }
        str = str.substring(0, str.length() - 1);

        return str;
    }

    public ForMassiv(int[] massiv) {
        this.massiv = massiv;
    }

    public ForMassiv() {
    }
}
