package com.zend.ide.o;

import com.zend.ide.bc.a;
import com.zend.ide.bd.c;
import com.zend.ide.p.ba;
import com.zend.ide.p.bw;
import com.zend.ide.util.bb;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import javax.swing.DefaultListModel;
import javax.swing.GrayFilter;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.ListCellRenderer;

public class fq extends bw
  implements cu
{
  private static final ImageIcon d = cv.b("togglebreakpoint16.gif");
  private static final ImageIcon e = new ImageIcon(GrayFilter.createDisabledImage(d.getImage()));
  private fk k;
  private dk j;

  public fq(fk paramfk)
  {
    super(paramfk.p());
    this.k = paramfk;
    this.j = paramfk.p();
    d("breakpointCompoent");
    g.a((g)q());
    putClientProperty("help_file", "zend_ide_helpmanaging_breakpoints.htm");
    addMouseListener(new f(this));
    InputMap localInputMap = getInputMap();
    localInputMap.put(KeyStroke.getKeyStroke(127, 0), "RemoveSelectedBreakpointsAction");
    a.a(this, "BREAKPOINTS");
  }

  protected DefaultListModel b(Object paramObject)
  {
    return new dw((dk)paramObject);
  }

  protected bb d()
  {
    return new g(this, null);
  }

  protected ListCellRenderer g()
  {
    return new dv(this, null);
  }

  protected String a(int paramInt)
  {
    return "breakpoint";
  }

  private void b()
  {
    di localdi = (di)getSelectedValue();
    try
    {
      if (!this.k.b(localdi.j(), localdi.b()))
      {
        int i = ba.a(c.b().h(), ct.a(865), ct.a(94), 0, 0);
        if (i == 0)
          this.j.a(localdi);
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  protected String a(Object paramObject, int paramInt)
  {
    di localdi = (di)paramObject;
    String str1 = localdi.j();
    int i = localdi.b() + 1;
    String str2 = localdi.h();
    String str3 = ct.a(742) + str2;
    return str1 + ct.a(751) + i + str3;
  }

  static void a(fq paramfq)
  {
    paramfq.b();
  }

  static ImageIcon e()
  {
    return d;
  }

  static ImageIcon f()
  {
    return e;
  }

  static fk b(fq paramfq)
  {
    return paramfq.k;
  }

  static dk a(fq paramfq)
  {
    return paramfq.j;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.fq
 * JD-Core Version:    0.6.0
 */