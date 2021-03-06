### 第2章 Java内存区域与内存溢出异常

#### 2.1 概述

Java将内存控制权交给Java虚拟机，为了排查内存泄漏和溢出方面的问题，需要了解虚拟机是如何使用内存的。

#### 2.2 运行时数据区域

Java SE 7中规定，Java虚拟机管理的内存包括以下运行时数据区域

![Java7虚拟机运行时数据区](E:\GIT\coffeebaby\techblog\jvm\pictures\Java7虚拟机运行时数据区.png)

##### 2.2.1 程序计数器

程序计数器线程私有，生命周期与线程相同，各个线程之间的计数器互不影响，程序计数器可以看作当前线程执行的字节码指示器。

如果线程执行的是Java方法，计数器记录正在执行的虚拟机字节码指令的地址；如果执行的是Native方法，该计数器为空（Undefined），程序计数器内存区域无OOM问题。

##### 2.2.2 Java虚拟机栈 （执行Java方法时）

Java虚拟机栈线程私有，生命周期与线程相同。

Java虚拟机栈描述Java方法执行的内存模型：

每个方法执行时都会创建一个栈帧用于存储局部变量表、操作数栈、动态链接、方法出口等。

每个方法从调用直至执行完成的过程，就对应一个栈帧在虚拟机中入栈到出栈的过程。

**局部变量表**

存放编译期可知的各种*基本数据类型*（boolean、byte、char、short、int、float、long、double）、*对象引用*（reference类型，它不等同于对象本身，可能是一个指向对象起始地址的引用指针，也可能是指向一个代表对象的句柄或其他于此对象相关的位置）和*returnAddress类型*（指向一条字节码指令的地址）

局部变量表需要的内存空间在编译期间完成分配，当进入一个方法时，这个方法需要在帧中分配多大的局部变量空间是完全确定的，在方法运行期间不会改变局部变量表的大小。

**Java虚拟机栈异常**

- StackOverflowError 线程请求的栈深度大于虚拟机所允许的深度
- OutOfMemoryError 如果虚拟机栈可以动态扩展，扩展时无法申请到足够的内存

##### 2.2.3 本地方法栈 （执行Native方法时）

本地方法栈线程私有，生命周期与线程相同。

本地方法栈与虚拟机栈发挥的作用相似。

说明：

HotSpot虚拟机将本地方法栈和虚拟机栈合二为一

**本地方法栈异常**

- StackOverflowError 线程请求的栈深度大于虚拟机所允许的深度
- OutOfMemoryError 如果虚拟机栈可以动态扩展，扩展时无法申请到足够的内存

##### 2.2.4 Java堆

Java堆是线程共享区域，虚拟机启动时创建。

Java堆的目的是存放对象实例，*几乎所有*的对象实例都在Java堆中分配内存。

Java堆是垃圾回收的主要区域。

- 内存回收角度

  现在的收集器基本都采用分代收集算法，因而Java堆细分为：新生代和老年代，再细化Eden空间、From Survivor空间、To Survivor空间等，详细的后面讨论分代收集算法再说。

- 内存分配角度

  线程共享的Java堆中可能分出多个线程私有的分配缓冲区（Thread Local Allocation Buffer，TLAB）。

  

  以上是两种内存划分角度，进一步划分区域的目的就是为更好的回收内存，或者更快的分配内存

目前主流的虚拟机都是按照可扩展来实现的（-Xmx和-Xms控制），如果堆中没有内存完成实例分配，并且堆无法再扩展，将抛出OOM异常。

##### 2.2.5 方法区

方法区是线程共享区域。

方法区用于存储已经虚拟机加载的类信息、常量、静态变量、即时编译器编译后的代码等数据。

方法区无法满足内存分配需求的时候，将抛出OOM异常。



**运行时常量池**

方法区的一部分。

Class文件中除了有类的版本、字段、方法、接口等描述信息外，还有一项信息是常量池，用于存放编译期生成的各种字面量和符号引用，这部分内容将在类加载后进入方法区的运行时常量池中存放。

#### 2.3 HotSpot虚拟机对象探秘

细节讨论需要限定在具体的虚拟机和某个内存区域，如HotSpot虚拟机和常用的内存区域Java堆。

##### 2.3.1 对象创建

虚拟机中的对象创建



