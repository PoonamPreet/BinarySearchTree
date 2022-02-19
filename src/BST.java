
class Node
{
char key;
Node lc,rc;
 
Node(char key)
{
this.key=key;
}
}

class BinarySolution
{
Node root;
void insertkey(char key)
{
root =insertInTree(root,key);	
}


Node insertInTree(Node root, char key)
{
if(root==null)
{
root=new Node(key);
return root;
}
if(key<root.key)
{
root.lc=insertInTree(root.lc,key);	
}
else if(key>root.key)
{
root.rc=insertInTree(root.rc,key);	
}
return root;
}
void preordertraversal(Node root)
{
if(root!=null)
{
System.out.print(root.key+" ");
preordertraversal(root.lc);
preordertraversal(root.rc);

}
}
}
public class BST {

	public static void main(String[] args) {
		BinarySolution t1=new BinarySolution();
		t1.insertkey('F');
		t1.insertkey('C');
		t1.insertkey('D');
		t1.insertkey('L');
		t1.insertkey('N');
		t1.insertkey('O');
		t1.insertkey('K');
		
		t1.preordertraversal(t1.root);
	}

}
