package day0914;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends JFrame implements ActionListener{
	   
	   JTextField txtName,txtHP;
	   JTextArea area;
	   JButton btnOpen,btnSave,btnDelete;
	   String path="C:\\Users\\jihea\\eclipse-workspace\\day0902\\task.txt";
	   File file =new File(path);
	   
	   public Test(String title){
	      super(title);
	      this.setBounds(700, 100, 800, 800);
	      this.getContentPane().setBackground(new Color(211,225,209));
	      this.setDesign();
	      this.setVisible(true);
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }   

	   private void setDesign() {
	      // TODO Auto-generated method stub
	      JLabel lname, lhp; 
	      this.setLayout(null);
	      lname = new JLabel("이름");
	      lname.setBounds(30, 30, 100, 30);
	      this.add(lname);
	      txtName = new JTextField();
	      txtName.setBounds(150,30,150,30);
	      this.add(txtName);
	      lhp = new JLabel("핸드폰번호");
	      lhp.setBounds(30, 80, 100, 30);
	      this.add(lhp);
	      txtHP = new JTextField();
	      txtHP.setBounds(150,80,150,30);
	      this.add(txtHP);
	      btnOpen = new JButton("전체불러오기");
	      btnOpen.setBounds(30, 150, 130, 30);
	      this.add(btnOpen);
	      btnSave = new JButton("파일에추가");
	      btnSave.setBounds(180, 150, 130, 30);
	      this.add(btnSave);   
	      btnDelete = new JButton("파일에삭제");
	      btnDelete.setBounds(320, 150, 130, 30);
	      this.add(btnDelete);
	      area = new JTextArea("");
	      JScrollPane jas = new JScrollPane(area);
	      jas.setBounds(30,200,500,300);
	      this.add(jas);
	      
	      btnOpen.addActionListener(this);
	      btnSave.addActionListener(this);
	      btnDelete.addActionListener(this);
	      
	   }
	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      new Test("파일문제 연습");
	   }
	   @Override
	   public void actionPerformed(ActionEvent e) {
	      // TODO Auto-generated method stub
	      Object ob = e.getSource();
	      if(ob==btnOpen) {
	         if(file.exists()) {
	            FileReader fr =null;
	            BufferedReader br =null;      
	            try {
	               fr = new FileReader(path);
	               br = new BufferedReader(fr);
	               
	               area.setText("");
	               
	               while(true)
	               {
	                  String line = br.readLine();
	                  if(line==null||line.length()==0)
	                     break;
	                  area.setText(line+"\n");   
	               }
	            } catch (FileNotFoundException e1) {
	               // TODO Auto-generated catch block
	               e1.printStackTrace();
	            } catch (IOException e1) {
	               // TODO Auto-generated catch block
	               e1.printStackTrace();
	            }finally {
	               
	               try {
	                  if(br!= null) br.close();
	                  if(fr!=null) fr.close();
	               }catch(IOException e1) {}   
	            }   
	         }   
	      }else if(ob == btnSave) {
	         
	            String name = txtName.getText();
	            String hp = txtHP.getText();
	            File file = new File(path);
	            FileWriter fw = null;
	            
	         try {
	            fw = new FileWriter(path,true);
	            fw.write("name : "+ name+", phone number : " + hp + "\n");
	            txtName.setText("");
	            txtHP.setText("");   
	         } catch (IOException e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	         }finally{
	            try {
	               if(fw != null) fw.close();
	            }catch (IOException e1) {
	               e1.printStackTrace();
	            }      
	         }
	      }else if(ob == btnDelete) {
	         if(file.exists()) {
	            file.delete();
	            area.setText("해당파일을 삭제하였습니다.");   
	         }
	         
	      }else {   
	         area.setText("파일 재확인");
	      }   
	   }
	}