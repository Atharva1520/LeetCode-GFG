/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> verticalTraversal(TreeNode* root) {
        vector<vector<int>> ans;
        if(!root) return ans;
        map<int, map<int, multiset<int>>> nodesMap;
        queue<pair<TreeNode *, pair<int,int>>> todo;
        
        todo.push({root, {0,0}});
        
        while(!todo.empty()){
            auto p = todo.front();
            todo.pop();
            TreeNode *node = p.first;
            int x = p.second.first, y = p.second.second;
            nodesMap[x][y].insert(node->val);
            if(node->left){
                todo.push({node->left, {x-1, y+1}});
            }
            if(node->right){
                todo.push({node->right, {x+1, y+1}});
            }
        }
        
        // iterating over the nodesMap
        for(auto it : nodesMap){
            vector<int> col;
            // iterating over the second map
            for(auto t : it.second){
                // iterating over the multiset which contains all the nodes at (it, t)
                for(auto x : t.second){
                    col.push_back(x);
                }
            }
            ans.push_back(col);
        }
        return ans;
    }
};