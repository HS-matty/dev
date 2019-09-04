package com.zend.ide.n;

import com.zend.ide.util.cl;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JLayeredPane;
import javax.swing.KeyStroke;
import javax.swing.RootPaneContainer;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.Segment;

class ij extends gx
{
  final dr d;

  private ij(dr paramdr)
  {
    setEditable(false);
    setRequestFocusEnabled(false);
    KeyStroke localKeyStroke = KeyStroke.getKeyStroke(27, 0);
    getActionMap().put("HideListAction", new id(paramdr, null));
    getInputMap(2).put(localKeyStroke, "HideListAction");
    Font localFont = (Font)b.a("editing.font").c();
    setFont(localFont);
  }

  protected void processMouseMotionEvent(MouseEvent paramMouseEvent)
  {
  }

  private void a()
  {
    int i = dr.l(this.d);
    JTextComponent localJTextComponent = dr.m(this.d);
    RootPaneContainer localRootPaneContainer1 = (RootPaneContainer)localJTextComponent.getTopLevelAncestor();
    RootPaneContainer localRootPaneContainer2 = (RootPaneContainer)getTopLevelAncestor();
    if ((localRootPaneContainer1 != localRootPaneContainer2) && (localRootPaneContainer1 != null))
      localRootPaneContainer1.getLayeredPane().add(this, new Integer(3));
    try
    {
      Document localDocument = localJTextComponent.getDocument();
      int j = localDocument.getDefaultRootElement().getElementIndex(i);
      Object localObject = dr.b(localDocument, j);
      String str = ((String)localObject).trim();
      int k;
      if (str.equals("{"))
      {
        while (true)
        {
          j--;
          if (j < 0)
            return;
          localObject = dr.b(localDocument, j).trim();
          if (((String)localObject).length() > 0)
            break;
        }
        i -= ((String)localObject).length();
        localObject = (String)localObject + " {";
        k = ((String)localObject).length() - 1;
      }
      else
      {
        k = i - localDocument.getDefaultRootElement().getElement(j).getStartOffset();
        for (int m = 0; (m < ((String)localObject).length()) && (Character.isWhitespace(((String)localObject).charAt(m))); m++)
          k--;
        localObject = str;
      }
      setText((String)localObject);
      ((cw)getDocument().getDefaultRootElement().getElement(0)).a(((ho)localDocument).b(i));
      a(localJTextComponent, j);
      getHighlighter().addHighlight(k, k + 1, dr.f(this.d));
      setVisible(true);
    }
    catch (Throwable localThrowable)
    {
      cl.a(localThrowable);
    }
  }

  private void a(JTextComponent paramJTextComponent, int paramInt)
    throws BadLocationException
  {
    if (getSize().width == 0)
      setSize(new Dimension(getPreferredSize().width, getPreferredSize().height + 3));
    setSize(getPreferredSize());
    Element localElement = paramJTextComponent.getDocument().getDefaultRootElement().getElement(paramInt);
    Segment localSegment = new Segment();
    paramJTextComponent.getDocument().getText(localElement.getStartOffset(), localElement.getEndOffset() - localElement.getStartOffset(), localSegment);
    int i = localElement.getStartOffset();
    int k;
    for (int j = localSegment.first(); (j != 65535) && (Character.isWhitespace(j)); k = localSegment.next())
      i++;
    Rectangle localRectangle = paramJTextComponent.modelToView(i);
    Container localContainer = paramJTextComponent.getTopLevelAncestor();
    Point localPoint = SwingUtilities.convertPoint(paramJTextComponent, paramJTextComponent.getVisibleRect().getLocation(), localContainer);
    localPoint.x -= localContainer.getInsets().left - localRectangle.x;
    localPoint.y -= localContainer.getInsets().top + getPreferredSize().height;
    setLocation(localPoint);
  }

  ij(dr paramdr, dx paramdx)
  {
    this(paramdr);
  }

  static void a(ij paramij)
  {
    paramij.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ij
 * JD-Core Version:    0.6.0
 */