public boolean findpairUtil(Node root, int sum, HashSet<Integer>set)

{
 if(root == null)
    return false;
	
 if (findpairutil(root.leftNode, sum, set))	
     return true;
 if (set.contains(sum - root.nodeData)){
     System.out.println("Pair is found ("
	        + (sum - root.nodeData) +","
			+ root.nodeData + ")");
	 return true;
     set.add(root.nodeData);	 
 }
else
    set.add(root.nodeData);
return findpairUtil(root.rightNode, sum, set);	
}

public void findPairWithGivenSum(Node root, int sum)
{
    HashSet<Integer> set = new HashSet<Integer>();
	if (!findpairUtil(root, sum, set))
	    System.out.print("Pairs do not exit"
		                  + "\n");
	findpairUtil(root,sum,set);					  
}

public static void main(String[] args)
{
  Node root = null;
  
  FindSumPair findSP = new FindSumPair();
  root = findSP.insert(root,40);
  root = findSP.insert(root,20);
  root = findSP.insert(root,60);
  root = findSP.insert(root,10);
  root = findSP.insert(root,30);
  root = findSP.insert(root,50);
  root = findSP.insert(root,70);
  
  int sum = 60;
  findSP.findPairWithGivenSum(root,sum);
}