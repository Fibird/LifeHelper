/**
 * IpAddressSearchWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public interface IpAddressSearchWebService extends javax.xml.rpc.Service {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>IP地址搜索 WEB 服务</strong>包含中国和国外已知的IP地址数据，是目前最完整的IP地址数据，记录数量现已超过37万条并还在不断更新和增加中，因IP地址在不断变化，此IP地址数据查询仅供参考。</br>此IP地址搜索Web
 * Services请不要用于任何商业目的，若有需要请<a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx"
 * target="_blank">联系我们</a>，欢迎技术交流。 QQ：8409035<br /><strong>使用本站 WEB
 * 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持</strong>！<br /><br />&nbsp;
 */
    public java.lang.String getIpAddressSearchWebServiceSoapAddress();

    public cn.com.WebXml.IpAddressSearchWebServiceSoap getIpAddressSearchWebServiceSoap() throws javax.xml.rpc.ServiceException;

    public cn.com.WebXml.IpAddressSearchWebServiceSoap getIpAddressSearchWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
