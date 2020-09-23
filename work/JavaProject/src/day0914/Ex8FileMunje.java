package day0914;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex8FileMunje extends JFrame implements ActionListener{
	JTextField txtName, txtHp;
	JTextArea area;
	JButton btnOpen, btnSave, btnDelete;
	final String root = "/Users/kimgyeong-o/bitcampJAVA/info.txt";
	
	public Ex8FileMunje(String title) {
		super(title);
		this.setBounds(700, 100, 500, 500); // 시작위치 x, y, 크기 w, h
		this.getContentPane().setBackground(Color.white); // 프레임 위에 있는 패널의 색상변경
//		this.getContentPane().setBackground(new Color(211, 225, 208)); // 프레임 위에 있는 패널의 색상변경
		this.setDesign(); // 디자인 코드
		this.setVisible(true); // 보이게 하기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료해주는 메서드
	}
	
	public void setDesign() {
		this.setLayout(null);
		btnSave = new JButton("파일에 추가");
		btnSave.setBounds(170, 30, 100, 30);
		this.add(btnSave);
		
		btnOpen = new JButton("전체불러오기");
		btnOpen.setBounds(50, 30, 100, 30);
		this.add(btnOpen);
		
		btnDelete = new JButton("파일삭제");
		btnDelete.setBounds(290, 30, 100, 30);
		this.add(btnDelete);
		
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setBounds(60, 80, 60, 30);
		this.add(nameLabel);
		
		txtName = new JTextField();
		txtName.setBounds(160, 80, 100, 30);
		this.add(txtName);
		
		JLabel phoneLabel = new JLabel("핸드폰");
		phoneLabel.setBounds(60, 120, 60, 30);
		this.add(phoneLabel);
		
		txtHp= new JTextField();
		txtHp.setBounds(160, 120, 100, 30);
		this.add(txtHp);
		
		area = new JTextArea();
		JScrollPane jsp = new JScrollPane(area);
		jsp.setBounds(10, 160, 450, 350);
		this.add(jsp); // 스크롤이 필요한 컴포넌트 추가하는 방법
		
		// 버튼 이벤트 추가
		btnSave.addActionListener(this);
		btnOpen.addActionListener(this);
		btnDelete.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob == btnSave) {
			FileWriter fw = null;
			String name = txtName.getText();
			String hp = txtHp.getText();
			if(name.length() == 0 || hp.length() == 0) {
				JOptionPane.showMessageDialog(this, "데이터를 입력해주세요");
				return;
			}
			try {
				fw = new FileWriter(root, true);
				String ct = "이름 : " + name + " 핸드폰 : " + hp;
				fw.write(ct + "\n");
				fw.write("=======================\n");
				area.setText(root + " 저장완료!!!!");
				txtName.setText("");
				txtHp.setText("");
				txtName.requestFocus(); // 포커스 보내기
			} catch (FileNotFoundException e2) {
				e2.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					fw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
		}else if(ob == btnOpen) {
			FileReader fr = null;
			BufferedReader br = null;
			try {
				fr = new FileReader(root);
				br = new BufferedReader(fr);
				// 현재 메모장 지우기
				area.setText("");
				while(true) {
					//한줄 읽기
					String line = br.readLine();
					if(line == null) {
						break;
					}
					area.append(line+"\n");
				}
			} catch (FileNotFoundException e1) {
				area.setText("파일이 존재하지 않습니다.\n데이터 저장후 불러오세요");
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if(br != null) {
						br.close();
					}
					if(fr != null) {
						fr.close();
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		}else if(ob == btnDelete) {
			File file = new File(root);
			if(file.exists()) {
				file.delete();
				area.setText("파일이 삭제되었습니다.");
			}else {
				area.setText("파일이 존재하지 않습니다");
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex8FileMunje("파일입출력문제");
	}

	
}
