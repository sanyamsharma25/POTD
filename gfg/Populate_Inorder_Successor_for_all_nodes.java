
class Solution {
    public void inorder(Node root,ArrayList<Node> list){
        if(root==null)
            return;
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }
    public void populateNext(Node root) {
        // code here
        ArrayList<Node> list=new ArrayList<>();
        inorder(root,list);
        for(int i=0;i<list.size()-1;i++){
            list.get(i).next=list.get(i+1);
        }

    }
}