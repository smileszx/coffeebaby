## Java 创建对象



> Spring 框架作为开发基础，程序员可以不用关心对象的创建过程，美哉！但是我们作为程序员还是要关心一下最基础的知识，如果我们想要创建一个Java对象有哪些方式呢？

### 1 new关键字

> 最常见的创建对象方式，其原理是通过构造函数（单例模式比较特殊，但是其类内部创建对象还是通过new关键字），构造函数包括无参数和有参数。

### 2 Class类的newInstance方法

> Class类的newInstance方式，其实本质上是调用类的默认无参构造方法。

### 3 Constructor类的newInstance方法

> java.lang.reflect.Constructor类里newInstance方法可以创建对象。我们可以通过这个newInstance方法调用有参数的和私有的构造函数。

### 4 clone方法

> 使用clone方式创建对象，首先要保证被创建的对象实现Cloneable接口并实现其定义的clone方法。无论何时我们调用一个对象的clone方法，JVM就会创建一个新的对象，将前面对象的内容全部拷贝进去。用clone方法创建对象并不会调用任何构造函数。

### 5 反序列化

> 序列化和反序列化一个对象，JVM会给我们创建一个单独的对象。在反序列化时，JVM创建对象并不会调用任何构造函数。为了反序列化一个对象，我们需要让类实现Serializable接口



> - **Class类和Constructor类两种newInstance方法区别：**
>
> 1. 从包名看，Class类位于java的lang包中，而构造器类是java反射机制的一部分。
>
> 2. 实现上，Class类的newInstance只触发无参数的构造方法创建对象，而构造器类的newInstance能触发有参数或者任意参数的构造方法。
>
> 3. Class类的newInstance需要其构造方法是公有的或者对调用方法可见的，而构造器类的newInstance可以在特定环境下调用私有构造方法来创建对象。
>
> 4. Class类的newInstance抛出类构造函数的异常，而构造器类的newInstance包装了一个InvocationTargetException异常。这是封装了一次的结果。即Class类本质上调用了反射包构造器类中无参数的newInstance方法，捕获了InvocationTargetException，将构造器本身的异常抛出。





