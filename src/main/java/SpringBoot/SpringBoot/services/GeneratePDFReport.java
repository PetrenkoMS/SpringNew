package SpringBoot.SpringBoot.services;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Бизнес-логика для создания pdf файла
 */
@Transactional
@Service
public class GeneratePDFReport {

    /**
     * Создание pdf файла с данными пользователя
     * @param response
     * @param userInfo информация о пользователе
     * @throws IOException
     * @throws DocumentException
     */
    public void export(HttpServletResponse response, List<String> userInfo) throws IOException, DocumentException {

        String FONT_FILENAME = "assets/fonts/arial.ttf";

        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();

        Font fontTitle = FontFactory.getFont(FONT_FILENAME);
        fontTitle.setSize(18);

        Paragraph paragraph = new Paragraph("Result", fontTitle);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(paragraph);

        Paragraph paragraphBr = new Paragraph("   ", fontTitle);
        paragraphBr.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(paragraphBr);

        Font fontParagraph = FontFactory.getFont(FONT_FILENAME);
        fontParagraph.setSize(12);

        for (int i = 0; i < userInfo.size(); i++) {
            Paragraph paragraph2 = new Paragraph(userInfo.get(i), fontParagraph);
            paragraph2.setAlignment(Paragraph.ALIGN_CENTER);

            document.add(paragraph2);
        }

        document.close();
    }
}
