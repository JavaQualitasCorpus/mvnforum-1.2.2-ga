//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.12.17 at 09:43:27 AM GMT+07:00 
//


package com.mvnforum.jaxb.db;


/**
 * Java content class for AttachmentType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/D:/working/mvnforum/contrib/phpbb2mvnforum-jaxb/schema/mvnforum.xsd line 271)
 * <p>
 * <pre>
 * &lt;complexType name="AttachmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachFilename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttachFileSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttachMimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttachDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachCreationIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachCreationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachDownloadCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AttachOption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AttachStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AttachmentType {


    /**
     * Gets the value of the attachModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAttachModifiedDate();

    /**
     * Sets the value of the attachModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAttachModifiedDate(java.lang.String value);

    /**
     * Gets the value of the attachFilename property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAttachFilename();

    /**
     * Sets the value of the attachFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAttachFilename(java.lang.String value);

    /**
     * Gets the value of the attachCreationIP property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAttachCreationIP();

    /**
     * Sets the value of the attachCreationIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAttachCreationIP(java.lang.String value);

    /**
     * Gets the value of the attachOption property.
     * 
     */
    int getAttachOption();

    /**
     * Sets the value of the attachOption property.
     * 
     */
    void setAttachOption(int value);

    /**
     * Gets the value of the attachStatus property.
     * 
     */
    int getAttachStatus();

    /**
     * Sets the value of the attachStatus property.
     * 
     */
    void setAttachStatus(int value);

    /**
     * Gets the value of the attachDesc property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAttachDesc();

    /**
     * Sets the value of the attachDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAttachDesc(java.lang.String value);

    /**
     * Gets the value of the memberName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getMemberName();

    /**
     * Sets the value of the memberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setMemberName(java.lang.String value);

    /**
     * Gets the value of the attachMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAttachMimeType();

    /**
     * Sets the value of the attachMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAttachMimeType(java.lang.String value);

    /**
     * Gets the value of the attachDownloadCount property.
     * 
     */
    int getAttachDownloadCount();

    /**
     * Sets the value of the attachDownloadCount property.
     * 
     */
    void setAttachDownloadCount(int value);

    /**
     * Gets the value of the attachCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAttachCreationDate();

    /**
     * Sets the value of the attachCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAttachCreationDate(java.lang.String value);

    /**
     * Gets the value of the attachFileSize property.
     * 
     */
    int getAttachFileSize();

    /**
     * Sets the value of the attachFileSize property.
     * 
     */
    void setAttachFileSize(int value);

}
