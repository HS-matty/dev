package com.zend.ide.bf;

import com.zend.ide.util.cl;
import com.zend.ide.util.dn;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.Action;
import javax.swing.text.JTextComponent;

class x extends dn
{
  final m b;

  private x(m paramm, Action paramAction)
  {
    super(paramAction);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    int i = ((JTextComponent)paramActionEvent.getSource()).getCaretPosition() - 1;
    if (m.a(this.b, i))
    {
      Transferable localTransferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(m.c(this.b));
      String str = "";
      try
      {
        str = (String)localTransferable.getTransferData(DataFlavor.stringFlavor);
      }
      catch (UnsupportedFlavorException localUnsupportedFlavorException)
      {
        cl.a(localUnsupportedFlavorException);
      }
      catch (IOException localIOException)
      {
        cl.a(localIOException);
      }
      int j = ((JTextComponent)paramActionEvent.getSource()).getSelectionEnd() - ((JTextComponent)paramActionEvent.getSource()).getSelectionStart();
      m.a(this.b, true);
      ((JTextComponent)paramActionEvent.getSource()).replaceSelection(str);
      i = ((JTextComponent)paramActionEvent.getSource()).getCaretPosition();
      p localp = m.a(this.b);
      this.b.a(str, i, str.length(), j, localp.d - j, localp);
    }
    else
    {
      m.b(this.b);
      super.actionPerformed(paramActionEvent);
    }
    m.a(this.b, false);
  }

  x(m paramm, Action paramAction, n paramn)
  {
    this(paramm, paramAction);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.x
 * JD-Core Version:    0.6.0
 */