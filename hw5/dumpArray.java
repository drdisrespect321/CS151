import java.awt.Rectangle;

public class DumpArray
{

    public static void dumpArray(Object[] objects)
    {
        for(int i = 0; i < objects.length; i++)
        {
            System.out.println(objects[i].toString());
        }
    }

    public static void main(String[] args)
    {
        Object[] objects = {"abc", 99, "AAA", 0.001,new Rectangle(10,20)};
        
       
        dumpArray(objects);
     
        
    }

}
