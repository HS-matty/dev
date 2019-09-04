package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

public class hs extends TextAction
{
  public hs()
  {
    super("copy-to-clipboard");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = getTextComponent(paramActionEvent);
    if (localJTextComponent != null)
    {
      if (localJTextComponent.getSelectedText() == null)
      {
        int i = localJTextComponent.getCaretPosition();
        Element localElement1 = localJTextComponent.getDocument().getDefaultRootElement();
        Element localElement2 = localElement1.getElement(localElement1.getElementIndex(i));
        localJTextComponent.setCaretPosition(localElement2.getEndOffset());
        localJTextComponent.moveCaretPosition(localElement2.getStartOffset());
      }
      localJTextComponent.copy();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hs
 * JD-Core Version:    0.6.0
 */