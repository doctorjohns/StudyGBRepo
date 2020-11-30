package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App extends JFrame {
    protected boolean isAlive = true;
    public App(final int SIZE) {
        setTitle("Бомбочки");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,400,400);
        setResizable(false);

        boolean[][] bombs = new boolean[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bombs[i][j] = Math.random() <= 0.25;
            }
        }


        JButton [][] buttons = new JButton[SIZE][SIZE];

        setLayout(new GridLayout(SIZE,SIZE));
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                JButton button = new JButton();
                buttons[i][j] = button;
                button.setText("???");
                // Доброго времени суток!) Здесь у меня вопрос.
                // actionEvent - это параметр метода addActionListener, и этим параметром будет то что написано между { } так?
                int ii = i;
                int jj = j;
                button.addActionListener(actionEvent -> {
                    if (!isAlive) return;
                    if (bombs[ii][jj]) {
                        //попали в бомбу
                        for (int k = 0; k < SIZE; k++) {
                            for (int l = 0; l < SIZE; l++) {
                                if (bombs[k][l]) {
                                    buttons[k][l].setText("\u2620");
                                    buttons[k][l].setFont(buttons[k][l].getFont().deriveFont(40.F));
                                    buttons[k][l].setBackground(Color.orange);
                                } else {
                                    buttons[k][l].setText(String.valueOf(findNeighbors(k,l,bombs)));
                                    buttons[k][l].setBackground(Color.green);
                                }

                            }

                        }
                        button.setText("\u2620");
                        button.setFont(button.getFont().deriveFont(40.F));
                        button.setBackground(Color.red);
                        button.setForeground(Color.white);

                        isAlive = false;
                    } else {
                        //промахнулись
                        button.setText(String.valueOf(findNeighbors(ii,jj,bombs)));
                        button.setBackground(Color.green);

                    }
                });
                add(button);
            }
        }
        setVisible(true);
    }

    //Поиск соседей нашел на StackOverFlow, к сожалению сам до такой реализации не додумался, только под свои нужды немного заточил)
    int findNeighbors(int ii, int jj, boolean bombs[][]) {
        int bombsCount=0;
        for (int x = Math.max(0, ii - 1); x <= Math.min(ii + 1, bombs.length); x++) {
            for (int y = Math.max(0, jj - 1); y <= Math.min(jj + 1,bombs[ii].length); y++) {
                if (x >= 0 && y >= 0 && x < bombs.length && y < bombs[ii].length) {
                    if(x!=ii || y!=jj){
                        if (bombs[x][y]) bombsCount++;
                    }
                }
            }
        }
        return bombsCount;
    }
}


