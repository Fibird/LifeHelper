/**
 * IpAddressSearchWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public interface IpAddressSearchWebServiceSoap extends java.rmi.Remote {

    /**
     * <br /><h3>通过输入IP地址查询国家、城市、所有者等信息。没有注明国家的为中国</h3><p>输入参数：IP地址（自动替换
     * " 。" 为 "."），返回数据： 一个一维字符串数组String(1)，String(0) = IP地址；String(1) =
     * 查询结果或提示信息</p><br />
     */
    public java.lang.String[] getCountryCityByIp(java.lang.String theIpAddress) throws java.rmi.RemoteException;

    /**
     * <br /><h3>获得您的IP地址和地址信息</h3><p>输入参数：无，返回数据： 一个一维字符串数组String(1)，String(0)
     * = IP地址；String(1) = 地址信息</p><br />
     */
    public java.lang.String[] getGeoIPContext() throws java.rmi.RemoteException;

    /**
     * <br /><h3>获得本IP地址搜索 WEB 服务的数据库版本更新时间</h3><p>输入参数：无，输出参数 String</p><br
     * />
     */
    public java.lang.String getVersionTime() throws java.rmi.RemoteException;
}
