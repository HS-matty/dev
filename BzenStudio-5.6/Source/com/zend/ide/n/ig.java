package com.zend.ide.n;

import java.awt.FontMetrics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.TextAction;

class ig extends TextAction
{
  private boolean a;
  private int b;

  public ig(String paramString, int paramInt, boolean paramBoolean)
  {
    super(paramString);
    this.a = paramBoolean;
    this.b = paramInt;
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    JTextComponent localJTextComponent = getTextComponent(paramActionEvent);
    if (localJTextComponent == null)
      return;
    Rectangle localRectangle1 = localJTextComponent.getVisibleRect();
    Rectangle localRectangle2 = new Rectangle(localRectangle1);
    int i = localJTextComponent.getCaretPosition();
    int j = localJTextComponent.getFontMetrics(localJTextComponent.getFont()).getHeight();
    int k = this.b * (int)Math.ceil(localRectangle1.height / j) * j;
    int m = localRectangle1.y;
    Caret localCaret = localJTextComponent.getCaret();
    Point localPoint = localCaret.getMagicCaretPosition();
    localRectangle2.y = a(localJTextComponent, localRectangle1.y + k, k);
    if (i != -1)
      try
      {
        Rectangle localRectangle3 = localJTextComponent.modelToView(i);
        int n = localPoint != null ? localPoint.x : localRectangle3.x;
        if (localRectangle1.contains(localRectangle3.x, localRectangle3.y))
          i1 = localJTextComponent.viewToModel(new Point(n, a(localJTextComponent, localRectangle3.y + k, 0)));
        else if (this.b == -1)
          i1 = localJTextComponent.viewToModel(new Point(n, localRectangle2.y));
        else
          i1 = localJTextComponent.viewToModel(new Point(n, localRectangle2.y + localRectangle1.height));
        int i1 = a(localJTextComponent, i1);
        if (i1 != i)
        {
          a(localJTextComponent, localRectangle2, m, i1);
          if (this.a)
            localJTextComponent.moveCaretPosition(i1);
          else
            localJTextComponent.setCaretPosition(i1);
        }
      }
      catch (BadLocationException localBadLocationException)
      {
      }
    if (localPoint != null)
      localCaret.setMagicCaretPosition(localPoint);
    localJTextComponent.scrollRectToVisible(localRectangle2);
  }

  private int a(JTextComponent paramJTextComponent, int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
      paramInt1 = 0;
    else if (paramInt1 + paramInt2 > paramJTextComponent.getHeight())
      paramInt1 = Math.max(0, paramJTextComponent.getHeight() - paramInt2);
    return paramInt1;
  }

  private int a(JTextComponent paramJTextComponent, int paramInt)
  {
    Document localDocument = paramJTextComponent.getDocument();
    if ((paramInt != 0) && (paramInt > localDocument.getLength()))
      paramInt = localDocument.getLength();
    if (paramInt < 0)
      paramInt = 0;
    return paramInt;
  }

  private void a(JTextComponent paramJTextComponent, Rectangle paramRectangle, int paramInt1, int paramInt2)
  {
    try
    {
      Rectangle localRectangle = paramJTextComponent.modelToView(paramInt2);
      if ((localRectangle.y < paramRectangle.y) || (localRectangle.y > paramRectangle.y + paramRectangle.height) || (localRectangle.y + localRectangle.height > paramRectangle.y + paramRectangle.height))
      {
        int i;
        if (localRectangle.y < paramRectangle.y)
          i = localRectangle.y;
        else
          i = localRectangle.y + localRectangle.height - paramRectangle.height;
        if (((this.b == -1) && (i < paramInt1)) || ((this.b == 1) && (i > paramInt1)))
          paramRectangle.y = i;
      }
    }
    catch (BadLocationException localBadLocationException)
    {
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ig
 * JD-Core Version:    0.6.0
 */