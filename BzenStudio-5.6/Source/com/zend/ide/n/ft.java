package com.zend.ide.n;

import com.zend.ide.util.cl;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;

class ft extends AbstractAction
{
  final cg a;

  public ft(cg paramcg)
  {
    super("insertBreakTag");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = this.a.b().e();
    if ((localJTextComponent != null) && (localJTextComponent.isEditable()))
    {
      Boolean localBoolean = (Boolean)b.a("completion.xhtmlTagStyle").c();
      String str = localBoolean.booleanValue() ? "<br />" : "<br>";
      boolean bool = ((Boolean)b.a("editing.htmlTagUppercase").c()).booleanValue();
      Document localDocument = localJTextComponent.getDocument();
      Element localElement1 = localDocument.getDefaultRootElement();
      int i = localJTextComponent.getCaretPosition();
      int j = localJTextComponent.getSelectionStart();
      int k = localJTextComponent.getSelectionEnd();
      try
      {
        if (bool)
          str = str.toUpperCase();
        if (j == k)
        {
          localDocument.insertString(i, str, null);
          localJTextComponent.replaceSelection("\n");
        }
        else
        {
          int m = localElement1.getElementIndex(j);
          int n = localElement1.getElementIndex(k);
          int i1 = n - m;
          if (i1 == 0)
          {
            localJTextComponent.replaceSelection("");
            i = localJTextComponent.getCaretPosition();
            localDocument.insertString(i, str + "\n", null);
          }
          else
          {
            for (int i3 = 0; i3 <= i1; i3++)
            {
              Element localElement2 = localElement1.getElement(m + i3);
              int i2 = localElement2.getEndOffset() - 1;
              localDocument.insertString(i2, str, null);
            }
          }
        }
        localJTextComponent.repaint();
        localJTextComponent.grabFocus();
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ft
 * JD-Core Version:    0.6.0
 */