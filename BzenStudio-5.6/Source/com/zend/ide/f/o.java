package com.zend.ide.f;

import com.zend.ide.m.g;
import java.util.Stack;

public class o
  implements bn
{
  private String a = "";
  private String b = "";
  private vb c;
  private Stack d = new Stack();
  private Stack e = new Stack();

  public o()
  {
    e();
  }

  protected vb a()
  {
    return this.c;
  }

  private void e()
  {
    this.c = bl.a(this.a, this.b);
  }

  protected String c()
  {
    return this.b;
  }

  protected String f()
  {
    return this.a;
  }

  public void a(String paramString, boolean paramBoolean, int paramInt1, g paramg, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void a(String paramString1, int paramInt1, String paramString2, String paramString3, g paramg, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void a(String paramString, int paramInt1, g paramg, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void a(String paramString, g paramg, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void a(String paramString, g paramg, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void a(int paramInt1, String paramString, short[] paramArrayOfShort, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void b()
  {
  }

  public void a(String paramString)
  {
    this.b = paramString;
    this.e.push(paramString);
    e();
  }

  public void a(String paramString, boolean paramBoolean, int paramInt)
  {
    if (!this.e.isEmpty())
      this.e.pop();
    this.b = (this.e.isEmpty() ? "" : (String)this.e.peek());
    e();
  }

  public void a(String paramString, int paramInt)
  {
    this.a = paramString;
    this.d.push(paramString);
    e();
  }

  public void c(String paramString, int paramInt)
  {
    if (!this.d.isEmpty())
      this.d.pop();
    this.a = (this.d.isEmpty() ? "" : (String)this.d.peek());
    e();
  }

  public void a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, boolean paramBoolean)
  {
  }

  public void b(String paramString, int paramInt)
  {
  }

  public void c(String paramString)
  {
  }

  public void d(String paramString)
  {
    this.a = "";
    this.b = "";
    e();
  }

  public void a(int paramInt1, int paramInt2)
  {
  }

  public void b(int paramInt1, int paramInt2)
  {
  }

  public void c(int paramInt1, int paramInt2)
  {
  }

  public void a(g paramg)
  {
  }

  public void a(String paramString1, String paramString2, g paramg, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.o
 * JD-Core Version:    0.6.0
 */