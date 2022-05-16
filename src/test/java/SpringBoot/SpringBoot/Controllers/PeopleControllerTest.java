package SpringBoot.SpringBoot.Controllers;

import SpringBoot.SpringBoot.DB.PeopleRepository;
import SpringBoot.SpringBoot.entity.PeopleModel;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
//@WebMvcTest(PeopleController.class)
//@TestPropertySource(locations = "classpath:application-test.properties")
class PeopleControllerTest {


    private MockMvc mockMvc;

    @Mock
    @Autowired
    PeopleRepository pRepository;

//    @MockBean
//    @Autowired
//    UserRepository userRepository;

    @Test
    public void peopleSubmit() {
        PeopleModel people = new PeopleModel(80, "1qqq", "gogo", "Ivan", "Gagarin", "male", "24", "1111", "222222", "i am Ivan", "88009992323", null);
//        pRepository.save(people);

        List<PeopleModel> employLogin = pRepository.findByLogin(people.getLogin());
        List<PeopleModel> employSeriesAndNumber = pRepository.findBySeriesPassportAndNumberPassport(people.getSeriesPassport(),
                people.getNumberPassport());

        if (employLogin.size() == 0) {

            if (employSeriesAndNumber.size() == 0) {
                assertNotNull(pRepository.findByLogin("qqq"));
                System.out.println("sout if: ");
            } else {
                assertNotNull(employSeriesAndNumber);
                System.out.println("sout Wrong Series Or Number: " + employSeriesAndNumber.get(0).getSeriesPassport() + " " + employSeriesAndNumber.get(0).getNumberPassport());
                assertTrue(employLogin.size() == 0, "Логин неверный (но здесь этого сообщения не должно быть");
                assertTrue(employSeriesAndNumber.size() == 0, "Серия и номер уже есть");
            }
        }
        else {
            assertNotNull(employLogin);
            System.out.println("sout Wrong_login: "+ employLogin.get(0).getLogin());
            assertTrue(employLogin.size() == 0, "Логин неверный");
        }
    }


}

