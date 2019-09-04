package com.zend.ide.util;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class dn extends AbstractAction
  implements PropertyChangeListener
{
  private Action a;

  public dn(Action paramAction)
  {
    this((String)paramAction.getValue("Name"), paramAction);
  }

  public dn(String paramString, Action paramAction)
  {
    a(paramAction);
    putValue("Name", paramString);
  }

  public boolean isEnabled()
  {
    return (d().isEnabled()) && (super.isEnabled());
  }

  public void a(Action paramAction)
  {
    this.a = paramAction;
    this.a.addPropertyChangeListener(di.a(this, paramAction));
    setEnabled(paramAction.isEnabled());
  }

  public Action d()
  {
    return this.a;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    this.a.actionPerformed(paramActionEvent);
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    String str = paramPropertyChangeEvent.getPropertyName();
    if (str.equals("enabled"))
    {
      boolean bool = ((Boolean)paramPropertyChangeEvent.getNewValue()).booleanValue();
      setEnabled(bool);
    }
  }

  public Object getValue(String paramString)
  {
    Object localObject = super.getValue(paramString);
    if (localObject == null)
      localObject = d().getValue(paramString);
    return localObject;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.dn
 * JD-Core Version:    0.6.0
 */