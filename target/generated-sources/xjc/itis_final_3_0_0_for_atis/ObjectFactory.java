//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package itis_final_3_0_0_for_atis;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the itis_final_3_0_0_for_atis package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ITIScodesAndTextItis_QNAME = new QName("", "itis");
    private final static QName _ITIScodesAndTextText_QNAME = new QName("", "text");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: itis_final_3_0_0_for_atis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ITIScodesAndText }
     * 
     */
    public ITIScodesAndText createITIScodesAndText() {
        return new ITIScodesAndText();
    }

    /**
     * Create an instance of {@link ITISEventType }
     * 
     */
    public ITISEventType createITISEventType() {
        return new ITISEventType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "itis", scope = ITIScodesAndText.class)
    public JAXBElement<List<String>> createITIScodesAndTextItis(List<String> value) {
        return new JAXBElement<List<String>>(_ITIScodesAndTextItis_QNAME, ((Class) List.class), ITIScodesAndText.class, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "text", scope = ITIScodesAndText.class)
    public JAXBElement<String> createITIScodesAndTextText(String value) {
        return new JAXBElement<String>(_ITIScodesAndTextText_QNAME, String.class, ITIScodesAndText.class, value);
    }

}
