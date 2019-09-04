package com.zend.ide.n;

import com.zend.ide.p.cd;
import com.zend.ide.util.a.f;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.ListModel;

class gt extends JDialog
  implements cu
{
  private ix a;
  private JPanel b;
  private String c = "closeActionName";
  private String d = "enterActionKey";
  private Action e = new f(new gj(this));
  private int f = (int)((Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 160.0D) / 23.0D);
  private ck g;
  private dt h = new dt(this);
  final ck j;

  public gt(ck paramck1, Frame paramFrame, ck paramck2)
  {
    super(paramFrame, ct.a(423), false);
    this.g = paramck2;
    f();
  }

  private void f()
  {
    this.g.a(this.h);
    JComponent localJComponent = (JComponent)getContentPane();
    localJComponent.getActionMap().put(this.c, new gi(this));
    InputMap localInputMap = localJComponent.getInputMap(1);
    localInputMap.put(KeyStroke.getKeyStroke(27, 0), this.c);
    localJComponent.getActionMap().put(this.d, this.e);
    localInputMap.put(KeyStroke.getKeyStroke(10, 0), this.d);
    gu localgu = new gu(this);
    this.b = new JPanel(new BorderLayout(5, 5));
    JPanel localJPanel = new JPanel(new BorderLayout(5, 5));
    this.b.setBorder(BorderFactory.createLineBorder(Color.black));
    this.a = new ix(this.j);
    this.a.setSelectionMode(2);
    this.a.setCellRenderer(localgu);
    this.a.setAutoscrolls(true);
    this.a.addMouseListener(new com.zend.ide.util.a.e(new x(this)));
    this.a.addFocusListener(new w(this));
    this.a.addListSelectionListener(new yd(this));
    addComponentListener(new e(this));
    cd localcd = new cd(this.a);
    localJPanel.add(localcd);
    this.b.add(localJPanel, "Center");
    this.b.setBackground(new Color(211, 229, 247));
    getContentPane().add(this.b);
    Dimension localDimension1 = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension localDimension2 = getPreferredSize();
    setLocation(localDimension1.width / 2 - localDimension2.width / 2, localDimension1.height / 2 - localDimension2.height / 2 - 180);
  }

  private void b()
  {
    int i = 5;
    int k = this.a.getModel().getSize();
    if (k < i)
      k = i;
    this.a.setVisibleRowCount(k + 1 < this.f ? k + 1 : this.f);
  }

  public void c()
  {
    Object[] arrayOfObject = ck.b(this.g);
    this.a.setListData(arrayOfObject);
    if (arrayOfObject.length > 0)
    {
      this.a.setSelectedIndex(0);
      this.a.ensureIndexIsVisible(0);
    }
    else
    {
      arrayOfObject = new Object[1];
      arrayOfObject[0] = ct.a(704);
      this.a.setListData(arrayOfObject);
    }
    b();
    pack();
    setVisible(true);
  }

  public void d()
  {
    Object[] arrayOfObject = this.a.getSelectedValues();
    if (!arrayOfObject[0].toString().equals(ct.a(704)))
    {
      ck.a(this.j).setVisible(false);
      for (int i = 0; i < arrayOfObject.length; i++)
        this.j.b().a(arrayOfObject[i].toString(), null, -1);
      this.j.b().grabFocus();
    }
  }

  private void e()
  {
    ck.a(this.j).setVisible(false);
    this.j.b().grabFocus();
  }

  static void a(gt paramgt)
  {
    paramgt.e();
  }

  static ix b(gt paramgt)
  {
    return paramgt.a;
  }

  static String a(gt paramgt)
  {
    return paramgt.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gt
 * JD-Core Version:    0.6.0
 */