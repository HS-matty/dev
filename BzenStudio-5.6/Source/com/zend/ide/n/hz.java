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
import javax.swing.text.Position;
import javax.swing.text.TextAction;

class hz extends TextAction
{
  private boolean a;

  hz(String paramString, boolean paramBoolean)
  {
    super(paramString);
    this.a = paramBoolean;
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
      char c;
      for (int k = j; k < i; k++)
      {
        c = localJTextComponent.getText(k, 1).charAt(0);
        if ((c != '_') && (!Character.isLetterOrDigit(c)))
          break;
      }
      while (k < i)
      {
        c = localJTextComponent.getText(k, 1).charAt(0);
        if (!Character.isSpaceChar(c))
          break;
        k++;
      }
      if (bc.b())
      {
        hb localhb = (hb)localJTextComponent;
        gb localgb = localhb.a().c(k);
        if ((localgb != null) && (localgb.c()) && (localgb.d() <= k))
          k = localgb.e() + 1;
      }
      if ((k == j) && (k != i))
        k++;
      if (this.a)
        localJTextComponent.moveCaretPosition(k);
      else
        localJTextComponent.setCaretPosition(k);
    }
    catch (BadLocationException localBadLocationException)
    {
      UIManager.getLookAndFeel().provideErrorFeedback(localJTextComponent);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hz
 * JD-Core Version:    0.6.0
 */