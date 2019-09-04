package com.zend.ide.be.a;

import com.zend.ide.be.h;
import com.zend.ide.be.i;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.event.MouseInputListener;

public class bl extends JPanel
  implements h
{
  private static final bu h = new bu();
  private String a;
  private Icon b;
  private String i;
  private boolean c;
  private i d;
  private JPanel f;
  JMenuBar e;
  private JToolBar g;
  private JToolBar j;

  public bl(String paramString1, Icon paramIcon, String paramString2, boolean paramBoolean, i parami)
  {
    this.a = paramString1;
    this.b = paramIcon;
    this.i = paramString2;
    this.c = paramBoolean;
    this.d = parami;
    setLayout(new BorderLayout(5, 0));
    setBorder(BorderFactory.createEtchedBorder());
    g();
  }

  public String c()
  {
    return this.a;
  }

  public void f(String paramString)
  {
    this.a = paramString;
  }

  public Icon d()
  {
    return this.b;
  }

  public void b(Icon paramIcon)
  {
    this.b = paramIcon;
  }

  public String h()
  {
    return this.i;
  }

  public void g(String paramString)
  {
    this.i = paramString;
  }

  public boolean e()
  {
    return this.c;
  }

  public i f()
  {
    return this.d;
  }

  public JComponent b()
  {
    return this;
  }

  private void g()
  {
    this.f = new JPanel(new BorderLayout());
    this.e = new JMenuBar();
    this.e.setLayout(new BorderLayout());
    this.e.setBorder(BorderFactory.createCompoundBorder(UIManager.getBorder("MenuBar.border"), h));
    this.e.setPreferredSize(new Dimension(100, 22));
    this.g = new JToolBar();
    this.g.setBorder(BorderFactory.createEmptyBorder());
    this.g.setRollover(true);
    this.e.add(this.g, "East");
    this.e.addMouseListener(new bz(this));
    this.j = new JToolBar();
    this.j.setFloatable(false);
    this.j.setBorder(BorderFactory.createEmptyBorder());
    this.j.setRollover(true);
    this.f.add(this.e);
    this.f.add(this.j, "South");
  }

  protected void i()
  {
    b().grabFocus();
  }

  void b(boolean paramBoolean)
  {
    if (paramBoolean)
      add(this.f, "North");
    else
      remove(this.f);
  }

  public void a(String paramString, Action paramAction)
  {
    JButton localJButton = this.g.add(paramAction);
    localJButton.setFocusable(false);
    localJButton.putClientProperty("actionKey", paramString);
    localJButton.setPreferredSize(new Dimension(16, 14));
    localJButton.setMargin(new Insets(1, 1, 1, 1));
  }

  public void a(String paramString)
  {
    Component[] arrayOfComponent = this.g.getComponents();
    for (int k = 0; k < arrayOfComponent.length; k++)
    {
      String str = (String)((JComponent)arrayOfComponent[k]).getClientProperty("actionKey");
      if ((str == null) || (!str.equals(paramString)))
        continue;
      this.g.remove(arrayOfComponent[k]);
    }
  }

  public void a(String paramString, JComponent paramJComponent)
  {
    this.j.add(paramJComponent);
    paramJComponent.setFocusable(false);
    paramJComponent.putClientProperty("componentKey", paramString);
    if (this.j.getComponentCount() == 1)
    {
      this.j.setBorder(BorderFactory.createCompoundBorder(UIManager.getBorder("MenuBar.border"), BorderFactory.createEmptyBorder(0, 5, 0, 0)));
      this.j.repaint();
    }
  }

  public void a(MouseInputListener paramMouseInputListener)
  {
    this.e.addMouseListener(paramMouseInputListener);
    this.e.addMouseMotionListener(paramMouseInputListener);
  }

  public void b(MouseInputListener paramMouseInputListener)
  {
    this.e.removeMouseListener(paramMouseInputListener);
    this.e.removeMouseMotionListener(paramMouseInputListener);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bl
 * JD-Core Version:    0.6.0
 */