package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel.setBounds(12, 10, 173, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트");
		lblNewLabel_1.setBounds(22, 45, 119, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setBounds(32, 70, 97, 23);
		contentPane.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("버튼1 클릭");
			}
		});
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭");
			}
		});
		btn2.setBounds(123, 70, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.setBounds(219, 70, 97, 23);
		contentPane.add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼3 클릭", "대화상자 제목", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		});
		btn4.setBounds(312, 70, 97, 23);
		contentPane.add(btn4);
		
		txtf1 = new JTextField();
		txtf1.setBounds(25, 129, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(25, 160, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(25, 191, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lbltxtf1result = new JLabel("결과: ");
		lbltxtf1result.setBounds(219, 132, 119, 15);
		contentPane.add(lbltxtf1result);
		
		JLabel lbltxtf2result = new JLabel("결과: ");
		lbltxtf2result.setBounds(219, 163, 119, 15);
		contentPane.add(lbltxtf2result);
		
		JLabel lbltxtf3result = new JLabel("결과: ");
		lbltxtf3result.setBounds(219, 194, 119, 15);
		contentPane.add(lbltxtf3result);
		
		JLabel lblNewLabel_1_1 = new JLabel("TextField 컴포넌트");
		lblNewLabel_1_1.setBounds(22, 104, 119, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btntxtf1 = new JButton("확인");
		btntxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf1.getText();
				lbltxtf1result.setText("결과: " + txt);
			}
		});
		
		btntxtf1.setBounds(141, 129, 67, 19);
		contentPane.add(btntxtf1);
		
		JButton btntxtf2 = new JButton("확인");
		btntxtf2.setBounds(141, 161, 67, 19);
		contentPane.add(btntxtf2);
		btntxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf2.getText();
				lbltxtf2result.setText("결과: " + txt);
			}
		});
		
		JButton btntxtf3 = new JButton("확인");
		btntxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf3.getText();
				lbltxtf3result.setText("결과: " + txt);
			}
		});
		btntxtf3.setBounds(141, 192, 67, 19);
		contentPane.add(btntxtf3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Checkbox 컴포넌트");
		lblNewLabel_1_1_1.setBounds(22, 235, 119, 15);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("취미를 고르세요");
		lblNewLabel_1_1_1_1.setBounds(32, 260, 119, 15);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(12, 281, 67, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(84, 281, 67, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(155, 281, 67, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(226, 281, 67, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(297, 281, 67, 23);
		contentPane.add(chk5);

		JLabel lblchkresult = new JLabel("결과: ");
		lblchkresult.setBounds(32, 310, 188, 15);
		contentPane.add(lblchkresult);
		
		JButton btnchk = new JButton("확인");
		btnchk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> chks = new ArrayList<>();
				
				if(chk1.isSelected()) {
					chks.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					chks.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					chks.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					chks.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				
				lblchkresult.setText("결과: " + chks.toString());
			}
		});
		btnchk.setBounds(367, 283, 67, 19);
		contentPane.add(btnchk);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_1_1_1_2.setBounds(22, 348, 119, 15);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JRadioButton rdmale = new JRadioButton("남자");
		rdmale.setBounds(20, 369, 67, 23);
		contentPane.add(rdmale);
		
		JRadioButton rdfemale = new JRadioButton("여자");
		rdfemale.setBounds(91, 369, 67, 23);
		contentPane.add(rdfemale);
		
		ButtonGroup bg = new ButtonGroup(); // 라디오버튼 둘 중 하나만 선택될 수 있도록 하는 코드
		bg.add(rdmale);
		bg.add(rdfemale);
		
		JLabel lblgenderresult = new JLabel("결과: ");
		lblgenderresult.setBounds(32, 398, 188, 15);
		contentPane.add(lblgenderresult);
		
		JButton btngender = new JButton("확인");
		btngender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdmale.isSelected()) {
					lblgenderresult.setText("결과: " + rdmale.getText());
				}else {
					lblgenderresult.setText("결과: " + rdfemale.getText());
				}
			}
		});
		btngender.setBounds(165, 371, 67, 19);
		contentPane.add(btngender);
	}
}
