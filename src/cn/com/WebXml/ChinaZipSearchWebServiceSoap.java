/**
 * ChinaZipSearchWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public interface ChinaZipSearchWebServiceSoap extends java.rmi.Remote {

    /**
     * <br /><h3>获得本邮政编码查询Web Services支持的省份/直辖市信息</h3><p>输入参数：无； 返回数据：一个一维字符串数组
     * String()，内容为省份/直辖市的名称。</p><br />
     */
    public java.lang.String[] getSupportProvince() throws java.rmi.RemoteException;

    /**
     * <br /><h3>通过省份/直辖市查询本邮政编码查询Web Services支持的城市、地区信息</h3><p>输入参数：byProvinceName
     * = 指定的省份/直辖市，若为空则默认上海；返回数据：一个一维字符串数组 String()，结构为：城市、地区(省份/直辖市)。</p><br
     * />
     */
    public java.lang.String[] getSupportCity(java.lang.String byProvinceName) throws java.rmi.RemoteException;

    /**
     * <br /><h3>获得本邮政编码查询Web Services支持的全部省份/直辖市 和 城市、地区信息</h3><p>输入参数：空；返回数据：DataSet，结构为：Item.(CITY)=城市、地区，Item.(PROVINCE)=省份/直辖市。</p><br
     * />
     */
    public cn.com.WebXml.GetSupportProvinceCityResponseGetSupportProvinceCityResult getSupportProvinceCity() throws java.rmi.RemoteException;

    /**
     * <br /><h3>通过邮政编码查询本邮政编码查询Web Services支持地址数据</h3><p>输入参数：theZipCode
     * = 中国的6位邮政编码，若为空则默认上海200080，userID = 商业用户ID（普通用户不需要）；返回数据：DataSet，结构为：Item.(ADDRESS)=街道、乡镇，Item.(CITY)=城市、地区，Item.(PROVINCE)=省份/直辖市，Item.(ZIP)=邮政编码。</p><br
     * />
     */
    public cn.com.WebXml.GetAddressByZipCodeResponseGetAddressByZipCodeResult getAddressByZipCode(java.lang.String theZipCode, java.lang.String userID) throws java.rmi.RemoteException;

    /**
     * <br /><h3>通过省份、城市、地址查询本邮政编码查询Web Services支持邮政编码数据</h3><p>输入参数：theProvinceName
     * = 省份/直辖市（必须按照 getSupportProvince 输入），theCityName = 城市、地区，theAddress
     * = 街道、乡镇，userID = 商业用户ID（普通用户不需要），theProvinceName若为空则默认上海，支持模糊查询，免费用户最多输出20条相关数据（如需显示更多请<a
     * href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">联系我们</a>）；返回数据：DataSet，结构为：Item.(ADDRESS)=街道、乡镇，Item.(CITY)=城市、地区，Item.(PROVINCE)=省份/直辖市，Item.(ZIP)=邮政编码。</p><br
     * />
     */
    public cn.com.WebXml.GetZipCodeByAddressResponseGetZipCodeByAddressResult getZipCodeByAddress(java.lang.String theProvinceName, java.lang.String theCityName, java.lang.String theAddress, java.lang.String userID) throws java.rmi.RemoteException;
}
