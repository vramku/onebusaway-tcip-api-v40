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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCHActualRunningTimeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCHActualRunningTimeData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scheduled" type="{http://www.TCIP-Final-4-0-0}SCHRunningTimeEntry"/&gt;
 *         &lt;element name="actuals"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20000"&gt;
 *                   &lt;element name="actual" type="{http://www.TCIP-Final-4-0-0}SCHActualRunTime"/&gt;
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
@XmlType(name = "SCHActualRunningTimeData", propOrder = {
    "scheduled",
    "actuals"
})
public class SCHActualRunningTimeData {

    @XmlElement(required = true)
    protected SCHRunningTimeEntry scheduled;
    @XmlElement(required = true)
    protected SCHActualRunningTimeData.Actuals actuals;

    /**
     * Gets the value of the scheduled property.
     * 
     * @return
     *     possible object is
     *     {@link SCHRunningTimeEntry }
     *     
     */
    public SCHRunningTimeEntry getScheduled() {
        return scheduled;
    }

    /**
     * Sets the value of the scheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHRunningTimeEntry }
     *     
     */
    public void setScheduled(SCHRunningTimeEntry value) {
        this.scheduled = value;
    }

    /**
     * Gets the value of the actuals property.
     * 
     * @return
     *     possible object is
     *     {@link SCHActualRunningTimeData.Actuals }
     *     
     */
    public SCHActualRunningTimeData.Actuals getActuals() {
        return actuals;
    }

    /**
     * Sets the value of the actuals property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCHActualRunningTimeData.Actuals }
     *     
     */
    public void setActuals(SCHActualRunningTimeData.Actuals value) {
        this.actuals = value;
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
     *       &lt;sequence maxOccurs="20000"&gt;
     *         &lt;element name="actual" type="{http://www.TCIP-Final-4-0-0}SCHActualRunTime"/&gt;
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
        "actual"
    })
    public static class Actuals {

        @XmlElement(required = true)
        protected List<SCHActualRunTime> actual;

        /**
         * Gets the value of the actual property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actual property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActual().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SCHActualRunTime }
         * 
         * 
         */
        public List<SCHActualRunTime> getActual() {
            if (actual == null) {
                actual = new ArrayList<SCHActualRunTime>();
            }
            return this.actual;
        }

    }

}
