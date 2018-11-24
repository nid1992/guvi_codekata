class A
{ void d1()
{System.out.println("method a");}
}
class B extends A
{void d2()
{System.out.println("method b");}
}
class E extends B
{void d3(){System.out.println("method e");}}
class C extends A
{void d4(){System.out.println("method c");}}
class D extends A
{void d5(){System.out.println("method d");}}
class F extends D
{void d6()
{System.out.println("method f");}
public static void main(String a[])
{F x=new F();
x.d6();
x.d5();
x.d1();
C y=new C();
y.d4();
E z=new E();
z.d3();
z.d2();
}
} 