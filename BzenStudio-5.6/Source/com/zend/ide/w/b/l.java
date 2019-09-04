package com.zend.ide.w.b;

import com.zend.ide.n.bw;
import com.zend.ide.util.cl;
import com.zend.ide.util.dj;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;

class l
{
  private bx a;
  private bx b;
  private bx c;
  private bx d;
  private bx e;
  private Document f;
  private Document g;
  private ArrayList h;
  private bf i;
  private bf j;
  private List k;
  private ArrayList l;
  private ArrayList m;
  private ArrayList n;
  private ArrayList o;
  private ArrayList p;
  private ArrayList q;
  private Highlighter r;
  private Highlighter s;
  private h t;

  public l(bf parambf1, bf parambf2, h paramh)
  {
    this.i = parambf1;
    this.j = parambf2;
    this.t = paramh;
    this.h = new ArrayList(5);
    this.p = new ArrayList();
    this.q = new ArrayList();
    this.l = new ArrayList();
    this.m = new ArrayList();
    this.n = new ArrayList();
    this.o = new ArrayList();
    this.f = parambf1.d();
    k();
  }

  public void a(List paramList, Map paramMap)
    throws dj
  {
    this.k = paramList;
    b(0);
    try
    {
      this.g = i.a(this.f);
    }
    catch (Exception localException)
    {
      throw new dj(localException);
    }
    l();
    for (int i1 = 0; i1 < paramList.size(); i1++)
    {
      j localj = (j)paramList.get(i1);
      v localv = (v)paramMap.get(localj);
      try
      {
        a(localj, localv);
      }
      catch (BadLocationException localBadLocationException)
      {
        throw new dj(localBadLocationException);
      }
    }
    this.j.a(this.g);
    n();
    m();
    a(this.p, this.i.g(), this.f);
    a(this.q, this.j.g(), this.g);
    a(this.l, this.i.g(), this.f);
    a(this.m, this.j.g(), this.g);
    a(this.n, this.i.g(), this.f);
    a(this.o, this.j.g(), this.g);
    b(1);
  }

  public List b()
  {
    return this.p;
  }

  public List c()
  {
    return this.q;
  }

  public List d()
  {
    return this.m;
  }

  public List e()
  {
    return this.l;
  }

  public List f()
  {
    return this.n;
  }

  public List g()
  {
    return this.o;
  }

  public Document h()
  {
    return this.f;
  }

  public Document i()
  {
    return this.g;
  }

  public List j()
  {
    return this.k;
  }

  public j a(int paramInt1, int paramInt2)
  {
    JTextArea localJTextArea;
    ArrayList localArrayList;
    if (paramInt2 == 0)
    {
      localJTextArea = this.i.g();
      localArrayList = this.n;
    }
    else if (paramInt2 == 1)
    {
      localJTextArea = this.j.g();
      localArrayList = this.o;
    }
    else
    {
      throw new IllegalArgumentException("Unknown Diff side - " + paramInt2);
    }
    j localj = null;
    try
    {
      Rectangle localRectangle = localJTextArea.modelToView(paramInt1);
      if (localRectangle != null)
        for (int i1 = 0; i1 < localArrayList.size(); i1++)
        {
          x localx = (x)localArrayList.get(i1);
          if (localx.c(localRectangle.y) != 0)
            continue;
          localj = (j)this.k.get(localx.f());
          break;
        }
    }
    catch (BadLocationException localBadLocationException)
    {
    }
    return localj;
  }

  private void k()
  {
    this.a = new bx(true, 0, this.t);
    this.b = new bx(false, 0, this.t);
    this.c = new bx(true, 2, this.t);
    this.d = new bx(false, 2, this.t);
    this.e = new bx(false, 1, this.t);
    this.r = new DefaultHighlighter();
    this.s = new DefaultHighlighter();
    this.i.f().a(null, this.r, -1);
    this.j.f().a(null, this.s, -1);
  }

  private void l()
  {
    this.p.clear();
    this.q.clear();
    this.l.clear();
    this.m.clear();
  }

  private void a(j paramj, v paramv)
    throws BadLocationException
  {
    switch (paramj.f())
    {
    case 0:
      a(paramj);
      b(paramj);
      break;
    case 1:
      b(paramv, paramj);
      b(paramj);
      break;
    case 2:
      a(paramv, paramj);
      b(paramj);
      break;
    default:
      throw new bj("No such element type - " + paramj.f());
    }
  }

