package com.chen;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * author: JINCHENCHEN
 * date: 2020/12/31
 */
public class Test {
    public static void main(String[] args) {
        String className = "TestClass";
        String javaSrc = "import java.util.Random;\r\n"
                +" import java.util.Map;\r\n"
                +" import java.util.HashMap;\r\n"
                + "public class TestClass {\r\n" + "\r\n"
                + "	public static void main(String[] args) {\r\n"
                + "		TestClass class1 = new TestClass();\r\n"
                + "		class1.sayHello(\"this is main method\");\r\n"
                + "		Random random = new Random();\r\n"
                + "		int a = random.nextInt(1024);\r\n"
                + "		int b = random.nextInt(1024);\r\n"
                + "     Map<String, Object> map = new HashMap<>(10000);\r\n"
                + "		System.out.printf(\r\n"
                + "				Thread.currentThread().getName() + \": \" + \"%d + %d = %d\\n\", a,\r\n"
                + "				b, class1.add(a, b));\r\n"
                + "		System.out.println();\r\n" + "	}\r\n" + "\r\n"
                + "	public void sayHello(String msg) {\r\n"
                + "		System.out.printf(\r\n"
                + "				Thread.currentThread().getName() + \": \" + \"Hello %s!\\n\", msg);\r\n"
                + "	}\r\n" + "\r\n" + "	public int add(int a, int b) {\r\n"
                + "		return a + b;\r\n" + "	}\r\n" + "}\r\n" + "";
        try {
            Test.testInvoke(className, javaSrc);
        } catch (ClassNotFoundException | IllegalAccessException
                | InstantiationException | NoSuchMethodException
                | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void testInvoke(String className, String source)
            throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchMethodException,
            InvocationTargetException {

        final String SUFFIX = ".java";// 类名后面要跟的后缀

        // 对source进行编译生成class文件存放在Map中，这里用bytecode接收
        Map<String, byte[]> bytecode = DynamicLoader.compile(className + SUFFIX,
                source);

        // 加载class文件到虚拟机中，然后通过反射执行
        @SuppressWarnings("resource")
        DynamicLoader.MemoryClassLoader classLoader = new DynamicLoader.MemoryClassLoader(
                bytecode);
        Class<?> clazz = classLoader.loadClass("TestClass");
        Object object = clazz.newInstance();

        // 得到sayHello方法
        Method sayHelloMethod = clazz.getMethod("sayHello", String.class);
        sayHelloMethod.invoke(object, "This is the method called by reflect");

        // 得到add方法
        Method addMethod = clazz.getMethod("add", int.class, int.class);
        Object returnValue = addMethod.invoke(object, 1024, 1024);
        System.out.println(Thread.currentThread().getName() + ": "
                + "1024 + 1024 = " + returnValue);

        // 因为在main方法中，调用了add和sayHello方法，所以直接调用main方法就可以执行两个方法
        Method mainMethod = clazz.getDeclaredMethod("main", String[].class);

        Examination.start();
        try {
            Thread.sleep(100_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mainMethod.invoke(null, (Object) new String[] {});
        Map<String, String> map = new HashMap<>(160);
        map.put("1234","12345");
        map.put("12342","12345");
        map.put("12324","12345");
        map.put("123324","12345");
        map.put("1232134","12345");
        map.put("122334","12345");
        for (int i = 0; i < 10000; i++) {
            map.put("1","1");
        }

        Examination.end();

    }
}
