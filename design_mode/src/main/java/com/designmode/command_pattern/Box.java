package com.designmode.command_pattern;

/**
 * 机箱
 */

public class Box {
    private Command openCommand;

    public void setOpenCommand(Command command){
        this.openCommand = command;
    }

    public void openButtonPressed(){
        if (openCommand != null){
            //按下按钮，执行命令
            openCommand.execute();
        }
    }
}
