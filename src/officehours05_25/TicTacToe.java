package officehours05_25;

public class TicTacToe {
    public static void main(String[] args) {


        char[] game = {
                'X', 'X', 'X',
                '-', 'O', '-',
                '-', 'O', '-'
        };

    }
    /*
    horizontal:
    a[0] +a[1] +a[2]
    a[3] +a[4] +a[5]
    a[6] +a[7] +a[8]

    vertical:

    a[0] +a[3] +a[6]
    a[1] +a[4] +a[7]
    a[2] +a[5] +a[8]

    Diagonal:
    a[0] + a[4]+ a[8]
    a[2] + a[4]+ a[6]

     */
    public static String won(char[] x){

        for(int i= 0, y =0; i < x.length;i++, y += 3){

            String rows = "" + x[i] +x[y + 1] + x[y + 2];
            String col = "" + x[i] +x[i + 3] + x[i + 6];
            String dign = "";

            if(i==0 ){
                dign ="" + x[i] +x[i + 4] + x[i + 8];
            }else if (i ==2){
                dign ="" + x[i] +x[i + 2] + x[i + 4];
            }
            if(rows.equals("xxx") || col.equals("xxx")){

         //       winner ="Player x won";
         //   }else if("ooo") || col.equals("ooo"){
          //      winner ="Player o won";
           }

        }
        return null;
    }
}
