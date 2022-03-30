public class Heart {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
                for(int x=(8-2*i);x>0;x--){
                    System.out.print(" ");
                }
                for(int y=1;y<=4*i;y++){
                    System.out.print("*");
                }
            //System.out.println();
                for(int x=2*(8-2*i);x>0;x--){
                    System.out.print(" ");
                }
                for(int y=1;y<=4*i;y++) {
                    System.out.print("*");
                }
                    System.out.println();
            }

                for(int u=1;u<=7;u++){
                    for(int l=1;l<=2*u;l++){
                        System.out.print(" ");
                    }
                    for (int r=31-4*u;r>=0;r--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
        }
    }

