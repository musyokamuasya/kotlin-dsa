package leetcode.trees

import leetcode.trees.node.TreeNode
import java.util.*

class LevelOrderTraversal {

        fun levelOrder(root: TreeNode?): List<List<Int>> {
            val queue: Queue<TreeNode> = LinkedList<TreeNode>() //Stores elements for processing
            val result: MutableList<List<Int>> = mutableListOf<List<Int>>() //Stores the list of lists for each level

            if(root == null) return result

            queue.add(root) //Add first element to queue

            while(!queue.isEmpty()){
                val level:MutableList<Int> = mutableListOf<Int>()

                for(i in 0 until queue.size){
                    val current = queue.poll()

//                    level.add(current.value)
                    level.add(current.value)

                    if(current.leftNode != null){
                        queue.add(current.leftNode)
                    }

                    if(current.rightNode != null){
                        queue.add(current.rightNode)
                    }
//                    result.add(current)
                }

//                result.add(current)

            }

            return result
        }
    }