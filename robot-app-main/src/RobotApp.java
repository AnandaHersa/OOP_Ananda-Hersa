import java.util.Scanner;

import Model.Layout;
import Model.Position;
import Model.Robot;

public class RobotApp {
    public static void main(String[] args){new RobotApp();}
    
    private Layout layout;
    private Robot robot;
    private Scanner scanner;
    public RobotApp() {
        this.layout = new Layout(10, 10, '*');
        this.robot = new Robot('o', new Position(4,4));
        this.scanner = new Scanner(System.in);
        String instruction = "";
        System.out.println("-------- Permainan Dimulai --------");
        do{
            draw();
            instruction = waitInstruction();
            executeInstruction(instruction);
        }while(!instruction.equals("x"));
        System.out.println("-------- Permainan Selesai --------");
    }
    
    private void executeInstruction(String instruction) {
        if (instruction.length() < 2) {
            System.out.println("Input Tidak Sesuai, Masukan Data Langkah Yang Benar !!!!");
            return;
        }

        char moveDirection = instruction.charAt(0);
        int steps;
        try {
            steps = Integer.parseInt(instruction.substring(1));
        } catch (NumberFormatException e) {
            System.out.println("Input Tidak Sesuaii, Masukkan Step Yang Benar !!!!");
            return;
        }

        Position posisiBaru = new Position(robot.getPosition().getX(), robot.getPosition().getY());
        switch(moveDirection) {
            case 'w':
                posisiBaru.setX(posisiBaru.getX() - steps);
                break;
            case 's':
                posisiBaru.setX(posisiBaru.getX() + steps);
                break;
            case 'a':
            posisiBaru.setY(posisiBaru.getY() - steps);
                break;
            case 'd':
                posisiBaru.setY(posisiBaru.getY() + steps);
                break;
            default:
                System.out.println("Input Tidak Sesuai, Gunakan 'w', 's', 'a', atau 'd' !!!!");
                return;
        }

        if(isValidPosition(posisiBaru)) {
            robot.setPosition(posisiBaru);
        } else {
            System.out.println("Tidak Sesuai Dengan Besarnya Arena !!!!");
        }
    }

    private boolean isValidPosition(Position posisi) {
        return posisi.getX() >= 0 && posisi.getX() < layout.getMaxX() && posisi.getY() >= 0 && posisi.getY() < layout.getMaxY();
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'keatas 3 langkah'");
        System.out.print("Masukan instruksi: ");
        return scanner.nextLine();
    }

    private void draw() {
        System.out.println("------ Posisi Terbaru ------");
        for(int i = 0; i < layout.getMaxX(); i++) {
            for(int j = 0; j < layout.getMaxY(); j++) {
                if(i == robot.getPosition().getX() && 
                j == robot.getPosition().getY()) {
                    System.out.print(robot.getIcon());
                } else {
                    System.out.print(layout.getArea()[i][j]);
                }
            }
            System.out.println();
        }
    }
}
