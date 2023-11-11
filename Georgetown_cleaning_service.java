package simple_payroll_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Rectangle;
import javax.swing.SwingConstants;

public class Georgetown_cleaning_service {

	private JFrame frmGeorgetownCleaningServicesemployee;
	private JTextField Fmonday;
	private JTextField Smonday;
	private JTextField Ftuesday;
	private JTextField Stuesday;
	private JTextField Fwednesday;
	private JTextField Swednesday;
	private JTextField Fthursday;
	private JTextField Sthursday;
	private JTextField Ffriday;
	private JTextField Sfriday;
	private JTextField Fsaturday;
	private JTextField Ssaturday;
	private JTextField Fsunday;
	private JTextField Ssunday;
	private JTextField E_name;
	private JTextField HSalary;
	private JTextField Reghours;
	private JTextField Overhour;
	private JTextField RegAmount;
	private JTextField OverAmount;
	private JTextField netpay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Georgetown_cleaning_service window = new Georgetown_cleaning_service();
					window.frmGeorgetownCleaningServicesemployee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Georgetown_cleaning_service() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeorgetownCleaningServicesemployee = new JFrame();
		frmGeorgetownCleaningServicesemployee.setBounds(new Rectangle(4, 4, 2, 2));
		frmGeorgetownCleaningServicesemployee.getContentPane().setBackground(new Color(245, 245, 220));
		frmGeorgetownCleaningServicesemployee.setBackground(new Color(0, 0, 205));
		frmGeorgetownCleaningServicesemployee.setForeground(new Color(255, 255, 255));
		frmGeorgetownCleaningServicesemployee.setTitle("Georgetown Cleaning Services-Employee Payroll");
		frmGeorgetownCleaningServicesemployee.setBounds(100, 100, 896, 395);
		frmGeorgetownCleaningServicesemployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeorgetownCleaningServicesemployee.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setBounds(82, 48, 97, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hourly Salary:");
		lblNewLabel_1.setBounds(421, 48, 79, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Week:");
		lblNewLabel_2.setBounds(51, 130, 86, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Second Week:");
		lblNewLabel_3.setBounds(51, 168, 86, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Monday");
		lblNewLabel_4.setBounds(162, 100, 46, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tuesday");
		lblNewLabel_5.setBounds(265, 100, 79, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Wednesday");
		lblNewLabel_6.setBounds(354, 100, 86, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Thursday");
		lblNewLabel_7.setBounds(462, 100, 79, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Friday");
		lblNewLabel_8.setBounds(558, 100, 46, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Saturday");
		lblNewLabel_9.setBounds(645, 100, 79, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Sunday");
		lblNewLabel_10.setBounds(749, 100, 46, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_10);
		
		Fmonday = new JTextField();
		Fmonday.setHorizontalAlignment(SwingConstants.RIGHT);
		Fmonday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Fmonday.setBounds(140, 127, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Fmonday);
		Fmonday.setColumns(10);
		
		Smonday = new JTextField();
		Smonday.setHorizontalAlignment(SwingConstants.RIGHT);
		Smonday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Smonday.setBounds(140, 165, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Smonday);
		Smonday.setColumns(10);
		
		Ftuesday = new JTextField();
		Ftuesday.setHorizontalAlignment(SwingConstants.RIGHT);
		Ftuesday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Ftuesday.setBounds(248, 127, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Ftuesday);
		Ftuesday.setColumns(10);
		
		Stuesday = new JTextField();
		Stuesday.setHorizontalAlignment(SwingConstants.RIGHT);
		Stuesday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Stuesday.setBounds(248, 165, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Stuesday);
		Stuesday.setColumns(10);
		
		Fwednesday = new JTextField();
		Fwednesday.setHorizontalAlignment(SwingConstants.RIGHT);
		Fwednesday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Fwednesday.setBounds(344, 127, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Fwednesday);
		Fwednesday.setColumns(10);
		
		Swednesday = new JTextField();
		Swednesday.setHorizontalAlignment(SwingConstants.RIGHT);
		Swednesday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Swednesday.setBounds(344, 165, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Swednesday);
		Swednesday.setColumns(10);
		
		Fthursday = new JTextField();
		Fthursday.setHorizontalAlignment(SwingConstants.RIGHT);
		Fthursday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Fthursday.setBounds(440, 127, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Fthursday);
		Fthursday.setColumns(10);
		
		Sthursday = new JTextField();
		Sthursday.setHorizontalAlignment(SwingConstants.RIGHT);
		Sthursday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Sthursday.setBounds(440, 165, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Sthursday);
		Sthursday.setColumns(10);
		
		Ffriday = new JTextField();
		Ffriday.setHorizontalAlignment(SwingConstants.RIGHT);
		Ffriday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Ffriday.setBounds(536, 127, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Ffriday);
		Ffriday.setColumns(10);
		
		Sfriday = new JTextField();
		Sfriday.setHorizontalAlignment(SwingConstants.RIGHT);
		Sfriday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Sfriday.setBounds(536, 165, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Sfriday);
		Sfriday.setColumns(10);
		
		Fsaturday = new JTextField();
		Fsaturday.setHorizontalAlignment(SwingConstants.RIGHT);
		Fsaturday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Fsaturday.setBounds(634, 127, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Fsaturday);
		Fsaturday.setColumns(10);
		
		Ssaturday = new JTextField();
		Ssaturday.setHorizontalAlignment(SwingConstants.RIGHT);
		Ssaturday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Ssaturday.setBounds(634, 165, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Ssaturday);
		Ssaturday.setColumns(10);
		
		Fsunday = new JTextField();
		Fsunday.setHorizontalAlignment(SwingConstants.RIGHT);
		Fsunday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Fsunday.setBounds(730, 127, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Fsunday);
		Fsunday.setColumns(10);
		
		Ssunday = new JTextField();
		Ssunday.setHorizontalAlignment(SwingConstants.RIGHT);
		Ssunday.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Ssunday.setBounds(730, 165, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Ssunday);
		Ssunday.setColumns(10);
		
		E_name = new JTextField();
		E_name.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		E_name.setBounds(178, 45, 213, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(E_name);
		E_name.setColumns(10);
		
		HSalary = new JTextField();
		HSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		HSalary.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		HSalary.setBounds(505, 45, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(HSalary);
		HSalary.setColumns(10);
		
		JButton btnNewButton = new JButton("Process It");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				E_name.getText();
				float salary=Float.valueOf(HSalary.getText());
				float mon=Float.valueOf(Fmonday.getText());
				float tue=Float.valueOf(Ftuesday.getText());
				float wed=Float.valueOf(Fwednesday.getText());
				float thur=Float.valueOf(Fthursday.getText());
				float fri=Float.valueOf(Ffriday.getText());
				float sat=Float.valueOf(Fsaturday.getText());
				float sun=Float.valueOf(Fsunday.getText());
				float mon2=Float.valueOf(Smonday.getText());
				float tue2=Float.valueOf(Stuesday.getText());
				float wed2=Float.valueOf(Swednesday.getText());
				float thur2=Float.valueOf(Sthursday.getText());
				float fri2=Float.valueOf(Sfriday.getText());
				float sat2=Float.valueOf(Ssaturday.getText());
				float sun2=Float.valueOf(Ssunday.getText());
				float arr1[]= {mon,tue,wed,thur,fri,sat,sun,mon2,tue2,wed2,thur2,fri2,sat2,sun2};
				float overtime,regular,over;
				overtime=0;
				regular=0;
				for(int j=0;j<14;j++)
				{
					if (arr1[j]>8)
					{
						over=arr1[j]-8;
						overtime=overtime+over;
						regular=regular+8;
					}
					else
					{
						regular=regular+arr1[j];
					}
					
				}
				
				float Weekovertime=overtime;
				float Weekregular=regular;
	
				Reghours.setText(String.valueOf(Weekregular));
				Overhour.setText(String.valueOf(Weekovertime));
			float regularamnt = Weekregular*salary;
			float overtimeamnt = Weekovertime*salary;	
			String formattedRegularAmount = String.format("%.2f", regularamnt);
			String formattedOvertimeAmount = String.format("%.2f", overtimeamnt);

			RegAmount.setText(formattedRegularAmount);
			OverAmount.setText(formattedOvertimeAmount);
			float Netpay= overtimeamnt+regularamnt;
			
			String formattednetpay = String.format("%.2f", Netpay);
			netpay.setText(String.valueOf(formattednetpay));
				
			}
		});
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(238, 232, 170));
		btnNewButton.setBounds(71, 242, 89, 67);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_11 = new JLabel("Regular:");
		lblNewLabel_11.setBounds(178, 256, 70, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Overtime:");
		lblNewLabel_12.setBounds(178, 295, 70, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_12);
		
		Reghours = new JTextField();
		Reghours.setHorizontalAlignment(SwingConstants.RIGHT);
		Reghours.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Reghours.setBounds(248, 253, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Reghours);
		Reghours.setColumns(10);
		
		Overhour = new JTextField();
		Overhour.setHorizontalAlignment(SwingConstants.RIGHT);
		Overhour.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Overhour.setBounds(248, 292, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Overhour);
		Overhour.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Hours");
		lblNewLabel_13.setBounds(265, 220, 46, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Amount");
		lblNewLabel_14.setBounds(384, 220, 46, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_14);
		
		RegAmount = new JTextField();
		RegAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		RegAmount.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		RegAmount.setBounds(365, 253, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(RegAmount);
		RegAmount.setColumns(10);
		
		OverAmount = new JTextField();
		OverAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		OverAmount.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		OverAmount.setBounds(365, 292, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(OverAmount);
		OverAmount.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Net Pay:");
		lblNewLabel_15.setBounds(510, 256, 46, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_15);
		
		netpay = new JTextField();
		netpay.setHorizontalAlignment(SwingConstants.RIGHT);
		netpay.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		netpay.setBounds(581, 253, 86, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(netpay);
		netpay.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1.setBounds(727, 242, 89, 57);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 220));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Empoyee Identification", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(21, 21, 836, 57);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBorder(new TitledBorder(null, "Time Sheet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(21, 89, 835, 107);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(21, 205, 836, 126);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(panel_2);
	}

}
