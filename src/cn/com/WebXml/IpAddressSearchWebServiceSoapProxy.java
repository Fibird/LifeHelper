package cn.com.WebXml;

public class IpAddressSearchWebServiceSoapProxy implements cn.com.WebXml.IpAddressSearchWebServiceSoap {
  private String _endpoint = null;
  private cn.com.WebXml.IpAddressSearchWebServiceSoap ipAddressSearchWebServiceSoap = null;
  
  public IpAddressSearchWebServiceSoapProxy() {
    _initIpAddressSearchWebServiceSoapProxy();
  }
  
  public IpAddressSearchWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initIpAddressSearchWebServiceSoapProxy();
  }
  
  private void _initIpAddressSearchWebServiceSoapProxy() {
    try {
      ipAddressSearchWebServiceSoap = (new cn.com.WebXml.IpAddressSearchWebServiceLocator()).getIpAddressSearchWebServiceSoap();
      if (ipAddressSearchWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ipAddressSearchWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ipAddressSearchWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ipAddressSearchWebServiceSoap != null)
      ((javax.xml.rpc.Stub)ipAddressSearchWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.com.WebXml.IpAddressSearchWebServiceSoap getIpAddressSearchWebServiceSoap() {
    if (ipAddressSearchWebServiceSoap == null)
      _initIpAddressSearchWebServiceSoapProxy();
    return ipAddressSearchWebServiceSoap;
  }
  
  public java.lang.String[] getCountryCityByIp(java.lang.String theIpAddress) throws java.rmi.RemoteException{
    if (ipAddressSearchWebServiceSoap == null)
      _initIpAddressSearchWebServiceSoapProxy();
    return ipAddressSearchWebServiceSoap.getCountryCityByIp(theIpAddress);
  }
  
  public java.lang.String[] getGeoIPContext() throws java.rmi.RemoteException{
    if (ipAddressSearchWebServiceSoap == null)
      _initIpAddressSearchWebServiceSoapProxy();
    return ipAddressSearchWebServiceSoap.getGeoIPContext();
  }
  
  public java.lang.String getVersionTime() throws java.rmi.RemoteException{
    if (ipAddressSearchWebServiceSoap == null)
      _initIpAddressSearchWebServiceSoapProxy();
    return ipAddressSearchWebServiceSoap.getVersionTime();
  }
  
  
}