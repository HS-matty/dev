package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

class re extends TextAction
{
  re()
  {
    super("delete-previous");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = getTextComponent(paramActionEvent);
    boolean bool = true;
    if ((localJTextComponent != null) && (localJTextComponent.isEditable()))
      bool = ((gz)localJTextComponent).a().a((gz)localJTextComponent);
    if (bool)
      UIManager.getLookAndFeel().provideErrorFeedback(localJTextComponent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.re
 * JD-Core Version:    0.6.0
 */