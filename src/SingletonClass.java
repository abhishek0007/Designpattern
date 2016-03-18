/**
 * Created by a on 18/3/16.
 */
public class SingletonClass {
    public static SingletonClass instance;
static  int i=0;
    SingletonClass() {}
    public static SingletonClass getInstance()
    {
        if(instance == null)
        {
            instance = new SingletonClass();
            i++;
            System.out.println("Singleton Class " +i);

        }
      return  instance;
    }
    public  void Outside()
    {
        i++;
        System.out.println("Outside"+i);
    }

}
