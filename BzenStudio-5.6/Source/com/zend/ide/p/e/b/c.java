package com.zend.ide.p.e.b;

import com.sun.java.swing.plaf.windows.WindowsButtonListener;
import java.beans.PropertyChangeEvent;
import javax.swing.AbstractButton;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ComponentInputMapUIResource;

public class c extends WindowsButtonListener
{
  private boolean a = false;

  public c(AbstractButton paramAbstractButton)
  {
    super(paramAbstractButton);
  }

  public void installKeyboardActions(JComponent paramJComponent)
  {
    super.installKeyboardActions(paramJComponent);
    ActionMap localActionMap = SwingUtilities.getUIActionMap(paramJComponent);
    localActionMap.put("pressed_selective", new g((AbstractButton)paramJComponent, null));
    SwingUtilities.replaceUIActionMap(paramJComponent, localActionMap);
    a((AbstractButton)paramJComponent);
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    String str = paramPropertyChangeEvent.getPropertyName();
    if (str.equals("mnemonic"))
      a((AbstractButton)paramPropertyChangeEvent.getSource());
    else
      super.propertyChange(paramPropertyChangeEvent);
  }

  private void a(AbstractButton paramAbstractButton)
  {
    int i = paramAbstractButton.getMnemonic();
    Object localObject;
    if (i != 0)
    {
      if (!this.a)
      {
        localObject = new ComponentInputMapUIResource(paramAbstractButton);
        SwingUtilities.replaceUIInputMap(paramAbstractButton, 2, (InputMap)localObject);
        this.a = true;
      }
      else
      {
        localObject = SwingUtilities.getUIInputMap(paramAbstractButton, 2);
      }
      if (localObject != null)
      {
        ((InputMap)localObject).clear();
        ((InputMap)localObject).put(KeyStroke.getKeyStroke(i, 8, false), "pressed");
        ((InputMap)localObject).put(KeyStroke.getKeyStroke(i, 8, true), "released");
        ((InputMap)localObject).put(KeyStroke.getKeyStroke(i, 0, false), "pressed_selective");
        ((InputMap)localObject).put(KeyStroke.getKeyStroke(i, 0, true), "released");
      }
    }
    else if (this.a)
    {
      localObject = SwingUtilities.getUIInputMap(paramAbstractButton, 2);
      if (localObject != null)
        ((InputMap)localObject).clear();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.b.c
 * JD-Core Version:    0.6.0
 */