package com.zend.ide.n;

import com.zend.ide.n.td.bc;
import com.zend.ide.n.td.gb;
import com.zend.ide.n.td.hb;
import com.zend.ide.n.td.jb;
import java.awt.event.ActionEvent;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

class ib extends TextAction
{
  private boolean a;
  private boolean b;

  public ib(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramString);
    this.a = paramBoolean1;
    this.b = paramBoolean2;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = getTextComponent(paramActionEvent);
    if (localJTextComponent == null)
      return;
    try
    {
      int i = localJTextComponent.getCaretPosition();
      char c;
      for (int j = i; j > 0; j--)
      {
        c = localJTextComponent.getText(j - 1, 1).charAt(0);
        if ((c != '_') && (!Character.isLetterOrDigit(c)))
          break;
      }
      while (j > 0)
      {
        c = localJTextComponent.getText(j - 1, 1).charAt(0);
        if (!Character.isSpaceChar(c))
          break;
        j--;
      }
      if ((j == i) && (j != 0))
        j--;
      if (bc.b())
      {
        hb localhb = (hb)localJTextComponent;
        gb localgb = localhb.a().c(j);
        if ((localgb != null) && (localgb.c()) && (localgb.e() >= j))
          j = localgb.d();
      }
      if (this.b)
        localJTextComponent.getDocument().remove(j, i - j);
      if (this.a)
        localJTextComponent.moveCaretPosition(j);
      else
        localJTextComponent.setCaretPosition(j);
    }
    catch (BadLocationException localBadLocationException)
    {
      UIManager.getLookAndFeel().provideErrorFeedback(localJTextComponent);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ib
 * JD-Core Version:    0.6.0
 */