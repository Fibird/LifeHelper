/**
 * GetAddressByZipCodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public class GetAddressByZipCodeResponse  implements java.io.Serializable {
    private cn.com.WebXml.GetAddressByZipCodeResponseGetAddressByZipCodeResult getAddressByZipCodeResult;

    public GetAddressByZipCodeResponse() {
    }

    public GetAddressByZipCodeResponse(
           cn.com.WebXml.GetAddressByZipCodeResponseGetAddressByZipCodeResult getAddressByZipCodeResult) {
           this.getAddressByZipCodeResult = getAddressByZipCodeResult;
    }


    /**
     * Gets the getAddressByZipCodeResult value for this GetAddressByZipCodeResponse.
     * 
     * @return getAddressByZipCodeResult
     */
    public cn.com.WebXml.GetAddressByZipCodeResponseGetAddressByZipCodeResult getGetAddressByZipCodeResult() {
        return getAddressByZipCodeResult;
    }


    /**
     * Sets the getAddressByZipCodeResult value for this GetAddressByZipCodeResponse.
     * 
     * @param getAddressByZipCodeResult
     */
    public void setGetAddressByZipCodeResult(cn.com.WebXml.GetAddressByZipCodeResponseGetAddressByZipCodeResult getAddressByZipCodeResult) {
        this.getAddressByZipCodeResult = getAddressByZipCodeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAddressByZipCodeResponse)) return false;
        GetAddressByZipCodeResponse other = (GetAddressByZipCodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAddressByZipCodeResult==null && other.getGetAddressByZipCodeResult()==null) || 
             (this.getAddressByZipCodeResult!=null &&
              this.getAddressByZipCodeResult.equals(other.getGetAddressByZipCodeResult())));
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
        if (getGetAddressByZipCodeResult() != null) {
            _hashCode += getGetAddressByZipCodeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAddressByZipCodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">getAddressByZipCodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAddressByZipCodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "getAddressByZipCodeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">>getAddressByZipCodeResponse>getAddressByZipCodeResult"));
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
