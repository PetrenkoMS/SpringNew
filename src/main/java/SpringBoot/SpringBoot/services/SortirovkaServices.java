package SpringBoot.SpringBoot.services;

import SpringBoot.SpringBoot.entity.SortirovkaModel;
import SpringBoot.SpringBoot.model.ForMassiv;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@Service
public class SortirovkaServices {
    public void sortirovka(Model model) {
        model.addAttribute("stroka", new SortirovkaModel());
    }

    public ModelAndView sortirovkaBubble(SortirovkaModel stroka, Model model) {
        String str = stroka.getStringForSort();

        String[] strMassiv = str.split(" ");
        int lengthMassiv = strMassiv.length;
        int[] massiv = new int[lengthMassiv];

        for(int i = 0; i < lengthMassiv; i++) {
            massiv[i] = Integer.parseInt(strMassiv[i]);
        }

        int temp = 0;

        for(int i = 0; i < lengthMassiv-1; i++) {
            for(int j = 0; j < lengthMassiv-i-1; j++) {
                if (massiv[j] > massiv[j+1]) {
                    temp = massiv[j];
                    massiv[j] = massiv[j+1];
                    massiv[j+1] = temp;
                }
            }
        }

        ForMassiv fm = new ForMassiv();
        String strokaOut = fm.toString(massiv);

        stroka.setStringBubbleSorted(strokaOut);
        model.addAttribute("stroka", stroka);
        return new ModelAndView("sortirovka");
    }

    public ModelAndView sortirovkaLin(SortirovkaModel stroka, Model model) {
        String str = stroka.getStringForSort();

        String[] strMassiv = str.split(" ");
        int lengthMassiv = strMassiv.length;
        int[] massiv = new int[lengthMassiv];;

        for(int i = 0; i < lengthMassiv; i++) {
            massiv[i] = Integer.parseInt(strMassiv[i]);
        }

        int temp = 0;

        for(int i = 0; i < lengthMassiv-1; i++) {
            for(int j = i+1; j < lengthMassiv; j++) {
                if (massiv[i] > massiv[j]) {
                    temp = massiv[i];
                    massiv[i] = massiv[j];
                    massiv[j] = temp;
                }
            }
        }

        ForMassiv fm = new ForMassiv();
        String strokaOut = fm.toString(massiv);

        stroka.setStringLinSorted(strokaOut);
        model.addAttribute("stroka", stroka);
        return new ModelAndView("sortirovka");
    }
}
