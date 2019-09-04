package com.zend.ide.n;

import com.zend.ide.util.bj;
import java.awt.event.ActionEvent;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

class ie extends TextAction
{
  public ie()
  {
    super("insert-tab");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = getTextComponent(paramActionEvent);
    if ((localJTextComponent == null) || (!localJTextComponent.isEditable()) || (!localJTextComponent.isEnabled()))
    {
      UIManager.getLookAndFeel().provideErrorFeedback(localJTextComponent);
      return;
    }
    if (localJTextComponent.getSelectedText() == null)
    {
      localJTextComponent.replaceSelection(b(localJTextComponent));
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
      String str = a(localJTextComponent);
      try
      {
        for (int k = i; k <= j; k++)
        {
          Element localElement2 = localElement1.getElement(k);
          int m = localElement2.getStartOffset();
          localDocument.insertString(m, str, null);
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

  static String a(JTextComponent paramJTextComponent)
  {
    if (f.b())
    {
      int i = ((gz)paramJTextComponent).getTabSize();
      StringBuffer localStringBuffer = new StringBuffer(i);
      for (int j = 0; j < i; j++)
        localStringBuffer.append(' ');
      return localStringBuffer.toString();
    }
    return "\t";
  }

  static String b(JTextComponent paramJTextComponent)
  {
    if (f.b())
    {
      Document localDocument = paramJTextComponent.getDocument();
      Element localElement1 = localDocument.getDefaultRootElement();
      int i = ((gz)paramJTextComponent).getTabSize();
      int j = paramJTextComponent.getCaretPosition();
      Element localElement2 = localElement1.getElement(localElement1.getElementIndex(j));
      int k = localElement2.getStartOffset();
      int m = j - k;
      int n = m / i * i + i - m;
      StringBuffer localStringBuffer = new StringBuffer(n);
      for (int i1 = 0; i1 < n; i1++)
        localStringBuffer.append(' ');
      return localStringBuffer.toString();
    }
    return "\t";
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ie
 * JD-Core Version:    0.6.0
 */