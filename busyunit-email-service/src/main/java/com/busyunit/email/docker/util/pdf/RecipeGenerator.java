/**
 * {@code BookRequest} represents a request during book creation.
 * <p/>
 *
 * @author Ram Ayall
 * @since 17/03/19
 */
package com.busyunit.email.docker.util.pdf;

import com.busyunit.email.docker.dto.EBook;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class RecipeGenerator {

    private static final String TITLE = "TestReport";

    public static ByteArrayInputStream generatePDFRecipe(){

        List<EBook> dataObjList = getDataObjectList();

        Document document = new Document();
        ByteArrayOutputStream out = new ByteArrayOutputStream();


        try {
            //Document is not auto-closable hence need to close it separately
            document = new Document(PageSize.A4);
            PdfWriter writer = PdfWriter.getInstance(document, out);
            HeaderFooter event = new HeaderFooter();
            event.setHeader("Test Recipe");
            writer.setPageEvent(event);
            document.open();
            PDFCreator.addMetaData(document, TITLE);
            PDFCreator.addTitlePage(document, TITLE);
            PDFCreator.addContent(document, dataObjList);
        }catch (DocumentException e) {
            e.printStackTrace();
            System.out.println("FileNotFoundException occurs.." + e.getMessage());
        }finally{

            if(null != document){
                document.close();
            }
        }


        return new ByteArrayInputStream(out.toByteArray());
    }



    public static List<EBook> getDataObjectList(){
        List<EBook> dataObjList = new ArrayList<EBook>();
        EBook d1 = new EBook();
        d1.setComanyName("ABC");
        d1.setIncome("20000");
        d1.setYear("2017");
        EBook d2 = new EBook();
        d2.setComanyName("XYZ");
        d2.setIncome("30000");
        d2.setYear("2017");
        dataObjList.add(d1);
        dataObjList.add(d2);
        return dataObjList;
    }
}
