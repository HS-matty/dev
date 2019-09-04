package com.zend.ide.n;

import com.zend.ide.util.cl;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

class yb extends AbstractAction
{
  protected String a;
  protected String b;
  final cg c;

  public yb(cg paramcg, String paramString1, String paramString2, String paramString3)
  {
    super(paramString1);
    this.a = paramString2;
    this.b = paramString3;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = this.c.b().e();
    if ((localJTextComponent != null) && (localJTextComponent.isEditable()))
    {
      int i = localJTextComponent.getSelectionStart();
      int j = localJTextComponent.getSelectionEnd();
      boolean bool = ((Boolean)b.a("editing.htmlTagUppercase").c()).booleanValue();
      Document localDocument = localJTextComponent.getDocument();
      try
      {
        if (bool)
        {
          this.a = this.a.toUpperCase();
          this.b = this.b.toUpperCase();
        }
        if (i == j)
        {
          int k = localJTextComponent.getCaretPosition();
          localDocument.insertString(k, this.b, null);
          localDocument.insertString(k, this.a, null);
          localJTextComponent.setCaretPosition(k + this.a.length());
        }
        else
        {
          localDocument.insertString(i, this.a, null);
          localDocument.insertString(j + this.a.length(), this.b, null);
          localJTextComponent.select(i + this.a.length(), j + this.a.length());
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
 * Qualified Name:     com.zend.ide.n.yb
 * JD-Core Version:    0.6.0
 */