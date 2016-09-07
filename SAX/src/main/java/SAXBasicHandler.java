import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by Juan Lagostena on 04/09/16
 * jlagostena@bitsense.com.ar
 * .
 */
public class SAXBasicHandler extends DefaultHandler {

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Larrrgaron!");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        System.out.println(uri + " - " + localName + " - " + qName + " - " + attributes);
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Y cruzaaaron el discoooo!");
    }

}
