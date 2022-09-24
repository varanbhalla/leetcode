/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */

var maxDepth = function(root) {
    if (root == null)
        return 0;
    
    const leftTreeDepth = maxDepth(root.left);
    const rightTreeDepth = maxDepth(root.right);
    const currentNodeDepth = 1;
    const treeMaxDepth = Math.max(leftTreeDepth, rightTreeDepth) + currentNodeDepth;
    return treeMaxDepth;
};




























