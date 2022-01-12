class Functionality
{
    int n = 0;
    boolean canSet = false;

    synchronized void get(String what, String consumedWhat, String item)
    {
        while(!this.canSet)
        {
            try
            {
                this.wait();
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("\tError Reported By JAVA : "+e);
            }
        }
        System.out.println("Got : "+this.n);
        System.out.println(what+" has consumed "+consumedWhat+" For "+this.n+" "+item);

        this.canSet = false;
        this.notify();
    }

    synchronized void put(int n,String what,String mat)
    {
        while(this.canSet)
        {
            try
            {
                this.wait();
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("\tError Reported By JAVA : "+e);
            }
        }
        this.n = n;
        this.canSet = true;
        System.out.println("Put : "+this.n);
        System.out.println(what+" has produced "+this.n+" "+mat+" for consumer");
        notify();
    }
}

class Producer implements Runnable
{

    String threadName;
    private final Functionality fun;
    public Thread t;
    String itemName;

    Producer(String name,String itemName,Functionality fun)
    {
        this.itemName = itemName;
        this.threadName = name;
        this.fun = fun;
        this.t = new Thread(this,this.threadName);
    }

    @Override
    public void run() {
        int i=0;
        while(true)
        {
            this.fun.put(i++,this.threadName,this.itemName);
        }
    }
}

class Consumer implements Runnable
{

    String threadName;
    private final Functionality fun;
    public Thread t;
    String itemName;
    String producerItem;

    Consumer(String name,String producerItem,String itemName,Functionality fun)
    {
        this.producerItem = producerItem;
        this.itemName = itemName;
        this.threadName = name;
        this.fun = fun;
        this.t = new Thread(this,this.threadName);
    }

    @Override
    public void run() {
        while(true)
        {
            this.fun.get(this.threadName,this.producerItem,this.itemName);
        }
    }
}

public class Prac6_5 {
    public static void main(String[] args) {

        Functionality NewFunc = new Functionality();
        Producer producer = new Producer("Producer","iPhone 13",NewFunc);
        Consumer consumer = new Consumer("Factory","Temporary iPhone 13","iPhone 13",NewFunc);

        producer.t.start();
        consumer.t.start();

    }
}