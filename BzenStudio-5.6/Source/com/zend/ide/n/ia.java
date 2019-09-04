package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.Position;
import javax.swing.text.TextAction;

class ia extends TextAction
{
  ia()
  {
    super("select-word");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = getTextComponent(paramActionEvent);
    if (localJTextComponent == null)
      return;
    try
    {
      int i = localJTextComponent.getDocument().getEndPosition().getOffset() - 1;
      int j = localJTextComponent.getCaretPosition();
      for (int k = j; k < i; k++)
      {
        c1 = localJTextComponent.getText(k, 1).charAt(0);
        if ((c1 != '_') && (!Character.isLetterOrDigit(c1)))
          break;
      }
      char c1 = j;
      while (c1 > 0)
      {
        char c2 = localJTextComponent.getText(c1 - '\001', 1).charAt(0);
        if ((c2 == '_') || (Character.isLetterOrDigit(c2)))
        {
          c1--;
        }
        else
        {
          if (c2 != '$')
            break;
          c1--;
          break;
        }
      }
      localJTextComponent.select(c1, k);
    }
    catch (BadLocationException localBadLocationException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ia
 * JD-Core Version:    0.6.0
 */