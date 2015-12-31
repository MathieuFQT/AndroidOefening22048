package com.example.mini_.android_oefening2_2048.Game;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.GridLayout;

/**
 * Created by mini_ on 31/12/2015.
 */
public class Board extends GridLayout {

    private Card[][] cardBoard;

    public Board(Context context) {
        super(context);
        initBoard();
    }

    public Board(Context context, AttributeSet attrs) {
        super(context, attrs);
        initBoard();
    }

    public Board(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initBoard();
    }

    private void initBoard() {
        //Populate the cardBoard
        cardBoard = new Card[4][4];
        for(int x = 0; x < 4; x++) {
            for(int y = 0; y < 4; y++) {
                cardBoard[x][y] = new Card(getContext());
            }
        }
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        int cardWith = (Math.min(w,h) - 10) / 4;
        addCards(cardWith, cardWith);
        startGame();

    }

    private void addCards(int cardWith, int cardHeight){
        for(int x = 0 ; x < 4 ; x++){
            for(int y = 0 ; y < 4 ; y++ ){
                cardBoard[x][y].setLayoutParams(new ViewGroup.LayoutParams(cardWith, cardHeight));
                this.addView(cardBoard[x][y]);
            }
        }
    }

    public void startGame(){
        setTestBoard();
    }

    private void setTestBoard(){
        for(int x = 0 ; x < 4 ; x++) {
            for (int y = 0; y < 4; y++) {
                cardBoard[x][y].setTextViewValue(x*10+y);
            }
        }
    }
}