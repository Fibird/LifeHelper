package cc.chaoyangliu.zipCodeSearch;

import java.rmi.RemoteException;

import cn.com.WebXml.*;

public class IpAddressInfoGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IpAddressSearchWebServiceSoapProxy ipAddInfoGetProxy = new IpAddressSearchWebServiceSoapProxy();
		String ipInfoResult [] = null;
		try {
			ipInfoResult = ipAddInfoGetProxy.getCountryCityByIp(".29.21.110");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(ipInfoResult.length);
		System.out.println(ipInfoResult[1]);
	}

}
