package com.designmode.command_pattern;

/**
 * 技嘉主板类
 */

public class GigaMainBoard implements MainBoardApi {
    @Override
    public void open() {
        System.out.println(" 技嘉主板现在正在开机,请等待 ");
        System.out.println(" 接通电源  ");
        System.out.println(" 设备检测");
        System.out.println(" 装载系统");
        System.out.println(" 机器正常运转起来");
        System.out.println(" 机器已经正常打开，请操作");
    }
}
