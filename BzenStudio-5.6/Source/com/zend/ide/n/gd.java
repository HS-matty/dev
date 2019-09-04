package com.zend.ide.n;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.text.JTextComponent;

public class gd extends AbstractAction
{
  boolean a;
  final ci b;

  public gd(ci paramci, String paramString, boolean paramBoolean)
  {
    super(paramString);
    this.a = paramBoolean;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = this.b.b().e();
    if ((localJTextComponent != null) && (localJTextComponent.isEditable()))
    {
      int i = localJTextComponent.getSelectionStart();
      int j = localJTextComponent.getSelectionEnd();
      if (i == j)
        return;
      String str = localJTextComponent.getSelectedText();
      if (this.a)
        str = str.toUpperCase();
      else
        str = str.toLowerCase();
      localJTextComponent.replaceSelection(str);
      localJTextComponent.select(i, j);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gd
 * JD-Core Version:    0.6.0
 */