# Lowest Common Ancestor of a Binary Search Tree

## 🧩 Problem Statement

Given a **Binary Search Tree (BST)** and two nodes `p` and `q`, find their **Lowest Common Ancestor (LCA)**.

The **Lowest Common Ancestor** of two nodes `p` and `q` is defined as the **lowest node in the tree that has both `p` and `q` as descendants** (a node can be a descendant of itself).

---

## 📌 Properties of Binary Search Tree
- Left subtree contains values **less than** the root
- Right subtree contains values **greater than** the root

---

## 🛠 Approach

We use the **BST property** to efficiently find the LCA:

1. If both `p` and `q` are **smaller than root**, then LCA lies in the **left subtree**
2. If both `p` and `q` are **greater than root**, then LCA lies in the **right subtree**
3. Otherwise, the **current root is the LCA**

This solution uses **recursion**.

---

## 💻 Code Implementation (Java)

```java
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        else {
            return root;
        }
    }
}
