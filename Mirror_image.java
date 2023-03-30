/*
finding the mirror image of an array
*/
package mirror_image;
import java.util.*;
public class Mirror_image {
    
int arr[][] = new int[4][4];
int arr_mir[][] = new int[4][4];

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 16 elements into a 4x4 array");
        int a; int b;
        for(a = 0; a < 4; a++){
            for(b = 0; b < 4; b++){
                arr[a][b] = sc.nextInt();
            }
        }
    
        for(a = 0; a < 4; a++){
            for(b = 0; b < 4; b++){
                System.out.print(arr[a][b] + " ");
            }
            System.out.println("");
            }
        System.out.println("");
    }
    void mirror(){
        int a; int b; int c;
       for(a = 0; a < 4; a++){
            for(b = 0; b < 4; b++){
             c = 3 - b;
             arr_mir[a][c] = arr[a][b];
            }
            } 
    }
    void display(){
        int a; int b;
        for(a = 0; a < 4; a++){
            for(b = 0; b < 4; b++){
                System.out.print(arr_mir[a][b] + " ");
            }
            System.out.println("");
        }
    }
    
    
    public static void main(String[] args) {

    Mirror_image ob = new Mirror_image();
    ob.input();
    ob.mirror();
    ob.display();
        
    }
    
}
