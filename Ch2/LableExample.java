package com.swtjface.Ch2;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.window.*;

public class LableExample extends ApplicationWindow
	{
		public LableExample()
		{
			super(null);
		}
	protected Control createContents(Composite parent)
	{
		getShell().setText("LableExample");
		parent.setSize(400,250);
		return parent;
	}
	public static void main(String[] args)
	{
		WidgetWindow_2 wwin = new WidgetWindow_2();
		wwin.setBlockOnOpen(true);
		wwin.open();
		Display.getCurrent().dispose();
	}
}