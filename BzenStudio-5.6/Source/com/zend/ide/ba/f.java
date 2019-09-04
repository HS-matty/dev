package com.zend.ide.ba;

import com.zend.ide.bc.a;
import com.zend.ide.d.bg;
import com.zend.ide.p.cd;
import com.zend.ide.p.d.bp;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.ch;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class f extends JSplitPane
  implements com.zend.ide.k.e, cu
{
  private com.zend.ide.k.f g;
  private o a = new o(this);
  private g b;
  private h[] c;
  private bb d;
  private bt e;
  private final JEditorPane f = new JEditorPane();
  private JFileChooser i;
  private int j;
  private bg k;

  public f(bg parambg)
  {
    this.k = parambg;
    this.c = new h[] { new h(ct.a(1041)) };
    cd localcd1 = new cd(this.a);
    this.a.addMouseListener(new d(this));
    a.a(this.f, "ANALYZER_RESULTS");
    this.f.setEditable(false);
    this.f.setFocusable(false);
    this.f.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    k();
    this.a.getSelectionModel().addTreeSelectionListener(new e(this));
    cd localcd2 = new cd(this.f);
    setLeftComponent(localcd1);
    setRightComponent(localcd2);
    setResizeWeight(0.5D);
    this.d = b();
    this.e = new bt(this);
    this.e.a(this.a);
    a.a(this, "ANALYZER_RESULTS");
  }

  private bb b()
  {
    i locali = new i(this);
    locali.b();
    return locali;
  }

  public void a(g paramg)
  {
    this.b = paramg;
  }

  private void k()
  {
    try
    {
      this.f.setPage(cv.c("0.html"));
    }
    catch (Exception localException)
    {
      cl.a("Problem loading analyzer output:0.html\n" + localException.toString());
    }
  }

  public void a(h[] paramArrayOfh)
  {
    this.j = paramArrayOfh.length;
    this.a.a(paramArrayOfh);
    k();
    ((com.zend.ide.k.d)x()).n();
  }

  public void d()
  {
    this.a.a(this.c);
  }

  public com.zend.ide.k.f x()
  {
    if (this.g == null)
      this.g = new c(this);
    return this.g;
  }

  private void a(b paramb)
  {
    this.b.a(paramb);
  }

  public bs t()
  {
    return this.a.t();
  }

  public void c(Object paramObject)
  {
  }

  public bb q()
  {
    return this.d;
  }

  public JComponent c()
  {
    return this;
  }

  public void d(String paramString)
  {
  }

  public String r()
  {
    return this.a.r();
  }

  public String a(int paramInt1, int paramInt2)
  {
    return this.a.a(paramInt1, paramInt2);
  }

  public void a(bn parambn)
  {
    this.d.a(parambn.q());
  }

  public Object s()
  {
    return null;
  }

  public boolean d(boolean paramBoolean)
  {
    return true;
  }

  private void e()
  {
    this.j = 0;
    ((r)this.a.getModel().getRoot()).f();
    k();
    this.a.i();
    ((com.zend.ide.k.d)x()).n();
  }

  private void f()
  {
    JTextComponent localJTextComponent = i();
    localJTextComponent.selectAll();
    localJTextComponent.copy();
  }

  private void g()
  {
    ch.a(j());
  }

  private void h()
  {
    if (this.i == null)
      this.i = new bp(false);
    int m = this.i.showSaveDialog(this);
    if (m != 0)
      return;
    OutputStream localOutputStream = null;
    try
    {
      JTextComponent localJTextComponent = i();
      localOutputStream = com.zend.ide.j.h.m.a(this.i.getSelectedFile().getPath(), true);
      localJTextComponent.write(new OutputStreamWriter(localOutputStream));
    }
    catch (Exception localIOException2)
    {
      cl.a(localException);
    }
    finally
    {
      if (localOutputStream != null)
        try
        {
          localOutputStream.close();
        }
        catch (IOException localIOException3)
        {
        }
    }
  }

  private JTextComponent i()
  {
    JTextArea localJTextArea = new JTextArea();
    localJTextArea.setText(j());
    return localJTextArea;
  }

  private String j()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    TreePath[] arrayOfTreePath = this.a.getSelectionPaths();
    Object localObject2;
    if ((arrayOfTreePath != null) && (arrayOfTreePath.length > 0))
    {
      for (int m = 0; m < arrayOfTreePath.length; m++)
      {
        Object localObject1 = arrayOfTreePath[m].getLastPathComponent();
        if ((localObject1 instanceof q))
        {
          localObject2 = (h)((q)localObject1).getUserObject();
          localStringBuffer.append(((h)localObject2).b() + "\n");
        }
        else
        {
          localObject2 = (b)((p)localObject1).getUserObject();
          localStringBuffer.append(((b)localObject2).toString() + "\n");
        }
      }
    }
    else
    {
      h[] arrayOfh = (h[])(h[])((r)this.a.getModel().getRoot()).b();
      for (int n = 0; n < arrayOfh.length; n++)
      {
        localObject2 = arrayOfh[n];
        localStringBuffer.append(((h)localObject2).b() + "\n");
        b[] arrayOfb = ((h)localObject2).d();
        for (int i1 = 0; i1 < arrayOfb.length; i1++)
        {
          b localb = arrayOfb[i1];
          localStringBuffer.append(localb.toString() + "\n");
        }
      }
    }
    return (String)localStringBuffer.toString();
  }

  static com.zend.ide.k.f a(f paramf)
  {
    return paramf.g;
  }

  static JEditorPane b(f paramf)
  {
    return paramf.f;
  }

  static o a(f paramf)
  {
    return paramf.a;
  }

  static void b(f paramf)
  {
    paramf.e();
  }

  static void e(f paramf)
  {
    paramf.h();
  }

  static void c(f paramf)
  {
    paramf.f();
  }

  static void g(f paramf)
  {
    paramf.g();
  }

  static void a(f paramf, b paramb)
  {
    paramf.a(paramb);
  }

  static int d(f paramf)
  {
    return paramf.j;
  }

  static h[] e(f paramf)
  {
    return paramf.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ba.f
 * JD-Core Version:    0.6.0
 */