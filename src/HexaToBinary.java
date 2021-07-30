public class HexaToBinary {
    public static void main(String[] args) {
        char c='9';
        int n=2;
        int j,r,p=0;
        char []b=new char[4];
        for (j=3;j>=0;j--){
            r=n%2;
            b[j]=(char)(r+'0');
            n=(int) (n/2);
        }
        for(j=0;j<4;j++)
            System.out.print(b[j]);
    }
}
