package com.zend.ide.n;

import com.zend.ide.f.bm;
import java.awt.event.ActionEvent;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.Segment;
import javax.swing.text.TextAction;

class hv extends TextAction
{
  public hv()
  {
    super("functionHelp");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = getTextComponent(paramActionEvent);
    if (localJTextComponent != null)
    {
      String str = a(localJTextComponent);
      bm.a(localJTextComponent, str);
    }
  }

  private String a(JTextComponent paramJTextComponent)
  {
    String str = paramJTextComponent.getSelectedText();
    if (str != null)
    {
      str = str.toLowerCase().trim();
    }
    else
    {
      int i = paramJTextComponent.getCaretPosition();
      Document localDocument = paramJTextComponent.getDocument();
      Segment localSegment = new Segment();
      try
      {
        localDocument.getText(0, localDocument.getLength(), localSegment);
        localSegment.setIndex(i);
        char c = localSegment.current();
        if ((!Character.isLetterOrDigit(c)) && (c != '_'))
        {
          c = localSegment.previous();
          if ((Character.isLetterOrDigit(c)) || (c == '_'));
        }
        for (c = localSegment.next(); (Character.isLetterOrDigit(c)) || (c == '_'); c = localSegment.previous());
        int j = localSegment.getIndex();
        if (j > 0)
          j++;
        localSegment.setIndex(i);
        for (c = localSegment.current(); (Character.isLetterOrDigit(c)) || (c == '_'); c = localSegment.next());
        int k = localSegment.getIndex();
        if (k - j > 0)
          str = localDocument.getText(j, k - j).trim();
      }
      catch (Exception localException)
      {
      }
    }
    return str;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hv
 * JD-Core Version:    0.6.0
 */