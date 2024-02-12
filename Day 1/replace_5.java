import java.sql.SQLOutput;

public class replace_5 {
    public static void main(String[] args) {
        int i,j;
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                System.out.println(a[i][j]);
                if(a[i][i]==5){
                    a[i][i]=0;
                    System.out.println(a[i][i]);
                }
            }
        }
    }
}
