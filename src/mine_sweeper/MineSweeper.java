package mine_sweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int row;
    private int col;

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
    }
    String[][] playField(){
        String[][] playfield = new String[this.row][this.col];
        for (int i = 0; i < playfield.length; i++) {
            for (int j = 0; j < playfield[0].length; j++) {
                playfield[i][j] = "-";
            }
        }
        return playfield;
    }

    String[][] mineField() {
        String[][] minefield = new String[this.row][this.col];
        int mineAmount = (this.col * this.row) / 4;
        Random random = new Random();
        boolean loopOut = false;

        for (int i = 0; i < minefield.length; i++) {
            for (int j = 0; j < minefield[0].length; j++) {
                minefield[i][j] = "-";
            }
        }

        for (int i = 0; i < mineAmount; i++) {
            int x = random.nextInt(this.row);
            int y = random.nextInt(this.col);
            if (minefield[x][y] == "*") {

                for (int k = 0; k < minefield.length; k++) {
                    for (int l = 0; l < minefield[0].length; l++) {
                        if (minefield[k][l] == "-") {
                            minefield[k][l] = "*";
                            loopOut = true;
                            break;

                        }
                    }
                    if (loopOut)
                        break;
                }

            } else {
                minefield[x][y] = "*";
            }

        }

        return minefield;


    }
    boolean execute(String[][] minefield,String[][] playfield){
        int mineAmount = (this.col * this.row) / 4;

        /*if(countdown==turn){
            System.out.println("Tebrikler Kazandınız !!!");
            return true;
        }*/

        int selectx;
        int selecty;
        int countdown=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Oyun Başladı ! ");
        System.out.println("Satır numarası giriniz : ");
        selectx = input.nextInt();
        System.out.println("Sütun numarası giriniz : ");
        selecty = input.nextInt();
        if((selecty>=this.col)||(selectx>=this.row)){
            System.out.println("Hatalı satır-sütun girdiniz. Lütfen satır için "+this.row+" dan , Sütun için "+this.col+" dan küçüksayı giriniz !");
            return execute(minefield,playfield);
        }

        if(minefield[selectx][selecty]=="*"){
            System.out.println("BOOOOOOOOOOOOMMMMMMM !!!");
            return false;
        }

        playfield=place(selectx,selecty,minefield,playfield);

        for(String[] i : playfield){
            for(String j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("===================");
        for(int i = 0; i<playfield.length;i++){
            for(int j = 0;j<playfield[0].length;j++){
                if(playfield[i][j]=="-"){
                    countdown++;
                }
            }
        }
        if(countdown==mineAmount){
            System.out.println("Tebrikler Kazandınız !!!");
            return true;
        }

        return execute(minefield,playfield);


    }

    void run() {
        String[][] minefield=mineField();
        String[][] playfield=playField();
//        for(String[] a : minefield ){
//            for (String b : a){
//                System.out.print(b+" ");
//            }
//            System.out.println();
//        }
        execute(minefield,playfield);

    }

    String[][] place(int selectx, int selecty, String[][] minefield,String[][] playfield) {
        int ct = 0;

        if (selectx == 0 && selecty == 0) {//sol üst köşe
            for (int i = selectx; i <= selectx + 1; i++) {
                for (int j = selecty; j <= selecty + 1; j++) {
                    if (minefield[i][j] == "*") {
                        ct++;
                    }
                }
            }
            String yeni = String.valueOf(ct);
            minefield[selectx][selecty] = yeni;
            playfield[selectx][selecty] = yeni;


        }
        else if ((selectx == this.row-1) && (selecty == 0)) {//sol alt köşe
            for (int i = selectx - 1; i <= selectx; i++) {
                for (int j = selecty ; j <= selecty+1; j++) {
                    if (minefield[i][j] == "*") {
                        ct++;
                    }
                }
            }
            String yeni = String.valueOf(ct);
            minefield[selectx][selecty] = yeni;
            playfield[selectx][selecty] = yeni;


        }
        else if (selectx == 0 && selecty == this.col-1) {//sağ üst köşe
            for (int i = selectx; i <= selectx + 1; i++) {
                for (int j = selecty - 1; j <= selecty; j++) {
                    if (minefield[i][j] == "*") {
                        ct++;
                    }
                }
            }
            String yeni = String.valueOf(ct);
            minefield[selectx][selecty] = yeni;
            playfield[selectx][selecty] = yeni;

        }
        else if(selectx==this.row-1&&selecty==this.col-1){//sağ alt köşe
            for (int i = selectx - 1; i <= selectx ; i++) {
                for (int j = selecty - 1; j <= selecty ; j++) {
                    if(minefield[i][j]=="*"){
                        ct++;
                    }
                }
            }
            String yeni = String.valueOf(ct);
            minefield[selectx][selecty]=yeni;
            playfield[selectx][selecty] = yeni;

        }
        else if((selectx==0)&&(selecty!=0||selecty!=this.col-1)){//üst kenar
            for (int i = selectx ; i <= selectx + 1; i++) {
                for (int j = selecty - 1; j <= selecty + 1; j++) {
                    if(minefield[i][j]=="*"){
                        ct++;
                    }
                }
            }
            String yeni = String.valueOf(ct);
            minefield[selectx][selecty]=yeni;
            playfield[selectx][selecty] = yeni;

        }
        else if ((selectx==this.row-1)&&(selecty!=0||selecty!=this.col-1)){//alt kenar
            for (int i = selectx - 1; i <= selectx ; i++) {
                for (int j = selecty - 1; j <= selecty + 1; j++) {
                    if(minefield[i][j]=="*"){
                        ct++;
                    }
                }
            }
            String yeni = String.valueOf(ct);
            minefield[selectx][selecty]=yeni;
            playfield[selectx][selecty] = yeni;

        }
        else if((selecty==0)&&(selectx!=0||selectx!=this.row-1)){//sol kenar
            for (int i = selectx - 1; i <= selectx + 1; i++) {
                for (int j = selecty ; j <= selecty + 1; j++) {
                    if(minefield[i][j]=="*"){
                        ct++;
                    }
                }
            }
            String yeni = String.valueOf(ct);
            minefield[selectx][selecty]=yeni;
            playfield[selectx][selecty] = yeni;

        }
        else if ((selecty==this.col-1)&&(selectx!=0||selectx!=this.row-1)){//sağ kenar
            for (int i = selectx - 1; i <= selectx + 1; i++) {
                for (int j = selecty - 1; j <= selecty ; j++) {
                    if(minefield[i][j]=="*"){
                        ct++;
                    }
                }
            }
            String yeni = String.valueOf(ct);
            minefield[selectx][selecty]=yeni;
            playfield[selectx][selecty] = yeni;

        }
        else{
            for (int i = selectx - 1; i <= selectx + 1; i++) {
                for (int j = selecty - 1; j <= selecty + 1; j++) {
                    if(minefield[i][j]=="*"){
                        ct++;
                    }
                }
            }
            String yeni = String.valueOf(ct);
            minefield[selectx][selecty]=yeni;
            playfield[selectx][selecty] = yeni;
        }

        return playfield;

    }
}
