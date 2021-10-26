import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

/**
 * @author Anderson Matte
 */
public class ConvertImageToPDF {

    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {

        // Creating a PdfWriter
        String dest = "C:\\Users\\atamborim\\Downloads\\Inter.pdf";
        PdfWriter writer = new PdfWriter(dest);
        // Creating a PdfDocument
        PdfDocument pdf = new PdfDocument(writer);

        // Creating a Document
        Document document = new Document(pdf);

        // Creating an ImageData object
        String imFile = "C:\\Users\\atamborim\\Downloads\\Inter.jpg";
        ImageData data = ImageDataFactory.create(imFile);

        // Creating an Image object
        Image image = new Image(data);

        // Adding image to the document
        document.add(image);

        // Closing the document
        document.close();

        System.out.println("Image added");


    }

}
