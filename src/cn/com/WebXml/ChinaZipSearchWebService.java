/**
 * ChinaZipSearchWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public interface ChinaZipSearchWebService extends javax.xml.rpc.Service {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>中国邮政编码搜索 WEB 服务</strong>包含中国全部邮政编码共计187285条记录，是目前最完整的邮政编码数据，精确到乡镇级、城市精确到街道，支持邮政编码<->城市、乡镇、街道的双向查询。此邮政编码查询仅供参考，如邮政编码或地址有变动请以当地邮局为准，也请及时<a
 * href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">通知我们</a>进行更正。<br
 * />此邮政编码查询Web Services请不要用于任何商业目的，若有需要请<a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx"
 * target="_blank">联系我们</a>，欢迎技术交流。 QQ：8409035<br /><strong>使用本站 WEB
 * 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持</strong>！<br /><br />&nbsp;
 */
    public java.lang.String getChinaZipSearchWebServiceSoapAddress();

    public cn.com.WebXml.ChinaZipSearchWebServiceSoap getChinaZipSearchWebServiceSoap() throws javax.xml.rpc.ServiceException;

    public cn.com.WebXml.ChinaZipSearchWebServiceSoap getChinaZipSearchWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
