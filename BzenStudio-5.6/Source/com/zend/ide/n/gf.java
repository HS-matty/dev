package com.zend.ide.n;

import com.zend.ide.util.cl;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;

public class gf extends AbstractAction
{
  final ci a;

  public gf(ci paramci)
  {
    super("eraseLine");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = this.a.b().e();
    if (localJTextComponent != null)
    {
      Document localDocument = localJTextComponent.getDocument();
      int i = localJTextComponent.getCaretPosition();
      int j = localDocument.getDefaultRootElement().getElementIndex(i);
      int k = localDocument.getDefaultRootElement().getElementCount() - 1;
      Element localElement = localDocument.getDefaultRootElement().getElement(j);
      int m = localElement.getStartOffset();
      int n = localElement.getEndOffset();
      if (j == k)
      {
        m--;
        localJTextComponent.select(m, n);
        localJTextComponent.replaceSelection(null);
      }
      else
      {
        try
        {
          localDocument.remove(m, n - m);
        }
        catch (BadLocationException localBadLocationException)
        {
          localJTextComponent.getToolkit().beep();
          cl.a(localBadLocationException);
        }
      }
      i = localJTextComponent.getCaretPosition();
      j = localDocument.getDefaultRootElement().getElementIndex(i);
      localJTextComponent.setCaretPosition(localDocument.getDefaultRootElement().getElement(j).getStartOffset());
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gf
 * JD-Core Version:    0.6.0
 */