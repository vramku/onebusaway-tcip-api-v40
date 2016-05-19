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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.DateTime;


/**
 * <p>Java class for PIAgencyStaticFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIAgencyStaticFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agency-id" type="{http://www.TCIP-Final-4-0-0}CPT-AgencyID"/&gt;
 *         &lt;element name="name" type="{http://www.TCIP-Final-4-0-0}CPT-AgencyName"/&gt;
 *         &lt;element name="file-headline" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="file-name" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote"/&gt;
 *         &lt;element name="file-nameLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="descriptionLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="applicability" type="{http://www.TCIP-Final-4-0-0}CPTFileApplicability" minOccurs="0"/&gt;
 *         &lt;element name="retrievalURL" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="retrieval-application" type="{http://www.TCIP-Final-4-0-0}CPT-ApplicationID" minOccurs="0"/&gt;
 *         &lt;element name="retrievalIP" type="{http://www.TCIP-Final-4-0-0}CPT-IPAddress" minOccurs="0"/&gt;
 *         &lt;element name="retrievalPort" type="{http://www.TCIP-Final-4-0-0}CPT-UDP-TCP-PortNumber" minOccurs="0"/&gt;
 *         &lt;element name="retrieval-instructions" type="{http://www.TCIP-Final-4-0-0}CPT-Footnote" minOccurs="0"/&gt;
 *         &lt;element name="retrieval-instructionsLangs" type="{http://www.TCIP-Final-4-0-0}CPTAdditionalLanguageContents" minOccurs="0"/&gt;
 *         &lt;element name="file-content" type="{http://www.TCIP-Final-4-0-0}CPT-FileContent" minOccurs="0"/&gt;
 *         &lt;element name="activation" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="deactivation" type="{http://www.TCIP-Final-4-0-0}CPT-DateTime" minOccurs="0"/&gt;
 *         &lt;element name="localPIAgencyStaticFile" type="{http://www.tcip-4-0-0-local}PIAgencyStaticFile" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIAgencyStaticFile", propOrder = {
    "agencyId",
    "name",
    "fileHeadline",
    "fileName",
    "fileNameLangs",
    "description",
    "descriptionLangs",
    "applicability",
    "retrievalURL",
    "retrievalApplication",
    "retrievalIP",
    "retrievalPort",
    "retrievalInstructions",
    "retrievalInstructionsLangs",
    "fileContent",
    "activation",
    "deactivation",
    "localPIAgencyStaticFile"
})
public class PIAgencyStaticFile {

    @XmlElement(name = "agency-id", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger agencyId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "file-headline")
    protected String fileHeadline;
    @XmlElement(name = "file-name", required = true)
    protected String fileName;
    @XmlElement(name = "file-nameLangs")
    protected CPTAdditionalLanguageContents fileNameLangs;
    protected String description;
    protected CPTAdditionalLanguageContents descriptionLangs;
    protected CPTFileApplicability applicability;
    protected String retrievalURL;
    @XmlElement(name = "retrieval-application")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger retrievalApplication;
    protected String retrievalIP;
    @XmlSchemaType(name = "unsignedByte")
    protected Short retrievalPort;
    @XmlElement(name = "retrieval-instructions")
    protected String retrievalInstructions;
    @XmlElement(name = "retrieval-instructionsLangs")
    protected CPTAdditionalLanguageContents retrievalInstructionsLangs;
    @XmlElement(name = "file-content")
    protected CPTFileContent fileContent;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime activation;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected DateTime deactivation;
    protected tcip_4_0_0_local.PIAgencyStaticFile localPIAgencyStaticFile;

    /**
     * Gets the value of the agencyId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAgencyId(BigInteger value) {
        this.agencyId = value;
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
     * Gets the value of the fileHeadline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileHeadline() {
        return fileHeadline;
    }

    /**
     * Sets the value of the fileHeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileHeadline(String value) {
        this.fileHeadline = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileNameLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getFileNameLangs() {
        return fileNameLangs;
    }

    /**
     * Sets the value of the fileNameLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setFileNameLangs(CPTAdditionalLanguageContents value) {
        this.fileNameLangs = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the descriptionLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getDescriptionLangs() {
        return descriptionLangs;
    }

    /**
     * Sets the value of the descriptionLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setDescriptionLangs(CPTAdditionalLanguageContents value) {
        this.descriptionLangs = value;
    }

    /**
     * Gets the value of the applicability property.
     * 
     * @return
     *     possible object is
     *     {@link CPTFileApplicability }
     *     
     */
    public CPTFileApplicability getApplicability() {
        return applicability;
    }

    /**
     * Sets the value of the applicability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTFileApplicability }
     *     
     */
    public void setApplicability(CPTFileApplicability value) {
        this.applicability = value;
    }

    /**
     * Gets the value of the retrievalURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalURL() {
        return retrievalURL;
    }

    /**
     * Sets the value of the retrievalURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrievalURL(String value) {
        this.retrievalURL = value;
    }

    /**
     * Gets the value of the retrievalApplication property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRetrievalApplication() {
        return retrievalApplication;
    }

    /**
     * Sets the value of the retrievalApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRetrievalApplication(BigInteger value) {
        this.retrievalApplication = value;
    }

    /**
     * Gets the value of the retrievalIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalIP() {
        return retrievalIP;
    }

    /**
     * Sets the value of the retrievalIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrievalIP(String value) {
        this.retrievalIP = value;
    }

    /**
     * Gets the value of the retrievalPort property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRetrievalPort() {
        return retrievalPort;
    }

    /**
     * Sets the value of the retrievalPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRetrievalPort(Short value) {
        this.retrievalPort = value;
    }

    /**
     * Gets the value of the retrievalInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalInstructions() {
        return retrievalInstructions;
    }

    /**
     * Sets the value of the retrievalInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrievalInstructions(String value) {
        this.retrievalInstructions = value;
    }

    /**
     * Gets the value of the retrievalInstructionsLangs property.
     * 
     * @return
     *     possible object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public CPTAdditionalLanguageContents getRetrievalInstructionsLangs() {
        return retrievalInstructionsLangs;
    }

    /**
     * Sets the value of the retrievalInstructionsLangs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTAdditionalLanguageContents }
     *     
     */
    public void setRetrievalInstructionsLangs(CPTAdditionalLanguageContents value) {
        this.retrievalInstructionsLangs = value;
    }

    /**
     * Gets the value of the fileContent property.
     * 
     * @return
     *     possible object is
     *     {@link CPTFileContent }
     *     
     */
    public CPTFileContent getFileContent() {
        return fileContent;
    }

    /**
     * Sets the value of the fileContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPTFileContent }
     *     
     */
    public void setFileContent(CPTFileContent value) {
        this.fileContent = value;
    }

    /**
     * Gets the value of the activation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivation(DateTime value) {
        this.activation = value;
    }

    /**
     * Gets the value of the deactivation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public DateTime getDeactivation() {
        return deactivation;
    }

    /**
     * Sets the value of the deactivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeactivation(DateTime value) {
        this.deactivation = value;
    }

    /**
     * Gets the value of the localPIAgencyStaticFile property.
     * 
     * @return
     *     possible object is
     *     {@link tcip_4_0_0_local.PIAgencyStaticFile }
     *     
     */
    public tcip_4_0_0_local.PIAgencyStaticFile getLocalPIAgencyStaticFile() {
        return localPIAgencyStaticFile;
    }

    /**
     * Sets the value of the localPIAgencyStaticFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link tcip_4_0_0_local.PIAgencyStaticFile }
     *     
     */
    public void setLocalPIAgencyStaticFile(tcip_4_0_0_local.PIAgencyStaticFile value) {
        this.localPIAgencyStaticFile = value;
    }

}