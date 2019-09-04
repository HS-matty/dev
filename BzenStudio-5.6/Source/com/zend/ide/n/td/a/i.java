package com.zend.ide.n.td.a;

import com.sun.java.swing.SwingUtilities2;
import java.awt.Container;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.text.BreakIterator;
import javax.swing.JComponent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.Segment;
import javax.swing.text.TabExpander;
import javax.swing.text.View;

public class i
{
  static JComponent a(View paramView)
  {
    if (paramView != null)
    {
      Container localContainer = paramView.getContainer();
      if ((localContainer instanceof JComponent))
        return (JComponent)localContainer;
    }
    return null;
  }

  static final int a(View paramView, Segment paramSegment, int paramInt1, int paramInt2, Graphics paramGraphics, TabExpander paramTabExpander, int paramInt3)
  {
    JComponent localJComponent = a(paramView);
    FontMetrics localFontMetrics = SwingUtilities2.getFontMetrics(localJComponent, paramGraphics);
    int i = paramInt1;
    char[] arrayOfChar = paramSegment.array;
    int k = paramSegment.offset;
    int m = 0;
    int n = paramSegment.offset;
    int i1 = paramSegment.offset + paramSegment.count;
    int j;
    for (int i2 = k; i2 < i1; i2++)
      if (arrayOfChar[i2] == '\t')
      {
        if (m > 0)
        {
          i = SwingUtilities2.drawChars(localJComponent, paramGraphics, arrayOfChar, n, m, paramInt1, paramInt2);
          m = 0;
        }
        n = i2 + 1;
        if (paramTabExpander != null)
          j = (int)paramTabExpander.nextTabStop(i, paramInt3 + i2 - k);
        else
          j += localFontMetrics.charWidth(' ');
        paramInt1 = j;
      }
      else if ((arrayOfChar[i2] == '\n') || (arrayOfChar[i2] == '\r'))
      {
        if (m > 0)
        {
          j = SwingUtilities2.drawChars(localJComponent, paramGraphics, arrayOfChar, n, m, paramInt1, paramInt2);
          m = 0;
        }
        n = i2 + 1;
        paramInt1 = j;
      }
      else
      {
        m++;
      }
    if (m > 0)
      j = SwingUtilities2.drawChars(localJComponent, paramGraphics, arrayOfChar, n, m, paramInt1, paramInt2);
    return j;
  }

  public static final int a(Segment paramSegment, FontMetrics paramFontMetrics, int paramInt1, TabExpander paramTabExpander, int paramInt2)
  {
    int i = paramInt1;
    char[] arrayOfChar = paramSegment.array;
    int k = paramSegment.offset;
    int m = paramSegment.offset + paramSegment.count;
    int n = 0;
    int j;
    for (int i1 = k; i1 < m; i1++)
      if (arrayOfChar[i1] == '\t')
      {
        i += paramFontMetrics.charsWidth(arrayOfChar, i1 - n, n);
        n = 0;
        if (paramTabExpander != null)
          j = (int)paramTabExpander.nextTabStop(i, paramInt2 + i1 - k);
        else
          j += paramFontMetrics.charWidth(' ');
      }
      else if (arrayOfChar[i1] == '\n')
      {
        j += paramFontMetrics.charsWidth(arrayOfChar, i1 - n, n);
        n = 0;
      }
      else
      {
        n++;
      }
    j += paramFontMetrics.charsWidth(arrayOfChar, m - n, n);
    return j - paramInt1;
  }

  public static final int a(Segment paramSegment, FontMetrics paramFontMetrics, int paramInt1, int paramInt2, TabExpander paramTabExpander, int paramInt3)
  {
    return a(paramSegment, paramFontMetrics, paramInt1, paramInt2, paramTabExpander, paramInt3, true);
  }

