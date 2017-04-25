/**
 * IpAddressSearchWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public class IpAddressSearchWebServiceLocator extends org.apache.axis.client.Service implements cn.com.WebXml.IpAddressSearchWebService {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>IP地址搜索 WEB 服务</strong>包含中国和国外已知的IP地址数据，是目前最完整的IP地址数据，记录数量现已超过37万条并还在不断更新和增加中，因IP地址在不断变化，此IP地址数据查询仅供参考。</br>此IP地址搜索Web
 * Services请不要用于任何商业目的，若有需要请<a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx"
 * target="_blank">联系我们</a>，欢迎技术交流。 QQ：8409035<br /><strong>使用本站 WEB
 * 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持</strong>！<br /><br />&nbsp;
 */

    public IpAddressSearchWebServiceLocator() {
    }


    public IpAddressSearchWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IpAddressSearchWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IpAddressSearchWebServiceSoap
    private java.lang.String IpAddressSearchWebServiceSoap_address = "http://ws.webxml.com.cn/WebServices/IpAddressSearchWebService.asmx";

    public java.lang.String getIpAddressSearchWebServiceSoapAddress() {
        return IpAddressSearchWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IpAddressSearchWebServiceSoapWSDDServiceName = "IpAddressSearchWebServiceSoap";

    public java.lang.String getIpAddressSearchWebServiceSoapWSDDServiceName() {
        return IpAddressSearchWebServiceSoapWSDDServiceName;
    }

    public void setIpAddressSearchWebServiceSoapWSDDServiceName(java.lang.String name) {
        IpAddressSearchWebServiceSoapWSDDServiceName = name;
    }

    public cn.com.WebXml.IpAddressSearchWebServiceSoap getIpAddressSearchWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IpAddressSearchWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIpAddressSearchWebServiceSoap(endpoint);
    }

    public cn.com.WebXml.IpAddressSearchWebServiceSoap getIpAddressSearchWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.com.WebXml.IpAddressSearchWebServiceSoapStub _stub = new cn.com.WebXml.IpAddressSearchWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getIpAddressSearchWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIpAddressSearchWebServiceSoapEndpointAddress(java.lang.String address) {
        IpAddressSearchWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.com.WebXml.IpAddressSearchWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.com.WebXml.IpAddressSearchWebServiceSoapStub _stub = new cn.com.WebXml.IpAddressSearchWebServiceSoapStub(new java.net.URL(IpAddressSearchWebServiceSoap_address), this);
                _stub.setPortName(getIpAddressSearchWebServiceSoapWSDDServiceName());
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
        if ("IpAddressSearchWebServiceSoap".equals(inputPortName)) {
            return getIpAddressSearchWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://WebXml.com.cn/", "IpAddressSearchWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "IpAddressSearchWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IpAddressSearchWebServiceSoap".equals(portName)) {
            setIpAddressSearchWebServiceSoapEndpointAddress(address);
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
