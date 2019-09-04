package com.zend.ide.cb.a;

import com.zend.ide.cb.c.w;
import com.zend.ide.cb.f;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.cb.v;
import com.zend.ide.cb.z;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.d.a;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.Format;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

public class ae extends DefaultTableModel
{
  private static j a = new j(null);
  private ResultSet b;
  private ResultSetMetaData c;
  private int d;
  private int e;
  private boolean f;
  private ArrayList g;
  private ArrayList h;
  private boolean i;
  private int j;
  private HashMap k;
  private a l;
  private boolean m;
  private boolean o;
  private boolean p;
  private boolean q;
  private Set r;
  private boolean s;
  private v t;
  private String u;
  private q v;
  private String w;
  private int x;
  private w n;

  public ae(boolean paramBoolean1, boolean paramBoolean2, w paramw)
  {
    this.n = paramw;
    this.k = new HashMap();
    this.l = new a();
    this.o = paramBoolean1;
    this.p = paramBoolean2;
    this.s = (System.getProperty("sqlDebug") != null);
  }

  public void a(z paramz, int paramInt, v paramv, boolean paramBoolean)
    throws SQLException
  {
    this.d = 0;
    if (paramz == null)
      return;
    if (paramz.a() != this.b)
    {
      a();
      this.l.c();
      this.w = null;
      this.v = null;
      this.u = null;
      this.i = false;
      this.b = paramz.a();
      this.p = ((this.p) && (this.b.getConcurrency() == 1008));
      this.c = this.b.getMetaData();
      this.e = this.c.getColumnCount();
      if (this.o)
        this.e += 1;
      this.t = paramv;
      if (this.t != null)
      {
        this.v = paramv.c();
        this.u = paramv.a().a();
        if (this.v.k())
          this.w = paramv.b().a();
      }
      else
      {
        this.v = null;
        this.w = null;
        this.u = null;
      }
      a(this.t);
      d();
      i();
      this.f = (this.b.getType() != 1003);
      fireTableStructureChanged();
    }
    else
    {
      fireTableDataChanged();
    }
    e();
    this.m = ((paramBoolean) || (!this.f));
    int i1 = paramz.b();
    int i2 = paramz.c();
    try
    {
      if ((this.f) && (this.b.isBeforeFirst()) && (i1 != i2))
        this.x = (i2 - i1);
      else
        this.x = 0;
    }
    catch (SQLException localSQLException)
    {
      this.x = (i2 - i1);
    }
    this.j = (i1 + 1);
    if ((this.f) && (!this.m))
    {
      int i3 = paramInt > 0 ? paramInt : 2147483647;
      if (i2 > 0)
        this.b.next();
      while ((this.b.next()) && (i3-- > 0))
        this.d += 1;
    }
    else
    {
      if (paramInt > 0)
        this.g = b(paramInt);
      else
        this.g = b(2147483647);
      if (this.m)
        this.h = this.g;
    }
    fireTableDataChanged();
  }

  public boolean a()
  {
    return this.m;
  }

  public void a(int paramInt)
    throws SQLException
  {
    if ((this.m) && (this.h != null) && (this.h.size() > 0))
      return;
    this.m = true;
    if (this.h == null)
      this.h = new ArrayList();
    if ((this.g != null) && (this.g.size() > 0))
    {
      this.h = this.g;
    }
    else
    {
      int i1 = this.b.getRow();
      int i2 = i1 - paramInt - 1;
      if (i2 > 0)
        this.b.absolute(i2);
      else
        this.b.beforeFirst();
      this.d = 0;
      this.h = b(paramInt);
    }
  }

  public void a()
  {
    if (this.b != null)
      try
      {
        this.b.close();
      }
      catch (SQLException localSQLException)
      {
      }
  }

  public boolean b()
  {
    return (this.p) && (d());
  }

  public boolean c()
  {
    return this.q;
  }

  public boolean a(boolean paramBoolean)
  {
    if (b())
    {
      this.q = paramBoolean;
      return true;
    }
    return false;
  }

  public boolean d()
  {
    return this.r.size() > 0;
  }

  public boolean e()
  {
    return this.t != null;
  }

