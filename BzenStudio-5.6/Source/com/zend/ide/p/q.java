package com.zend.ide.p;

import java.awt.Component;
import java.awt.Rectangle;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class q extends bj
  implements ListCellRenderer, Serializable
{
  protected static Border a;

  public q()
  {
    if (a == null)
      a = new EmptyBorder(1, 1, 1, 1);
    setOpaque(true);
    setBorder(a);
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    setComponentOrientation(paramJList.getComponentOrientation());
    if (paramBoolean1)
    {
      setBackground(paramJList.getSelectionBackground());
      setForeground(paramJList.getSelectionForeground());
    }
    else
    {
      setBackground(paramJList.getBackground());
      setForeground(paramJList.getForeground());
    }
    if ((paramObject instanceof Icon))
    {
      setIcon((Icon)paramObject);
      setText("");
    }
    else
    {
      setIcon(null);
      setText(paramObject == null ? "" : paramObject.toString());
    }
    setEnabled(paramJList.isEnabled());
    setFont(paramJList.getFont());
    setBorder(paramBoolean2 ? UIManager.getBorder("List.focusCellHighlightBorder") : a);
    return this;
  }

  public void validate()
  {
  }

  public void revalidate()
  {
  }

  public void repaint(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void repaint(Rectangle paramRectangle)
  {
  }

  protected void firePropertyChange(String paramString, Object paramObject1, Object paramObject2)
  {
    if (paramString == "text")
      super.firePropertyChange(paramString, paramObject1, paramObject2);
  }

  public void firePropertyChange(String paramString, byte paramByte1, byte paramByte2)
  {
  }

  public void firePropertyChange(String paramString, char paramChar1, char paramChar2)
  {
  }

  public void firePropertyChange(String paramString, short paramShort1, short paramShort2)
  {
  }

  public void firePropertyChange(String paramString, int paramInt1, int paramInt2)
  {
  }

  public void firePropertyChange(String paramString, long paramLong1, long paramLong2)
  {
  }

  public void firePropertyChange(String paramString, float paramFloat1, float paramFloat2)
  {
  }

  public void firePropertyChange(String paramString, double paramDouble1, double paramDouble2)
  {
  }

  public void firePropertyChange(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.q
 * JD-Core Version:    0.6.0
 */