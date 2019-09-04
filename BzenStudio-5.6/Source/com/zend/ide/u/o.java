package com.zend.ide.u;

class o
{
  static final String a = null;
  String b;
  String c;
  int d;
  long e;
  long f;
  o[] g;

  o(String paramString1, String paramString2, int paramInt, long paramLong1, long paramLong2)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramInt;
    this.e = paramLong1;
    this.f = paramLong2;
  }

  o(String paramString)
  {
    this(paramString, a, 0, -1L, 1L);
  }

  o()
  {
    this(null);
  }

  public String toString()
  {
    return super.toString() + " fileName=" + this.b + " targetFileName=" + this.c + " booleanAttributes=" + this.d + " length=" + this.e + " lastModified=" + this.f;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.o
 * JD-Core Version:    0.6.0
 */