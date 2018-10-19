package com.swtjface.Ch2;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

public class HelloSWT_JFace extends ApplicationWindow
  	{
	public HelloSWT_JFace() //클래스 생성자 호출
	{
		super(null);
	}
	//Window 할당
	
	protected Control createContents(Composite parent) //ApplicationWindow-createContents
	{
	Text helloText = new Text(parent, SWT.CENTER);
	helloText.setText("Hello SWT and JFace!");
	parent.pack();
	return parent;
	}
	
	public static void main(String[] args)
	{
		HelloSWT_JFace awin = new HelloSWT_JFace();
		awin.setBlockOnOpen(true);
		awin.open();
		Display.getCurrent().dispose(); //window 닫고 나서 작용함.
	}

}
