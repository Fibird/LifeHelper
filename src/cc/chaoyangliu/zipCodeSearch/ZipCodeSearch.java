/**
 * 
 */
package cc.chaoyangliu.zipCodeSearch;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.*;

import cn.com.WebXml.*;
/**
 * @author bird
 *
 */
public class ZipCodeSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChinaZipSearchWebServiceSoapProxy zipSearchProxy = new ChinaZipSearchWebServiceSoapProxy();
		GetAddressByZipCodeResponseGetAddressByZipCodeResult addResultSet = new GetAddressByZipCodeResponseGetAddressByZipCodeResult();
		GetZipCodeByAddressResponseGetZipCodeByAddressResult zipCodeResultSet = new GetZipCodeByAddressResponseGetZipCodeByAddressResult();
		String [] provinces = null;
		String noResultFlag = new String("提示信息");
		try {
			zipCodeResultSet = zipSearchProxy.getZipCodeByAddress("陕西", "咸阳", "", "");
			addResultSet = zipSearchProxy.getAddressByZipCode("030812", "");
			provinces = zipSearchProxy.getSupportCity("安徽");
			//Pattern p = Pattern.compile("（[^x00-xff]*）");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String p : provinces) {
			System.out.println(p.replaceAll("（[^x00-xff]*）", ""));
		}
		MessageElement elements[] = addResultSet.get_any();
		//System.out.println();
		NodeList list = elements[1].getElementsByTagName("ZipInfo");
		ArrayList<ResultInfo> info = new ArrayList<ResultInfo>();
		/*遍历名为'ZipInfo'的子元素*/
		String tempString = list.item(0).getChildNodes().item(0).getFirstChild().toString();
		
		if (tempString.equals(noResultFlag)) {
			System.out.println("no result");
		} else
		{
			for(int i = 0; i < list.getLength(); i++)
			{
				Node node = list.item(i);
				NodeList children = node.getChildNodes();
				ResultInfo temp = new ResultInfo();
				
				/*取出名为'ZipInfo'的子元素下的省、城市、地址、邮编等值*/
				for(int j = 0; j < children.getLength(); j++)
				{
					if (j == children.getLength() - 1)
						temp.zipCode = children.item(j).getFirstChild().toString();
					else
						temp.address += children.item(j).getFirstChild().toString();
				}
				//System.out.println(temp);
				info.add(temp);
				
			}
			for (ResultInfo r : info) {
				//System.out.println(r);
			}
		}
		
	}

}
