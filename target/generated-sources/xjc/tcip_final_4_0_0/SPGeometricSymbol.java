//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SPGeometricSymbol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPGeometricSymbol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parts"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="part" type="{http://www.TCIP-Final-4-0-0}SPSymbolPart"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="default-color" type="{http://www.TCIP-Final-4-0-0}CPT-Color" minOccurs="0"/&gt;
 *         &lt;element name="highlight-color" type="{http://www.TCIP-Final-4-0-0}CPT-Color" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPGeometricSymbol", propOrder = {
    "parts",
    "defaultColor",
    "highlightColor"
})
public class SPGeometricSymbol {

    @XmlElement(required = true)
    protected SPGeometricSymbol.Parts parts;
    @XmlElement(name = "default-color")
    @XmlSchemaType(name = "anySimpleType")
    protected String defaultColor;
    @XmlElement(name = "highlight-color")
    @XmlSchemaType(name = "anySimpleType")
    protected String highlightColor;

    /**
     * Gets the value of the parts property.
     * 
     * @return
     *     possible object is
     *     {@link SPGeometricSymbol.Parts }
     *     
     */
    public SPGeometricSymbol.Parts getParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPGeometricSymbol.Parts }
     *     
     */
    public void setParts(SPGeometricSymbol.Parts value) {
        this.parts = value;
    }

    /**
     * Gets the value of the defaultColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultColor() {
        return defaultColor;
    }

    /**
     * Sets the value of the defaultColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultColor(String value) {
        this.defaultColor = value;
    }

    /**
     * Gets the value of the highlightColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighlightColor() {
        return highlightColor;
    }

    /**
     * Sets the value of the highlightColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighlightColor(String value) {
        this.highlightColor = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="20"&gt;
     *         &lt;element name="part" type="{http://www.TCIP-Final-4-0-0}SPSymbolPart"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "part"
    })
    public static class Parts {

        @XmlElement(required = true)
        protected List<SPSymbolPart> part;

        /**
         * Gets the value of the part property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the part property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPart().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SPSymbolPart }
         * 
         * 
         */
        public List<SPSymbolPart> getPart() {
            if (part == null) {
                part = new ArrayList<SPSymbolPart>();
            }
            return this.part;
        }

    }

}