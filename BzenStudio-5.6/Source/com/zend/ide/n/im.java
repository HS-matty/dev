package com.zend.ide.n;

import com.zend.ide.util.cl;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

class im extends AbstractAction
{
  final cg a;

  public im(cg paramcg)
  {
    super("insertNbspTag");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = this.a.b().e();
    if ((localJTextComponent != null) && (localJTextComponent.isEditable()))
    {
      int i = localJTextComponent.getSelectionStart();
      int j = localJTextComponent.getSelectionEnd();
      String str = "&nbsp;";
      Document localDocument = localJTextComponent.getDocument();
      try
      {
        if (i == j)
        {
          int k = localJTextComponent.getCaretPosition();
          localDocument.insertString(k, str, null);
          localJTextComponent.setCaretPosition(k + 6);
        }
        else
        {
          localDocument.remove(i, j - i);
          localDocument.insertString(i, str, null);
          localJTextComponent.setCaretPosition(i + 6);
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
 * Qualified Name:     com.zend.ide.n.im
 * JD-Core Version:    0.6.0
 */