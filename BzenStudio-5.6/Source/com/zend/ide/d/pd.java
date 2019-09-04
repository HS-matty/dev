package com.zend.ide.d;

import com.zend.ide.p.bb;
import com.zend.ide.p.w;
import com.zend.ide.util.cm;
import com.zend.ide.util.ct;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class pd extends JPanel
  implements HierarchyListener
{
  private w a;
  private JPanel b;
  private bb c;
  private bb d;
  private ActionListener e;
  private cm f = new cm("");
  private final String g = ct.a(226);
  private cm h;
  private cm i;
  private final cm j = new cm("http://www.zend.com/manual/");
  final od k;

  public pd(od paramod)
  {
    cm localcm = b.c((Locale)b.a("desktop.language").c());
    if (localcm.b())
      this.h = localcm;
    this.i = b.a((Locale)b.a("desktop.language").c());
    this.e = new sb(this);
    addHierarchyListener(this);
    a();
    putClientProperty("Name", ct.a(851));
  }

  private void a()
  {
    setLayout(new BoxLayout(this, 1));
    JPanel localJPanel = new JPanel(new BorderLayout(3, 3));
    od.a(this.k, new cb(10));
    this.a = new w(" ... ");
    this.b = new JPanel(od.g(this.k));
    this.c = new bb();
    this.d = new bb();
    od.a(this.k, new bb());
    localJPanel.add(od.h(this.k), "Center");
    localJPanel.add(this.a, "East");
    localJPanel.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
    od.h(this.k).setAlignmentX(0.0F);
    this.a.setAlignmentX(0.0F);
    od.h(this.k).setEditable(false);
    od.h(this.k).addFocusListener(new tb(this));
    this.a.addActionListener(new rb(this));
    this.a.setEnabled(false);
    this.c.setText("php.net");
    this.c.setSelected(true);
    this.c.setActionCommand(this.i.toString());
    this.c.addActionListener(this.e);
    this.d.setText("Zend site");
    this.d.setActionCommand(this.j.toString());
    this.d.addActionListener(this.e);
    od.i(this.k).setText(this.g);
    od.i(this.k).addActionListener(this.e);
    ButtonGroup localButtonGroup = new ButtonGroup();
    localButtonGroup.add(this.c);
    localButtonGroup.add(this.d);
    localButtonGroup.add(od.i(this.k));
    JLabel localJLabel = new JLabel(ct.a(20) + ":");
    this.b.add(localJLabel);
    this.b.add(this.c);
    this.b.add(this.d);
    this.b.add(od.i(this.k));
    this.b.setBorder(BorderFactory.createEmptyBorder(0, 3, 0, 0));
    add(this.b);
    add(Box.createVerticalStrut(4));
    add(localJPanel);
  }

  public void a(cm paramcm)
  {
    String str = paramcm.toString();
    if (str.equals(this.i.toString()))
    {
      this.c.setSelected(true);
    }
    else if (str.equals(this.j.toString()))
    {
      this.d.setSelected(true);
    }
    else
    {
      if (this.h == null)
        this.h = new cm(str);
      else
        this.h.a(str);
      this.h.a(true);
      od.i(this.k).setSelected(true);
      od.i(this.k).setActionCommand(this.h.toString());
    }
    od.h(this.k).setText(str);
  }

  public void hierarchyChanged(HierarchyEvent paramHierarchyEvent)
  {
    boolean bool = false;
    long l = paramHierarchyEvent.getChangeFlags();
    int m = (l & 0x4) != 0L ? 1 : 0;
    if (m != 0)
    {
      if (od.i(this.k).isSelected())
      {
        bool = true;
        od.h(this.k).selectAll();
      }
      od.h(this.k).setEditable(bool);
      this.a.setEnabled(bool);
    }
  }

  static cm a(pd parampd)
  {
    return parampd.f;
  }

  static String b(pd parampd)
  {
    return parampd.g;
  }

  static w c(pd parampd)
  {
    return parampd.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.pd
 * JD-Core Version:    0.6.0
 */