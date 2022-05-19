package SpringBoot.SpringBoot.Controllers;

import SpringBoot.SpringBoot.DB.PeopleRepository;
import SpringBoot.SpringBoot.entity.PeopleModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FindUserControllerTest {

    private MockMvc mockMvc;

    //    @MockBean
    @Autowired
    PeopleRepository pRepository;

    @Test
    void findUser() {
        String series_user = "1111";
        String number_user = "111111";
        //1111 222222
        PeopleModel user = new PeopleModel(58L, "Mike", "qwe", "Михаил", "Петренко", "male", "23", series_user, number_user, "Smile more often!", "88005553535", null);
        PeopleModel peopleIf = new PeopleModel(58L, "Mike", "qwe", "Михаил", "Петренко", "male", "23", "1111", "222222", "Smile more often!", "88005553535", "ok");
        PeopleModel peopleElse = new PeopleModel(58L, "Mike", "qwe", "Михаил", "Петренко", "male", "23", "1111", "222222", "Smile more often!", "88005553535", "Данный пользователь не зарегистрирован!");

        String series = user.getSeriesPassport();
        String number = user.getNumberPassport();
        List<PeopleModel> employSeriesAndNumber = pRepository.findBySeriesPassportAndNumberPassport(series,number);

        if (employSeriesAndNumber.size() == 1) {
            user = employSeriesAndNumber.get(0);
            user.setEr("ok");
            assertTrue(String.valueOf(peopleIf.getEr()) == String.valueOf(user.getEr()), "Не совпали -- er ok \"не добавился\"");
        }
        else {
            user.setEr("Данный пользователь не зарегистрирован!");
            user.setSeriesPassport(null);
            user.setNumberPassport(null);
            assertTrue(peopleElse.getEr() == user.getEr(), "Не совпали -- er \"Не зарегистрирован\" не добавился");

            assertTrue(employSeriesAndNumber.size() == 1, "Номера и серии НЕТ");
        }

    }
}