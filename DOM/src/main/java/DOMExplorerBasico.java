import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import explorer.DOMExplorer;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Juan Lagostena on 04/09/16
 * jplagostena@gmail.com
 * .
 */
public class DOMExplorerBasico {


    public static void main(String [] args) throws IOException, SAXException {

        // Creamos el parseador
        DOMParser parser = new DOMParser();

        ClassLoader classLoader = DOMExplorerBasico.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("quilmes_2012.xml");
        // Procesamos el fichero XML
        parser.parse(new InputSource(inputStream));
        Document doc = parser.getDocument();

        DOMExplorer domExplorer = new DOMExplorer(doc);
        domExplorer.traversePreOrder();

    }



}