  private void d()
    throws SQLException
  {
    String[] arrayOfString = new String[this.e];
    int i1 = 0;
    int i2 = 1;
    if (this.o)
      arrayOfString[(i1++)] = " ";
    while (i1 < this.e)
    {
      arrayOfString[i1] = this.c.getColumnName(i2++);
      if (arrayOfString[i1] != null)
      {
        if (a(arrayOfString[i1].toUpperCase()))
          arrayOfString[i1] = (arrayOfString[i1] + " [PRI]");
      }
      else
        arrayOfString[i1] = " ";
      i1++;
    }
    setColumnIdentifiers(arrayOfString);
  }

  private void e()
  {
    if (this.g == null)
      this.g = new ArrayList(50);
    else
      this.g.clear();
    if (this.h == null)
      this.h = new ArrayList(50);
    else
      this.h.clear();
  }

  private ArrayList b(int paramInt)
  {
    e();
    ArrayList localArrayList = new ArrayList();
    int i1 = paramInt;
    int i2 = 0;
    try
    {
      if ((!this.f) && (this.b.getRow() == 0))
        i2 = 1;
      i2 = (i2 != 0) || ((this.f) && (this.b.isBeforeFirst())) ? 1 : 0;
      if ((i2 == 0) && (this.b.getRow() != 0))
        if (this.b.next())
        {
          a(localArrayList);
          i1--;
        }
        else
        {
          return localArrayList;
        }
      while ((i1 > 0) && (this.b.next()))
      {
        a(localArrayList);
        i1--;
      }
    }
    catch (SQLException localSQLException)
    {
      if (this.s)
      {
        System.out.println("SQLException in loadResults");
        localSQLException.printStackTrace();
      }
    }
    return localArrayList;
  }

  private void a(ArrayList paramArrayList)
    throws SQLException
  {
    Object[] arrayOfObject = new Object[this.e];
    int i1;
    if ((this.o) && (this.e > 0))
    {
      arrayOfObject[0] = new lb(this.d + this.j);
      for (i1 = 1; i1 < this.e; i1++)
      {
        Class localClass = getColumnClass(i1);
        if ((localClass == Blob.class) || (localClass == Clob.class))
          try
          {
            Object localObject;
            if (localClass == Blob.class)
            {
              localObject = this.b.getBlob(i1);
              if (localObject == null)
                arrayOfObject[i1] = null;
              else
                arrayOfObject[i1] = new rc((Blob)localObject);
            }
            else
            {
              localObject = this.b.getClob(i1);
              if (localObject == null)
                arrayOfObject[i1] = null;
              else
                arrayOfObject[i1] = new vc((Clob)localObject);
            }
          }
          catch (SQLException localSQLException1)
          {
            try
            {
              arrayOfObject[i1] = this.b.getBytes(i1);
            }
            catch (SQLException localSQLException2)
            {
              arrayOfObject[i1] = this.b.getObject(i1);
              a(i1 + 1, Object.class);
            }
          }
        else
          arrayOfObject[i1] = this.b.getObject(i1);
      }
    }
    else
    {
      for (i1 = 0; i1 < this.e; i1++)
        arrayOfObject[i1] = this.b.getObject(i1 + 1);
    }
    paramArrayList.add(arrayOfObject);
    this.d += 1;
  }

  public boolean f()
  {
    if (this.b == null)
      return false;
    return this.f;
  }

  public void a(int paramInt, Class paramClass)
  {
    this.k.put(Integer.toString(paramInt), paramClass);
  }

  public Class getColumnClass(int paramInt)
  {
    if ((this.o) && (paramInt == 0))
      return lb.class;
    if (this.k.containsKey(Integer.toString(paramInt + 1)))
      return (Class)this.k.get(Integer.toString(paramInt + 1));
    return c(paramInt + 1);
  }

  private Class c(int paramInt)
  {
    if (this.c != null)
      try
      {
        String str = this.c.getColumnClassName(paramInt + 1);
        if (str.startsWith("class "))
          str = str.substring(6).trim();
        Class localClass = getClass().getClassLoader().loadClass(str);
        return localClass;
      }
      catch (Exception localException)
      {
      }
    return Object.class;
  }

  public int getRowCount()
  {
    return this.d;
  }

  public int getColumnCount()
  {
    return this.e;
  }

