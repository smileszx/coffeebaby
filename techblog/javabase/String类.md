

[Java-String.intern的深入研究](https://www.cnblogs.com/Kidezyq/p/8040338.html)

### 1 String.intern()

[画图理解String.intern()](https://blog.csdn.net/soonfly/article/details/70147205)

[String.intern()  JDK1.8](https://blog.csdn.net/u013366617/article/details/83618361)

#### 1.1 new String("xxx")

> new String 是在堆上创建字符串对象，当调用intern()方法时，编译器会将字符串添加到常量池中（string Table维护），并返回指向该常量的引用。

#### 1.2 通过字面量赋值创建String字符串，如String s = “XXX”

> 先在常量池中查找是否存在相同的字符串，若存在，则将栈中的引用直接指向该字符串；若不存在，则在常量池中生成一个字符串，再将栈中的引用指向该字符串。

#### 1.3 常量字符串的“+”

> 编译阶段直接会合成为一个字符串。如string str=”JA”+”VA”，在编译阶段会直接合并成语句String str=”JAVA”，于是会去常量池中查找是否存在”JAVA”,从而进行创建或引用。

#### 1.4 final 关键字修饰

> 对于final字段，编译期直接进行了常量替换（而对于非final字段则是在运行期进行赋值处理的）。

#### 1.5 常量字符串和变量拼接时（如：String str3=baseStr + “01”;）

> 会调用stringBuilder.append()在堆上创建新的对象。