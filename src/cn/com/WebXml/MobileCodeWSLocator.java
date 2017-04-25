/**
 * MobileCodeWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public class MobileCodeWSLocator extends org.apache.axis.client.Service implements cn.com.WebXml.MobileCodeWS {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>国内手机号码归属地查询WEB服务</strong>，提供最新的国内手机号码段归属地数据，每月更新。<br />使用本站
 * WEB 服务请注明或链接本站：<a href="http://www.webxml.com.cn/" target="_blank">http://www.webxml.com.cn/</a>
 * 感谢大家的支持！<br />&nbsp;
 */

    public MobileCodeWSLocator() {
    }


    public MobileCodeWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MobileCodeWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MobileCodeWSSoap
    private java.lang.String MobileCodeWSSoap_address = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx";

    public java.lang.String getMobileCodeWSSoapAddress() {
        return MobileCodeWSSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MobileCodeWSSoapWSDDServiceName = "MobileCodeWSSoap";

    public java.lang.String getMobileCodeWSSoapWSDDServiceName() {
        return MobileCodeWSSoapWSDDServiceName;
    }

    public void setMobileCodeWSSoapWSDDServiceName(java.lang.String name) {
        MobileCodeWSSoapWSDDServiceName = name;
    }

    public cn.com.WebXml.MobileCodeWSSoap getMobileCodeWSSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MobileCodeWSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMobileCodeWSSoap(endpoint);
    }

    public cn.com.WebXml.MobileCodeWSSoap getMobileCodeWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.com.WebXml.MobileCodeWSSoapStub _stub = new cn.com.WebXml.MobileCodeWSSoapStub(portAddress, this);
            _stub.setPortName(getMobileCodeWSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMobileCodeWSSoapEndpointAddress(java.lang.String address) {
        MobileCodeWSSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.com.WebXml.MobileCodeWSSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.com.WebXml.MobileCodeWSSoapStub _stub = new cn.com.WebXml.MobileCodeWSSoapStub(new java.net.URL(MobileCodeWSSoap_address), this);
                _stub.setPortName(getMobileCodeWSSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MobileCodeWSSoap".equals(inputPortName)) {
            return getMobileCodeWSSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://WebXml.com.cn/", "MobileCodeWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "MobileCodeWSSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MobileCodeWSSoap".equals(portName)) {
            setMobileCodeWSSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