  public Object getValueAt(int paramInt1, int paramInt2)
  {
    if (this.i)
      return null;
    if (this.m)
      return a(this.h, paramInt1, paramInt2);
    if (this.l.a(this.e * paramInt2 + paramInt1))
    {
      Object localObject = this.l.b(this.e * paramInt2 + paramInt1);
      if (localObject == a)
        return null;
      return localObject;
    }
    if (this.f)
    {
      if (this.b != null)
      {
        if (this.o)
        {
          if (paramInt2 == 0)
            return new lb(paramInt1 + this.j);
          paramInt2--;
        }
        try
        {
          this.b.absolute(this.j + paramInt1 + this.x);
          return this.b.getObject(paramInt2 + 1);
        }
        catch (SQLException localSQLException)
        {
          this.i = true;
          if (this.s)
          {
            cl.a(localSQLException);
            localSQLException.printStackTrace();
          }
        }
      }
      else
      {
        return null;
      }
    }
    else
      return a(this.g, paramInt1, paramInt2);
    return null;
  }

  public void setValueAt(Object paramObject, int paramInt1, int paramInt2)
  {
    if (this.s)
      System.out.println("setValueAt::aValue = " + paramObject + " [" + paramObject.getClass().getName() + ']');
    int i1 = paramInt2;
    if (this.b != null)
    {
      if (this.o)
        i1--;
      if ((paramObject != null) && (paramObject.toString().equalsIgnoreCase("(null)")))
        paramObject = null;
      Object localObject1 = getValueAt(paramInt1, paramInt2);
      if ((localObject1 == null) && (paramObject != null) && (paramObject.toString().equals("")))
        return;
      if ((localObject1 != paramObject) && (((localObject1 != null) && (!localObject1.equals(paramObject))) || ((paramObject != null) && (!paramObject.equals(localObject1)))))
        try
        {
          if (this.s)
            System.out.println("Trying to update " + localObject1 + " to " + paramObject);
          g();
          synchronized (this.b)
          {
            if (this.b.absolute(this.j + paramInt1 + this.x))
            {
              a(i1 + 1, paramObject);
            }
            else
            {
              if (this.s)
                System.out.println("setValueAt :: Could not move cursor to absolute row #" + (this.j + paramInt1 + this.x) + "\nResultSet row = " + this.b.getRow());
              return;
            }
          }
          if (paramObject == null)
            paramObject = a;
          this.l.a(this.e * paramInt2 + paramInt1, paramObject);
          if (this.s)
            System.out.println("Update successful");
        }
        catch (SQLException localSQLException)
        {
          if (this.v != null)
          {
            if (this.v.a(true, true))
              this.n.a(this.v, localSQLException, true);
          }
          else
            this.n.a(ct.a(94) + ": --> " + localSQLException.getMessage(), true);
        }
    }
  }

  private void g()
    throws SQLException
  {
    this.v.a(this.u, this.w);
  }

  private void a(int paramInt, Object paramObject)
    throws SQLException
  {
    int i1 = 12;
    try
    {
      i1 = this.c.getColumnType(paramInt);
    }
    catch (Throwable localThrowable)
    {
      cl.a(localThrowable);
      localThrowable.printStackTrace();
    }
    if (paramObject == null)
    {
      this.b.updateNull(paramInt);
    }
    else
    {
      try
      {
        paramObject = a(paramObject, i1, null);
      }
      catch (ParseException localParseException)
      {
      }
      switch (i1)
      {
      case -1:
      case 1:
      case 12:
        this.b.updateString(paramInt, (String)paramObject);
        break;
      case -6:
        this.b.updateByte(paramInt, ((Byte)paramObject).byteValue());
        break;
      case 5:
        this.b.updateShort(paramInt, ((Short)paramObject).shortValue());
        break;
      case 4:
        this.b.updateInt(paramInt, ((Integer)paramObject).intValue());
        break;
      case -5:
        this.b.updateLong(paramInt, ((Long)paramObject).longValue());
        break;
      case 6:
      case 8:
        this.b.updateDouble(paramInt, ((Double)paramObject).doubleValue());
        break;
      case 2:
      case 3:
        this.b.updateBigDecimal(paramInt, (BigDecimal)paramObject);
        break;
      case -7:
      case 16:
        this.b.updateBoolean(paramInt, ((Boolean)paramObject).booleanValue());
        break;
      case -4:
      case -3:
        this.b.updateBytes(paramInt, (byte[])(byte[])paramObject);
        break;
      case 2004:
        this.b.updateBlob(paramInt, (Blob)paramObject);
        break;
      case 2005:
        this.b.updateClob(paramInt, (Clob)paramObject);
        break;
      case 91:
        this.b.updateDate(paramInt, (java.sql.Date)paramObject);
        break;
      case 92:
        this.b.updateTime(paramInt, (Time)paramObject);
        break;
      case 93:
        this.b.updateTimestamp(paramInt, (Timestamp)paramObject);
        break;
      default:
        this.b.updateObject(paramInt, paramObject);
      }
    }
    this.b.updateRow();
  }

