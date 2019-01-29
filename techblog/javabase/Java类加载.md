### Java类加载



#### 1 Java类加载最终产物

Java源文件 => Javac编译器 => Class文件 => ClassLoader类加载器



```java
//javap是 Java class文件分解器，可以反编译（即对javac编译的文件进行反编译），也可以查看java编译器生成的字节码。用于分解class文件。
javap -v ClazzLoadTest.class


Classfile /E:/GIT/coffeebaby/java-design-pattern/target/classes/com/coffee/baby/classloader/ClazzLoadTest.class
  Last modified 2019-1-28; size 1172 bytes
  MD5 checksum 3d47fa5598a513af822fff2bf6a0195f
  Compiled from "ClazzLoadTest.java"
public class com.coffee.baby.classloader.ClazzLoadTest
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #14.#38        // java/lang/Object."<init>":()V
   #2 = Class              #39            // com/coffee/baby/classloader/ChildClazz
   #3 = Methodref          #2.#38         // com/coffee/baby/classloader/ChildClazz."<init>":()V
   #4 = String             #40            // com.coffee.baby.classloader.ChildClazz
   #5 = Methodref          #41.#42        // java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
   #6 = Class              #43            // java/lang/ClassNotFoundException
   #7 = Methodref          #6.#44         // java/lang/ClassNotFoundException.printStackTrace:()V
   #8 = Fieldref           #45.#46        // java/lang/System.out:Ljava/io/PrintStream;
   #9 = Fieldref           #2.#47         // com/coffee/baby/classloader/ChildClazz.value:I
  #10 = Methodref          #48.#49        // java/io/PrintStream.println:(I)V
  #11 = Integer            100000
  #12 = Fieldref           #2.#50         // com/coffee/baby/classloader/ChildClazz.random:I
  #13 = Class              #51            // com/coffee/baby/classloader/ClazzLoadTest
  #14 = Class              #52            // java/lang/Object
  #15 = Utf8               <init>
  #16 = Utf8               ()V
  #17 = Utf8               Code
  #18 = Utf8               LineNumberTable
  #19 = Utf8               LocalVariableTable
  #20 = Utf8               this
  #21 = Utf8               Lcom/coffee/baby/classloader/ClazzLoadTest;
  #22 = Utf8               main
  #23 = Utf8               ([Ljava/lang/String;)V
  #24 = Utf8               e
  #25 = Utf8               Ljava/lang/ClassNotFoundException;
  #26 = Utf8               args
  #27 = Utf8               [Ljava/lang/String;
  #28 = Utf8               childClazz
  #29 = Utf8               Lcom/coffee/baby/classloader/ChildClazz;
  #30 = Utf8               childClazzes
  #31 = Utf8               [Lcom/coffee/baby/classloader/ChildClazz;
  #32 = Utf8               StackMapTable
  #33 = Class              #27            // "[Ljava/lang/String;"
  #34 = Class              #39            // com/coffee/baby/classloader/ChildClazz
  #35 = Class              #43            // java/lang/ClassNotFoundException
  #36 = Utf8               SourceFile
  #37 = Utf8               ClazzLoadTest.java
  #38 = NameAndType        #15:#16        // "<init>":()V
  #39 = Utf8               com/coffee/baby/classloader/ChildClazz
  #40 = Utf8               com.coffee.baby.classloader.ChildClazz
  #41 = Class              #53            // java/lang/Class
  #42 = NameAndType        #54:#55        // forName:(Ljava/lang/String;)Ljava/lang/Class;
  #43 = Utf8               java/lang/ClassNotFoundException
  #44 = NameAndType        #56:#16        // printStackTrace:()V
  #45 = Class              #57            // java/lang/System
  #46 = NameAndType        #58:#59        // out:Ljava/io/PrintStream;
  #47 = NameAndType        #60:#61        // value:I
  #48 = Class              #62            // java/io/PrintStream
  #49 = NameAndType        #63:#64        // println:(I)V
  #50 = NameAndType        #65:#61        // random:I
  #51 = Utf8               com/coffee/baby/classloader/ClazzLoadTest
  #52 = Utf8               java/lang/Object
  #53 = Utf8               java/lang/Class
  #54 = Utf8               forName
  #55 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;
  #56 = Utf8               printStackTrace
  #57 = Utf8               java/lang/System
  #58 = Utf8               out
  #59 = Utf8               Ljava/io/PrintStream;
  #60 = Utf8               value
  #61 = Utf8               I
  #62 = Utf8               java/io/PrintStream
  #63 = Utf8               println
  #64 = Utf8               (I)V
  #65 = Utf8               random
{
  public com.coffee.baby.classloader.ClazzLoadTest();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 8: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/coffee/baby/classloader/ClazzLoadTest;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=1
         0: new           #2                  // class com/coffee/baby/classloader/ChildClazz
         3: dup
         4: invokespecial #3                  // Method com/coffee/baby/classloader/ChildClazz."<init>":()V
         7: astore_1
         8: ldc           #4                  // String com.coffee.baby.classloader.ChildClazz
        10: invokestatic  #5                  // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        13: astore_2
        14: goto          22
        17: astore_2
        18: aload_2
        19: invokevirtual #7                  // Method java/lang/ClassNotFoundException.printStackTrace:()V
        22: getstatic     #8                  // Field java/lang/System.out:Ljava/io/PrintStream;
        25: getstatic     #9                  // Field com/coffee/baby/classloader/ChildClazz.value:I
        28: invokevirtual #10                 // Method java/io/PrintStream.println:(I)V
        31: bipush        10
        33: anewarray     #2                  // class com/coffee/baby/classloader/ChildClazz
        36: astore_2
        37: getstatic     #8                  // Field java/lang/System.out:Ljava/io/PrintStream;
        40: ldc           #11                 // int 100000
        42: invokevirtual #10                 // Method java/io/PrintStream.println:(I)V
        45: getstatic     #8                  // Field java/lang/System.out:Ljava/io/PrintStream;
        48: getstatic     #12                 // Field com/coffee/baby/classloader/ChildClazz.random:I
        51: invokevirtual #10                 // Method java/io/PrintStream.println:(I)V
        54: return
      Exception table:
         from    to  target type
             8    14    17   Class java/lang/ClassNotFoundException
      LineNumberTable:
        line 12: 0
        line 17: 8
        line 20: 14
        line 18: 17
        line 19: 18
        line 26: 22
        line 29: 31
        line 32: 37
        line 35: 45
        line 36: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       4     2     e   Ljava/lang/ClassNotFoundException;
            0      55     0  args   [Ljava/lang/String;
            8      47     1 childClazz   Lcom/coffee/baby/classloader/ChildClazz;
           37      18     2 childClazzes   [Lcom/coffee/baby/classloader/ChildClazz;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class "[Ljava/lang/String;", class com/coffee/baby/classloader/ChildClazz ]
          stack = [ class java/lang/ClassNotFoundException ]
        frame_type = 4 /* same */
}
SourceFile: "ClazzLoadTest.java"

```



#### 2 类加载的三个阶段

##### 2.1 加载

> 查找并且加载类的二进制数据

##### 2.2 链接

- 验证 

  > 确保被加载类的正确性

- 准备

  > 为类的静态变量分配内存，并将其初始化为默认值

- 解析

  > 把类中的符号引用转换为直接引用

##### 2.3 为类的静态变量赋予正确的初始值

