package cn.com.WebXml;

public class ChinaZipSearchWebServiceSoapProxy implements cn.com.WebXml.ChinaZipSearchWebServiceSoap {
  private String _endpoint = null;
  private cn.com.WebXml.ChinaZipSearchWebServiceSoap chinaZipSearchWebServiceSoap = null;
  
  public ChinaZipSearchWebServiceSoapProxy() {
    _initChinaZipSearchWebServiceSoapProxy();
  }
  
  public ChinaZipSearchWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initChinaZipSearchWebServiceSoapProxy();
  }
  
  private void _initChinaZipSearchWebServiceSoapProxy() {
    try {
      chinaZipSearchWebServiceSoap = (new cn.com.WebXml.ChinaZipSearchWebServiceLocator()).getChinaZipSearchWebServiceSoap();
      if (chinaZipSearchWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)chinaZipSearchWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)chinaZipSearchWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (chinaZipSearchWebServiceSoap != null)
      ((javax.xml.rpc.Stub)chinaZipSearchWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.com.WebXml.ChinaZipSearchWebServiceSoap getChinaZipSearchWebServiceSoap() {
    if (chinaZipSearchWebServiceSoap == null)
      _initChinaZipSearchWebServiceSoapProxy();
    return chinaZipSearchWebServiceSoap;
  }
  
  public java.lang.String[] getSupportProvince() throws java.rmi.RemoteException{
    if (chinaZipSearchWebServiceSoap == null)
      _initChinaZipSearchWebServiceSoapProxy();
    return chinaZipSearchWebServiceSoap.getSupportProvince();
  }
  
  public java.lang.String[] getSupportCity(java.lang.String byProvinceName) throws java.rmi.RemoteException{
    if (chinaZipSearchWebServiceSoap == null)
      _initChinaZipSearchWebServiceSoapProxy();
    return chinaZipSearchWebServiceSoap.getSupportCity(byProvinceName);
  }
  
  public cn.com.WebXml.GetSupportProvinceCityResponseGetSupportProvinceCityResult getSupportProvinceCity() throws java.rmi.RemoteException{
    if (chinaZipSearchWebServiceSoap == null)
      _initChinaZipSearchWebServiceSoapProxy();
    return chinaZipSearchWebServiceSoap.getSupportProvinceCity();
  }
  
  public cn.com.WebXml.GetAddressByZipCodeResponseGetAddressByZipCodeResult getAddressByZipCode(java.lang.String theZipCode, java.lang.String userID) throws java.rmi.RemoteException{
    if (chinaZipSearchWebServiceSoap == null)
      _initChinaZipSearchWebServiceSoapProxy();
    return chinaZipSearchWebServiceSoap.getAddressByZipCode(theZipCode, userID);
  }
  
  public cn.com.WebXml.GetZipCodeByAddressResponseGetZipCodeByAddressResult getZipCodeByAddress(java.lang.String theProvinceName, java.lang.String theCityName, java.lang.String theAddress, java.lang.String userID) throws java.rmi.RemoteException{
    if (chinaZipSearchWebServiceSoap == null)
      _initChinaZipSearchWebServiceSoapProxy();
    return chinaZipSearchWebServiceSoap.getZipCodeByAddress(theProvinceName, theCityName, theAddress, userID);
  }
  
  
}