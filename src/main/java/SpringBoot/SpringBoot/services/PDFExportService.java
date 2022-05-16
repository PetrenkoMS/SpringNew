package SpringBoot.SpringBoot.services;

import SpringBoot.SpringBoot.entity.PeopleModel;
import com.itextpdf.text.DocumentException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static SpringBoot.SpringBoot.services.FindUserServices.userz;

@Service
public class PDFExportService {

    private final GeneratePDFReport generatePDFReport;

    public PDFExportService(GeneratePDFReport generatePDFReport) {
        this.generatePDFReport = generatePDFReport;
    }

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
