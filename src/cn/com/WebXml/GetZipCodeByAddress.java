/**
 * GetZipCodeByAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public class GetZipCodeByAddress  implements java.io.Serializable {
    private java.lang.String theProvinceName;

    private java.lang.String theCityName;

    private java.lang.String theAddress;

    private java.lang.String userID;

    public GetZipCodeByAddress() {
    }

    public GetZipCodeByAddress(
           java.lang.String theProvinceName,
           java.lang.String theCityName,
           java.lang.String theAddress,
           java.lang.String userID) {
           this.theProvinceName = theProvinceName;
           this.theCityName = theCityName;
           this.theAddress = theAddress;
           this.userID = userID;
    }


    /**
     * Gets the theProvinceName value for this GetZipCodeByAddress.
     * 
     * @return theProvinceName
     */
    public java.lang.String getTheProvinceName() {
        return theProvinceName;
    }


    /**
     * Sets the theProvinceName value for this GetZipCodeByAddress.
     * 
     * @param theProvinceName
     */
    public void setTheProvinceName(java.lang.String theProvinceName) {
        this.theProvinceName = theProvinceName;
    }


    /**
     * Gets the theCityName value for this GetZipCodeByAddress.
     * 
     * @return theCityName
     */
    public java.lang.String getTheCityName() {
        return theCityName;
    }


    /**
     * Sets the theCityName value for this GetZipCodeByAddress.
     * 
     * @param theCityName
     */
    public void setTheCityName(java.lang.String theCityName) {
        this.theCityName = theCityName;
    }


    /**
     * Gets the theAddress value for this GetZipCodeByAddress.
     * 
     * @return theAddress
     */
    public java.lang.String getTheAddress() {
        return theAddress;
    }


    /**
     * Sets the theAddress value for this GetZipCodeByAddress.
     * 
     * @param theAddress
     */
    public void setTheAddress(java.lang.String theAddress) {
        this.theAddress = theAddress;
    }


    /**
     * Gets the userID value for this GetZipCodeByAddress.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this GetZipCodeByAddress.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZipCodeByAddress)) return false;
        GetZipCodeByAddress other = (GetZipCodeByAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.theProvinceName==null && other.getTheProvinceName()==null) || 
             (this.theProvinceName!=null &&
              this.theProvinceName.equals(other.getTheProvinceName()))) &&
            ((this.theCityName==null && other.getTheCityName()==null) || 
             (this.theCityName!=null &&
              this.theCityName.equals(other.getTheCityName()))) &&
            ((this.theAddress==null && other.getTheAddress()==null) || 
             (this.theAddress!=null &&
              this.theAddress.equals(other.getTheAddress()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTheProvinceName() != null) {
            _hashCode += getTheProvinceName().hashCode();
        }
        if (getTheCityName() != null) {
            _hashCode += getTheCityName().hashCode();
        }
        if (getTheAddress() != null) {
            _hashCode += getTheAddress().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZipCodeByAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">getZipCodeByAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("theProvinceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "theProvinceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("theCityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "theCityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("theAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "theAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "userID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
