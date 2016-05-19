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
 * <p>Java class for IMResponsePerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IMResponsePerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response-agency" type="{http://www.TCIP-Final-4-0-0}IM-ResponseAgencyID"/&gt;
 *         &lt;element name="employee-functions"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="employee-function" type="{http://www.TCIP-Final-4-0-0}IM-EmployeeFunction"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="person-id" type="{http://www.TCIP-Final-4-0-0}IM-PersonIdentifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IMResponsePerson", propOrder = {
    "responseAgency",
    "employeeFunctions",
    "personId"
})
public class IMResponsePerson {

    @XmlElement(name = "response-agency", required = true)
    protected String responseAgency;
    @XmlElement(name = "employee-functions", required = true)
    protected IMResponsePerson.EmployeeFunctions employeeFunctions;
    @XmlElement(name = "person-id", required = true)
    protected String personId;

    /**
     * Gets the value of the responseAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseAgency() {
        return responseAgency;
    }

    /**
     * Sets the value of the responseAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseAgency(String value) {
        this.responseAgency = value;
    }

    /**
     * Gets the value of the employeeFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link IMResponsePerson.EmployeeFunctions }
     *     
     */
    public IMResponsePerson.EmployeeFunctions getEmployeeFunctions() {
        return employeeFunctions;
    }

    /**
     * Sets the value of the employeeFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMResponsePerson.EmployeeFunctions }
     *     
     */
    public void setEmployeeFunctions(IMResponsePerson.EmployeeFunctions value) {
        this.employeeFunctions = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
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
     *         &lt;element name="employee-function" type="{http://www.TCIP-Final-4-0-0}IM-EmployeeFunction"/&gt;
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
        "employeeFunction"
    })
    public static class EmployeeFunctions {

        @XmlElement(name = "employee-function", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> employeeFunction;

        /**
         * Gets the value of the employeeFunction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employeeFunction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployeeFunction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEmployeeFunction() {
            if (employeeFunction == null) {
                employeeFunction = new ArrayList<String>();
            }
            return this.employeeFunction;
        }

    }

}
