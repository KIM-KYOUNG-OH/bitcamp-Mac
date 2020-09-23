package day0915;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Ex5FileMunje extends JFrame{
	JTextField textName, textNum, textPrice;
	JTable table;
	DefaultTableModel model;
	JButton btnAdd, btnDelete;
	String []title = {"Name", "Number", "Price", "Total"};
	String fileName = "/Users/kimgyeong-o/bitcampJAVA/shop1.txt";
	
	public Ex5FileMunje(String title) {
		super(title);
		this.setBounds(700, 100, 400, 400); // 시작위치 x, y, 크기 w, h
//		this.getContentPane().setBackground(Color.DARK_GRAY); // 프레임 위에 있는 패널의 색상변경
		this.getContentPane().setBackground(new Color(211, 225, 208)); // 프레임 위에 있는 패널의 색상변경
		this.setDesign(); // 디자인 코드
		this.writeData();
		this.setVisible(true); // 보이게 하기
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료해주는 메서드
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName, false);
					for(int i=0; i<model.getRowCount(); i++) {
						String line = "";
						for(int j=0; j<model.getColumnCount(); j++) {
							line += model.getValueAt(i, j).toString() + ",";
						}
						line = line.substring(0, line.length()-1);
						fw.write(line + "\n");
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					try {
						fw.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				System.exit(0);
				super.windowClosing(e);
			}
		});
	}
	
	private void writeData() {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null || line.length() == 0) {
					break;
				}
				String []data = line.split(",");
				model.addRow(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void setDesign() {
		this.setLayout(null);
		// 라벨, 필드 설정
		JLabel lblName = new JLabel("이름");
		lblName.setBounds(10, 20, 30, 30);
		this.add(lblName);
		
		JLabel lblNum = new JLabel("개수");
		lblNum.setBounds(130, 20, 30, 30);
		this.add(lblNum);
		
		JLabel lblPrice = new JLabel("단가");
		lblPrice.setBounds(250, 20, 30, 30);
		this.add(lblPrice);
		
		textName = new JTextField();
		textName.setBounds(40, 20, 80, 30);
		this.add(textName);
		
		textNum = new JTextField();
		textNum.setBounds(160, 20, 80, 30);
		this.add(textNum);
		
		textPrice = new JTextField();
		textPrice.setBounds(270, 20, 80, 30);
		this.add(textPrice);
		
		// 버튼 생성
		btnAdd = new JButton("데이터추가");
		btnAdd.setBounds(100, 60, 80, 30);
		this.add(btnAdd);
		
		btnDelete = new JButton("데이터삭제");
		btnDelete.setBounds(200, 60, 80, 30);
		this.add(btnDelete);
		
		// table생성
		model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		JScrollPane jsp = new JScrollPane(table);
		jsp.setBounds(20, 90, 350, 250);
		this.add(jsp);
		
		// 버튼 이벤트
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String name = textName.getText();
					String num = textNum.getText();
					String price = textPrice.getText();
					int total = Integer.parseInt(num) * Integer.parseInt(price);
					
					// 테이블에 데이터 추가
					String []data = {name, num, price, String.valueOf(total)};
					model.addRow(data);
					textName.setText("");
					textNum.setText("");
					textPrice.setText("");
				} catch (NumberFormatException e2) {
					JOptionPane.showInternalMessageDialog(Ex5FileMunje.this, "빈칸에 숫자만 입력하세요");
				}
				
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();
				if(selectedRow == -1) {
					JOptionPane.showMessageDialog(Ex5FileMunje.this, "데이터가 없습니다.");
				}else {
					model.removeRow(selectedRow);
				}
			}
		});
	}
	
	public static void main(String[] args) {
		new Ex5FileMunje("파일shop");
	}
}
