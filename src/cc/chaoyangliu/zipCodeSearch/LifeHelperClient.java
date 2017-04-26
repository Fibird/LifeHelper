/**
 * 
 */
package cc.chaoyangliu.zipCodeSearch;

import javax.swing.JOptionPane;

/**
 * @author bird
 *
 */
public class LifeHelperClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (NetConnectedCheck.netIsConnected()) {
			LifeHelper lifeHelperClient = new LifeHelper();
			lifeHelperClient.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "不能连接到网络，请检查网络连接！", "错误", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
