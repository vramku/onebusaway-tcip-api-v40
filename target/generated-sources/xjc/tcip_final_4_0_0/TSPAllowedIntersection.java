//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.24 at 02:32:24 PM EDT 
//


package tcip_final_4_0_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSPAllowedIntersection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSPAllowedIntersection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intersection" type="{http://www.TCIP-Final-4-0-0}CPTIntersectionIden"/&gt;
 *         &lt;element name="allowed-approaches" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="allowed-approache" type="{http://www.TCIP-Final-4-0-0}TSP-ApproachID"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="boundaries" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="boundarie" type="{http://www.TCIP-Final-4-0-0}TSP-BoundaryID"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPAllowedIntersection", propOrder = {
    "intersection",
    "allowedApproaches",
    "boundaries"
})
public class TSPAllowedIntersection {

    @XmlElement(required = true)
    protected CPTIntersectionIden intersection;
    @XmlElement(name = "allowed-approaches")
    protected TSPAllowedIntersection.AllowedApproaches allowedApproaches;
    protected TSPAllowedIntersection.Boundaries boundaries;

    /**
     * Gets the value of the intersection property.
     * 
     * @return
     *     possible object is
     *     {@link CPTIntersectionIden }
     *     
     */
    public CPTIntersectionIden getIntersection() {
        return intersection;
    }

    /**
     * Sets the value of the intersection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTIntersectionIden }
     *     
     */
    public void setIntersection(CPTIntersectionIden value) {
        this.intersection = value;
    }

    /**
     * Gets the value of the allowedApproaches property.
     * 
     * @return
     *     possible object is
     *     {@link TSPAllowedIntersection.AllowedApproaches }
     *     
     */
    public TSPAllowedIntersection.AllowedApproaches getAllowedApproaches() {
        return allowedApproaches;
    }

    /**
     * Sets the value of the allowedApproaches property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPAllowedIntersection.AllowedApproaches }
     *     
     */
    public void setAllowedApproaches(TSPAllowedIntersection.AllowedApproaches value) {
        this.allowedApproaches = value;
    }

    /**
     * Gets the value of the boundaries property.
     * 
     * @return
     *     possible object is
     *     {@link TSPAllowedIntersection.Boundaries }
     *     
     */
    public TSPAllowedIntersection.Boundaries getBoundaries() {
        return boundaries;
    }

    /**
     * Sets the value of the boundaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPAllowedIntersection.Boundaries }
     *     
     */
    public void setBoundaries(TSPAllowedIntersection.Boundaries value) {
        this.boundaries = value;
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
     *       &lt;sequence maxOccurs="10"&gt;
     *         &lt;element name="allowed-approache" type="{http://www.TCIP-Final-4-0-0}TSP-ApproachID"/&gt;
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
        "allowedApproache"
    })
    public static class AllowedApproaches {

        @XmlElement(name = "allowed-approache", required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected List<BigInteger> allowedApproache;

        /**
         * Gets the value of the allowedApproache property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the allowedApproache property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAllowedApproache().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getAllowedApproache() {
            if (allowedApproache == null) {
                allowedApproache = new ArrayList<BigInteger>();
            }
            return this.allowedApproache;
        }

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
     *       &lt;sequence maxOccurs="10"&gt;
     *         &lt;element name="boundarie" type="{http://www.TCIP-Final-4-0-0}TSP-BoundaryID"/&gt;
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
        "boundarie"
    })
    public static class Boundaries {

        @XmlElement(required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected List<BigInteger> boundarie;

        /**
         * Gets the value of the boundarie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the boundarie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBoundarie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getBoundarie() {
            if (boundarie == null) {
                boundarie = new ArrayList<BigInteger>();
            }
            return this.boundarie;
        }

    }

}
