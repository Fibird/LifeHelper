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
			JOptionPane.showMessageDialog(null, "�������ӵ����磬�����������ӣ�", "����", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
