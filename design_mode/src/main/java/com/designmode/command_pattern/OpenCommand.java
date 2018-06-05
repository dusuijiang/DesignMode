package com.designmode.command_pattern;

/**
 * Created by Administrator on 2018/6/4.
 */

public class OpenCommand implements Command {

   private MainBoardApi mainBoardApi = null;

   public OpenCommand(MainBoardApi mainBoardApi){
       this.mainBoardApi = mainBoardApi;
   }

    @Override
    public void execute() {
        if (mainBoardApi != null)
            this.mainBoardApi.open();;
    }
}
