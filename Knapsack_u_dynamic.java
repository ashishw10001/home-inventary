package tech_verito;

public class Knapsack_u_dynamic {
        public static void main(String[] args) {
            int[]val={60,100,120};
            int[]wt={10,20,30};
            int n=val.length;
            int W=50;
            System.out.println(knapsack(W,val,wt,n));
        }
        public static int knapsack(int W,int[]val,int[]wt,int n) {
            if (n == 0 || W == 0) return 0;
            if (wt[n - 1] > W) {
                return knapsack(W, val, wt, n - 1);
            } else {
                return Math.max(val[n - 1] + knapsack(W - wt[n - 1], val, wt, n - 1), knapsack(W, val, wt, n - 1));
            }
        }
}
