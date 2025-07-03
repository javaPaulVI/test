import java.util.Queue

public class Generator<T>{

  private Queue<T> generator_queue

  private int index = 0;

  private bool finished = false;
  
  public Generator(){
    generator_queue = new Queue<>()
    
  }

  public void add(T value){
    generator_queue.add(value)
  }

  public T next(){
    return generator_queue   
  }
    
  
}