  public boolean h()
  {
    return this.o;
  }

  public byte[] a(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = null;
    if ((!a()) && (f()))
    {
      try
      {
        int i1 = this.b.getRow();
        this.b.absolute(paramInt1 + 1);
        arrayOfByte = this.b.getBytes(paramInt2 + 1);
        this.b.absolute(i1);
      }
      catch (SQLException localSQLException)
      {
        cl.a(localSQLException);
      }
    }
    else
    {
      if (a())
      {
        int i2 = h() ? 1 : 0;
        Object localObject = a(this.h, paramInt1, paramInt2 + i2);
        if ((localObject instanceof xc))
          try
          {
            return ((xc)localObject).a();
          }
          catch (Throwable localThrowable)
          {
            if (this.s)
              localThrowable.printStackTrace();
            return new byte[0];
          }
        if ((localObject instanceof byte[]))
          return (byte[])(byte[])localObject;
        return new byte[0];
      }
      if (this.s)
        System.out.println("Non scrollable results are not supported");
    }
    return arrayOfByte == null ? new byte[0] : arrayOfByte;
  }

  public boolean a(String paramString)
  {
    return this.r.contains(paramString);
  }

  private Object a(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    if (paramArrayList != null)
    {
      if ((paramInt1 < this.d) && (paramInt2 < this.e) && (paramArrayList.size() > paramInt1))
        return ((Object[])(Object[])paramArrayList.get(paramInt1))[paramInt2];
      return null;
    }
    return null;
  }

  private void a(v paramv)
    throws SQLException
  {
    if (this.r == null)
      this.r = new HashSet();
    else
      this.r.clear();
    if (paramv != null)
    {
      this.r = paramv.f();
      if ((this.s) && (this.r.size() > 0))
        System.out.println("Loaded primary keys from " + paramv + ": " + this.r);
    }
  }

  private void i()
  {
    if (this.c == null)
      return;
    this.k.clear();
    int i1 = 1;
    if (this.o)
    {
      a(1, lb.class);
      i1++;
    }
    int i2 = 1;
    for (int i3 = i1; i3 <= this.e; i3++)
    {
      int i4 = 12;
      try
      {
        i4 = this.c.getColumnType(i2++);
      }
      catch (Throwable localThrowable)
      {
        cl.a(localThrowable);
        localThrowable.printStackTrace();
      }
      switch (i4)
      {
      case 91:
        a(i3, java.sql.Date.class);
        break;
      case -6:
      case 5:
        a(i3, Integer.class);
        break;
      case 93:
        a(i3, Timestamp.class);
        break;
      case 92:
        a(i3, Time.class);
        break;
      case 2:
      case 3:
      case 7:
        a(i3, Double.class);
        break;
      case -5:
        a(i3, BigInteger.class);
        break;
      case -7:
      case 16:
        a(i3, Boolean.class);
        break;
      case 8:
        a(i3, Double.class);
        break;
      case 6:
        a(i3, Float.class);
        break;
      case 4:
        a(i3, Integer.class);
        break;
      case -4:
      case -3:
      case -2:
        a(i3, Blob.class);
        break;
      case -1:
      case 1:
      case 12:
        try
        {
          if (this.c.getColumnClassName(i2 - 1).indexOf("Clob") > -1)
          {
            a(i3, Clob.class);
            continue;
          }
        }
        catch (Exception localException)
        {
        }
        a(i3, String.class);
        break;
      case 2004:
        a(i3, Blob.class);
        break;
      case 2005:
        a(i3, Clob.class);
        break;
      case 2006:
        a(i3, Ref.class);
        break;
      case 2003:
        a(i3, Array.class);
        break;
      case 2001:
        break;
      default:
        a(i3, c(i3));
      }
    }
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    if ((c()) && (b()))
    {
      Class localClass = getColumnClass(paramInt2);
      if ((localClass == Blob.class) || (localClass == Clob.class))
        return false;
      return (!this.o) || (paramInt2 != 0);
    }
    return false;
  }

