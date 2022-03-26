class Question3 {
    public ListNode preorder(root.left, root.right){
        preorder(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public ListNode inorder(root.left, root.right){
        inorder(root.left);
        inorder(root.val);
        inorder(root.right);
    }

    public void inorder(root.left, root.right){

        return;
    }

}
