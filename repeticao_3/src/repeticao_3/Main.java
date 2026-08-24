package repeticao_3;


import javax.swing.JOptionPane;

public class Main {

    

    public static void main(String[] args) {



        for (int i = 1; i <= 50; i++) {



            if (i % 2 != 0) {

                JOptionPane.showMessageDialog(null, i);

            }


        }

    }

}