  public static Object a(Object paramObject, int paramInt, Format paramFormat)
    throws ParseException
  {
    if (paramObject == null)
      throw new IllegalArgumentException("null");
    Number localNumber5;
    Object localObject7;
    switch (paramInt)
    {
    case -1:
    case 1:
    case 12:
      return paramObject.toString();
    case -6:
      Object localObject1;
      if ((paramObject instanceof Number))
      {
        if ((paramObject instanceof Byte))
          return paramObject;
        localObject1 = (Number)paramObject;
        return new Byte(((Number)localObject1).byteValue());
      }
      try
      {
        localObject1 = paramObject.toString().trim();
        if (((String)localObject1).length() == 0)
          localObject1 = "0";
        byte b1 = Byte.parseByte((String)localObject1);
        return new Byte(b1);
      }
      catch (Throwable localThrowable1)
      {
        if (paramFormat == null)
          throw new IllegalArgumentException(paramObject.toString());
        Number localNumber1 = (Number)paramFormat.parseObject(paramObject.toString());
        return new Byte(localNumber1.byteValue());
      }
    case 5:
      Object localObject2;
      if ((paramObject instanceof Number))
      {
        if ((paramObject instanceof Short))
          return paramObject;
        localObject2 = (Number)paramObject;
        return new Short(((Number)localObject2).shortValue());
      }
      if ((paramObject instanceof Boolean))
      {
        localObject2 = (Boolean)paramObject;
        return new Short((short)(((Boolean)localObject2).booleanValue() ? 1 : 0));
      }
      try
      {
        localObject2 = paramObject.toString().trim();
        if (((String)localObject2).length() == 0)
          localObject2 = "0";
        short s1 = Short.parseShort((String)localObject2);
        return new Short(s1);
      }
      catch (Throwable localThrowable2)
      {
        if (paramFormat == null)
          throw new IllegalArgumentException(paramObject.toString());
        Number localNumber2 = (Number)paramFormat.parseObject(paramObject.toString());
        return new Short(localNumber2.shortValue());
      }
    case 4:
      Object localObject3;
      if ((paramObject instanceof Number))
      {
        if ((paramObject instanceof Integer))
          return paramObject;
        localObject3 = (Number)paramObject;
        return new Integer(((Number)localObject3).intValue());
      }
      try
      {
        localObject3 = paramObject.toString().trim();
        if (((String)localObject3).length() == 0)
          localObject3 = "0";
        int i1 = Integer.parseInt((String)localObject3);
        return new Integer(i1);
      }
      catch (Throwable localThrowable3)
      {
        if (paramFormat == null)
          throw new IllegalArgumentException(paramObject.toString().trim());
        Number localNumber3 = (Number)paramFormat.parseObject(paramObject.toString());
        return new Integer(localNumber3.intValue());
      }
    case -5:
      Object localObject4;
      if ((paramObject instanceof Number))
      {
        if ((paramObject instanceof Long))
          return paramObject;
        localObject4 = (Number)paramObject;
        return new Long(((Number)localObject4).longValue());
      }
      try
      {
        localObject4 = paramObject.toString().trim();
        if (((String)localObject4).length() == 0)
          localObject4 = "0";
        long l1 = Long.parseLong((String)localObject4);
        return new Long(l1);
      }
      catch (Throwable localThrowable4)
      {
        if (paramFormat == null)
          throw new IllegalArgumentException(paramObject.toString());
        Number localNumber4 = (Number)paramFormat.parseObject(paramObject.toString());
        return new Long(localNumber4.longValue());
      }
    case 6:
    case 8:
      Object localObject5;
      if ((paramObject instanceof Number))
      {
        if ((paramObject instanceof Double))
          return paramObject;
        localObject5 = (Number)paramObject;
        return new Double(((Number)localObject5).doubleValue());
      }
      try
      {
        localObject5 = paramObject.toString().trim();
        if (((String)localObject5).length() == 0)
          localObject5 = "0";
        double d1 = Double.parseDouble((String)localObject5);
        return new Double(d1);
      }
      catch (Throwable localThrowable5)
      {
        if (paramFormat == null)
          throw new IllegalArgumentException(paramObject.toString());
        localNumber5 = (Number)paramFormat.parseObject(paramObject.toString());
        return new Double(localNumber5.doubleValue());
      }
    case 2:
    case 3:
      Object localObject6;
      if ((paramObject instanceof Number))
      {
        if ((paramObject instanceof BigDecimal))
          return paramObject;
        localObject6 = (Number)paramObject;
        return new BigDecimal(((Number)localObject6).doubleValue());
      }
      try
      {
        localObject6 = paramObject.toString().trim();
        if (((String)localObject6).length() == 0)
          localObject6 = "0";
        return new BigDecimal((String)localObject6);
      }
      catch (Throwable localThrowable6)
      {
        if (paramFormat == null)
          throw new IllegalArgumentException(paramObject.toString());
        localNumber5 = (Number)paramFormat.parseObject(paramObject.toString());
        return new BigDecimal(localNumber5.doubleValue());
      }
    case -7:
    case 16:
      if ((paramObject instanceof Boolean))
        return paramObject;
      try
      {
        return Boolean.valueOf(paramObject.toString());
      }
      catch (Throwable localThrowable7)
      {
        if (paramFormat == null)
          throw new IllegalArgumentException(paramObject.toString());
        return (Boolean)paramFormat.parseObject(paramObject.toString());
      }
    case -4:
    case -3:
      if ((paramObject instanceof byte[]))
        return paramObject;
      if ((paramObject instanceof Blob))
        try
        {
          Blob localBlob = (Blob)paramObject;
          return localBlob.getBytes(0L, (int)localBlob.length());
        }
        catch (SQLException localSQLException1)
        {
          return paramObject.toString().getBytes();
        }
      if ((paramObject instanceof Clob))
        try
        {
          Clob localClob = (Clob)paramObject;
          return localClob.getSubString(0L, (int)localClob.length()).getBytes();
        }
        catch (SQLException localSQLException2)
        {
          return paramObject.toString().getBytes();
        }
      if (paramFormat == null)
        return paramObject.toString().getBytes();
      return (byte[])(byte[])paramFormat.parseObject(paramObject.toString());
    case 2004:
    case 2005:
      return paramObject;
    case 91:
      if ((paramObject instanceof java.util.Date))
      {
        localObject7 = (java.util.Date)paramObject;
        return new java.sql.Date(((java.util.Date)localObject7).getTime());
      }
      if ((paramObject instanceof Number))
      {
        localObject7 = (Number)paramObject;
        return new java.sql.Date(((Number)localObject7).longValue());
      }
      if (paramFormat == null)
        throw new IllegalArgumentException(paramObject.toString());
      localObject7 = (java.util.Date)paramFormat.parseObject(paramObject.toString());
      return new java.sql.Date(((java.util.Date)localObject7).getTime());
    case 92:
      if ((paramObject instanceof Time))
        return paramObject;
      if ((paramObject instanceof java.sql.Date))
      {
        localObject7 = (java.util.Date)paramObject;
        return new Time(((java.util.Date)localObject7).getTime());
      }
      if ((paramObject instanceof Number))
      {
        localObject7 = (Number)paramObject;
        return new Time(((Number)localObject7).longValue());
      }
      if (paramFormat == null)
        throw new IllegalArgumentException(paramObject.toString());
      localObject7 = (java.util.Date)paramFormat.parseObject(paramObject.toString());
      return new Time(((java.util.Date)localObject7).getTime());
    case 93:
      if ((paramObject instanceof Time))
        return paramObject;
      if ((paramObject instanceof java.util.Date))
      {
        localObject7 = (java.util.Date)paramObject;
        return new Timestamp(((java.util.Date)localObject7).getTime());
      }
      if ((paramObject instanceof Number))
      {
        localObject7 = (Number)paramObject;
        return new Timestamp(((Number)localObject7).longValue());
      }
      if (paramFormat == null)
        throw new IllegalArgumentException(paramObject.toString());
      localObject7 = (java.util.Date)paramFormat.parseObject(paramObject.toString());
      return new Timestamp(((java.util.Date)localObject7).getTime());
    }
    return paramObject;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.ae
 * JD-Core Version:    0.6.0
 */