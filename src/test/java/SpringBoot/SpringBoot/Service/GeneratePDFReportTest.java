package SpringBoot.SpringBoot.Service;

import SpringBoot.SpringBoot.entity.PeopleModel;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class GeneratePDFReportTest {

    @Test
    void generate() throws DocumentException, FileNotFoundException {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        String series_user = "1111";
        String number_user = "111111";
        PeopleModel user = new PeopleModel(58, "Mike", "qwe", "Михаил", "Петренко", "male", "23", series_user, number_user, "Smile more often!", "88005553535", null);
        PeopleModel peopleIf = new PeopleModel(58, "Mike", "qwe", "Михаил", "Петренко", "male", "23", "1111", "222222", "Smile more often!", "88005553535", "ok");
        PeopleModel peopleElse = new PeopleModel(58, "Mike", "qwe", "Михаил", "Петренко", "male", "23", "1111", "222222", "Smile more often!", "88005553535", "Данный пользователь не зарегистрирован!");

        java.util.List<String> userInfo = List.of("Name","Second Name", "Age", "Gender", "Series passport", "Number passport", "telephone", "About");
        java.util.List<String> userInfo1 = List.of();
        String FONT_FILENAME = "assets/fonts/arial.ttf";

        String dest = "C:/Users/Home/Desktop/Java/SpringNew/src/test/pdf/test.pdf";
        Document document = new Document();
        PdfWriter.getInstance(document, byteArrayOutputStream);
        document.open();

        Font fontTitle = FontFactory.getFont(FONT_FILENAME);
        fontTitle.setSize(18);

        Font fontParagraph = FontFactory.getFont(FONT_FILENAME);
        fontParagraph.setSize(12);

        for (int i = 0; i < userInfo.size(); i++) {
            Paragraph paragraph2 = new Paragraph(userInfo.get(i), fontParagraph);
            paragraph2.setAlignment(Paragraph.ALIGN_CENTER);

            document.add(paragraph2);
        }
        document.close();

        byte[] pdfBytes = byteArrayOutputStream.toByteArray();
        assertNotNull(pdfBytes, "Документ пуст");
    }
}
