/**
 * GetZipCodeByAddressResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public class GetZipCodeByAddressResponse  implements java.io.Serializable {
    private cn.com.WebXml.GetZipCodeByAddressResponseGetZipCodeByAddressResult getZipCodeByAddressResult;

    public GetZipCodeByAddressResponse() {
    }

    public GetZipCodeByAddressResponse(
           cn.com.WebXml.GetZipCodeByAddressResponseGetZipCodeByAddressResult getZipCodeByAddressResult) {
           this.getZipCodeByAddressResult = getZipCodeByAddressResult;
    }


    /**
     * Gets the getZipCodeByAddressResult value for this GetZipCodeByAddressResponse.
     * 
     * @return getZipCodeByAddressResult
     */
    public cn.com.WebXml.GetZipCodeByAddressResponseGetZipCodeByAddressResult getGetZipCodeByAddressResult() {
        return getZipCodeByAddressResult;
    }


    /**
     * Sets the getZipCodeByAddressResult value for this GetZipCodeByAddressResponse.
     * 
     * @param getZipCodeByAddressResult
     */
    public void setGetZipCodeByAddressResult(cn.com.WebXml.GetZipCodeByAddressResponseGetZipCodeByAddressResult getZipCodeByAddressResult) {
        this.getZipCodeByAddressResult = getZipCodeByAddressResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZipCodeByAddressResponse)) return false;
        GetZipCodeByAddressResponse other = (GetZipCodeByAddressResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZipCodeByAddressResult==null && other.getGetZipCodeByAddressResult()==null) || 
             (this.getZipCodeByAddressResult!=null &&
              this.getZipCodeByAddressResult.equals(other.getGetZipCodeByAddressResult())));
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
        if (getGetZipCodeByAddressResult() != null) {
            _hashCode += getGetZipCodeByAddressResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZipCodeByAddressResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">getZipCodeByAddressResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZipCodeByAddressResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "getZipCodeByAddressResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">>getZipCodeByAddressResponse>getZipCodeByAddressResult"));
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
