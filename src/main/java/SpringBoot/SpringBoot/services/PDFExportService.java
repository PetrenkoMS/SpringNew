package SpringBoot.SpringBoot.services;

import SpringBoot.SpringBoot.entity.PeopleModel;
import com.itextpdf.text.DocumentException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static SpringBoot.SpringBoot.services.FindUserServices.userz;

/**
 * Бизнес-логика для создания и заполнения pdf файла с данными о найденном пользователе
 */
@Transactional
@Service
public class PDFExportService {

    private final GeneratePDFReport generatePDFReport;

    /**
     * Для генерации pdf документа
     * @param generatePDFReport
     */
    public PDFExportService(GeneratePDFReport generatePDFReport) {
        this.generatePDFReport = generatePDFReport;
    }

    /**
     * Создание и заполнение pdf файла
     * @param response
     * @throws DocumentException
     * @throws IOException
     */
    public void generatePDF(HttpServletResponse response) throws DocumentException, IOException {

        response.setContentType("application/pdf");
        PeopleModel user = (PeopleModel) userz;
        String namePdf = user.getName() + "_" + user.getSeriesPassport()+ "_" + user.getNumberPassport();

        response.setHeader("Content-disposition", "attachment; filename=\"" + namePdf + ".pdf" + "\"");

        String tmpUser = "Name: " + user.getName() + "%" +
                "Second name: " + user.getSecondName() + "%" +
                "Age: " + user.getAge() + "%" +
                "Gender: " + user.getGender() + "%" +
                "Passport series: " + user.getSeriesPassport() + "%" +
                "Passport number: " + user.getNumberPassport() + "%" +
                "Phone: " + user.getTelephone() + "%" +
                "Another info: " + user.getAbout();


        List<String> userInfo = List.of(tmpUser.split("%"));

        this.generatePDFReport.export(response, userInfo);
    }
}
