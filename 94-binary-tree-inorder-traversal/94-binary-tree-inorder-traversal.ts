/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function inorderTraversal(root: TreeNode | null): number[] {
    let inorderList: number[] = []
    inorderTraversalHelper(root, inorderList);
    return inorderList;
};

function inorderTraversalHelper(root: TreeNode, inorderList: number[]) {
    if (root == null) {
        return;
    }
    
    inorderTraversalHelper(root.left, inorderList);
    inorderList.push(root.val);
    inorderTraversalHelper(root.right, inorderList);    
}




















