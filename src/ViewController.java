import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;

public class ViewController extends JFrame {
	
	public JPanel sidePanel = new JPanel();;
	public JPanel editorPanel = new JPanel();;
	public PageListViewer pageListViewer;
	public PageEditor pageEditor;
	public PageMenu pageMenu;
	
	public ViewController() { //클래스와 이름이 같아 생긴 빨간줄
		setTitle("Basic Note");
		setSize(1000,700);
		
		sidePanel.setBackground(Color.RED);
		editorPanel.setBackground(Color.ORANGE);
		
		pageEditor =  new PageEditor();
		JScrollPane scrollPane = new JScrollPane(pageEditor);
		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		pageListViewer = new PageListViewer(pageEditor,root);
		
		pageMenu = new PageMenu(pageListViewer,pageEditor);  //메뉴바 생성
		setJMenuBar(pageMenu);  //메인프레임에 메뉴바 부착
		
		sidePanel.setLayout(new GridLayout(1,1));
		sidePanel.add(pageListViewer);  //왼쪽 JPanel에 트리뷰 컴포넌트를 추가한다. 
        editorPanel.setLayout(new GridLayout(1,1));
        editorPanel.add(pageEditor);  //오른쪽 JPanel에 텍스트 에디어 컴포넌트를 추가한다.
        
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
	
		sidePanel.setLayout(new GridLayout(1,1));
        sidePanel.add(pageListViewer);  //왼쪽 JPanel에 트리뷰 컴포넌트를 추가한다. 

        editorPanel.setLayout(new GridLayout(1,1));
        editorPanel.add(pageEditor);  //오른쪽 JPanel에 텍스트 에디어 컴포넌트를 추가한다.

        contentPane.add("West",sidePanel); 
        contentPane.add("Center",editorPanel);  
       

		
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //프레임 윈도우가 닫힐 때 프로그램도 함께 종료한다.
	}

}


//3번째 줄 오류 관련
//https://zzznara2.tistory.com/186
//https://blog.naver.com/fochaerim/70105895049