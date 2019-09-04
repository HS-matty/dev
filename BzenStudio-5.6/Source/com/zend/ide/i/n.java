package com.zend.ide.i;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.KeyStroke;

public class n extends JDialog
{
  public String a = "closeActionName";

  public n()
  {
    b();
  }

  public n(Frame paramFrame)
  {
    super(paramFrame);
    b();
  }

  public n(Frame paramFrame, String paramString)
  {
    super(paramFrame, paramString);
    b();
  }

  public n(Frame paramFrame, String paramString, boolean paramBoolean)
  {
    super(paramFrame, paramString, paramBoolean);
    b();
  }

  public n(Frame paramFrame, boolean paramBoolean)
  {
    super(paramFrame, paramBoolean);
    b();
  }

  public n(Dialog paramDialog)
  {
    super(paramDialog);
    b();
  }

  public n(Dialog paramDialog, String paramString)
  {
    super(paramDialog, paramString);
    b();
  }

  public n(Dialog paramDialog, boolean paramBoolean)
  {
    super(paramDialog, paramBoolean);
    b();
  }

  public n(Dialog paramDialog, String paramString, boolean paramBoolean)
  {
    super(paramDialog, paramString, paramBoolean);
    b();
  }

  public void B()
  {
    Dimension localDimension1 = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension localDimension2 = getSize();
    setLocation((localDimension1.width - localDimension2.width) / 2, (localDimension1.height - localDimension2.height) / 2);
  }

  protected void b()
  {
    addWindowListener(new b(this));
    JComponent localJComponent = (JComponent)getContentPane();
    localJComponent.getActionMap().put(this.a, new l(this));
    InputMap localInputMap = localJComponent.getInputMap(1);
    localInputMap.put(KeyStroke.getKeyStroke(27, 0), this.a);
  }

  public boolean d()
  {
    setVisible(false);
    Container localContainer = getParent();
    if (localContainer != null)
    {
      Component localComponent = null;
      if ((localContainer instanceof Dialog))
        localComponent = ((Dialog)localContainer).getMostRecentFocusOwner();
      else if ((localContainer instanceof Frame))
        localComponent = ((Frame)localContainer).getMostRecentFocusOwner();
      if (localComponent != null)
        localComponent.requestFocus();
    }
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.n
 * JD-Core Version:    0.6.0
 */