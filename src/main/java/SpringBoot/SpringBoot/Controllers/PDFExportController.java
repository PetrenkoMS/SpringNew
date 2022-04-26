package SpringBoot.SpringBoot.Controllers;

import SpringBoot.SpringBoot.DB.PeopleRepository;
import SpringBoot.SpringBoot.model.PeopleModel;
import SpringBoot.SpringBoot.services.GeneratePDFReport;
import com.itextpdf.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import SpringBoot.SpringBoot.Controllers.FindUserController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
public class PDFExportController {

    private final GeneratePDFReport generatePDFReport;

    public PDFExportController(GeneratePDFReport generatePDFReport) {
        this.generatePDFReport = generatePDFReport;
    }

    @GetMapping("/findUsers/pdf")
    public void generatePDF(HttpServletResponse response) throws DocumentException, IOException {

        response.setContentType("application/pdf");
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
//        String currentDateTime = dateFormat.format(new Date());

        PeopleModel user = (PeopleModel) FindUserController.userz;
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
