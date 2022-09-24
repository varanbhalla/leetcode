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
    if (root == null) {
        return 0;
    }
    const leftTreeMaxDepth = maxDepth(root.left);
    const rightTreeMaxDepth = maxDepth(root.right);
    const currentNodeDepth = 1;
    const treeMaxDepth = Math.max(leftTreeMaxDepth, rightTreeMaxDepth) + currentNodeDepth;
    return treeMaxDepth;
    
};





























