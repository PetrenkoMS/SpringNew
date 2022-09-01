package SpringBoot.SpringBoot.services;

import SpringBoot.SpringBoot.entity.SortirovkaModel;
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
        int[] massiv = null;

        for(int i = 0; i < lengthMassiv; i++) {
            massiv[i] = Integer.parseInt(strMassiv[i]);
        }

        int temp = 0;

        for(int i = 0; i < lengthMassiv-1; i++) {
                if (massiv[i] > massiv[i+1]) {
                    temp = massiv[i];
                    massiv[i] = massiv[i+1];
                    massiv[i+1] = temp;
                }
        }

        String strokaOut = massiv.toString();

        stroka.setStringBubbleSorted(strokaOut);
        return new ModelAndView("sortirovka");
    }

    public ModelAndView sortirovkaLin(SortirovkaModel stroka, Model model) {
        String str = stroka.getStringForSort();

        String[] strMassiv = str.split(" ");
        int lengthMassiv = strMassiv.length;
        int[] massiv = null;

        for(int i = 0; i < lengthMassiv; i++) {
            massiv[i] = Integer.parseInt(strMassiv[i]);
        }

        int temp = 0;

        for(int i = 0; i < lengthMassiv-1; i++) {
            for(int j = i+1; j < lengthMassiv-i; j++) {
                if (massiv[i] > massiv[j]) {
                    temp = massiv[i];
                    massiv[i] = massiv[j];
                    massiv[j] = temp;
                }
            }
        }

        String strokaOut = massiv.toString();

        stroka.setStringLinSorted(strokaOut);
        return new ModelAndView("sortirovka");
    }
}
