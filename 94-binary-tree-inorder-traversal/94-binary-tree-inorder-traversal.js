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
 * @return {number[]}
 */

var inorderTraversal = function(root) {
    const inorderList = [];
    inorderTraversalHelper(root, inorderList);
    return inorderList;
};

const inorderTraversalHelper = (root, inorderList) => {
    if (root == null) {
        return
    }
    inorderTraversalHelper(root.left, inorderList);
    inorderList.push(root.val);
    inorderTraversalHelper(root.right, inorderList);    
}





























