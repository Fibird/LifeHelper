/**
 * ChinaZipSearchWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public class ChinaZipSearchWebServiceLocator extends org.apache.axis.client.Service implements cn.com.WebXml.ChinaZipSearchWebService {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>中国邮政编码搜索 WEB 服务</strong>包含中国全部邮政编码共计187285条记录，是目前最完整的邮政编码数据，精确到乡镇级、城市精确到街道，支持邮政编码<->城市、乡镇、街道的双向查询。此邮政编码查询仅供参考，如邮政编码或地址有变动请以当地邮局为准，也请及时<a
 * href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">通知我们</a>进行更正。<br
 * />此邮政编码查询Web Services请不要用于任何商业目的，若有需要请<a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx"
 * target="_blank">联系我们</a>，欢迎技术交流。 QQ：8409035<br /><strong>使用本站 WEB
 * 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持</strong>！<br /><br />&nbsp;
 */

    public ChinaZipSearchWebServiceLocator() {
    }


    public ChinaZipSearchWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ChinaZipSearchWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ChinaZipSearchWebServiceSoap
    private java.lang.String ChinaZipSearchWebServiceSoap_address = "http://ws.webxml.com.cn/WebServices/ChinaZipSearchWebService.asmx";

    public java.lang.String getChinaZipSearchWebServiceSoapAddress() {
        return ChinaZipSearchWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ChinaZipSearchWebServiceSoapWSDDServiceName = "ChinaZipSearchWebServiceSoap";

    public java.lang.String getChinaZipSearchWebServiceSoapWSDDServiceName() {
        return ChinaZipSearchWebServiceSoapWSDDServiceName;
    }

    public void setChinaZipSearchWebServiceSoapWSDDServiceName(java.lang.String name) {
        ChinaZipSearchWebServiceSoapWSDDServiceName = name;
    }

    public cn.com.WebXml.ChinaZipSearchWebServiceSoap getChinaZipSearchWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ChinaZipSearchWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getChinaZipSearchWebServiceSoap(endpoint);
    }

    public cn.com.WebXml.ChinaZipSearchWebServiceSoap getChinaZipSearchWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.com.WebXml.ChinaZipSearchWebServiceSoapStub _stub = new cn.com.WebXml.ChinaZipSearchWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getChinaZipSearchWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setChinaZipSearchWebServiceSoapEndpointAddress(java.lang.String address) {
        ChinaZipSearchWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.com.WebXml.ChinaZipSearchWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.com.WebXml.ChinaZipSearchWebServiceSoapStub _stub = new cn.com.WebXml.ChinaZipSearchWebServiceSoapStub(new java.net.URL(ChinaZipSearchWebServiceSoap_address), this);
                _stub.setPortName(getChinaZipSearchWebServiceSoapWSDDServiceName());
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
        if ("ChinaZipSearchWebServiceSoap".equals(inputPortName)) {
            return getChinaZipSearchWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://WebXml.com.cn/", "ChinaZipSearchWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "ChinaZipSearchWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ChinaZipSearchWebServiceSoap".equals(portName)) {
            setChinaZipSearchWebServiceSoapEndpointAddress(address);
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
