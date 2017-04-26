package cc.chaoyangliu.zipCodeSearch;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.util.ArrayList;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.*;
import cn.com.WebXml.*;

import javax.swing.JScrollPane;
import java.awt.Label;
import java.awt.Color;
import javax.swing.JFormattedTextField;
public class LifeHelper extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6860730355018093569L;
	private JPanel contentPane;
	private JTextField zipCodeTextField;
	private JTextField addressTextField;
	private JButton searchByAddressbutton;
	private JPanel phoneNum;
	private JPanel ipAddress;
	private JLabel addressLabel;
	private JComboBox cityComboBox;
	private JLabel label;
	private JComboBox provinceComboBox;
	private JLabel provinceLabel;
	private JButton searchByZipCodebutton;
	private JLabel zipCodeLabel;
	private JLabel byAddressLabel;
	private JSeparator byZipCodeSeparator;
	private JSeparator byAddressSeparator;
	private JLabel byZipCodeLabel;
	private JPanel ZipCode;
	private JTabbedPane tabbedPane;
	private JMenuBar menuBar;
	private ChinaZipSearchWebServiceSoapProxy zipSearchProxy;
	private JScrollPane resultScrollPane;
	private JTable resultTable;
	private DefaultTableModel resultTableModel;
	private JTextField phoneNumTextField;
	private JSeparator PhoneNumSeparator;
	private JButton phoneNumInfoSearchButton;
	private Label showPhoneNumInfoLabel;
	private MobileCodeWSSoapProxy mobileCodeProxy;
	private IpAddressSearchWebServiceSoapProxy ipAddInfoGetProxy;
	private JLabel pNumResultLabel;
	private JFormattedTextField ipAddressTextField;
	private JLabel ipInfoResultLabel;
	private Label showIpInfoLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LifeHelper frame = new LifeHelper();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LifeHelper() {
		zipSearchProxy = new ChinaZipSearchWebServiceSoapProxy();
		mobileCodeProxy = new MobileCodeWSSoapProxy();
		ipAddInfoGetProxy = new IpAddressSearchWebServiceSoapProxy();
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\temp_workspace\\WebServiceTools\\images\\find.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 408);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu helpMenu = new JMenu("\u5E2E\u52A9");
		menuBar.add(helpMenu);
		
		JMenuItem menuItem = new JMenuItem("\u5173\u4E8E");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Copyright(c)2017 刘朝洋\nchaoyanglius@outlook.com\nAll rights reserved.", "关于", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		helpMenu.add(menuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		ZipCode = new JPanel();
		tabbedPane.addTab("邮编查询", null, ZipCode, null);
		ZipCode.setLayout(null);
		
		byZipCodeLabel = new JLabel("\u90AE\u7F16\u67E5\u8BE2\u5730\u540D");
		byZipCodeLabel.setBounds(10, 12, 83, 15);
		ZipCode.add(byZipCodeLabel);
		
		byAddressSeparator = new JSeparator();
		byAddressSeparator.setBounds(0, 72, 534, 94);
		ZipCode.add(byAddressSeparator);
		
		byZipCodeSeparator = new JSeparator();
		byZipCodeSeparator.setBounds(0, 0, 534, 72);
		ZipCode.add(byZipCodeSeparator);
		
		byAddressLabel = new JLabel("\u5730\u5740\u67E5\u8BE2\u90AE\u7F16");
		byAddressLabel.setBounds(10, 82, 83, 15);
		ZipCode.add(byAddressLabel);
		String[] columnNames = {"地址", "邮编"};
		//resultTable = new JTable();
		Object[][] data = {
			};
		resultTableModel = new DefaultTableModel(data, columnNames);
		resultTable = new JTable(resultTableModel);
		//((DefaultTableModel) resultTable.getModel()).addRow(new Object[]{"t1", "t2"});
		//resultTableModel.addRow(new Object[]{"t1", "t2"});
		JLabel resultLabel = new JLabel("\u67E5\u8BE2\u7ED3\u679C");
		resultLabel.setBounds(10, 176, 54, 15);
		ZipCode.add(resultLabel);
		
		zipCodeLabel = new JLabel("\u90AE\u7F16\uFF1A");
		zipCodeLabel.setBounds(20, 37, 54, 15);
		ZipCode.add(zipCodeLabel);
		
		zipCodeTextField = new JTextField();
		zipCodeTextField.setBounds(67, 34, 117, 21);
		ZipCode.add(zipCodeTextField);
		zipCodeTextField.setColumns(10);
		
		searchByZipCodebutton = new JButton("\u67E5\u8BE2");
		searchByZipCodebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GetAddressByZipCodeResponseGetAddressByZipCodeResult addResultSet = new GetAddressByZipCodeResponseGetAddressByZipCodeResult();
				String inputZipCode = zipCodeTextField.getText();
				if (inputZipCode.equals("")) {
					JOptionPane.showMessageDialog(null, "邮编不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				} else {
					try {
						addResultSet = zipSearchProxy.getAddressByZipCode(zipCodeTextField.getText(), "");
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					MessageElement elements[] = addResultSet.get_any();
					NodeList list = elements[1].getElementsByTagName("ZipInfo");
					ArrayList<ResultInfo> info = new ArrayList<ResultInfo>();
					String noResultFlag = new String("提示信息");
					String judgeString = list.item(0).getChildNodes().item(0).getFirstChild().toString();
					if (judgeString.equals(noResultFlag)) {
						ClearResultTable();
						JOptionPane.showMessageDialog(null, "不存在该邮编，请核对后再进行查找！", "提示", JOptionPane.INFORMATION_MESSAGE);
					} else {
						/*遍历名为'ZipInfo'的子元素*/
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
							info.add(temp);
						}
						ClearResultTable();
						for (ResultInfo r : info) {
							resultTableModel.addRow(new Object [] {r.address, r.zipCode});
						}			
					}
				}		
			}
		});
		searchByZipCodebutton.setBounds(248, 33, 93, 23);
		ZipCode.add(searchByZipCodebutton);
		
		provinceLabel = new JLabel("\u7701\u4EFD\uFF1A");
		provinceLabel.setBounds(10, 110, 54, 15);
		ZipCode.add(provinceLabel);
		
		provinceComboBox = new JComboBox();
		
		provinceComboBox.setBounds(49, 107, 71, 21);
		ZipCode.add(provinceComboBox);
		String [] p = getProvinces();
		for (String tp : p) {
			provinceComboBox.addItem(tp);
		}
		label = new JLabel("\u53BF/\u5E02/\u533A\uFF1A");
		label.setBounds(130, 110, 65, 15);
		ZipCode.add(label);
		
		cityComboBox = new JComboBox();
		cityComboBox.setBounds(193, 107, 126, 21);
		ZipCode.add(cityComboBox);
		String [] c = getCitiesByProvince(provinceComboBox.getSelectedItem().toString());
		for (String tc : c) {
			cityComboBox.addItem(tc.replaceAll("（[^x00-xff]*）", ""));
		}
		
		provinceComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cityComboBox.removeAllItems();
				String [] c = getCitiesByProvince(provinceComboBox.getSelectedItem().toString());		
				for (String tc : c) {
					cityComboBox.addItem(tc.replaceAll("（[^x00-xff]*）", ""));
				}
			}
		});
		addressLabel = new JLabel("\u5730\u5740\uFF1A");
		addressLabel.setBounds(329, 110, 54, 15);
		ZipCode.add(addressLabel);
		
		addressTextField = new JTextField();
		addressTextField.setBounds(367, 107, 167, 21);
		ZipCode.add(addressTextField);
		addressTextField.setColumns(10);
		
		searchByAddressbutton = new JButton("\u67E5\u8BE2");
		searchByAddressbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GetZipCodeByAddressResponseGetZipCodeByAddressResult zipCodeResultSet = new GetZipCodeByAddressResponseGetZipCodeByAddressResult();
				try {
					zipCodeResultSet = zipSearchProxy.getZipCodeByAddress(provinceComboBox.getSelectedItem().toString(), cityComboBox.getSelectedItem().toString(), addressTextField.getText(), "");
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				MessageElement elements[] = zipCodeResultSet.get_any();
				NodeList list = elements[1].getElementsByTagName("ZipInfo");
				ArrayList<ResultInfo> info = new ArrayList<ResultInfo>();
				String noResultFlag = new String("提示信息");
				String judgeString = list.item(0).getChildNodes().item(0).getFirstChild().toString();
				if (judgeString.equals(noResultFlag)) {
					ClearResultTable();
					JOptionPane.showMessageDialog(null, "不存在该邮编，请核对后再进行查找！", "提示", JOptionPane.INFORMATION_MESSAGE);
				} else {
					/*遍历名为'ZipInfo'的子元素*/
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
						info.add(temp);
					}
					ClearResultTable();
					for (ResultInfo r : info) {
						resultTableModel.addRow(new Object [] {r.address, r.zipCode});
					}			
				}
			}
		});
		searchByAddressbutton.setBounds(441, 138, 93, 23);
		ZipCode.add(searchByAddressbutton);
		
		resultScrollPane = new JScrollPane(resultTable);
		resultScrollPane.setBounds(0, 201, 544, 118);
		ZipCode.add(resultScrollPane);
		resultTable.setFillsViewportHeight(true);
		phoneNum = new JPanel();
		tabbedPane.addTab("手机归属地查询", null, phoneNum, null);
		phoneNum.setLayout(null);
		
		JLabel phonNumlabel = new JLabel("\u624B\u673A\u53F7\uFF1A");
		phonNumlabel.setBounds(109, 44, 54, 15);
		phoneNum.add(phonNumlabel);
		
		phoneNumTextField = new JTextField();
		phonNumlabel.setLabelFor(phoneNumTextField);
		phoneNumTextField.setBounds(161, 41, 125, 21);
		phoneNum.add(phoneNumTextField);
		phoneNumTextField.setColumns(10);
		
		PhoneNumSeparator = new JSeparator();
		PhoneNumSeparator.setBounds(0, 0, 544, 102);
		phoneNum.add(PhoneNumSeparator);
		
		phoneNumInfoSearchButton = new JButton("\u67E5\u8BE2");
		phoneNumInfoSearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pNum = phoneNumTextField.getText();
				String infoResult = new String();
				if(pNum.equals("")) {
					JOptionPane.showMessageDialog(null, "手机号不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				} else {
					try {
						infoResult = mobileCodeProxy.getMobileCodeInfo(pNum, "");
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if (infoResult.equals("手机号码错误 http://www.webxml.com.cn")) {
						JOptionPane.showMessageDialog(null, "不存在该手机号，请核对后再进行查询！", "提示", JOptionPane.INFORMATION_MESSAGE);
						//showPhoneNumInfoLabel.setText("手机号不存在！");
					} else {
						showPhoneNumInfoLabel.setText(infoResult.replaceAll("^(\\d)*：", ""));
					}			
				}
			}
		});
		phoneNumInfoSearchButton.setBounds(328, 40, 93, 23);
		phoneNum.add(phoneNumInfoSearchButton);
		
		showPhoneNumInfoLabel = new Label("");
		showPhoneNumInfoLabel.setAlignment(Label.CENTER);
		showPhoneNumInfoLabel.setBackground(Color.WHITE);
		showPhoneNumInfoLabel.setBounds(40, 129, 469, 167);
		phoneNum.add(showPhoneNumInfoLabel);
		
		pNumResultLabel = new JLabel("\u67E5\u8BE2\u7ED3\u679C\uFF1A");
		pNumResultLabel.setBounds(40, 108, 70, 15);
		phoneNum.add(pNumResultLabel);
		
		ipAddress = new JPanel();
		tabbedPane.addTab("IP地址归属地查询", null, ipAddress, null);
		ipAddress.setLayout(null);
		
		JLabel ipAddressLabel = new JLabel("IP\u5730\u5740\uFF1A");
		ipAddressLabel.setBounds(117, 48, 67, 15);
		ipAddress.add(ipAddressLabel);
		MaskFormatter mf = null;
		try {
			mf = new MaskFormatter("###.###.###.###");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ipAddressTextField = new JFormattedTextField(mf);
		ipAddressLabel.setLabelFor(ipAddressTextField);
		ipAddressTextField.setBounds(173, 45, 107, 21);
		ipAddress.add(ipAddressTextField);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ipAdd = ipAddressTextField.getText();
				String ipAddInfoResult [] = null;
				
				if (ipAdd.equals("")) {
					JOptionPane.showMessageDialog(null, "IP地址不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				} else {
					try {
						ipAddInfoResult = ipAddInfoGetProxy.getCountryCityByIp(ipAdd);
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if (ipAddInfoResult[1].equals("IP地址错误（IP包含非法字符或数据不正确）！请输入标准IP格式：*.*.*.*，http://www.webxml.com.cn")) {
						JOptionPane.showMessageDialog(null, "错误的IP地址格式，请核对后再进行查询！", "错误", JOptionPane.ERROR_MESSAGE);
					} else {
						showIpInfoLabel.setText(ipAddInfoResult[1]);
					}		
				}
				
			}
		});
		button.setBounds(321, 44, 93, 23);
		ipAddress.add(button);
		
		ipInfoResultLabel = new JLabel("\u67E5\u8BE2\u7ED3\u679C\uFF1A");
		ipInfoResultLabel.setBounds(37, 104, 67, 15);
		ipAddress.add(ipInfoResultLabel);
		
		showIpInfoLabel = new Label("");
		showIpInfoLabel.setBackground(Color.WHITE);
		showIpInfoLabel.setAlignment(Label.CENTER);
		showIpInfoLabel.setBounds(47, 125, 469, 167);
		ipAddress.add(showIpInfoLabel);
	}
	void ClearResultTable() {
		while (resultTableModel.getRowCount() != 0) {
			resultTableModel.removeRow(0);
		}
	}
	String [] getProvinces() {
		String provinces [] = null;
		try {
			provinces = zipSearchProxy.getSupportProvince();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return provinces;
	}
	String [] getCitiesByProvince(String pN) {
		String cities [] = null;
		try {
			cities = zipSearchProxy.getSupportCity(pN);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cities;
	}
}
