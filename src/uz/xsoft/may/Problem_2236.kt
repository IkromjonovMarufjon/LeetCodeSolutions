package uz.xsoft.may

class Problem_2236 {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun checkTree(root: TreeNode?): Boolean {
        return root!!.`val` == root.left!!.`val` + root.right!!.`val`
    }
}