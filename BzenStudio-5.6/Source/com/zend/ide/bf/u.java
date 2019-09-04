package com.zend.ide.bf;

import com.zend.ide.s.di;
import com.zend.ide.util.cl;
import com.zend.ide.util.dn;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

class u extends dn
{
  final m b;

  private u(m paramm, Action paramAction)
  {
    super(paramAction);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str1 = paramActionEvent.getActionCommand();
    int i = paramActionEvent.getModifiers();
    if ((str1 != null) && (str1.length() > 0) && ((i & 0x8) == (i & 0x2)))
    {
      int j = str1.charAt(0);
      if ((j >= 32) && (j != 127) && (j != 255))
        try
        {
          JTextComponent localJTextComponent = (JTextComponent)paramActionEvent.getSource();
          int k = localJTextComponent.getCaretPosition();
          if (m.a(this.b, k))
          {
            int m = localJTextComponent.getSelectionEnd() - localJTextComponent.getSelectionStart();
            m.a(this.b, true);
            Document localDocument = localJTextComponent.getDocument();
            int n = localDocument.getLength() - m;
            super.actionPerformed(paramActionEvent);
            int i1 = localDocument.getLength();
            k = localJTextComponent.getCaretPosition() - 1;
            String str2 = paramActionEvent.getActionCommand();
            int i2 = i1 - n;
            if (i2 > 1)
              str2 = localDocument.getText(k, i2);
            ((di)d()).a(true);
            p localp = m.a(this.b);
            this.b.a(str2, k, str2.length(), m, k - localp.b, localp);
          }
          else
          {
            m.b(this.b);
            super.actionPerformed(paramActionEvent);
          }
        }
        catch (Exception localException)
        {
          cl.a(localException);
        }
        finally
        {
          m.a(this.b, false);
          ((di)d()).a(false);
        }
    }
  }

  u(m paramm, Action paramAction, n paramn)
  {
    this(paramm, paramAction);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.u
 * JD-Core Version:    0.6.0
 */