//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package lrms_final_09_07_for_atis_im;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StreetInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreetInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="prefix" type="{http://www.lrms-final-09-07-for-atis-im}Text-name-presuf4" maxOccurs="4" minOccurs="0"/&gt;
 *           &lt;element name="name" type="{http://www.lrms-final-09-07-for-atis-im}Text-name255"/&gt;
 *           &lt;element name="suffix" type="{http://www.lrms-final-09-07-for-atis-im}Text-name-presuf4" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="streetIndex" type="{http://www.lrms-final-09-07-for-atis-im}IdType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreetInfo", propOrder = {
    "prefix",
    "name",
    "suffix",
    "streetIndex"
})
public class StreetInfo {

    protected List<String> prefix;
    protected String name;
    protected List<String> suffix;
    protected IdType streetIndex;

    /**
     * Gets the value of the prefix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrefix() {
        if (prefix == null) {
            prefix = new ArrayList<String>();
        }
        return this.prefix;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuffix() {
        if (suffix == null) {
            suffix = new ArrayList<String>();
        }
        return this.suffix;
    }

    /**
     * Gets the value of the streetIndex property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getStreetIndex() {
        return streetIndex;
    }

    /**
     * Sets the value of the streetIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setStreetIndex(IdType value) {
        this.streetIndex = value;
    }

}
