public class Tugas2_27 {
    int x, y, width, height;

    public Tugas2_27(int x, int y,int width, int heigth){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=heigth;
    }
    
    void moveLeft(){
        if (x>0 && x<width) {
            x--;
        }else {
            detectCollision();
        }
    }

    void moveRight(){
        if (x>0 && x<width) {
            x++;
        }else {
            detectCollision();
        }
    }

    void moveUp(){
        if (y>0 && y<height) {
            y++;
        }else {
            detectCollision();
        }
    }

    void moveDown(){
        if (y>0 && y<height) {
            y--;
        }else {
            detectCollision();
        }
    }

    void printPosition(){
        System.out.println("Dragon sekarang berada di titik (X,Y): " + x + "," + y);
    }

    void detectCollision(){
        System.out.println("GAME OVER");
        System.out.println("Terimakasih telah bermain :)");
        System.exit(0);
    }

}