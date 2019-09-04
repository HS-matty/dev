package com.zend.ide.n;

import com.zend.ide.util.bj;
import java.awt.event.ActionEvent;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

class hq extends TextAction
{
  public hq()
  {
    super("backspace-tab");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = getTextComponent(paramActionEvent);
    if ((localJTextComponent == null) || (!localJTextComponent.isEditable()) || (!localJTextComponent.isEnabled()))
    {
      UIManager.getLookAndFeel().provideErrorFeedback(localJTextComponent);
      return;
    }
    try
    {
      if ((localJTextComponent instanceof bj))
        ((bj)localJTextComponent).B();
      Document localDocument = localJTextComponent.getDocument();
      Element localElement1 = localDocument.getDefaultRootElement();
      int i = localElement1.getElementIndex(localJTextComponent.getSelectionStart());
      int j = localElement1.getElementIndex(localJTextComponent.getSelectionEnd() - 1);
      int k = ((gz)localJTextComponent).getTabSize();
      try
      {
        for (int m = i; m <= j; m++)
        {
          Element localElement2 = localElement1.getElement(m);
          int n = localElement2.getStartOffset();
          int i1 = 0;
          String str = localJTextComponent.getText(n, 1);
          if (str.equals("\t"))
          {
            localDocument.remove(n, 1);
          }
          else
          {
            while ((i1 < k) && (str.equals(" ")))
            {
              i1++;
              str = localJTextComponent.getText(n + i1, 1);
            }
            localDocument.remove(n, i1);
          }
        }
      }
      catch (Exception localException)
      {
      }
    }
    finally
    {
      if ((localJTextComponent instanceof bj))
        ((bj)localJTextComponent).D();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hq
 * JD-Core Version:    0.6.0
 */