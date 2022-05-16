//package SpringBoot.SpringBoot.Controllers;
//
//import SpringBoot.SpringBoot.entity.PeopleModel;
//import SpringBoot.SpringBoot.services.GeneratePDFReport;
//import SpringBoot.SpringBoot.services.PDFExportService;
//import com.itextpdf.text.DocumentException;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//import static SpringBoot.SpringBoot.services.FindUserServices.userz;
//
//
//@RestController
//public class PDFExportController {
//
//    private final GeneratePDFReport generatePDFReport;
//    private final PDFExportService pDFExportService;
//
//    public PDFExportController(GeneratePDFReport generatePDFReport, PDFExportService pDFExportService) {
//        this.generatePDFReport = generatePDFReport;
//        this.pDFExportService = pDFExportService;
//    }
//
//    @GetMapping("/findUsers/pdf")
//    public void generatePDF(HttpServletResponse response) throws DocumentException, IOException {
//        pDFExportService.generatePDF(response);
//    }
//
////        response.setContentType("application/pdf");
//////        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
//////        String currentDateTime = dateFormat.format(new Date());
////
////        PeopleModel user = (PeopleModel) userz;
////        String namePdf = user.getName() + "_" + user.getSeriesPassport()+ "_" + user.getNumberPassport();
////
////        response.setHeader("Content-disposition", "attachment; filename=\"" + namePdf + ".pdf" + "\"");
////
////        String tmpUser = "Name: " + user.getName() + "%" +
////                        "Second name: " + user.getSecondName() + "%" +
////                        "Age: " + user.getAge() + "%" +
////                        "Gender: " + user.getGender() + "%" +
////                        "Passport series: " + user.getSeriesPassport() + "%" +
////                        "Passport number: " + user.getNumberPassport() + "%" +
////                        "Phone: " + user.getTelephone() + "%" +
////                        "Another info: " + user.getAbout();
////
////
////        List<String> userInfo = List.of(tmpUser.split("%"));
////
////        this.generatePDFReport.export(response, userInfo);
////    }
//}
