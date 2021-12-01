import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;

public class ViewController extends JFrame {
	
	public JPanel sidePanel = new JPanel();;
	public JPanel editorPanel = new JPanel();;
	public PageListViewer pageListViewer;
	public PageEditor pageEditor;
	public PageMenu pageMenu;
	
	public ViewController() { //Ŭ������ �̸��� ���� ���� ������
		setTitle("Basic Note");
		setSize(1000,700);
		
		sidePanel.setBackground(Color.RED);
		editorPanel.setBackground(Color.ORANGE);
		
		pageEditor =  new PageEditor();
		JScrollPane scrollPane = new JScrollPane(pageEditor);
		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		pageListViewer = new PageListViewer(pageEditor,root);
		
		pageMenu = new PageMenu(pageListViewer,pageEditor);  //�޴��� ����
		setJMenuBar(pageMenu);  //���������ӿ� �޴��� ����
		
		sidePanel.setLayout(new GridLayout(1,1));
		sidePanel.add(pageListViewer);  //���� JPanel�� Ʈ���� ������Ʈ�� �߰��Ѵ�. 
        editorPanel.setLayout(new GridLayout(1,1));
        editorPanel.add(pageEditor);  //������ JPanel�� �ؽ�Ʈ ����� ������Ʈ�� �߰��Ѵ�.
        
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
	
		sidePanel.setLayout(new GridLayout(1,1));
        sidePanel.add(pageListViewer);  //���� JPanel�� Ʈ���� ������Ʈ�� �߰��Ѵ�. 

        editorPanel.setLayout(new GridLayout(1,1));
        editorPanel.add(pageEditor);  //������ JPanel�� �ؽ�Ʈ ����� ������Ʈ�� �߰��Ѵ�.

        contentPane.add("West",sidePanel); 
        contentPane.add("Center",editorPanel);  
       

		
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //������ �����찡 ���� �� ���α׷��� �Բ� �����Ѵ�.
	}

}


//3��° �� ���� ����
//https://zzznara2.tistory.com/186
//https://blog.naver.com/fochaerim/70105895049