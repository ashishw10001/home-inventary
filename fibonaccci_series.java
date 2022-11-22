package tech_verito;

public class fibonaccci_series {
    public static int recursive(int n){
        if(n<=2)return 1;
        else return recursive(n-1)+recursive(n-2);
    }
    public static int using_loop(int n){
        int []res=new int[n+1];
        res[0]=0;
        res[1]=1;
        for(int i=2;i<=n;i++){
            res[i]=res[i-1]+res[i-2];
        }
        return res[n];
    }
    public static void main(String[] args) {
        System.out.println(recursive(11));
        System.out.println();
        System.out.println(using_loop(11));

    }
}
