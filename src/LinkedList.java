
public class LinkedList { 
    Node head;  // head of list 
    int size = 0;   //side of list
  
    /* Linked list Node.  This inner class is made static so that 
       main() can access it */
    static class Node { 
        String name;
		String city;
        String state;
        Node next; 
        
        Node()  { 
        	name = null;
        	city = null;
        	state = null;
        	next = null;
        }  
        
        Node(String n, String c, String s) {
        	name = n;
        	city = c;
        	state = s;
        	next = null;
        }
        
    } 
    
    //
    //Linked List class Methods
    //
    
    public String getCity() {
		return head.city;
	}

	public void setCity(String city) {
		head.city = city;
	}

	public String getState() {
		return head.state;
	}

	public void setState(String state) {
		head.state = state;
	}

	public Node getNext() {
		return head.next;
	}

	public void setNext(Node next) {
		head.next = next;
	}
    
    public String getName() {
		return head.name;
	}

	public void setName(String name) {
		head.name = name;
	}
    
    public void addFirst(Node next) {
		head = next;
		size++;
	}
	
	public void appendToList(Node next) {
		if (head == null)
			addFirst(next);
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = next;
			size++;
		}
	}
	
	public boolean hasNext() {
		return (head.next != null);
	}
	
	public int size() {
        return size;
    }
	
    /* 
     * main method to test out the linked list
     * 
     */
    public static void main(String[] args) 
    { 
        LinkedList llist = new LinkedList(); 
  
        //add ten items to the list
        for (int i=1; i < 11; i++) {
        	Node temp = new Node("person"+i,"city"+i,"state"+i); 
        	llist.appendToList(temp);
        }
        
        //print the list
        LinkedList temp = llist;
        for (int i=0; i < llist.size(); i++) {
        	System.out.println(temp.getName());
        	temp.head = temp.getNext();
        }
        
        /*boolean go = (temp != null);
        while (go) {
        	System.out.println(temp.getName());
        	temp.head = temp.getNext();
        	if (temp.head == null) go = false;
        }*/
    } 
} 
