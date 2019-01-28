### Java反射机制

#### 1 Java反射

> 我们知道反射机制允许程序在运行时取得任何一个已知名称的class的内部信息，包括包括其modifiers(修饰符)，fields(属性)，methods(方法)等，并可于运行时改变fields内容或调用methods。那么我们便可以更灵活的编写代码，代码可以在运行时装配，无需在组件之间进行源代码链接，降低代码的耦合度；还有动态代理的实现等等；但是需要注意的是反射使用不当会造成很高的资源消耗！

##### 1.1 Java反射常用API

- 获取反射中的Class对象

  > Java反射中，要获取一个类或调用一个类的方法首先获取该类的Class对象， Java API中获取Class对象有三种方法：

  - Class.forName 静态方法，前提是知道该类的全路径名时，可以用该方法获取Class类对象

    ```java
    Class clazz = Class.forName("java.lang.String");
    ```

  - .class方法， 这种方法只适合在编译前就知道操作的Class

    ```JAVA
    Class clazz = String.class;
    ```

  - 类对象的getClass()方法

    ```java
    String str = new String("Hello");
    Class clazz = str.getClass();
    ```

    

- 通过反射创建类对象

  > 通过反射创建对象主要有两种方式：通过Class对象的newInstance()方法，通过Constructor对象的newInstance()方法。

  - 通过Class对象的newInstance()方法， 通过Class对象智能使用默认的无参数构造方法

    ```JAVA
    Class class = Apple.class;
    Apple apple = (Apple) clazz.newInstance();
    ```

  - 通过Constructor对象的newInstance()方法, 通过Constructor对象创建对象可以选择特定的构造方法

    ```java
    //默认无参数构造方法
    Class clazz = Apple.class;
    Constructor constructor = clazz.getConstructor();
    Apple apple = (Apple) constructor.newInstance();
    
    //调用有参数构造方法
    Class clz = Apple.class;
    Constructor constructor = clz.getConstructor(String.class, int.class);
    Apple apple = (Apple)constructor.newInstance("红富士", 15);
    ```

- 反射获取类属性、方法、构造器

  - getFields() 方法可以获取Class类的属性，但是无法获取私有属性。

    ```java
    Class clazz = Apple.class;
    Field[] fields = clazz.getFields();
    for (Field field:fields) {
        System.out.println(field.getName());
    }
    ```

    

  - getDeclaredFields()方法可以获取包括私有属性在内的所有属性, 与获取类属性一样，当我们去获取类方法、类构造器时，如果要获取私有方法或私有构造器(私有构造器创建后需要)，则必须使用有 declared 关键字的方法。

    ```java
    Class clz = Apple.class;
    Field[] fields = clz.getDeclaredFields();
    for (Field field : fields) {
        System.out.println(field.getName());
    }
    ```

- 根据反射获取父类属性

  - 父类的私有属性值，要注意的是直接通过反射获取子类的对象是不能得到父类的属性值的，必须根据反射获得的子类 Class 对象在调用  getSuperclass() 方法获取父类对象，然后在通过父类对象去获取父类的属性值。

    