  private static void a(List paramList, JTextArea paramJTextArea, Document paramDocument)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      try
      {
        ((x)localIterator.next()).a(paramJTextArea, paramDocument);
      }
      catch (BadLocationException localBadLocationException)
      {
        cl.a(localBadLocationException);
      }
  }

  private void m()
  {
    a(this.l, this.n, 0);
    a(this.m, this.o, 1);
  }

  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt)
  {
    Object localObject;
    int[] arrayOfInt;
    x localx;
    if (paramInt == 0)
      for (i1 = 0; i1 < this.k.size(); i1++)
      {
        localObject = (j)this.k.get(i1);
        arrayOfInt = ((j)localObject).d();
        if (arrayOfInt[0] == 0)
          continue;
        if (((j)localObject).a(arrayOfInt[0]).b())
        {
          a(new x(arrayOfInt[0], arrayOfInt[1]), paramArrayList1);
          a(new x(arrayOfInt[0], arrayOfInt[1]), paramArrayList2);
        }
        else
        {
          localx = new x(arrayOfInt[0], arrayOfInt[1]);
          localx.a(true);
          a(localx, paramArrayList2);
        }
      }
    else
      for (i1 = 0; i1 < this.k.size(); i1++)
      {
        localObject = (j)this.k.get(i1);
        arrayOfInt = ((j)localObject).e();
        if (arrayOfInt[0] == 0)
          continue;
        if (((j)localObject).b(arrayOfInt[0]).b())
        {
          a(new x(arrayOfInt[0], arrayOfInt[1]), paramArrayList1);
          a(new x(arrayOfInt[0], arrayOfInt[1]), paramArrayList2);
        }
        else
        {
          localx = new x(arrayOfInt[0], arrayOfInt[1]);
          localx.a(true);
          a(localx, paramArrayList2);
        }
      }
    for (int i1 = 0; i1 < paramArrayList1.size(); i1++)
    {
      localObject = (x)paramArrayList1.get(i1);
      ((x)localObject).d(i1);
      ((x)localObject).b(true);
    }
    for (i1 = 0; i1 < paramArrayList2.size(); i1++)
    {
      localObject = (x)paramArrayList2.get(i1);
      ((x)localObject).d(i1);
      ((x)localObject).b(true);
    }
  }

  private void n()
  {
    a(this.p, this.f, 0);
    a(this.q, this.g, 1);
  }

  private void a(ArrayList paramArrayList, Document paramDocument, int paramInt)
  {
    if (this.k.size() == 0)
    {
      int i1 = i.b(paramDocument);
      if (i1 > 0)
        paramArrayList.add(new x(1, i1));
      return;
    }
    int[] arrayOfInt = a(paramInt);
    a(paramArrayList, arrayOfInt, paramDocument);
    a(paramArrayList, paramInt);
    b(paramArrayList, paramInt);
    Collections.sort(paramArrayList, x.g());
    for (int i2 = 0; i2 < paramArrayList.size(); i2++)
      ((x)paramArrayList.get(i2)).d(i2);
  }

  private int[] a(int paramInt)
  {
    int[] arrayOfInt1 = new int[this.k.size() * 2];
    int i1 = 0;
    for (int i2 = 0; i2 < this.k.size(); i2++)
    {
      j localj = (j)this.k.get(i2);
      int[] arrayOfInt2;
      if (paramInt == 0)
        arrayOfInt2 = localj.d();
      else
        arrayOfInt2 = localj.e();
      arrayOfInt1[(i1++)] = arrayOfInt2[0];
      arrayOfInt1[(i1++)] = arrayOfInt2[1];
    }
    return arrayOfInt1;
  }

  private void a(ArrayList paramArrayList, int[] paramArrayOfInt, Document paramDocument)
  {
    if (paramArrayOfInt[0] > 1)
      try
      {
        a(new x(1, Math.max(1, paramArrayOfInt[0] - 1)), paramArrayList);
      }
      catch (IllegalArgumentException localIllegalArgumentException1)
      {
        cl.a(localIllegalArgumentException1);
      }
    int i1 = 2;
    while (i1 < paramArrayOfInt.length)
    {
      if (paramArrayOfInt[i1] - paramArrayOfInt[(i1 - 1)] > 1)
        try
        {
          a(new x(paramArrayOfInt[(i1 - 1)] + 1, paramArrayOfInt[i1] - 1), paramArrayList);
        }
        catch (IllegalArgumentException localIllegalArgumentException2)
        {
          cl.a(localIllegalArgumentException2);
        }
      i1 += 2;
    }
    i1 = i.b(paramDocument);
    if (paramArrayOfInt[(paramArrayOfInt.length - 1)] < i1)
      try
      {
        a(new x(paramArrayOfInt[(paramArrayOfInt.length - 1)] + 1, i1), paramArrayList);
      }
      catch (IllegalArgumentException localIllegalArgumentException3)
      {
        cl.a(localIllegalArgumentException3);
      }
  }

  private void a(ArrayList paramArrayList, int paramInt)
  {
    for (int i1 = 0; i1 < paramArrayList.size(); i1++)
    {
      x localx = (x)paramArrayList.get(i1);
      if (localx.d() - localx.c() <= 0)
        continue;
      int i2 = localx.d() + 1;
      Object localObject = null;
      for (int i3 = 0; i3 < this.k.size(); i3++)
      {
        j localj = (j)this.k.get(i3);
        int i4;
        if (paramInt == 0)
          i4 = localj.d()[0];
        else
          i4 = localj.e()[0];
        if (i4 != i2)
          continue;
        q localq;
        if (paramInt == 0)
          localq = localj.a(i4);
        else
          localq = localj.b(i4);
        if ((localq == null) || (!localq.b()))
          break;
        localObject = localj;
        break;
      }
      if (localObject == null)
        continue;
      a(new x(localx.d(), localx.d()), paramArrayList);
      localx.b(localx.d() - 1);
    }
  }

  private void b(ArrayList paramArrayList, int paramInt)
  {
    for (int i1 = 0; i1 < this.k.size(); i1++)
    {
      j localj = (j)this.k.get(i1);
      int i2;
      if (paramInt == 0)
        i2 = localj.d()[0];
      else
        i2 = localj.e()[0];
      if (i2 == 0)
        continue;
      q localq;
      if (paramInt == 0)
        localq = localj.a(i2);
      else
        localq = localj.b(i2);
      if ((localq == null) || (localq.b()))
        continue;
      x localx = new x(i2, i2);
      localx.a(true);
      a(localx, paramArrayList);
    }
  }

  private static void a(x paramx, List paramList)
  {
    if (!b(paramx, paramList))
      paramList.add(paramx);
  }

  private static boolean b(x paramx, List paramList)
  {
    return Collections.binarySearch(paramList, paramx, x.g()) == 0;
  }

  private void a(v paramv, j paramj)
    throws BadLocationException
  {
    int[] arrayOfInt = paramj.e();
    i.a(this.g, arrayOfInt[0], paramv.c());
  }

  private void b(v paramv, j paramj)
    throws BadLocationException
  {
    int[] arrayOfInt = paramj.e();
    int i1 = paramj.b();
    int i2 = paramj.c();
    if (i2 == 1)
      i.b(this.g, arrayOfInt[0], paramv.c());
    else if (i1 >= 1)
    {
      if (i2 > 1)
      {
        for (int i3 = 1; i3 < i2; i3++)
          i.a(this.g, arrayOfInt[0] + 1);
        i.b(this.g, arrayOfInt[0], paramv.c());
      }
      else
      {
        throw new bj("Diff structure error.");
      }
    }
    else
      throw new bj("Cannot handle the 'diff element'.");
  }

  private void a(j paramj)
    throws BadLocationException
  {
    int i1 = paramj.c();
    int[] arrayOfInt = paramj.e();
    for (int i2 = 1; i2 <= i1; i2++)
      i.a(this.g, arrayOfInt[0] + 1);
  }

  private void b(j paramj)
    throws BadLocationException
  {
    int[] arrayOfInt1 = paramj.d();
    int[] arrayOfInt2 = paramj.e();
    q localq1;
    q localq2;
    switch (paramj.f())
    {
    case 0:
      localq1 = new q(true);
      localq2 = new q(false);
      break;
    case 2:
      localq1 = new q(false);
      localq2 = new q(true);
      break;
    case 1:
      localq1 = new q(true);
      localq2 = new q(true);
      break;
    default:
      localq1 = new q(true);
      localq2 = new q(true);
    }
    int i1 = arrayOfInt1[0];
    int i2 = arrayOfInt1[1];
    for (int i3 = i1; i3 <= i2; i3++)
    {
      a(i3, paramj, localq1, this.f, this.r);
      paramj.a(i3, localq1);
    }
    i1 = arrayOfInt2[0];
    i2 = arrayOfInt2[1];
    for (i3 = i1; i3 <= i2; i3++)
    {
      a(i3, paramj, localq2, this.g, this.s);
      paramj.b(i3, localq2);
    }
  }

  private void a(int paramInt, j paramj, q paramq, Document paramDocument, Highlighter paramHighlighter)
    throws BadLocationException
  {
    bx localbx = a(paramq, paramj);
    int i1;
    if (!paramq.b())
    {
      if (paramInt == 0)
      {
        i1 = i.b(paramDocument, 1);
      }
      else if (paramInt + 1 > i.b(paramDocument))
      {
        i1 = i.b(paramDocument, paramInt);
        localbx.a(1);
      }
      else
      {
        i1 = i.b(paramDocument, paramInt + 1);
      }
    }
    else
      i1 = i.b(paramDocument, paramInt);
    paramHighlighter.addHighlight(i1, i1 + 1, localbx);
  }

  private bx a(q paramq, j paramj)
  {
    bx localbx = null;
    switch (paramj.f())
    {
    case 1:
      localbx = this.e;
      break;
    case 0:
      if (paramq.b())
        localbx = this.b;
      else
        localbx = this.a;
      break;
    case 2:
      if (paramq.b())
        localbx = this.d;
      else
        localbx = this.c;
    }
    return localbx;
  }

  public void a(m paramm)
  {
    synchronized (this.h)
    {
      this.h.add(paramm);
    }
  }

  private void b(int paramInt)
  {
    bl localbl = new bl(this, paramInt);
    synchronized (this.h)
    {
      for (int i1 = 0; i1 < this.h.size(); i1++)
        ((m)this.h.get(i1)).a(localbl);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.l
 * JD-Core Version:    0.6.0
 */