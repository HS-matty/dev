package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;
import javax.swing.text.JTextComponent;

class hx extends DefaultEditorKit.InsertBreakAction
{
  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = getTextComponent(paramActionEvent);
    if ((localJTextComponent == null) || (!(localJTextComponent instanceof gz)))
    {
      super.actionPerformed(paramActionEvent);
      return;
    }
    if ((!localJTextComponent.isEditable()) || (!localJTextComponent.isEnabled()))
    {
      UIManager.getLookAndFeel().provideErrorFeedback(localJTextComponent);
      return;
    }
    ((gz)localJTextComponent).A().a((gz)localJTextComponent, "\n");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hx
 * JD-Core Version:    0.6.0
 */