/**
 * MobileCodeWSSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public interface MobileCodeWSSoap extends java.rmi.Remote {

    /**
     * <br /><h3>获得国内手机号码归属地省份、地区和手机卡类型信息</h3><p>输入参数：mobileCode =
     * 字符串（手机号码，最少前7位数字），userID = 字符串（商业用户ID） 免费用户为空字符串；返回数据：字符串（手机号码：省份
     * 城市 手机卡类型）。</p><br />
     */
    public java.lang.String getMobileCodeInfo(java.lang.String mobileCode, java.lang.String userID) throws java.rmi.RemoteException;

    /**
     * <br /><h3>获得国内手机号码归属地数据库信息</h3><p>输入参数：无；返回数据：一维字符串数组（省份 城市
     * 记录数量）。</p><br />
     */
    public java.lang.String[] getDatabaseInfo() throws java.rmi.RemoteException;
}
