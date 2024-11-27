public class Pyramid
{
  final static  int max=6;
  public static int rear=-1;
  public static int front=-1;
  public static int arr[]= new int[max];
    static public void main(String[] args)
    {
         
        enqueue(4);
        enqueue(7);
        enqueue(14);
        print();
         
    }
    public static void enqueue(int data)
    {
      if(rear==max-1)
      {
          System.out.print("queue is full");
      }
      else
      {
        if(front==-1)
        {
          front=0;
          rear++;
          arr[rear]=data;
          System.out.print(data);
        }
      }

    }

    public static void deque()
    {
      if(front==-1)
      {
        System.out.println("queue is empty");
      }
      else
      {
        System.out.println(arr[front]);
        front++;
        if(front>rear)
        {
          front=rear=-1;
        }
      }
    }
    public static void print()
    {
      if(front==-1)
      {
        System.err.println("que is empty");
      }
      else
      {
        
        for(int i=front;i<=rear;i++)
        {
          System.out.print(arr[i]);
        }
        System.out.println();

      }
    }
}
