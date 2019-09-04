package com.zend.ide.n;

import com.zend.ide.util.cl;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;

public class ge extends AbstractAction
{
  final ci a;

  public ge(ci paramci)
  {
    super("duplicateSelection");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = this.a.b().e();
    if ((localJTextComponent != null) && (localJTextComponent.isEditable()))
    {
      int i = localJTextComponent.getSelectionStart();
      int j = localJTextComponent.getSelectionEnd();
      int k = localJTextComponent.getCaretPosition();
      int m = k;
      Document localDocument = localJTextComponent.getDocument();
      if (localDocument.getLength() == 0)
        return;
      Element localElement1 = localDocument.getDefaultRootElement();
      int n = 0;
      try
      {
        String str;
        if (i == j)
        {
          Element localElement2 = localElement1.getElement(localElement1.getElementIndex(k));
          int i1 = localElement2.getStartOffset();
          int i2 = localElement2.getEndOffset();
          str = localDocument.getText(i1, i2 - i1);
          m = i1;
        }
        else
        {
          n = 1;
          str = localDocument.getText(i, j - i);
        }
        if (str != null)
        {
          localDocument.insertString(m, str, null);
          if (n != 0)
            localJTextComponent.setSelectionStart(j);
        }
      }
      catch (BadLocationException localBadLocationException)
      {
        cl.a(localBadLocationException);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ge
 * JD-Core Version:    0.6.0
 */