package com.zend.ide.p;

import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.s;
import com.zend.ide.y.i;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.ActionMap;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.text.Position.Bias;

public class bw extends JList
  implements bn
{
  private String a;
  private bt b;
  private bb c;
  private i d;

  public bw(Object paramObject)
  {
    a(paramObject);
  }

  public bw()
  {
    a(null);
  }

  protected void a(Object paramObject)
  {
    setModel(b(paramObject));
    setFixedCellHeight(17);
    ListCellRenderer localListCellRenderer = g();
    if (localListCellRenderer != null)
      setCellRenderer(localListCellRenderer);
    this.c = d();
    this.b = b(this);
    mb localmb = new mb(this);
    getActionMap().put("keys.selectAll", localmb);
    this.d = new i(this);
    this.d.a("phpEditorPane.selectAll", "selectAll");
    this.d.a("phpEditorPane.selectAll", "selectAll", 0);
    this.d.a("phpEditorPane.selectAll", "selectAll", 2);
  }

  protected bb d()
  {
    return new s();
  }

  protected DefaultListModel b(Object paramObject)
  {
    return new DefaultListModel();
  }

  protected ListCellRenderer g()
  {
    return new bv(this);
  }

  protected bt b(bn parambn)
  {
    return new bu(this, parambn);
  }

  public int locationToIndex(Point paramPoint)
  {
    int i = paramPoint.y;
    int j = getModel().getSize();
    if (j <= 0)
      return -1;
    int k = (i - getInsets().top) / getFixedCellHeight();
    if ((k < 0) || (k >= j))
      k = -1;
    return k;
  }

  protected String a(Object paramObject, int paramInt)
  {
    if ((paramObject instanceof String))
      return (String)paramObject;
    return paramObject.toString();
  }

  public int getNextMatch(String paramString, int paramInt, Position.Bias paramBias)
  {
    ListModel localListModel = getModel();
    int i = localListModel.getSize();
    if (paramString == null)
      throw new IllegalArgumentException();
    if ((paramInt < 0) || (paramInt >= i))
      throw new IllegalArgumentException();
    paramString = paramString.toUpperCase();
    int j = paramBias == Position.Bias.Forward ? 1 : -1;
    int k = paramInt;
    do
    {
      Object localObject = localListModel.getElementAt(k);
      if (localObject != null)
      {
        String str = a(localObject, k).toUpperCase();
        if ((str != null) && (str.startsWith(paramString)))
          return k;
      }
      k = (k + j + i) % i;
    }
    while (k != paramInt);
    return -1;
  }

  public boolean d(boolean paramBoolean)
  {
    return this.b.d(paramBoolean);
  }

  public bb q()
  {
    return this.c;
  }

  public JComponent c()
  {
    return this;
  }

  public String a(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = getSelectedValues();
    if ((arrayOfObject != null) && (arrayOfObject.length > 1))
      return "multipleSelection";
    int i = locationToIndex(new Point(paramInt1, paramInt2));
    if (i == -1)
      return r();
    return a(i);
  }

  protected String a(int paramInt)
  {
    return r();
  }

  public String r()
  {
    return this.a;
  }

  public void d(String paramString)
  {
    this.a = paramString;
  }

  public void a(bn parambn)
  {
    this.c.a(parambn.q());
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public bs t()
  {
    return this.b;
  }

  protected void processMouseEvent(MouseEvent paramMouseEvent)
  {
    super.processMouseEvent(paramMouseEvent);
    if ((paramMouseEvent.getID() == 501) || (paramMouseEvent.getID() == 502))
    {
      int i = locationToIndex(paramMouseEvent.getPoint());
      if (i == -1)
        clearSelection();
    }
  }

  protected void processMouseMotionEvent(MouseEvent paramMouseEvent)
  {
    int i = getSelectedIndex();
    super.processMouseMotionEvent(paramMouseEvent);
    if (paramMouseEvent.getID() == 506)
    {
      int j = locationToIndex(paramMouseEvent.getPoint());
      if ((i == -1) && (j == -1))
        clearSelection();
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bw
 * JD-Core Version:    0.6.0
 */