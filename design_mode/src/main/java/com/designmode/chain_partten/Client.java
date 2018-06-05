package com.designmode.chain_partten;

/**
 * 责任链模式
 */

public class Client {
    public static void main(String[] args) {
        Handler h1 = new GeneralManager();
        Handler h2 = new DepManager();
        Handler h3 = new ProjectManager();

        h3.setHandler(h2);
        h2.setHandler(h1);

        String ret1 = h3.handlerReqpest("小李", 300);
        System.out.println(" ret1 : " + ret1);
        String ret2 = h3.handlerReqpest("小张", 300);
        System.out.println(" ret2 : " + ret2);


        String ret3 = h3.handlerReqpest("小李", 700);
        System.out.println(" ret3 : " + ret3);
        String ret4 = h3.handlerReqpest("小张", 700);
        System.out.println(" ret4 : " + ret4);

        String ret5 = h3.handlerReqpest("小李", 1700);
        System.out.println(" ret5 : " + ret5);
        String ret6 = h3.handlerReqpest("小张", 1700);
        System.out.println(" ret6 : " + ret6);

    }

}
