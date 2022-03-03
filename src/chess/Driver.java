package chess;
import java.util.Scanner;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Piece> chessPiece = new ArrayList<>();

        Bishop bishop = new Bishop(3, true);
        chessPiece.add(bishop);

        Pawn pawn = new Pawn(1, false);
        chessPiece.add(pawn);

        Knight knight = new Knight(2, true);
        chessPiece.add(knight);

        Rook rook = new Rook(5, false);
        chessPiece.add(rook);

        Queen queen = new Queen(9, true);
        chessPiece.add(queen);

        King king = new King(1000, false);
        chessPiece.add(king);

        for (Piece piece : chessPiece) {
            piece.move();
        }

        Pawn p1 = new Pawn(1, true, true, queen);
        Pawn p2 = new Pawn(1, false, false, null);
        Pawn p3 = new Pawn(1, false, true, queen);
        Pawn p4 = new Pawn(1, false, true, queen);
        Pawn p5 = new Pawn(1, true, true, knight);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));
    }
}

