public class WordSearch {
    static public boolean isWordExist(char[][] mat, String word) {
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j] == word.charAt(0)){
                    boolean[][] vis = new boolean[mat.length][mat[0].length];
                    if(check(mat, i, j, 0,  word, vis)) return true;
                }
            }
        }
        return false;
    }
    static boolean check(char[][] mat, int i, int j, int ind, String word, boolean[][] vis){
        if(ind == word.length()) return true;
        if(i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || vis[i][j] || mat[i][j] != word.charAt(ind)){
            return false;
        }
        vis[i][j] = true;
        if(check(mat, i, j - 1, ind + 1, word, vis) || 
            check(mat, i, j + 1, ind + 1, word, vis) || 
            check(mat, i + 1, j , ind + 1, word, vis) || 
            check(mat, i - 1, j, ind + 1, word, vis)) 
            return true;
        vis[i][j] = false;
        return false;
    }
    public static void main(String[] args) {
        char[][] mat = {{'T', 'E', 'E'},
                        {'S', 'G', 'K'},
                        {'T', 'E', 'L'}};
        String word = "GEEK";
        System.out.println(isWordExist(mat, word));
    }
}
