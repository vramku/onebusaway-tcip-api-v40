//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBParameterID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBParameterID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pid" type="{http://www.TCIP-Final-4-0-0}OB-PID" minOccurs="0"/&gt;
 *         &lt;element name="spn" type="{http://www.TCIP-Final-4-0-0}OB-SPN" minOccurs="0"/&gt;
 *         &lt;element name="pgn" type="{http://www.TCIP-Final-4-0-0}OB-PGN" minOccurs="0"/&gt;
 *         &lt;element name="footnote" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="footnoteLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBParameterID", propOrder = {
    "pid",
    "spn",
    "pgn",
    "footnote",
    "footnoteLangs"
})
public class OBParameterID {

    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger pid;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger spn;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger pgn;
    protected String footnote;
    protected CPTAdditionalLanguageContents footnoteLangs;

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPid(BigInteger value) {
        this.pid = value;
    }

    /**
     * Gets the value of the spn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpn() {
        return spn;
    }

    /**
     * Sets the value of the spn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpn(BigInteger value) {
        this.spn = value;
    }

    /**
     * Gets the value of the pgn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPgn() {
        return pgn;
    }

    /**
     * Sets the value of the pgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPgn(BigInteger value) {
        this.pgn = value;
    }

    /**
     * Gets the value of the footnote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFootnote() {
        return footnote;
    }

    /**
     * Sets the value of the footnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFootnote(String value) {
        this.footnote = value;
    }

    /**
     * Gets the value of the footnoteLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getFootnoteLangs() {
        return footnoteLangs;
    }

    /**
     * Sets the value of the footnoteLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setFootnoteLangs(CPTAdditionalLanguageContents value) {
        this.footnoteLangs = value;
    }

}
