# Validate Binary Search Tree (BST)

## 📌 Problem Statement

Given the root of a binary tree, determine whether it is a **valid Binary Search Tree (BST)**.

A valid BST is defined as:
- The left subtree of a node contains **only nodes with values less than the node’s value**.
- The right subtree of a node contains **only nodes with values greater than the node’s value**.
- Both the left and right subtrees must also be **binary search trees**.

---

## 🧠 Approach Used

This solution validates the BST by:
- Finding the **maximum value** in the left subtree.
- Finding the **minimum value** in the right subtree.
- Ensuring:
  - `root.val > max(left subtree)`
  - `root.val < min(right subtree)`
- Recursively applying the same checks to left and right subtrees.

---

## 🧩 Algorithm

1. If the root is `null`, return `true`.
2. Compute the maximum value of the left subtree.
3. Compute the minimum value of the right subtree.
4. If BST property fails at any node, return `false`.
5. Recursively validate left and right subtrees.

---

## 💻 Code Implementation (Java)

```java
class Solution {

    public int max(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;

        int a = max(root.left);
        int b = max(root.right);

        return Math.max(root.val, Math.max(a, b));
    }

    public int min(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;

        int a = min(root.left);
        int b = min(root.right);

        return Math.min(root.val, Math.min(a, b));
    }

    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        if(root.left != null && root.val <= max(root.left)) return false;
        if(root.right != null && root.val >= min(root.right)) return false;

        return isValidBST(root.left) && isValidBST(root.right);
    }
}
