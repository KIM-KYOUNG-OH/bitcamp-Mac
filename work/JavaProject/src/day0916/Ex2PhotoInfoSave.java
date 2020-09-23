package day0916;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex2PhotoInfoSave extends JFrame implements ActionListener{
	MyPhoto myPhoto; // 내부클래스
	JButton btnPhoto, btnSave, btnOpen;
	JTextField txtName, txtAge;
	JComboBox<String> comboBlood;
	Image photoImage;
	String imageName;
	String []bloodType = {"A", "B", "O", "AB"};

	public Ex2PhotoInfoSave(String title) {
		super(title);
		this.setBounds(700, 100, 400, 400); // 시작위치 x, y, 크기 w, h
		this.getContentPane().setBackground(Color.white); // 프레임 위에 있는 패널의 색상변경
		//		this.getContentPane().setBackground(new Color(211, 225, 208)); // 프레임 위에 있는 패널의 색상변경
		this.setDesign(); // 디자인 코드
		this.setVisible(true); // 보이게 하기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료해주는 메서드
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();
		if(ob == btnPhoto) {
			// 사진 가져오기 버튼
			// FileDialog를 이용해서 사진을 가져오면 사진 변경되도록 해보세요
			FileDialog fd = null;
			fd = new FileDialog(this, "사진불러오기", FileDialog.LOAD);
			fd.setVisible(true);
			if(fd.getDirectory() != null) {
				imageName = fd.getDirectory()+fd.getFile();
				// Image 생성
				photoImage = new ImageIcon(imageName).getImage();
				// paint 메서드 호출
				myPhoto.repaint();
			}
		}else if(ob == btnSave) {
			// 정보 저장
			// 입력한 이름.txt로 저장하기(java0901 폴더에)
			// 입력체크 - 이름이나 나이를 입력안하면 경고메세지후 메서드종료
			FileWriter fw = null;
			String photo = imageName;
			String name = txtName.getText();
			String blood = String.valueOf(bloodType[comboBlood.getSelectedIndex()]);
			String age = txtAge.getText();
			String path = "/Users/kimgyeong-o/bitcampJAVA/" + name + ".txt";


			if(name.length() == 0) {
				JOptionPane.showMessageDialog(this, "이름을 입력해주세요");
				txtName.requestFocus();
				return;
			}else if(age.length() == 0) {
				JOptionPane.showMessageDialog(this, "나이를 입력해주세요");
				txtName.requestFocus();
				return;
			}
			try {
				fw = new FileWriter(path, false);
				
				fw.write(photo + "\n");
				fw.write(name + "\n");
				fw.write(blood + "\n");
				fw.write(age + "\n");

				imageName = "/Users/kimgyeong-o/bitcampJAVA/image/연예인사진/1.JPG";
				photoImage = new ImageIcon(imageName).getImage();
				myPhoto.repaint();
				txtName.setText("");
				txtAge.setText("");

			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					fw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			// 파일에 한줄에 정보 한개씩
			// 이미지명(첫줄), 이름(두번째줄), 혈액형(세번째줄), 나이(네번째줄)로 저장

			// 이미지는 처음 이미지로 초기화, 이름과 나이는 지우고 혈액형은 다시 1번째꺼로 초기화

		}else if(ob == btnOpen) {
			// 정보 가져오기
			// 해당 이름으로 된 파일을 불러오면 그 데이터로
			// 사진, 이름, 혈액형, 나이가 변경되도록 한다
			FileReader fr = null;
			BufferedReader br = null;
			FileDialog dlg = new FileDialog(this, "파일열기", FileDialog.LOAD);
			dlg.setVisible(true);
			if(dlg.getDirectory() != null) {
				String fileName = dlg.getDirectory()+dlg.getFile();
				try {
					fr = new FileReader(fileName);
					br = new BufferedReader(fr);
					
					imageName = br.readLine();
					photoImage = new ImageIcon(imageName).getImage();
					myPhoto.repaint();
					
					String name = br.readLine();
					txtName.setText(name);
					
					String blood = br.readLine();
					comboBlood.setSelectedItem(blood);
					
					String age = br.readLine();
					txtAge.setText(age);
					
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					try {
						if(br!=null) br.close();
						if(fr!=null) fr.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
				}
				
			}
		}
	}

	// 사진을 출력할 캠바스 내부클래스
	class MyPhoto extends Canvas{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(photoImage, 0, 0, 100, 150, this);
		}
	}

	public void setDesign() {
		this.setLayout(null);
		// 사진 버튼
		btnPhoto = new JButton("사진가져오기");
		btnPhoto.setBounds(20, 20, 120, 25);
		this.add(btnPhoto);
		btnPhoto.addActionListener(this);

		// 사진 출력
		// 임시 사진 출력하기
		photoImage = new ImageIcon("/Users/kimgyeong-o/bitcampJAVA/image/연예인사진/1.JPG").getImage();
		myPhoto = new MyPhoto(); // 내부클래스 생성
		myPhoto.setBounds(20, 50, 100, 150);
		this.add(myPhoto);

		// 사진 우측으로 이름, 혈액형, 나이 입력하기
		JLabel lbl1 = new JLabel("이름");
		lbl1.setBounds(250, 30, 50, 25);
		this.add(lbl1);

		JLabel lbl2 = new JLabel("혈액형");
		lbl2.setBounds(250, 80, 50, 25);
		this.add(lbl2);

		JLabel lbl3 = new JLabel("나이");
		lbl3.setBounds(250, 130, 50, 25);
		this.add(lbl3);

		txtName = new JTextField();
		txtName.setBounds(300, 30, 80, 25);
		this.add(txtName);

		comboBlood = new JComboBox<String>(bloodType);
		comboBlood.setBounds(300, 80, 80, 25);
		this.add(comboBlood);

		txtAge = new JTextField();
		txtAge.setBounds(300, 130, 80, 25);
		this.add(txtAge);

		// 버튼 2개
		btnSave = new JButton("고객정보저장");
		btnSave.setBounds(50, 250, 130, 50);
		btnSave.setBackground(Color.red);
		btnSave.setForeground(Color.green);
		btnSave.setOpaque(true);
		btnSave.setBorderPainted(false);
		btnSave.addActionListener(this);
		this.add(btnSave);

		btnOpen = new JButton("고객정보가져오기");
		btnOpen.setBounds(200, 250, 150, 50);
		btnOpen.setBackground(Color.orange);
		btnOpen.setForeground(Color.blue);
		btnOpen.setOpaque(true);
		btnOpen.setBorderPainted(false);
		btnOpen.addActionListener(this);
		this.add(btnOpen);
	}

	public static void main(String[] args) {
		new Ex2PhotoInfoSave("고객정보관리");
	}
}
