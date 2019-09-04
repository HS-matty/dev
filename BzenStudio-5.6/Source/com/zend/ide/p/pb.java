package com.zend.ide.p;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

public class pb extends JToolBar
{
  private ob a;
  private JButton b;
  private JPopupMenu c;
  private ActionListener d;

  public pb()
  {
    this(null, null);
  }

  public pb(Icon paramIcon)
  {
    this(null, paramIcon);
  }

  public pb(String paramString, Icon paramIcon)
  {
    setRollover(true);
    setFloatable(false);
    this.a = new ob(5);
    this.a.setAction(new nb(this));
    this.a.addChangeListener(new hb(this));
    this.b = new JButton(paramString, paramIcon);
    this.b.addChangeListener(new ib(this));
    add(this.b);
    add(this.a);
    this.c = new JPopupMenu();
    this.c.addHierarchyListener(new jb(this));
    this.d = new lb(this);
    this.a.setPreferredSize(new Dimension(10, this.a.getPreferredSize().height));
    int i = this.b.getPreferredSize().width + this.a.getPreferredSize().width;
    setPreferredSize(new Dimension(i, getPreferredSize().height));
    setMaximumSize(new Dimension(i, getPreferredSize().height));
    setSize(new Dimension(i, getPreferredSize().height));
  }

  public void setToolTipText(String paramString)
  {
    this.b.setToolTipText(paramString);
  }

  public void a(JMenuItem paramJMenuItem)
  {
    this.c.add(paramJMenuItem);
    paramJMenuItem.addActionListener(this.d);
  }

  public void a()
  {
    this.c.addSeparator();
  }

  public void remove(Component paramComponent)
  {
    this.c.remove(paramComponent);
  }

  public void a(ActionListener paramActionListener)
  {
    this.b.addActionListener(paramActionListener);
  }

  static JButton a(pb parampb)
  {
    return parampb.b;
  }

  static ob b(pb parampb)
  {
    return parampb.a;
  }

  static JPopupMenu c(pb parampb)
  {
    return parampb.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.pb
 * JD-Core Version:    0.6.0
 */