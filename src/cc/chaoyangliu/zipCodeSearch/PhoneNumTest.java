package cc.chaoyangliu.zipCodeSearch;

import java.rmi.RemoteException;

import cn.com.WebXml.MobileCodeWSSoapProxy;

public class PhoneNumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileCodeWSSoapProxy mobileCodeProxy = new MobileCodeWSSoapProxy();
		String info = new String();
		try {
			info = mobileCodeProxy.getMobileCodeInfo("1839", "");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (info.equals("ÊÖ»úºÅÂë´íÎó http://www.webxml.com.cn")) {
			System.out.println("no result");
		} else {
			System.out.println(info);
		}
		
	}

}
