import java.io.File;
import java.io.FileInputStream;

class BreakLoader extends ClassLoader {

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        Class<?> c = findLoadedClass(name);
        if (c == null) {
            c = findClass(name);
        }
        if (resolve) {
            resolveClass(c);
        }
        return c;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
       String path = name.replace(".", File.separator);
       String classfile = path+".class";
       File classfile1 = new File(classfile);
       System.out.println(classfile1.exists());
       try {
           FileInputStream fis = new FileInputStream(classfile);
           int len = fis.available();
           byte[] classBytes = new byte[len];
           fis.read(classBytes);
           fis.close();
           return defineClass(name, classBytes, 0, len);
       } catch (Exception e) {
           e.printStackTrace();
       }
       return null;
    }
}
