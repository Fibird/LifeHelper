/**
 * 
 */
package cc.chaoyangliu.zipCodeSearch;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author bird
 *
 */
public class NetConnectedCheck {
	static boolean flag = false;
	static boolean netIsConnected() {
		int timeout = 10000;
		  InetAddress[] addresses = null;
		try {
			addresses = InetAddress.getAllByName("www.baidu.com");
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			flag = false;
		}
		if (addresses == null) {
			flag = false;
		} else {
			for (InetAddress address : addresses) {
			    try {
					if (address.isReachable(timeout))
					  flag = true;
					else
					  flag = false;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
		}
		return flag;
	}
}
