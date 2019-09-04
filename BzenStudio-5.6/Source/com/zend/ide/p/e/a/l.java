package com.zend.ide.p.e.a;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JDialog;
import javax.swing.text.JTextComponent;

class l extends AbstractAction
{
  AbstractButton a = null;

  private l(AbstractButton paramAbstractButton)
  {
    this.a = paramAbstractButton;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    Container localContainer = this.a.getParent();
    while (!(localContainer instanceof JDialog))
    {
      localContainer = localContainer.getParent();
      if (localContainer == null)
        return;
    }
    Component localComponent = ((JDialog)localContainer).getFocusOwner();
    if ((localComponent != null) && ((localComponent instanceof JTextComponent)))
      return;
    this.a.requestFocus();
    ButtonModel localButtonModel = this.a.getModel();
    localButtonModel.setArmed(true);
    localButtonModel.setPressed(true);
  }

  public boolean isEnabled()
  {
    return this.a.getModel().isEnabled();
  }

  l(AbstractButton paramAbstractButton, f paramf)
  {
    this(paramAbstractButton);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.e.a.l
 * JD-Core Version:    0.6.0
 */