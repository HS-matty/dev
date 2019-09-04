package com.zend.ide.n;

import com.zend.ide.util.cl;
import java.awt.event.ActionEvent;
import java.util.Map;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

class iu extends TextAction
{
  final dr a;

  iu(dr paramdr)
  {
    super("findMatchingBracket");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = getTextComponent(paramActionEvent);
    if (localJTextComponent == null)
      return;
    try
    {
      int i = localJTextComponent.getCaretPosition();
      Document localDocument = localJTextComponent.getDocument();
      il localil = (il)dr.b(this.a).get(localJTextComponent);
      int j = il.e(localil);
      if (j < i)
      {
        if (!a(localJTextComponent, localDocument, i))
          b(localJTextComponent, localDocument, i);
      }
      else if (!b(localJTextComponent, localDocument, i))
        a(localJTextComponent, localDocument, i);
      il.a(localil, i);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  private boolean a(JTextComponent paramJTextComponent, Document paramDocument, int paramInt)
    throws BadLocationException
  {
    int i = fm.a(paramDocument, paramInt, false);
    if ((i != -1) && (i != -2))
    {
      if (i >= 0)
        paramJTextComponent.setCaretPosition(i);
      else
        paramJTextComponent.setCaretPosition(fm.b(i));
      return true;
    }
    return false;
  }

  private boolean b(JTextComponent paramJTextComponent, Document paramDocument, int paramInt)
    throws BadLocationException
  {
    int i = fm.a(paramDocument, paramInt, true);
    if ((i != -1) && (i != -2))
    {
      if (i >= 0)
        paramJTextComponent.setCaretPosition(i + 1);
      else
        paramJTextComponent.setCaretPosition(fm.b(i) + 1);
      return true;
    }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.iu
 * JD-Core Version:    0.6.0
 */