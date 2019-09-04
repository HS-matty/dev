package com.zend.ide.d;

import com.zend.ide.n.bd;
import com.zend.ide.n.cw;
import com.zend.ide.n.gz;
import com.zend.ide.n.hk;
import com.zend.ide.n.hl;
import com.zend.ide.n.ho;
import com.zend.ide.n.kc;
import com.zend.ide.p.cd;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.s.bk;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.b;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.text.AbstractDocument.AbstractElement;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

public class dd extends dm
  implements cu
{
  private x h;
  private x c;
  private x d;
  private gz e;
  private dt f;
  private dt g;
  private cr j;
  private bk k;
  private x l;
  private eb i = new eb(this, null);

  public dd(dc paramdc, String paramString, ArrayList paramArrayList)
  {
    super(paramdc, paramArrayList);
    String str = a(paramString);
    this.e.setText(str);
    ho localho = (ho)this.e.getDocument();
    localho.b(paramString);
    this.k = kc.b(localho);
    b.a(this.i, "desktop.phpVersion");
  }

  protected JPanel e()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout(15, 15));
    JPanel localJPanel2 = new JPanel(new BorderLayout(5, 5));
    cd localcd = new cd(this.a);
    localJPanel2.add(localcd, "Center");
    localJPanel2.setBorder(BorderFactory.createTitledBorder(ct.a(1154)));
    localJPanel1.add(localJPanel2, "Center");
    localJPanel1.add(f(), "East");
    return localJPanel1;
  }

  protected JPanel f()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout(5, 5));
    localJPanel1.setBorder(BorderFactory.createTitledBorder(ct.a(1155)));
    JPanel localJPanel2 = new JPanel(new BorderLayout(5, 5));
    this.h = new x(ct.b(1156));
    this.c = new x(ct.b(1157));
    this.d = new x(ct.b(1158));
    localJPanel2.add(this.h, "West");
    localJPanel2.add(this.c, "Center");
    localJPanel2.add(this.d, "East");
    cz localcz = new cz(this);
    this.h.addActionListener(localcz);
    this.c.addActionListener(localcz);
    this.d.addActionListener(localcz);
    this.l = new x();
    this.l.addActionListener(new cy(this));
    z localz1 = new z(ct.a(1159));
    this.f = new dt(this);
    this.f.addMouseListener(new da(this, null));
    this.f.setOpaque(true);
    this.f.setPreferredSize(new Dimension(60, 25));
    JPanel localJPanel3 = new JPanel(new FlowLayout(2, 5, 5));
    localJPanel3.add(localz1);
    localJPanel3.add(this.f);
    z localz2 = new z(ct.a(1160));
    this.g = new dt(this);
    this.g.addMouseListener(new cx(this, null));
    this.g.setOpaque(true);
    this.g.setHorizontalAlignment(0);
    this.g.setPreferredSize(new Dimension(60, 25));
    JPanel localJPanel4 = new JPanel(new FlowLayout(2, 5, 5));
    localJPanel4.add(this.l);
    localJPanel4.add(localz2);
    localJPanel4.add(this.g);
    JPanel localJPanel5 = new JPanel(new GridLayout(2, 1));
    localJPanel5.add(localJPanel3);
    localJPanel5.add(localJPanel4);
    localJPanel1.add(localJPanel5, "Center");
    localJPanel1.add(localJPanel2, "South");
    return localJPanel1;
  }

  private hl g()
  {
    return this.b.p().c();
  }

  protected JPanel i()
  {
    JPanel localJPanel = new JPanel(new BorderLayout());
    localJPanel.setBorder(BorderFactory.createTitledBorder(ct.a(1161)));
    this.e = new gz();
    this.e.a(false);
    this.e.d("No Context");
    this.j = new cr(this.e);
    cd localcd = new cd(this.e);
    this.e.setEditable(false);
    localcd.setPreferredSize(new Dimension(450, 200));
    localJPanel.add(localcd, "Center");
    j();
    return localJPanel;
  }

  protected void j()
  {
    this.e.addMouseListener(new bp(this));
    this.e.addMouseMotionListener(new ce(this));
  }

  private int a(int paramInt)
  {
    Segment localSegment = new Segment();
    Document localDocument = this.e.getDocument();
    AbstractDocument.AbstractElement localAbstractElement1 = (AbstractDocument.AbstractElement)localDocument.getDefaultRootElement();
    int m = localAbstractElement1.getElementIndex(paramInt);
    AbstractDocument.AbstractElement localAbstractElement2 = (AbstractDocument.AbstractElement)localAbstractElement1.getChildAt(m);
    int n = localAbstractElement2.getStartOffset();
    int i1 = localAbstractElement2.getEndOffset();
    int i2 = i1 - n;
    int i3 = paramInt - n;
    try
    {
      localDocument.getText(n, i2, localSegment);
    }
    catch (BadLocationException localBadLocationException)
    {
      return -1;
    }
    Object localObject = ((cw)localAbstractElement2).b();
    this.k.a(localSegment);
    this.k.a(localObject);
    int i4 = this.k.a(i3);
    return i4;
  }

  private int b(int paramInt)
  {
    DefaultListModel localDefaultListModel = (DefaultListModel)this.a.getModel();
    for (int m = 0; m < localDefaultListModel.getSize(); m++)
    {
      ci localci = (ci)localDefaultListModel.getElementAt(m);
      int n = Arrays.binarySearch(localci.b(), paramInt);
      if (n >= 0)
        return m;
    }
    return -1;
  }

  public void h()
  {
    this.e.repaint();
  }

  protected void k()
  {
    ci localci = m();
    if (localci != null)
    {
      bd localbd = g().a(localci.b()[0]);
      Color localColor1 = localbd.b();
      Color localColor2 = localbd.c();
      int m = localbd.e();
      boolean bool = localbd.f();
      if (localColor1 != null)
        this.f.setBackground(localColor1);
      this.h.setSelected((m & 0x1) != 0);
      this.c.setSelected((m & 0x2) != 0);
      this.d.setSelected(bool);
      this.l.setSelected(localbd.d());
      a(localbd.d(), localColor2);
    }
  }

  protected void a(hl paramhl)
  {
    this.e.a(paramhl);
  }

  protected void a(Font paramFont)
  {
    this.e.setFont(paramFont);
  }

  protected void a(Color paramColor)
  {
    this.e.setBackground(paramColor);
  }

  protected void b(Color paramColor)
  {
    this.j.a(paramColor);
  }

  private void a(boolean paramBoolean, Color paramColor)
  {
    this.g.setFocusable(paramBoolean);
    this.g.setEnabled(paramBoolean);
    if ((paramBoolean) && (paramColor != null))
    {
      this.g.setBackground(paramColor);
      this.g.setText("");
    }
    else
    {
      this.g.setBackground(Color.white);
      this.g.setText(ct.a(1174));
    }
  }

  private ci m()
  {
    return (ci)this.a.getSelectedValue();
  }

  private String a(String paramString)
  {
    InputStream localInputStream = null;
    try
    {
      localInputStream = ClassLoader.getSystemResourceAsStream(paramString);
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localInputStream));
      localObject1 = new StringBuffer();
      String str1;
      while ((str1 = localBufferedReader.readLine()) != null)
      {
        ((StringBuffer)localObject1).append(str1);
        ((StringBuffer)localObject1).append("\n");
      }
      String str2 = ((StringBuffer)localObject1).toString();
      return str2;
    }
    catch (Exception localException)
    {
      cl.a("the example editor file " + paramString + " could not be found!");
      Object localObject1 = dc.a();
      return localObject1;
    }
    finally
    {
      if (localInputStream != null)
        try
        {
          localInputStream.close();
        }
        catch (IOException localIOException3)
        {
        }
    }
    throw localObject2;
  }

  static gz a(dd paramdd)
  {
    return paramdd.e;
  }

  static int b(dd paramdd, int paramInt)
  {
    return paramdd.a(paramInt);
  }

  static int a(dd paramdd, int paramInt)
  {
    return paramdd.b(paramInt);
  }

  static x d(dd paramdd)
  {
    return paramdd.l;
  }

  static ci b(dd paramdd)
  {
    return paramdd.m();
  }

  static hl c(dd paramdd)
  {
    return paramdd.g();
  }

  static void a(dd paramdd, boolean paramBoolean, Color paramColor)
  {
    paramdd.a(paramBoolean, paramColor);
  }

  static x h(dd paramdd)
  {
    return paramdd.h;
  }

  static x e(dd paramdd)
  {
    return paramdd.c;
  }

  static x f(dd paramdd)
  {
    return paramdd.d;
  }

  static dt g(dd paramdd)
  {
    return paramdd.g;
  }

  static bk a(dd paramdd)
  {
    return paramdd.k;
  }

  static bk a(dd paramdd, bk parambk)
  {
    return paramdd.k = parambk;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.dd
 * JD-Core Version:    0.6.0
 */