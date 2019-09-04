package com.zend.ide.p;

import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

public class cd extends JScrollPane
{
  public cd(Component paramComponent, int paramInt1, int paramInt2)
  {
    super(paramComponent, paramInt1, paramInt2);
  }

  public cd(Component paramComponent)
  {
    super(paramComponent);
  }

  public cd()
  {
  }

  public void requestFocus()
  {
    super.requestFocus();
    JViewport localJViewport = getViewport();
    Component localComponent = localJViewport.getView();
    if (localComponent != null)
      localComponent.requestFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.cd
 * JD-Core Version:    0.6.0
 */