import java.lang.reflect.Field;

public class Reflection {
    public static void main(String[] args) throws Exception{ //rather than doing try catch block "throw" the exception somewhere else
        //read contents of something at run time.
        // peak inside a file during run time to do something with it.
        // the <?> is a generic type that takes anything. it doesnt know what its going to get.
        Class<?> c = Class.forName("Person"); // this turns c into an object of "Person"
        System.out.println(c.getName());

        //Print fields of Person
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        Person joe = (Person) c.newInstance();
        System.out.println(joe);

        Field newAge = c.getDeclaredField("age");
        newAge.setAccessible(true);
        newAge.set(joe, -5000);
        System.out.println(joe);
    }
}