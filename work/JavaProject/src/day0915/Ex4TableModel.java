package day0915;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Ex4TableModel extends JFrame{
	DefaultTableModel model;
	JTable table;
	JTextField txtName, txtJava, txtSpring;
	JButton btnAdd, btnDelete;
	String []title = {"Name", "Java", "Spring", "Total", "Average"};
	final String fileName = "/Users/kimgyeong-o/bitcampJAVA/sungjuk.txt";

	public Ex4TableModel(String title) {
		super(title);
		this.setBounds(700, 100, 400, 400); // 시작위치 x, y, 크기 w, h
//		this.getContentPane().setBackground(Color.DARK_GRAY); // 프레임 위에 있는 패널의 색상변경
		this.getContentPane().setBackground(new Color(211, 225, 208)); // 프레임 위에 있는 패널의 색상변경
		this.setDesign(); // 디자인 코드
		this.writeData(); // 테이블에 파일 내용 불러오기
		this.setVisible(true); // 보이게 하기
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 종료해주는 메서드
		
		// 종료시 테이블의 데이터를 파일에 저장
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 파일 저장
				// 총 행갯수 : model.getRowCount()
				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName, true);
					for(int i=0; i<model.getRowCount(); i++) {
						// 행갓수
						// 행단위로 저장할 변수 선언
						String line = "";
						for(int j=0; j<model.getColumnCount(); j++) {
							line += model.getValueAt(i, j).toString() + ",";
						}
						// 맨 마지막 컴마는 제거
						line = line.substring(0, line.length()-1);
						// 파일에 저장
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
				
				// 시스템 종료
				System.exit(0);
				super.windowClosing(e);
			}
		});
	}
	
	// 파일에서 데이터를 가져와서 테이블에 출력
	public void writeData() {
		// 파일에서 불러오기
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			while(true) {
				// 파일에서 한줄 읽기
				String line = br.readLine();
				// 널값이면 종료
				if(line == null) {
					break;
				}
				// , 로 분리
				String []data = line.split(",");
				// model에 추가
				model.addRow(data);
			}
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(this, "불러올 파일이 없습니다");
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
		// 입력 텍스트 필드
		JLabel lbl1 = new JLabel("Name");
		lbl1.setBounds(10, 20, 50, 30);
		this.add(lbl1);
		
		JLabel lbl2 = new JLabel("Java");
		lbl2.setBounds(130, 20, 50, 30);
		this.add(lbl2);
		
		JLabel lbl3 = new JLabel("Spring");
		lbl3.setBounds(250, 20, 50, 30);
		this.add(lbl3);
		
		txtName = new JTextField();
		txtName.setBounds(50, 20, 70, 30);
		this.add(txtName);
		
		txtJava = new JTextField();
		txtJava.setBounds(160, 20, 70, 30);
		this.add(txtJava);
		
		txtSpring = new JTextField();
		txtSpring.setBounds(300, 20, 70, 30);
		this.add(txtSpring);
		
		// 버튼
		btnAdd = new JButton("데이터추가");
		btnAdd.setBounds(30, 60, 100, 30);
		this.add(btnAdd);
		
		btnDelete = new JButton("데이터삭제");
		btnDelete.setBounds(200, 60, 100, 30);
		this.add(btnDelete);
		
		// 테이블
		model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		JScrollPane jsp = new JScrollPane(table);
		jsp.setBounds(20, 120, 350, 190);
		this.add(jsp);
		
		// 추가 이벤트
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String java = txtJava.getText();
				String spring = txtSpring.getText();
				try {
					int tot = Integer.parseInt(java) + Integer.parseInt(spring);
					double avg = tot/2.0;
					// 1. String 배열 타입으로 추가하는 방법
					// 전체 데이터를 String 배열타입으로 만들기
//					String []data = {name, java, spring, String.valueOf(tot), String.valueOf(avg)};
					
					// 테이블 모델에 추가
//					model.addRow(data);
					
					// 2. vector타입으로 추가하는 방법
					Vector<String> arr = new Vector<String>();
					arr.add(name);
					arr.add(java);
					arr.add(spring);
					arr.add(String.valueOf(tot));
					arr.add(String.valueOf(avg));
					model.addRow(arr);
					
					// 입력값 지우기
					txtName.setText("");
					txtJava.setText("");
					txtSpring.setText("");
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(Ex4TableModel.this, "점수에 문자가 섞여있네요");
					return;
				}
			}
		});
		
		// 삭제 버튼 이벤트
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectRow = table.getSelectedRow(); // 선택하면 행번호 반환, 안하면 -1 반환
				System.out.println(selectRow);
				if(selectRow == -1) {
					JOptionPane.showMessageDialog(Ex4TableModel.this, "삭제할 행을 선택해주세요");
				}else {
					// 삭제
					model.removeRow(selectRow);
				}
			}
		});
	}
	
	public static void main(String[] args) {
		new Ex4TableModel("table 데이터 관리");
	}
}
