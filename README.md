# Java-Experiment1
Java课程作业项目仓库

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

## 核心代码
### CPU类
    public static char type = 'i';public static String brand;//使用静态变量type，类型为字符型
    private int speed;//速度属性(整型)，访问权限修饰符为“私有”
    protected double cache;//容量属性(双浮点型)，访问权限修饰符为“保护”
    public double CPU() {
    return cache;}//不含参构造方法
    public void CPU(double cache) {
    this.cache = cache;}//含参构造方法
### HardDisk类
    private int amount;//容量属性(整型)，访问权限修饰符为“私有”
    protected float rpm;//速度属性(单浮点型)，访问权限修饰符为“保护”
    public float HardDisk() {
    return rpm;}//不含参构造方法
    public void HardDisk(float rpm) {
    this.rpm = rpm;}//含参构造方法
### PC类
      String brand;//品牌属性(字符串型)
      CPU cpu;
      HardDisk HD;
      void setCPU(CPU cpu) {
      this.cpu = cpu;}
      void setHardDisk(HardDisk HD) {
      this.HD = HD;}
### Test类
      CPU cpu = new CPU();//创建CPU对象cpu
      HardDisk disk=new HardDisk();//创建HardDisk对象disk
      cpu.setSpeed(2200);//cpu设定自己speed设定为2200
      cpu.CPU(256);
      disk.setAmount(200);//disk将自己amount设定为200
      disk.HardDisk(5400);
      PC pc =new PC();//创建PC对象pc
      pc.setCPU(cpu);//pc调用方法，实参是cpu
      pc.setHardDisk(disk);//pc调用方法，实参是disk
      pc.brand = "DELL-WXJ";
      CPU.brand = "Intel(R)";
      pc.show();//pc调用show()方法
## 实验结果
![image](https://github.com/daladida/Java-Experiment1/blob/main/images/%E5%AE%9E%E7%8E%B0%EF%BC%88%E4%B8%80%EF%BC%89%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.png)

## 实验感想
   一、Java对于我们来说是一门陌生的学科，但它是目前业界应用最广泛，使用人数最多的语言，连续多年排名世界第一，。刚开始学的时候有一种恐惧感，因为它是陌生的，虽然只是有学过python C++，但那些只学了皮毛，感觉对代码的编写还是有点不太擅长。  
   二、在PC模拟机程序实验中让我对前一阶段所学的知识有了一定的具体认识，光听课感觉概念都太过于抽象，亲手编写出来以后就化抽象为具体了。首先彻底的理解了类和对象的定义和使用，对象是具体的事物：类是对对象的抽象。类可以看成一类对象的模板，对象可以看成该类的一个具体实例，掌握了用类创建对象的方法，利用类中定义的构造方法来创建对象。还用到了重载构造方法，并且尝试把这次实验的多个类放置在不同的包中，体会到了修饰符private的用法，还用this,private关键字进行了封装。  
   三、之前在查看代码的时候进入过Github，但没有自己使用过，通过查看老师的详细图片讲解，学会了把代码上传，并借助互联网解决了README的格式调节，又掌握了一项新的技能，以后不仅是Java代码其他学科也可以保存于此，方便日后查看。   
   四、第一节课我了解到了Java的发展史和一些基本的知识和环境的搭建使用等，后续课程逐步深入学习，尤其是自己动手编写之后，就从中感觉到了许多乐趣，刚开始感觉这个很难，以为它像C++一样难，而且还都是英文，对于我这种英语差的来说简直就是噩梦，但经过一段时间的学习后感觉其实并没有想象的那么可怕，感觉很好玩，它不像C++一样，报错都是最后显示，还得回去找，Java有错直接能显示非常的方便。  
   我觉得学好这门课需要做到以下几：  
     1.多运用编译器编写、调试程序。  
     2.对于不懂得的代码，要尽量搞清楚问题出在哪。  
     3.与同学课下多多交流，课上多请教老师。  


















