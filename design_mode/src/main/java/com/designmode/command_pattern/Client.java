package com.designmode.command_pattern;

/**
 * 命令模式
 */

public class Client {
    public static void main(String[] args) {

        MainBoardApi mainBoardApi = new GigaMainBoard();

        OpenCommand openCommand = new OpenCommand(mainBoardApi);

        Box box = new Box();
        box.setOpenCommand(openCommand);
        box.openButtonPressed();
    }

}
