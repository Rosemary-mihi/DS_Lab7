import java.lang.RuntimeException;

public class QueueUnderFlowException extends RuntimeException
{


   public QueueUnderFlowException()
   {
      super("queue is empty");
   }


   public QueueUnderFlowException(String message)
   {
      super(message);
   }

}
