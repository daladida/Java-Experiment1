# Java-
Java课程作业项目仓库

#阅读程序

## 实验内容
   用类描述计算机中CPU的速度和硬盘的容量，并且在Java应用程序中添加4个类，名字分别是PC、CPU、HardDisk和Test,其中Text是主类。类中还需要定义不少于两个构造方法；每个类定义不少于2个属性，且属性的类型多样化。根据课堂中关于访问权限的内容，定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断。把本次实验的多个类放置在不同的包中，体会修饰符private的用法。

## 实验方法
   CPU类有getSpeed()返回speed的值，setSpeed(int m)方法将参数m的值赋值给speed;HardDisk类中getAmount()返回amount的值，setAmount(int m)方法将参数m的值赋值给amount;PC类中setCPU(CPU c)将参数c的值赋值给cpu，setHardDisk(HardDisk h)方法将参数h的值赋值给HD，show()方法能显示cpu的速度和硬盘容量。
   在主Test类中  
   (1、main方法中创建一个CPU对象cpu，cpu将speed设置为2200  
   (2、main方法中创建一个HardDisk对象disk，disk将amount设置为200  
   (3、main方法中创建一个PC对象pc  
   (4、pc调用setCPU(CPU c)方法，调用时实参是cpu  
   (5、pc调用setHardDisk(HardDisk h)方法，调用时实参是disk  
   (6、pc调用show()方法  
   
## 核心方法
  <1>首先在src下新建CPU、HD、PC三个包，并分别在其下建立CPU、HardDisk、PC、Test四个类；  
  <2>还使用了import关键字，将CPU与HD两包下的CPU与HardDisk两类进行并入到PC类与Test类下进行访问；  
  <3>在类下分别使用两种构造方法(重载)，比如CPU类下的public double CPU()与public void CPU(double cache)；  
  <4>分别在CPU与HardDisk类下添加cache，rpm两个另外属性，其类型分别是double与float，并为其添加private与protected修饰符，进行权限限制访问，使得private成员只能通过被调用相关public方法来实现   不同包与不同类下的访问；  
  <5>通过调用构造方法将属性输出，如public double CPU(){return cache}，最后通过pc.show()方法输出；  
  <6>当然，在PC类下也使用了String字符串型定义了brand属性给出了PC与CPU的品牌；  
  <7>同时还创新性的使用了静态数据——public static char type = 'i';  

## 实验结果
PC品牌:DELL-WXJ  
Intel(R)i5-6200U  
CPU主频:2200Hz  
CPU缓存:256.0MB  
HDD容量:200GB  
HDD转速:5400.0rpm  

## 实验感想
     Java对于我们来说是一门陌生的学科，但它是目前业界应用最广泛，使用人数最多的语言，连续多年排名世界第一，。刚开始学的时候有一种恐惧感，因为它是陌生的，虽然只是有学过python C++，但那些只学了皮毛，感觉对代码的编写还是有点不太擅长。
     第一节课我了解到了Java的发展史和一些基本的知识，后续课程逐步深入学习，尤其是自己动手编写之后，就从中感觉到了许多乐趣，刚开始感觉这个很难，以为它像C++一样难，而且还都是英文，对于我这种英语差的来说简直就是噩梦，但经过一段时间的学习后感觉其实并没有想象的那么可怕，感觉很好玩，它不像C++一样，报错都是最后显示，还得回去找，Java有错直接能显示非常的方便。
     我觉得学好这门课需要做到以下几：
     1.多运用编译器编写、调试程序。
     2.对于不懂得的代码，要尽量搞清楚问题出在哪。
     3.与同学课下多多交流，课上多请教老师。


















