class Solution {
    public boolean solve(ArrayList<Integer> list,Node root,int target){
        if(root==null)
            return false;
        if(root.data==target)
            return true;
        if(solve(list,root.left,target)||solve(list,root.right,target)){
            list.add(root.data);
            return true;
        }
        return false;
    }

    public ArrayList<Integer> Ancestors(Node root, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        solve(list,root,target);
        return list;
    }
}