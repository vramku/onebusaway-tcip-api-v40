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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lrms_final_09_07.AddressPoint;
import org.joda.time.LocalDate;


/**
 * <p>Java class for CPTEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPTEmployee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="employee" type="{http://www.TCIP-Final-4-0-0}CPTEmployeeIden"/&gt;
 *         &lt;element name="metadata" type="{http://www.TCIP-Final-4-0-0}CPTRowMetaData" minOccurs="0"/&gt;
 *         &lt;element name="employeeTel" type="{http://www.TCIP-Final-4-0-0}CPT-EmployeeTelephone"/&gt;
 *         &lt;element name="homeAddress" type="{http://www.lrms-final-09-07}AddressPoint"/&gt;
 *         &lt;element name="emergencyContactFirst" type="{http://www.TCIP-Final-4-0-0}CPT-PersonFirstName" minOccurs="0"/&gt;
 *         &lt;element name="emergencyContactFirstLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="emergencyContactMiddle" type="{http://www.TCIP-Final-4-0-0}CPT-PersonMiddleName" minOccurs="0"/&gt;
 *         &lt;element name="emergencyContactMiddleLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="emergencyContactLast" type="{http://www.TCIP-Final-4-0-0}CPT-PersonLastName" minOccurs="0"/&gt;
 *         &lt;element name="emergencyContactLastLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="emergencyTelephone" type="{http://www.TCIP-Final-4-0-0}CPT-PhoneNumber"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="pagerNumber" type="{http://www.TCIP-Final-4-0-0}CPT-PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="cellPhoneNumber" type="{http://www.TCIP-Final-4-0-0}CPT-PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="workPhone" type="{http://www.TCIP-Final-4-0-0}CPT-PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="dateHired" type="{http://www.TCIP-Final-4-0-0}CPT-Date" minOccurs="0"/&gt;
 *         &lt;element name="dateSeniority" type="{http://www.TCIP-Final-4-0-0}CPT-Date" minOccurs="0"/&gt;
 *         &lt;element name="dateTerminated" type="{http://www.TCIP-Final-4-0-0}CPT-Date" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.TCIP-Final-4-0-0}CPT-Sex" minOccurs="0"/&gt;
 *         &lt;element name="birthdate" type="{http://www.TCIP-Final-4-0-0}CPT-Date"/&gt;
 *         &lt;element name="facility" type="{http://www.TCIP-Final-4-0-0}CPTTransitFacilityIden" minOccurs="0"/&gt;
 *         &lt;element name="organization" type="{http://www.TCIP-Final-4-0-0}CPTOrganizationalUnitIden"/&gt;
 *         &lt;element name="jobCategory" type="{http://www.TCIP-Final-4-0-0}CPT-EmplJobCat"/&gt;
 *         &lt;element name="jobCategoryDesc" type="{http://www.TCIP-Final-4-0-0}CPT-EmplJobCatDesc" minOccurs="0"/&gt;
 *         &lt;element name="jobCategoryDescLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="work-week-days" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="25"&gt;
 *                   &lt;element name="work-week-day" type="{http://www.TCIP-Final-4-0-0}SCH-DayType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="comment" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="commentLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="operatorBase" type="{http://www.TCIP-Final-4-0-0}CPTOperatorBaseIden" minOccurs="0"/&gt;
 *         &lt;element name="localCPTEmployee" type="{http://www.tcip-4-0-0-local}CPTEmployee" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPTEmployee", propOrder = {
    "employee",
    "metadata",
    "employeeTel",
    "homeAddress",
    "emergencyContactFirst",
    "emergencyContactFirstLangs",
    "emergencyContactMiddle",
    "emergencyContactMiddleLangs",
    "emergencyContactLast",
    "emergencyContactLastLangs",
    "emergencyTelephone",
    "emailAddress",
    "pagerNumber",
    "cellPhoneNumber",
    "workPhone",
    "dateHired",
    "dateSeniority",
    "dateTerminated",
    "gender",
    "birthdate",
    "facility",
    "organization",
    "jobCategory",
    "jobCategoryDesc",
    "jobCategoryDescLangs",
    "workWeekDays",
    "comment",
    "commentLangs",
    "operatorBase",
    "localCPTEmployee"
})
public class CPTEmployee {

    @XmlElement(required = true)
    protected CPTEmployeeIden employee;
    protected CPTRowMetaData metadata;
    @XmlElement(required = true)
    protected String employeeTel;
    @XmlElement(required = true)
    protected AddressPoint homeAddress;
    protected String emergencyContactFirst;
    protected CPTAdditionalLanguageContents emergencyContactFirstLangs;
    protected String emergencyContactMiddle;
    protected CPTAdditionalLanguageContents emergencyContactMiddleLangs;
    protected String emergencyContactLast;
    protected CPTAdditionalLanguageContents emergencyContactLastLangs;
    @XmlElement(required = true)
    protected String emergencyTelephone;
    protected String emailAddress;
    protected String pagerNumber;
    protected String cellPhoneNumber;
    protected String workPhone;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalDate dateHired;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalDate dateSeniority;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalDate dateTerminated;
    @XmlSchemaType(name = "anySimpleType")
    protected String gender;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected LocalDate birthdate;
    protected CPTTransitFacilityIden facility;
    @XmlElement(required = true)
    protected CPTOrganizationalUnitIden organization;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String jobCategory;
    protected String jobCategoryDesc;
    protected CPTAdditionalLanguageContents jobCategoryDescLangs;
    @XmlElement(name = "work-week-days")
    protected CPTEmployee.WorkWeekDays workWeekDays;
    protected String comment;
    protected CPTAdditionalLanguageContents commentLangs;
    protected CPTOperatorBaseIden operatorBase;
    protected tcip_4_0_0_local.CPTEmployee localCPTEmployee;

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link CPTEmployeeIden }
     *     
     */
    public CPTEmployeeIden getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTEmployeeIden }
     *     
     */
    public void setEmployee(CPTEmployeeIden value) {
        this.employee = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link CPTRowMetaData }
     *     
     */
    public CPTRowMetaData getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTRowMetaData }
     *     
     */
    public void setMetadata(CPTRowMetaData value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the employeeTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeTel() {
        return employeeTel;
    }

    /**
     * Sets the value of the employeeTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeTel(String value) {
        this.employeeTel = value;
    }

    /**
     * Gets the value of the homeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPoint }
     *     
     */
    public AddressPoint getHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets the value of the homeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPoint }
     *     
     */
    public void setHomeAddress(AddressPoint value) {
        this.homeAddress = value;
    }

    /**
     * Gets the value of the emergencyContactFirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactFirst() {
        return emergencyContactFirst;
    }

    /**
     * Sets the value of the emergencyContactFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactFirst(String value) {
        this.emergencyContactFirst = value;
    }

    /**
     * Gets the value of the emergencyContactFirstLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getEmergencyContactFirstLangs() {
        return emergencyContactFirstLangs;
    }

    /**
     * Sets the value of the emergencyContactFirstLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setEmergencyContactFirstLangs(CPTAdditionalLanguageContents value) {
        this.emergencyContactFirstLangs = value;
    }

    /**
     * Gets the value of the emergencyContactMiddle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactMiddle() {
        return emergencyContactMiddle;
    }

    /**
     * Sets the value of the emergencyContactMiddle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactMiddle(String value) {
        this.emergencyContactMiddle = value;
    }

    /**
     * Gets the value of the emergencyContactMiddleLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getEmergencyContactMiddleLangs() {
        return emergencyContactMiddleLangs;
    }

    /**
     * Sets the value of the emergencyContactMiddleLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setEmergencyContactMiddleLangs(CPTAdditionalLanguageContents value) {
        this.emergencyContactMiddleLangs = value;
    }

    /**
     * Gets the value of the emergencyContactLast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactLast() {
        return emergencyContactLast;
    }

    /**
     * Sets the value of the emergencyContactLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactLast(String value) {
        this.emergencyContactLast = value;
    }

    /**
     * Gets the value of the emergencyContactLastLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getEmergencyContactLastLangs() {
        return emergencyContactLastLangs;
    }

    /**
     * Sets the value of the emergencyContactLastLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setEmergencyContactLastLangs(CPTAdditionalLanguageContents value) {
        this.emergencyContactLastLangs = value;
    }

    /**
     * Gets the value of the emergencyTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyTelephone() {
        return emergencyTelephone;
    }

    /**
     * Sets the value of the emergencyTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyTelephone(String value) {
        this.emergencyTelephone = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the pagerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagerNumber() {
        return pagerNumber;
    }

    /**
     * Sets the value of the pagerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagerNumber(String value) {
        this.pagerNumber = value;
    }

    /**
     * Gets the value of the cellPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * Sets the value of the cellPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhoneNumber(String value) {
        this.cellPhoneNumber = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the dateHired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDateHired() {
        return dateHired;
    }

    /**
     * Sets the value of the dateHired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateHired(LocalDate value) {
        this.dateHired = value;
    }

    /**
     * Gets the value of the dateSeniority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDateSeniority() {
        return dateSeniority;
    }

    /**
     * Sets the value of the dateSeniority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateSeniority(LocalDate value) {
        this.dateSeniority = value;
    }

    /**
     * Gets the value of the dateTerminated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDateTerminated() {
        return dateTerminated;
    }

    /**
     * Sets the value of the dateTerminated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTerminated(LocalDate value) {
        this.dateTerminated = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdate(LocalDate value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link CPTTransitFacilityIden }
     *     
     */
    public CPTTransitFacilityIden getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTTransitFacilityIden }
     *     
     */
    public void setFacility(CPTTransitFacilityIden value) {
        this.facility = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link CPTOrganizationalUnitIden }
     *     
     */
    public CPTOrganizationalUnitIden getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTOrganizationalUnitIden }
     *     
     */
    public void setOrganization(CPTOrganizationalUnitIden value) {
        this.organization = value;
    }

    /**
     * Gets the value of the jobCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCategory() {
        return jobCategory;
    }

    /**
     * Sets the value of the jobCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCategory(String value) {
        this.jobCategory = value;
    }

    /**
     * Gets the value of the jobCategoryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCategoryDesc() {
        return jobCategoryDesc;
    }

    /**
     * Sets the value of the jobCategoryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCategoryDesc(String value) {
        this.jobCategoryDesc = value;
    }

    /**
     * Gets the value of the jobCategoryDescLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getJobCategoryDescLangs() {
        return jobCategoryDescLangs;
    }

    /**
     * Sets the value of the jobCategoryDescLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setJobCategoryDescLangs(CPTAdditionalLanguageContents value) {
        this.jobCategoryDescLangs = value;
    }

    /**
     * Gets the value of the workWeekDays property.
     * 
     * @return
     *     possible object is
     *     {@link CPTEmployee.WorkWeekDays }
     *     
     */
    public CPTEmployee.WorkWeekDays getWorkWeekDays() {
        return workWeekDays;
    }

    /**
     * Sets the value of the workWeekDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTEmployee.WorkWeekDays }
     *     
     */
    public void setWorkWeekDays(CPTEmployee.WorkWeekDays value) {
        this.workWeekDays = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the commentLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getCommentLangs() {
        return commentLangs;
    }

    /**
     * Sets the value of the commentLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setCommentLangs(CPTAdditionalLanguageContents value) {
        this.commentLangs = value;
    }

    /**
     * Gets the value of the operatorBase property.
     * 
     * @return
     *     possible object is
     *     {@link CPTOperatorBaseIden }
     *     
     */
    public CPTOperatorBaseIden getOperatorBase() {
        return operatorBase;
    }

    /**
     * Sets the value of the operatorBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTOperatorBaseIden }
     *     
     */
    public void setOperatorBase(CPTOperatorBaseIden value) {
        this.operatorBase = value;
    }

    /**
     * Gets the value of the localCPTEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.CPTEmployee }
     *     
     */
    public tcip_4_0_0_local.CPTEmployee getLocalCPTEmployee() {
        return localCPTEmployee;
    }

    /**
     * Sets the value of the localCPTEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.CPTEmployee }
     *     
     */
    public void setLocalCPTEmployee(tcip_4_0_0_local.CPTEmployee value) {
        this.localCPTEmployee = value;
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
     *       &lt;sequence maxOccurs="25"&gt;
     *         &lt;element name="work-week-day" type="{http://www.TCIP-Final-4-0-0}SCH-DayType"/&gt;
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
        "workWeekDay"
    })
    public static class WorkWeekDays {

        @XmlElement(name = "work-week-day", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> workWeekDay;

        /**
         * Gets the value of the workWeekDay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workWeekDay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWorkWeekDay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getWorkWeekDay() {
            if (workWeekDay == null) {
                workWeekDay = new ArrayList<String>();
            }
            return this.workWeekDay;
        }

    }

}
