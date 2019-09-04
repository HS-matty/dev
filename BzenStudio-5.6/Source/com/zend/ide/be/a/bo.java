package com.zend.ide.be.a;

import com.zend.ide.bc.a;
import com.zend.ide.be.i;
import com.zend.ide.be.l;
import com.zend.ide.be.m;
import com.zend.ide.util.cl;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.event.MouseInputListener;

public class bo extends bl
  implements l
{
  private static final Dimension h = new Dimension();
  private JToolBar i;
  private ButtonGroup j;
  private JLabel k;
  private String m = null;
  private Component o = null;
  private Vector n = new Vector(3);
  private HashMap l = new HashMap(5);
  private HashMap p = new HashMap(5);
  private CardLayout q = new CardLayout();
  private JPanel r = new JPanel(this.q);

  public bo(String paramString1, Icon paramIcon, boolean paramBoolean, i parami, String paramString2)
  {
    super(paramString1, paramIcon, paramString2, paramBoolean, parami);
    b(true);
    this.i = new JToolBar();
    this.i.setFloatable(false);
    this.i.setRollover(true);
    this.i.setLayout(new s());
    this.j = new ButtonGroup();
    this.e.add(this.i, "Center");
    add(this.r, "Center");
    this.k = new JLabel();
    a(paramIcon);
    c(paramString1);
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
      this.e.add(this.k, "West");
    else
      this.e.remove(this.k);
  }

  public void c(String paramString)
  {
    this.k.setText(paramString);
  }

  public void a(Icon paramIcon)
  {
    this.k.setIcon(paramIcon);
  }

  public void a(String paramString1, Icon paramIcon, Component paramComponent, String paramString2, String paramString3)
  {
    JToggleButton localJToggleButton = new JToggleButton();
    localJToggleButton.setFocusable(false);
    localJToggleButton.setName(paramString1);
    localJToggleButton.setHorizontalAlignment(2);
    this.p.remove(paramString1);
    this.l.put(paramString1, paramComponent);
    bc localbc = new bc(this, paramComponent, paramString1);
    localbc.putValue("Name", paramString1);
    if ((paramString2 == null) || (paramString2.equals("")))
      paramString2 = paramString1;
    if ((paramString3 != null) && (!paramString3.equals("")))
      a.a(localJToggleButton, paramString3);
    else
      a.a(localJToggleButton, "DEFAULT");
    localbc.putValue("ShortDescription", paramString2);
    localbc.putValue("SmallIcon", paramIcon);
    localJToggleButton.setAction(localbc);
    this.j.add(localJToggleButton);
    this.i.add(localJToggleButton);
    this.i.invalidate();
    this.r.add(paramComponent, paramString1);
    if (this.j.getButtonCount() == 1)
      localJToggleButton.doClick();
  }

  public void a(String paramString, Component paramComponent)
  {
    this.p.remove(paramString);
    this.l.put(paramString, paramComponent);
    JToggleButton localJToggleButton = (JToggleButton)d(paramString);
    bc localbc = (bc)localJToggleButton.getAction();
    localbc.a(paramComponent);
    if (localJToggleButton.isSelected())
      localJToggleButton.doClick();
    b().invalidate();
  }

  public void e(String paramString)
  {
    a(paramString, -1);
  }

  public void a(String paramString, int paramInt)
  {
    AbstractButton localAbstractButton1 = d(paramString);
    if (localAbstractButton1 != null)
    {
      this.p.remove(paramString);
      this.l.remove(paramString);
      localAbstractButton1.setAction(null);
      int i1 = this.i.getComponentIndex(localAbstractButton1);
      this.i.remove(localAbstractButton1);
      this.j.remove(localAbstractButton1);
      this.i.invalidate();
      i1 = paramInt != -1 ? paramInt : Math.min(i1, this.i.getComponentCount() - 1);
      AbstractButton localAbstractButton2 = (AbstractButton)this.i.getComponent(i1);
      localAbstractButton2.doClick();
    }
  }

  public void b(String paramString)
  {
    AbstractButton localAbstractButton = d(paramString);
    if ((localAbstractButton != null) && (!localAbstractButton.isSelected()))
      localAbstractButton.doClick();
  }

  public void a(Component paramComponent)
  {
    AbstractButton localAbstractButton = b(paramComponent);
    if ((localAbstractButton != null) && (!localAbstractButton.isSelected()))
      localAbstractButton.doClick();
  }

  public Component g()
  {
    return this.o;
  }

  private AbstractButton d(String paramString)
  {
    Component[] arrayOfComponent = this.i.getComponents();
    for (int i1 = 0; i1 < arrayOfComponent.length; i1++)
    {
      AbstractButton localAbstractButton = (AbstractButton)arrayOfComponent[i1];
      String str = (String)localAbstractButton.getAction().getValue("Name");
      if (str.equals(paramString))
        return localAbstractButton;
    }
    return null;
  }

  private AbstractButton b(Component paramComponent)
  {
    Component[] arrayOfComponent = this.i.getComponents();
    for (int i1 = 0; i1 < arrayOfComponent.length; i1++)
    {
      AbstractButton localAbstractButton = (AbstractButton)arrayOfComponent[i1];
      bc localbc = (bc)localAbstractButton.getAction();
      if (bc.a(localbc) == paramComponent)
        return localAbstractButton;
    }
    return null;
  }

  public void a(m paramm)
  {
    if (!this.n.contains(paramm))
      this.n.add(paramm);
  }

  public void a(String paramString1, String paramString2, JComponent paramJComponent)
  {
    JToolBar localJToolBar;
    if (this.p.containsKey(paramString1))
    {
      localJToolBar = (JToolBar)this.p.get(paramString1);
    }
    else
    {
      localJToolBar = new JToolBar();
      localJToolBar.setFloatable(false);
      localJToolBar.setBorder(BorderFactory.createCompoundBorder(UIManager.getBorder("MenuBar.border"), BorderFactory.createEmptyBorder(0, 5, 0, 0)));
      localJToolBar.setRollover(true);
      localJToolBar.setLayout(new FlowLayout(0, 1, 1));
      JPanel localJPanel = new JPanel(new BorderLayout());
      Component localComponent = (Component)this.l.remove(paramString1);
      localJPanel.add(localComponent);
      localJPanel.add(localJToolBar, "North");
      this.r.add(localJPanel, paramString1);
      this.r.validate();
      a(paramString1, localJPanel);
      localComponent.setVisible(true);
      this.p.put(paramString1, localJToolBar);
    }
    localJToolBar.add(paramJComponent);
    paramJComponent.setFocusable(false);
    paramJComponent.putClientProperty("componentKey", paramString2);
  }

  public Component a(String paramString1, String paramString2)
  {
    if (this.p.containsKey(paramString1))
    {
      JToolBar localJToolBar = (JToolBar)this.p.get(paramString1);
      Component[] arrayOfComponent = localJToolBar.getComponents();
      for (int i1 = 0; i1 < arrayOfComponent.length; i1++)
      {
        String str = (String)((JComponent)arrayOfComponent[i1]).getClientProperty("componentKey");
        if ((str != null) && (str.equals(paramString2)))
          return arrayOfComponent[i1];
      }
    }
    return null;
  }

  protected void d(String paramString)
  {
    int i1 = this.n.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      m localm = (m)this.n.get(i2);
      try
      {
        localm.a(paramString);
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  public void a(MouseInputListener paramMouseInputListener)
  {
    super.a(paramMouseInputListener);
    this.i.addMouseListener(paramMouseInputListener);
    this.i.addMouseMotionListener(paramMouseInputListener);
  }

  public void b(MouseInputListener paramMouseInputListener)
  {
    super.b(paramMouseInputListener);
    this.i.removeMouseListener(paramMouseInputListener);
    this.i.removeMouseMotionListener(paramMouseInputListener);
  }

  static JPanel a(bo parambo)
  {
    return parambo.r;
  }

  static CardLayout b(bo parambo)
  {
    return parambo.q;
  }

  static Component a(bo parambo, Component paramComponent)
  {
    return parambo.o = paramComponent;
  }

  static Dimension a()
  {
    return h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bo
 * JD-Core Version:    0.6.0
 */