package com.zend.ide.n;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.SwingUtilities;
import javax.swing.plaf.TextUI;
import javax.swing.plaf.basic.BasicTextUI.BasicCaret;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

class hb extends BasicTextUI.BasicCaret
{
  private Color a = Color.black;
  private Color b = Color.white;
  private transient boolean c;
  private boolean d = false;
  private hj e = new hj(this);

  public void paint(Graphics paramGraphics)
  {
    if (isVisible())
      try
      {
        gx localgx = (gx)getComponent();
        TextUI localTextUI = localgx.getUI();
        Rectangle localRectangle1 = localTextUI.modelToView(localgx, getDot());
        if ((this.width > 0) && (this.height > 0) && (!a(localRectangle1.x, localRectangle1.y, localRectangle1.width, localRectangle1.height)))
        {
          Rectangle localRectangle2 = paramGraphics.getClipBounds();
          if ((localRectangle2 != null) && (!localRectangle2.contains(this)))
            repaint();
          damage(localRectangle1);
        }
        paramGraphics.setColor(a(localgx));
        if (f.d())
          paramGraphics.drawLine(localRectangle1.x, localRectangle1.y, localRectangle1.x, localRectangle1.y + localRectangle1.height - 1);
        else
          paramGraphics.drawRect(localRectangle1.x, localRectangle1.y, 5, localRectangle1.height - 1);
      }
      catch (BadLocationException localBadLocationException)
      {
      }
  }

  boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.width;
    int j = this.height;
    if ((i | j | paramInt3 | paramInt4) < 0)
      return false;
    int k = this.x;
    int m = this.y;
    if ((paramInt1 < k) || (paramInt2 < m))
      return false;
    if (paramInt3 > 0)
    {
      i += k;
      paramInt3 += paramInt1;
      if (paramInt3 <= paramInt1)
      {
        if ((i >= k) || (paramInt3 > i))
          return false;
      }
      else if ((i >= k) && (paramInt3 > i))
        return false;
    }
    else if (k + i < paramInt1)
    {
      return false;
    }
    if (paramInt4 > 0)
    {
      j += m;
      paramInt4 += paramInt2;
      if (paramInt4 <= paramInt2)
      {
        if ((j >= m) || (paramInt4 > j))
          return false;
      }
      else if ((j >= m) && (paramInt4 > j))
        return false;
    }
    else if (m + j < paramInt2)
    {
      return false;
    }
    return true;
  }

  Color a(gx paramgx)
  {
    Color localColor = paramgx.getBackground();
    if (paramgx.getSelectionStart() != paramgx.getSelectionEnd())
      localColor = paramgx.getSelectionColor();
    if (this.b.equals(localColor))
      return this.a;
    this.b = localColor;
    int i = 255 - localColor.getRed();
    int j = 255 - localColor.getGreen();
    int k = 255 - localColor.getBlue();
    this.a = new Color(i, j, k);
    return this.a;
  }

  protected void adjustVisibility(Rectangle paramRectangle)
  {
    if ((this.d) && (!getComponent().hasFocus()))
    {
      this.d = false;
      return;
    }
    Rectangle localRectangle = getComponent().getVisibleRect();
    if (paramRectangle.x + paramRectangle.width >= localRectangle.x + localRectangle.width)
      paramRectangle.x = Math.min(getComponent().getBounds().width, paramRectangle.x + localRectangle.width / 5);
    if (paramRectangle.x - paramRectangle.width < localRectangle.x)
      paramRectangle.x = Math.max(0, paramRectangle.x - localRectangle.width / 5);
    if (paramRectangle.y < localRectangle.y)
      paramRectangle.y = Math.max(0, paramRectangle.y - localRectangle.height / 5);
    if (paramRectangle.y + paramRectangle.height >= localRectangle.y + localRectangle.height)
      paramRectangle.y += localRectangle.height / 5;
    super.adjustVisibility(paramRectangle);
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    if (((SwingUtilities.isRightMouseButton(paramMouseEvent)) || (paramMouseEvent.isPopupTrigger())) && (getComponent().getSelectedText() != null))
      return;
    if (paramMouseEvent.isConsumed())
    {
      this.c = true;
    }
    else
    {
      this.c = false;
      adjustCaretAndFocus(paramMouseEvent);
    }
  }

  public void mouseReleased(MouseEvent paramMouseEvent)
  {
    if (this.c)
      adjustCaretAndFocus(paramMouseEvent);
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (paramMouseEvent.isConsumed())
      return;
    if (SwingUtilities.isLeftMouseButton(paramMouseEvent))
    {
      int i = paramMouseEvent.getClickCount();
      Action localAction;
      if (i == 2)
      {
        localAction = getComponent().getActionMap().get("select-word");
        localAction.actionPerformed(new ActionEvent(getComponent(), 1001, null, paramMouseEvent.getWhen(), paramMouseEvent.getModifiers()));
      }
      else if (i == 3)
      {
        localAction = getComponent().getActionMap().get("select-line");
        localAction.actionPerformed(new ActionEvent(getComponent(), 1001, null, paramMouseEvent.getWhen(), paramMouseEvent.getModifiers()));
      }
    }
    else
    {
      super.mouseClicked(paramMouseEvent);
    }
  }

  void adjustCaretAndFocus(MouseEvent paramMouseEvent)
  {
    a(paramMouseEvent);
    a(false);
  }

  private void a(MouseEvent paramMouseEvent)
  {
    if (((paramMouseEvent.getModifiers() & 0x1) != 0) && (getDot() != -1))
      moveCaret(paramMouseEvent);
    else
      positionCaret(paramMouseEvent);
  }

  private void a(boolean paramBoolean)
  {
    JTextComponent localJTextComponent = getComponent();
    if ((localJTextComponent != null) && (localJTextComponent.isEnabled()) && (localJTextComponent.isRequestFocusEnabled()))
      if (paramBoolean)
        localJTextComponent.requestFocusInWindow();
      else
        localJTextComponent.requestFocus();
  }

  public void focusLost(FocusEvent paramFocusEvent)
  {
    setVisible(false);
  }

  public void setSelectionVisible(boolean paramBoolean)
  {
    if (paramBoolean)
      super.setSelectionVisible(paramBoolean);
  }

  public void install(JTextComponent paramJTextComponent)
  {
    super.install(paramJTextComponent);
    Document localDocument = paramJTextComponent.getDocument();
    if (localDocument != null)
      localDocument.addDocumentListener(this.e);
    paramJTextComponent.addPropertyChangeListener(this.e);
  }

  public void deinstall(JTextComponent paramJTextComponent)
  {
    super.deinstall(paramJTextComponent);
    paramJTextComponent.removePropertyChangeListener(this.e);
    Document localDocument = paramJTextComponent.getDocument();
    if (localDocument != null)
      localDocument.removeDocumentListener(this.e);
  }

  static boolean a(hb paramhb, boolean paramBoolean)
  {
    return paramhb.d = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.hb
 * JD-Core Version:    0.6.0
 */