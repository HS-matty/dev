package com.zend.ide.w;

import com.zend.ide.n.bd;
import com.zend.ide.n.hk;
import java.awt.Color;
import java.util.HashMap;

public class db
{
  private static final Color a = Color.BLUE;
  private static final Color b = Color.GREEN.darker();
  private static final Color c = new Color(147, 89, 85);
  private static final Color d = Color.RED;
  private static final Color e = Color.BLACK;
  private static db f = new db();
  private HashMap g;

  private db()
  {
    b();
  }

  public static hk a(String paramString)
    throws IllegalArgumentException
  {
    hk localhk = (hk)f.g.get(paramString);
    if (localhk == null)
      return a();
    return localhk;
  }

  public static hk a()
  {
    bd localbd = new bd();
    localbd.a(Color.BLACK);
    return localbd;
  }

  private void b()
  {
    this.g = new HashMap();
    bd localbd = new bd();
    localbd.a(a);
    this.g.put("vcs.statusModified", localbd);
    localbd = new bd();
    localbd.a(b);
    this.g.put("vcs.statusAdded", localbd);
    localbd = new bd();
    localbd.a(c);
    this.g.put("vcs.statusNotVersioned", localbd);
    localbd = new bd();
    localbd.a(d);
    this.g.put("vcs.statusMergedWithConflicts", localbd);
    localbd = new bd();
    localbd.a(e);
    this.g.put("vcs.statusUpToDate", localbd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.db
 * JD-Core Version:    0.6.0
 */