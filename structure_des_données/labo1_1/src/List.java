public class List {
    private LinkList head;

    public  List(){
        head=null;

    }
    private boolean isEmpty(){
        return head==null;
    }
    public void add(int data){
        LinkList temp=new LinkList(data);
        temp.next=head;
        head=temp;
    }
    public void remove(){
        head=head.next;
    }

    public void removeAt(int key){
        LinkList cur= head;
        LinkList prev=head;

        while (cur.data != key){
            if(isEmpty()){
                System.out.println("List is empty");
            }else{
                prev=cur;
                cur=cur.next;
            }

            if(cur==head){
                head=head.next;
            }else{
                prev.next=cur.next;
            }
        }
    }
    public int find(int key){
        LinkList temp=head;
        int c=0;

        while(temp !=null){
            if(temp.data==key){
                return c;
            }
            temp= temp.next;
            c++;
        }
        return -1;
    }

    public void print(){
        LinkList temp=head;

        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
