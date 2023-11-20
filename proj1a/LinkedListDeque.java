/*
    The project is to implemented
    Deque API (Double ended queue)
        Requirements
        add/remove -> no recursive
        get -? iteration (no recursive)
        size-> constant time
 */
public class LinkedListDeque<T>{

    private class ListNode{
        public T item;
        public ListNode next;
        public ListNode prev;

        public ListNode(T i,ListNode Prev,ListNode Next){
            item=i;
            next=Next;
            prev=Prev;
        }
    }

    private ListNode sentinel;
    private int size;
    public LinkedListDeque(){
        sentinel = new ListNode(null, null,null);
        sentinel.prev=sentinel;
        sentinel.next=sentinel;
        size =0;
    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    public int size(){
        return size;
    }
    /*
        Adds an item of type T to the front of the deque
    */
    public void addFirst(T item){
        ListNode newNode = new ListNode(item,sentinel,sentinel.next);
        // 更新原先節點的PREV指向新的節點
        sentinel.next.prev=newNode;
        sentinel.next=newNode;
        size=size+1;
    }
    public void addLast(T item){
        //創造節點指向 A-> SEN
        //           SEN_PREV<-A
        ListNode newNode=new ListNode(item,sentinel.prev,sentinel);
        //更新PREV節點
        sentinel.prev.next=newNode;
        sentinel.prev=newNode;
        size=size+1;
    }
    public void printDeque(){
        ListNode traverseNode=sentinel;
        while(traverseNode.next!=sentinel){
            System.out.print(traverseNode.next.item+" ");
            traverseNode=traverseNode.next;
        }
    }

    public T removeFirst(){
        if(size==0){
            return null;
        }
        T removeItem=sentinel.next.item;
        sentinel.next.next.prev=sentinel;
        sentinel.next=sentinel.next.next;
        size=size-1;
        return removeItem;
    }
    public T removeLast(){
        if(size==0){
            return null;
        }
        T removeItem=sentinel.prev.item;
        sentinel.prev.prev.next=sentinel;
        sentinel.prev=sentinel.prev.prev;
        size=size-1;
        return removeItem;
    }
    public T get(int index){
        if(index>=size){
            return null;
        }
        ListNode getNode=sentinel;
        for (int i=0;i<=index;i++){
            getNode=getNode.next;
        }
        return getNode.item;
    }
    private T getRecursivehelper(ListNode start,int index){
        if (index==0){
            return start.item;
        }
        else{
            return getRecursivehelper(start.next,index-1);
        }
    }
    public T getRecursive(int index){
        if(index>=size){
            return null;
        }
        return getRecursivehelper(sentinel.next,index);

    }
}
