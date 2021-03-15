 // backtraking means if you are not finding solution in one path then you backtrack and
 // try second path and continue until soln found

package Backtracking;

 public class NqueenProb{

     // number of queens
               int N;

     // constructor to initialize N
     public NqueenProb(int N) {
         this.N=N;

     }

     public boolean queenProblem() {

         // create solution  matrix of N*N
         int[][] sol = new int[N][N];
         
         // now i call utility problem that whether there is solution or not
         // we are passing 0th column and sol matrix
         if(!queenProblemUtil(0,sol)) {
             System.out.println("N queen placement not  possible");
             return false;
         }
         // if there is solution then print it
         printQueenPlacement(sol);
         return true;
     }


     // creting func to chrcking sol with all possible constraint
     private boolean queenProblemUtil(int col, int[][] sol) {

         // i.e if column given in problem example 8*8 matrix then
         // if 8 column reach or more than it i.e for 9th col we are placing queen
         // then we got solution bcoz we reach that colum when we place all queen
         // safely to column before
         if (col >= N) {
             return true;
         }
         // if not reach nth col then

         //loop for rows and 0th col
         // i.e here col fix 0 and row are from row to N
         for(int row = 0; row < N; row++) {

             // if place is safe i.e when this func reurn true
             //we have to place 1 there and then call util func which call next col
             if (isSafeToPlaceQueen(row,col,sol)) {
                 sol[row][col] = 1;

                 // here if safe func return true then thids func call next col to check
                 //again for this col safe func run  and it continue till N col
                 if (queenProblemUtil(col + 1, sol)) {
                     return true;
                 }
                 // so now if we are not getting true for same index above
                 // we have to to backtrack and place zero by removing 1
                 // and again try by calling above function
                 // and as we not getting sol we check next row
                 sol[row][col] = 0;
             }
         }
         // if any row we didn't get solution then reurn false
         return false;
     }

     // this function check is queen safe to place
     // by checking 3 condition first row wise ; and then dioagonal wise once upper and once lower
     private boolean isSafeToPlaceQueen(int row, int col, int[][] sol) {

         int i, j;

         // here we check rowise(first row) condition i.e row is fix and we are checking col
         for (i = 0; i < col; i++) {
             // if at this row and col there is 1 then return false
             if (sol[row][i] == 1) {
                 return false;
             }
         }
             // now when we put in second row and a col we have to check
             // diagonal condition for checking upper diagonal; condition we have to decrement value
             // of index of row and col
             for (i = row, j = col; i >= 0 && j >= 0 ;i--,j--){
                 // after check if there is 1 present at uppr side diagonal then return false
                 if (sol[i][j] == 1) {
                     return false;
                 }
             }
             // similarly for checking lower diagonal condition
             //  we have to decrement col index and inc row index
             for (i = row,j = col; i < N && j >= 0 ;i++,j--){
                 // if there also present 1 return false imeediately
                 if (sol[i][j] == 1) {
                     return false;
                 }
             }
             // if there is no 1 in both upper and lower diagonal and row condition check
             // return true and place 1 there
             return true;
         }

         // here we are printing the path for sol i.e printing matrix of sol
         private void printQueenPlacement(int [][] mat) {

             for ( int i = 0; i < N; i++) {
                 for ( int j = 0; j < N; j++) {
                     System.out.println(mat[i][j] + " ");
                 }
                 System.out.println();
             }
         }

         public static void main(String[] args){

             int N = 4;

             NqueenProb prob = new NqueenProb(N);
             prob.queenProblem();
         }

     }