  public static final int a(Segment paramSegment, FontMetrics paramFontMetrics, int paramInt1, int paramInt2, TabExpander paramTabExpander, int paramInt3, boolean paramBoolean)
  {
    if (paramInt1 >= paramInt2)
      return 0;
    int i = paramInt1;
    int j = i;
    char[] arrayOfChar = paramSegment.array;
    int m = paramSegment.offset;
    int n = paramSegment.count;
    int i1 = paramSegment.offset + paramSegment.count;
    for (int i2 = paramSegment.offset; i2 < i1; i2++)
    {
      int k;
      if (arrayOfChar[i2] == '\t')
      {
        if (paramTabExpander != null)
          k = (int)paramTabExpander.nextTabStop(j, paramInt3 + i2 - m);
        else
          k += paramFontMetrics.charWidth(' ');
      }
      else
      {
        if (arrayOfChar[i2] == '\n')
        {
          m++;
          continue;
        }
        k += paramFontMetrics.charWidth(arrayOfChar[i2]);
      }
      if ((paramInt2 >= i) && (paramInt2 < k))
      {
        if ((!paramBoolean) || (paramInt2 - i < k - paramInt2))
          return i2 - m;
        return i2 + 1 - m;
      }
      i = k;
    }
    return n;
  }

  public static final int b(Segment paramSegment, FontMetrics paramFontMetrics, int paramInt1, int paramInt2, TabExpander paramTabExpander, int paramInt3)
  {
    char[] arrayOfChar = paramSegment.array;
    int i = paramSegment.offset;
    int j = paramSegment.count;
    int k = a(paramSegment, paramFontMetrics, paramInt1, paramInt2, paramTabExpander, paramInt3, false);
    if (k >= j - 1)
      return j;
    for (int m = i + k; m >= i; m--)
    {
      int n = arrayOfChar[m];
      if (n < 256)
      {
        if (!Character.isWhitespace(n))
          continue;
        k = m - i + 1;
        break;
      }
      BreakIterator localBreakIterator = BreakIterator.getLineInstance();
      localBreakIterator.setText(paramSegment);
      int i1 = localBreakIterator.preceding(m + 1);
      if (i1 <= i)
        break;
      k = i1 - i;
      break;
    }
    return k;
  }

  public static final int a(JTextComponent paramJTextComponent, int paramInt)
    throws BadLocationException
  {
    Rectangle localRectangle = paramJTextComponent.modelToView(paramInt);
    if (localRectangle == null)
      return -1;
    int i = paramInt;
    int j = localRectangle.y;
    while ((localRectangle != null) && (j == localRectangle.y))
    {
      paramInt = i;
      i--;
      localRectangle = i >= 0 ? paramJTextComponent.modelToView(i) : null;
    }
    return paramInt;
  }

  public static final int b(JTextComponent paramJTextComponent, int paramInt)
    throws BadLocationException
  {
    Rectangle localRectangle = paramJTextComponent.modelToView(paramInt);
    if (localRectangle == null)
      return -1;
    int i = paramJTextComponent.getDocument().getLength();
    int j = paramInt;
    int k = localRectangle.y;
    while ((localRectangle != null) && (k == localRectangle.y))
    {
      paramInt = j;
      j++;
      localRectangle = j <= i ? paramJTextComponent.modelToView(j) : null;
    }
    return paramInt;
  }

  public static final int a(JTextComponent paramJTextComponent, int paramInt1, int paramInt2)
    throws BadLocationException
  {
    int i = a(paramJTextComponent, paramInt1) - 1;
    if (i < 0)
      return -1;
    int j = 2147483647;
    int k = 0;
    Rectangle localRectangle = null;
    if (i >= 0)
    {
      localRectangle = paramJTextComponent.modelToView(i);
      k = localRectangle.y;
    }
    while ((localRectangle != null) && (k == localRectangle.y))
    {
      int m = Math.abs(localRectangle.x - paramInt2);
      if (m < j)
      {
        paramInt1 = i;
        j = m;
      }
      i--;
      localRectangle = i >= 0 ? paramJTextComponent.modelToView(i) : null;
    }
    return paramInt1;
  }

  public static final int b(JTextComponent paramJTextComponent, int paramInt1, int paramInt2)
    throws BadLocationException
  {
    int i = b(paramJTextComponent, paramInt1) + 1;
    if (i <= 0)
      return -1;
    int j = 2147483647;
    int k = paramJTextComponent.getDocument().getLength();
    int m = 0;
    Rectangle localRectangle = null;
    if (i <= k)
    {
      localRectangle = paramJTextComponent.modelToView(i);
      m = localRectangle.y;
    }
    while ((localRectangle != null) && (m == localRectangle.y))
    {
      int n = Math.abs(paramInt2 - localRectangle.x);
      if (n < j)
      {
        paramInt1 = i;
        j = n;
      }
      i++;
      localRectangle = i <= k ? paramJTextComponent.modelToView(i) : null;
    }
    return paramInt1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.a.i
 * JD-Core Version:    0.6.0
 */