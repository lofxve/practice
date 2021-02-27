package com.lofxve.algorithrm.leetcode;

import java.util.*;

public class Solution {

    public static int[][] convert (int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = n-1;
        while (i<j)
        {
            for (int k = 0;k<m;k++){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[j][k];
                matrix[j][k] = temp;
            }
            i++;
            j--;
        }
        return matrix;
    }

    /**1
     * 判定字符是否唯一
     * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
     示例 1：
     输入: s = "leetcode"
     输出: false
     * */
    public boolean isUnique1(String astr) {
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0 ;i<astr.length();i++)
        {
            /*key是否存在，如果存在则返回value，如果不存在，则返回defaultValue
             * (e = getNode(hash(key), key)) == null ? defaultValue : e.value;
             * */
            int count = result.getOrDefault(astr.charAt(i),0)+1;
            result.put(astr.charAt(i),count);
        }

        for(Map.Entry<Character, Integer> map:result.entrySet())
        {
            if (map.getValue() !=1)
                return false;
        }
        return true;
    }
    public boolean isUnique(String astr) {
        if (astr.length() == 1 || astr.length() == 0) {
            return true;
        }
        boolean flag = true;
        for (int i = 0 ;i<astr.length()-1;i++)
        {
            //根据字符查找位置，indexOf（从前往后查），lastIndexOf（从后往前查）
            if (astr.indexOf(astr.charAt(i)) != astr.lastIndexOf(astr.charAt(i)))
                flag = false;
        }
        return true;
    }
    /**2
     * 判定是否互为字符重排
     * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
     示例 1：
     输入: s1 = "abc", s2 = "bca"
     输出: true
     。*/
    public boolean CheckPermutation2(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if(m != n)
            return false;
        HashMap<Character, Integer> result = new HashMap<>();
        HashMap<Character, Integer> result2 = new HashMap<>();
        for (int i = 0 ;i<m;i++)
        {
            int count = result.getOrDefault(s1.charAt(i),0)+1;
            result.put(s1.charAt(i),count);
            int count1 = result2.getOrDefault(s2.charAt(i),0)+1;
            result2.put(s2.charAt(i),count1);
        }
        for(Map.Entry<Character, Integer> map:result.entrySet())
        {
            if (result2.get(map.getKey()) != map.getValue()){
                return false;
            }
        }
        return true;
    }
    public boolean CheckPermutation(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if(m != n)
            return false;
        int[] index = new int[128];
        for (int i=0;i<m;i++)
        {
            index[s1.charAt(i)]++;
            index[s2.charAt(i)]--;
        }
        for (int i : index)
        {
            if (i!=0)
                return false;
        }
        return true;
    }
    /**4
     * 回文排列
     * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
     回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
     回文串不一定是字典当中的单词。
     示例1：
     输入："tactcoa"
     输出：true（排列有"tacocat"、"atcocta"，等等）
     * */
    public boolean canPermutePalindrome4(String s) {
        if (s==null||s.length()<1){
            return false;
        }
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0 ;i < s.length();i++)
        {
            int count = result.getOrDefault(s.charAt(i),0)+1;
            result.put(s.charAt(i),count);
        }
        int flag = 0;
        for (Map.Entry<Character, Integer> map:result.entrySet()){
            if (map.getValue()%2 ==1 )
            {
                flag++;
            }
        }
        return flag<=1;
    }
    /**5
     * 一次编辑
     * 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。
     * 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。*/
    public boolean oneEditAway5(String first, String second) {
        if (first == null || second == null) return false;
        int len1 = first.length();
        int len2 = second.length();
        if (Math.abs(len1 - len2) > 1) return false;
        if (len2 > len1) return oneEditAway5(second, first);

        // 保持第一个比第二个长
        for (int i = 0; i < len2; i++){
            if (first.charAt(i) != second.charAt(i)){
                return first.substring(i + 1).equals(second.substring(len1 == len2 ? i + 1 : i));
            }
        }
        return true;
    }
    /**6
     * 字符串压缩
     字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
     比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
     示例1:
     输入："aabcccccaaa"
     输出："a2b1c5a3"*/
    public String compressString6(String str) {
        if (str == "")
            return "";
        StringBuffer sb = new StringBuffer();
        int N = str.length();
        int i = 0;
        while (i < N) {
            int j = i;
            while (j < N && str.charAt(j) == str.charAt(i)) {
                j++;
            }
            sb.append(str.charAt(i));
            sb.append(j - i);
            i = j;
        }

        String s1 = sb.toString();
        return str.length()<=s1.length()?str:s1;
    }
    /**7
     * 旋转矩阵
     * 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
     * */
    public void rotate7(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = n-1;
        while (i<j)
        {
            for (int k = 0;k<m;k++){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[j][k];
                matrix[j][k] = temp;
            }
            i++;
            j--;
        }
        for (int a = 0;a<n;a++){
            for (int b = 0;b<a;b++){
                int temp = matrix[a][b];
                matrix[a][b] = matrix[b][a];
                matrix[b][a] = temp;
            }
        }
    }
    //零矩阵
    public void setZeroes(int[][] matrix) {
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if (matrix[i][j]==0){
                    for (int a = 0;a<m;a++){
                        matrix[a][j] = 0;
                    }
                    for (int a = 0;a<n;a++){
                        matrix[i][a] = 0;
                    }
                }
            }
        }
    }
    public int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
    /**字符串相乘
     * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
     示例 1:
     输入: num1 = "2", num2 = "3"
     输出: "6"
     */
    public String multiply(String num1, String num2) {
        if (num1.equals("0")||num2.equals("0")){
            return "0";
        }
        String ans = "0";
        int m=num1.length();
        int n=num2.length();
        for (int i = m - 1;i>=0;i--) {
            //初始化 num2除了最低位以外，其余的每一位的运算结果都需要补 0
            StringBuffer buffer = new StringBuffer();
            for (int j = m - 1; j > i; j--) {
                buffer.append(0);
            }
            int add = 0;
            //每一位相乘
            for (int j = n - 1;j >= 0 ;j--){
                int sum = (num1.charAt(i) - '0') * (num2.charAt(j) - '0') + add;
                buffer.append(sum%10);
                add = sum/10;
            }
            //是否需要进位
            if (add != 0) {
                buffer.append(add % 10);
            }
            ans = addStrings(ans, buffer.reverse().toString());
        }
        return ans;
    }
    //两数相加
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        ans.reverse();
        return ans.toString();
    }
    /**有效的括号
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     有效字符串需满足：
     左括号必须用相同类型的右括号闭合。
     左括号必须以正确的顺序闭合。
     注意空字符串可被认为是有效字符串。
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (char ch :chars){
            switch (ch)
            {
                case'(':
                case'[':
                case'{': stack.push(ch); break;
                case')': if(stack.empty() || stack.peek()!='(') return false; else stack.pop(); break;
                case']': if(stack.empty() || stack.peek()!='[') return false; else stack.pop(); break;
                case'}': if(stack.empty() || stack.peek()!='{') return false; else stack.pop(); break;
                default: ;
            }
        }
        return stack.isEmpty();
    }
    /**两数相加
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     示例：
     输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     输出：7 -> 0 -> 8
     原因：342 + 465 = 807
     * */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode listNode = ln;
        int c = 0;
        while(p!=null||q!=null)
        {
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = x + y + c;
            c = sum/10;

            listNode.next = new ListNode(sum % 10);
            listNode = listNode.next;

            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        //是否需要进位
        if(c>0) {
            listNode.next = new ListNode(c);
        }
        return ln.next;
    }
    /**108
     将有序数组转换为二叉搜索树
     * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
     本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。*/
    public TreeNode sortedArrayToBST(Object[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    public TreeNode helper(Object[] nums, int left, int right) {
        if (left>right)
            return null;
        int mid = (right+left)/2;
        TreeNode root = new TreeNode((Integer) nums[mid]);
        root.left = helper(nums,left,mid - 1);
        root.right = helper(nums,mid + 1 ,right);
        return root;
    }
    /**109有序链表转换二叉搜索树
     * 给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
     本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
     */
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();
        ListNode p = head;
        while (p!=null){
            nums.add(p.val);
            p=p.next;
        }
        return sortedArrayToBST(nums.toArray());
    }
    /**110
     * 平衡二叉树
     * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
     * */
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        else{
            //左右平衡并且左右子树相差小于1
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }/**111
     给定一个二叉树，找出其最小深度。
     最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
     说明: 叶子节点是指没有子节点的节点。
     */
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.right == null && root.left == null){
            return 1;
        }
        int h1 = minDepth(root.left);
        int h2 = minDepth(root.right);
        //1.如果左孩子和右孩子有为空的情况，直接返回最大深度+1
        if (root.right == null || root.left == null){
            return Math.max(h1,h2) + 1;
        }
        //2.如果都不为空，返回较小深度+1
        return Math.min(h1,h2)+1;
    }
    /**647 回文子串
     * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
     * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
     **/
    //取得所有子串
    public int countSubstrings(String s) {
        int len = s.length();
        int k =0;
        for(int i = 0; i < len; i++){
            for (int j = i+1; j<=len; j++){
                if(ispalindromic(s.substring(i,j))){
                    k++;
                }
            }
        }
        return k;
    }
    //判断回文字符串
    public boolean ispalindromic(String s){
        int i = 0;
        int j = s.length() -1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    /**648单词替换
     * 输入：dict(词典) = ["cat", "bat", "rat"] sentence(句子) = "the cattle was rattled by the battery"
     * 输出："the cat was rat by the bat"*/
    public static String replaceWords(List<String> dict, String sentence) {
        String[] arr = sentence.split(" ");
        String str = "";
        for (String ss : arr){
            str = str +countSubstrings11(dict, ss);
            str = str +" ";
        }
        return str.trim();
    }
    //判断dic是否在字符串s找那个
    public static String countSubstrings11(List<String> dict, String s) {
        int len = s.length();
        for(int i = 0; i < len; i++){
            for (int j = i+1; j<=len; j++){
                for (String ss : dict){
                    if(ss.equals(s.substring(i,j))){
                        return ss;
                    }
                }
            }
        }
        return s;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
