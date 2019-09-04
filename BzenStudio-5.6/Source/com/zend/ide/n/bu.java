package com.zend.ide.n;

import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter.HighlightPainter;
import javax.swing.text.Position;

public class bu
{
  private bw a;
  private int b;
  private Hashtable c = new Hashtable();
  private Hashtable d = new Hashtable();

  public bu(bw parambw, int paramInt)
  {
    this.a = parambw;
    new ed(this);
    this.b = paramInt;
  }

  public bw c()
  {
    return this.a;
  }

  public int b()
  {
    return this.b;
  }

  public Object a(String paramString, int paramInt1, int paramInt2, Highlighter.HighlightPainter paramHighlightPainter)
  {
    dz[] arrayOfdz = this.a.c(paramString);
    if (arrayOfdz == null)
      return null;
    bv localbv;
    try
    {
      Document localDocument = arrayOfdz[0].getDocument();
      Position localPosition1 = localDocument.createPosition(paramInt1);
      Position localPosition2 = localDocument.createPosition(paramInt2);
      localbv = new bv(this, localPosition1, localPosition2, paramHighlightPainter);
    }
    catch (BadLocationException localBadLocationException)
    {
      return null;
    }
    for (int i = 0; i < arrayOfdz.length; i++)
      localbv.a(arrayOfdz[i]);
    a(paramString, localbv);
    return localbv;
  }

  public void a(String paramString, Object paramObject)
  {
    if (!(paramObject instanceof bv))
      return;
    bv localbv = (bv)paramObject;
    localbv.b();
    b(paramString, localbv);
  }

  public void b(String paramString)
  {
    ArrayList localArrayList = a(paramString);
    while (!localArrayList.isEmpty())
      a(paramString, localArrayList.get(localArrayList.size() - 1));
  }

  private DefaultHighlighter a(dz paramdz)
  {
    DefaultHighlighter localDefaultHighlighter = (DefaultHighlighter)this.c.get(paramdz);
    if (localDefaultHighlighter == null)
    {
      localDefaultHighlighter = new DefaultHighlighter();
      ((bw)paramdz).a(paramdz.k(), localDefaultHighlighter, b());
      this.c.put(paramdz, localDefaultHighlighter);
    }
    return localDefaultHighlighter;
  }

  private void b(dz paramdz)
  {
    DefaultHighlighter localDefaultHighlighter = (DefaultHighlighter)this.c.get(paramdz);
    if (localDefaultHighlighter != null)
    {
      ((bw)paramdz).a(paramdz.k(), localDefaultHighlighter);
      this.c.remove(localDefaultHighlighter);
    }
  }

  private void a(String paramString, bv parambv)
  {
    ArrayList localArrayList = (ArrayList)this.d.get(paramString);
    if (localArrayList == null)
    {
      localArrayList = new ArrayList();
      this.d.put(paramString, localArrayList);
    }
    localArrayList.add(parambv);
  }

  private void b(String paramString, bv parambv)
  {
    ArrayList localArrayList = (ArrayList)this.d.get(paramString);
    if (localArrayList == null)
      return;
    localArrayList.remove(parambv);
    if (localArrayList.size() == 0)
      this.d.remove(localArrayList);
  }

  private void a(String paramString1, String paramString2)
  {
    ArrayList localArrayList = (ArrayList)this.d.remove(paramString1);
    if (localArrayList == null)
      return;
    this.d.put(paramString2, localArrayList);
  }

  private ArrayList a(String paramString)
  {
    ArrayList localArrayList = (ArrayList)this.d.get(paramString);
    if (localArrayList == null)
      localArrayList = new ArrayList();
    return localArrayList;
  }

  static ArrayList a(bu parambu, String paramString)
  {
    return parambu.a(paramString);
  }

  static void a(bu parambu, dz paramdz)
  {
    parambu.b(paramdz);
  }

  static void a(bu parambu, String paramString1, String paramString2)
  {
    parambu.a(paramString1, paramString2);
  }

  static DefaultHighlighter b(bu parambu, dz paramdz)
  {
    return parambu.a(paramdz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.bu
 * JD-Core Version:    0.6.0
 */