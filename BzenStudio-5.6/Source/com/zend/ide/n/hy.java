package com.zend.ide.n;

import com.zend.ide.util.cl;
import java.awt.FontMetrics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.LookAndFeel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.TextUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.Position.Bias;
import javax.swing.text.TextAction;

class hy extends TextAction
  implements SwingConstants
{
  private boolean a;
  private int b;

  public hy(String paramString, boolean paramBoolean, int paramInt)
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
    try
    {
      Caret localCaret = localJTextComponent.getCaret();
      int i = localCaret.getDot();
      Point localPoint = localCaret.getMagicCaretPosition();
      if ((localPoint == null) && ((this.b == 1) || (this.b == 5)))
        localPoint = localJTextComponent.modelToView(i).getLocation();
      int j;
      if ((this.b == 1) || (this.b == 5))
        j = a(localJTextComponent, i, this.b, localPoint);
      else
        j = a(localJTextComponent, i, this.b);
      if (j < 0)
        j = 0;
      if (j >= localJTextComponent.getDocument().getLength())
        j = localJTextComponent.getDocument().getLength();
      if (this.a)
        localCaret.moveDot(j);
      else
        localCaret.setDot(j);
      if ((localPoint != null) && ((this.b == 1) || (this.b == 5)))
        localCaret.setMagicCaretPosition(localPoint);
    }
    catch (BadLocationException localBadLocationException)
    {
      UIManager.getLookAndFeel().provideErrorFeedback(localJTextComponent);
    }
    catch (Exception localException)
    {
    }
  }

  private static int a(JTextComponent paramJTextComponent, int paramInt1, int paramInt2)
  {
    Position.Bias localBias = paramInt2 == 7 ? Position.Bias.Backward : Position.Bias.Forward;
    int i = paramInt1;
    try
    {
      i = paramJTextComponent.getUI().getNextVisualPositionFrom(paramJTextComponent, paramInt1, localBias, paramInt2, hg.a());
      return i;
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
      if (paramInt2 == 7)
        tmpTernaryOp = -1;
    }
    return i + 1;
  }

  private static int a(JTextComponent paramJTextComponent, int paramInt1, int paramInt2, Point paramPoint)
    throws BadLocationException
  {
    if ((paramInt2 == 1) && (a(paramJTextComponent, paramInt1)))
      return paramInt1;
    Point localPoint = paramJTextComponent.modelToView(paramInt1).getLocation();
    Element localElement1;
    int j;
    Element localElement2;
    if ((paramInt2 == 5) && (b(paramJTextComponent, paramInt1)))
    {
      localElement1 = a(paramJTextComponent);
      j = localElement1.getElementIndex(paramInt1);
      localElement2 = localElement1.getElement(j);
      localPoint.x = paramJTextComponent.modelToView(localElement2.getEndOffset() - 1).getLocation().x;
      if (paramPoint != null)
      {
        paramPoint.x = 2147483647;
        paramJTextComponent.getCaret().setMagicCaretPosition(paramPoint);
      }
    }
    else if (paramPoint != null)
    {
      if (paramPoint.x == 2147483647)
      {
        localElement1 = a(paramJTextComponent);
        j = localElement1.getElementIndex(paramInt1);
        localElement2 = localElement1.getElement(j + (paramInt2 == 1 ? -1 : 1));
        localPoint.x = paramJTextComponent.modelToView(localElement2.getEndOffset() - 1).getLocation().x;
      }
      else
      {
        localPoint.x = paramPoint.x;
      }
    }
    int i = paramJTextComponent.getFontMetrics(paramJTextComponent.getFont()).getHeight();
    localPoint.y += (paramInt2 == 1 ? -i : i);
    return paramJTextComponent.viewToModel(localPoint);
  }

  private static Element a(JTextComponent paramJTextComponent)
  {
    return paramJTextComponent.getDocument().getDefaultRootElement();
  }

  private static boolean a(JTextComponent paramJTextComponent, int paramInt)
  {
    return a(paramJTextComponent).getElementIndex(paramInt) == 0;
  }

  private static boolean b(JTextComponent paramJTextComponent, int paramInt)
  {
    Element localElement = a(paramJTextComponent);
    return localElement.getElementIndex(paramInt) == localElement.getElementCount() - 1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hy
 * JD-Core Version:    0.6.0
 */